package defpackage;

import java.io.Serializable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbrg  reason: default package */
/* loaded from: classes5.dex */
public final class dbrg<A, B> extends dbrh<B, A> implements Serializable {
    private static final long serialVersionUID = 0;
    final dbrh<A, B> a;

    public dbrg(dbrh<A, B> dbrhVar) {
        this.a = dbrhVar;
    }

    @Override // defpackage.dbrh
    public final A NV(B b) {
        return this.a.NW(b);
    }

    @Override // defpackage.dbrh
    public final B NW(A a) {
        return this.a.NV(a);
    }

    @Override // defpackage.dbrh
    protected final B b(A a) {
        throw new AssertionError();
    }

    @Override // defpackage.dbrh
    protected final A c(B b) {
        throw new AssertionError();
    }

    @Override // defpackage.dbrn
    public final boolean equals(Object obj) {
        if (obj instanceof dbrg) {
            return this.a.equals(((dbrg) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ (-1);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 10);
        sb.append(valueOf);
        sb.append(".reverse()");
        return sb.toString();
    }
}
