package test.utils.collection;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.*;
import com.firefly.utils.collection.HashedArrayTree;

public class TestHashedArrayTree {
	@Test
	public void test() {
		HashedArrayTree<Integer> arr = new HashedArrayTree<Integer>();
		for (int i = 0; i < 50; i++) {
			arr.add(i);
		}
		Assert.assertThat(arr.size(), is(50));
	}

}
