package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: dday  reason: default package */
/* loaded from: classes5.dex */
final class dday implements Iterable<Integer> {
    final /* synthetic */ dbug a;
    final /* synthetic */ ddbc b;

    public dday(ddbc ddbcVar, dbug dbugVar) {
        this.b = ddbcVar;
        this.a = dbugVar;
    }

    @Override // java.lang.Iterable
    public final Iterator<Integer> iterator() {
        return new ddax(this);
    }
}
