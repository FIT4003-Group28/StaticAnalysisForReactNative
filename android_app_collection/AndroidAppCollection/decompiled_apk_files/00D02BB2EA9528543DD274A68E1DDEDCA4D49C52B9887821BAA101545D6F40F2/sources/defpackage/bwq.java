package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: bwq  reason: default package */
/* loaded from: classes.dex */
final class bwq implements Iterable<bwp> {
    public final List<bwp> a;

    public bwq() {
        this(new ArrayList(2));
    }

    public bwq(List<bwp> list) {
        this.a = list;
    }

    public static bwp e(chx chxVar) {
        return new bwp(chxVar, cjh.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(chx chxVar) {
        return this.a.contains(e(chxVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        return this.a.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int c() {
        return this.a.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final bwq d() {
        return new bwq(new ArrayList(this.a));
    }

    @Override // java.lang.Iterable
    public final Iterator<bwp> iterator() {
        return this.a.iterator();
    }
}
