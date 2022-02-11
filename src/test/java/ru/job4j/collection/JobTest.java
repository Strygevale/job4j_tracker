package ru.job4j.collection;

import org.junit.Test;
import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {

    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompareAscByName() {
        Comparator<Job> compareAscByName = new JobAscByName();
        int rsl = compareAscByName.compare(
                new Job("Bob", 1),
                new Job("Andrey", 2)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompareAscByPriority() {
        Comparator<Job> compareAscByPriority = new JobAscByPriority();
        int rsl = compareAscByPriority.compare(
                new Job("Bob", 1),
                new Job("Andrey", 2)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompareDescByName() {
        Comparator<Job> compareDescByName = new JobDescByName();
        int rsl = compareDescByName.compare(
                new Job("Bob", 1),
                new Job("Andrey", 2)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompareDescByPriority() {
        Comparator<Job> compareDescByPriority = new JobDescByPriority();
        int rsl = compareDescByPriority.compare(
                new Job("Bob", 1),
                new Job("Andrey", 2)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompareAscByPriorityAscByName() {
        Comparator<Job> comparePriorityAndName = new JobAscByPriority().thenComparing(new JobAscByName());
        int rsl = comparePriorityAndName.compare(
                new Job("Bob", 1),
                new Job("Andrey", 1)
        );
        assertThat(rsl, greaterThan(0));
    }
}