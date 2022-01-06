package org.ar.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class SimpleOrComplex {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// N M
		// 2 3
		// 3 2
		int t = Integer.parseInt(br.readLine());
		for (int j = 1; j <= t; j++) {
			String s[] = br.readLine().split(" ");
			int n = Integer.parseInt(s[0]);
			int m = Integer.parseInt(s[1]);
			boolean flag = true;
			HashSet<String> set = new HashSet<String>();
			for (int i = 1; i <= m; i++) {
				s = br.readLine().split(" ");
				int u = Integer.parseInt(s[0]);
				int v = Integer.parseInt(s[1]);
				if (u == v)
					flag = false;

				int min = Math.min(u, v);
				int max = Math.max(u, v);
				String key = min + " " + max;
				if (set.contains(key)) {
					flag = false;
				} else {
					set.add(key);
				}

			}
			if (flag)
				System.out.println("Simple");
			else
				System.out.println("Complex");
		}

	}
}
