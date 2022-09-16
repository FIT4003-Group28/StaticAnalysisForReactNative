package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: akrf  reason: default package */
/* loaded from: classes2.dex */
final class akrf {
    public static final Comparator<Map.Entry<Integer, Integer>> d = akrd.a;
    public static final Comparator<Map.Entry<Integer, Integer>> e = akre.a;
    public final List<List<Map.Entry<Integer, Integer>>> a = new ArrayList();
    public final List<List<Map.Entry<Integer, Integer>>> b = new ArrayList();
    final List<List<Integer>> c = new ArrayList();

    public final void a(int i, int i2, int i3, boolean z) {
        List<Integer> list = this.c.get(i);
        list.add(i2, Integer.valueOf(i3));
        list.add(i2, Integer.valueOf(z ? akrg.a : -akrg.a));
    }
}
