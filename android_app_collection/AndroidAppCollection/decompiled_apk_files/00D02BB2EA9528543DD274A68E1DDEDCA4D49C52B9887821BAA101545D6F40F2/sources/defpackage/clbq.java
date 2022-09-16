package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: clbq  reason: default package */
/* loaded from: classes5.dex */
public final class clbq implements Iterable<Integer> {
    final /* synthetic */ clbr a;
    final /* synthetic */ clbu b;

    public clbq(clbu clbuVar, clbr clbrVar) {
        this.b = clbuVar;
        this.a = clbrVar;
    }

    @Override // java.lang.Iterable
    public final Iterator<Integer> iterator() {
        return new clbp(this);
    }
}
