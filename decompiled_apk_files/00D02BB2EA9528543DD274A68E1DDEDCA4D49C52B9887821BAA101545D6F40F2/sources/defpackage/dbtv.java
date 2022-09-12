package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: dbtv  reason: default package */
/* loaded from: classes.dex */
final class dbtv {
    final boolean[] a = new boolean[256];
    final Set<Integer> b;

    public dbtv(Set<Integer> set) {
        this.b = set;
        for (int i = 0; i < 256; i++) {
            this.a[i] = this.b.contains(Integer.valueOf(i));
        }
    }
}
