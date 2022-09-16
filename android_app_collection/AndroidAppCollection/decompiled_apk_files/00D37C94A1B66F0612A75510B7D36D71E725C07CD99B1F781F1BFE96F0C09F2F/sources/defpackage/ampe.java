package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: ampe  reason: default package */
/* loaded from: classes.dex */
final class ampe extends ampf implements Serializable {
    private static final long serialVersionUID = 0;
    final ampf a;

    public ampe(ampf ampfVar) {
        this.a = ampfVar;
    }

    @Override // defpackage.ampf
    protected final Object a(Object obj) {
        throw new AssertionError();
    }

    @Override // defpackage.ampf
    protected final Object b(Object obj) {
        throw new AssertionError();
    }

    @Override // defpackage.ampf
    public final Object c(Object obj) {
        return this.a.d(obj);
    }

    @Override // defpackage.ampf
    public final Object d(Object obj) {
        return this.a.c(obj);
    }

    @Override // defpackage.ampg
    public final boolean equals(Object obj) {
        if (obj instanceof ampe) {
            return this.a.equals(((ampe) obj).a);
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
