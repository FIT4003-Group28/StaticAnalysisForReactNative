package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;
/* compiled from: PG */
/* renamed from: bwrn  reason: default package */
/* loaded from: classes.dex */
public final class bwrn {
    private final Map<bwrl, TreeSet<Integer>> a = new HashMap();

    private final TreeSet<Integer> c(bwrl bwrlVar) {
        TreeSet<Integer> treeSet = this.a.get(bwrlVar);
        if (treeSet == null) {
            TreeSet<Integer> treeSet2 = new TreeSet<>();
            this.a.put(bwrlVar, treeSet2);
            return treeSet2;
        }
        return treeSet;
    }

    public final synchronized bwqj a(bwqi bwqiVar, cqat cqatVar, dvsb dvsbVar) {
        String num;
        TreeSet<Integer> c = c(bwqiVar);
        Iterator<Integer> it = c.iterator();
        int i = 0;
        while (it.hasNext() && it.next().intValue() == i) {
            i++;
        }
        c.add(Integer.valueOf(i));
        num = Integer.toString(i);
        bwqj.c(cqatVar, dvsbVar);
        return new bwqj(bwqiVar, num);
    }

    public final synchronized void b(bwqj bwqjVar) {
        c(bwqjVar.c).add(Integer.valueOf(Integer.parseInt(bwqjVar.d)));
    }
}
