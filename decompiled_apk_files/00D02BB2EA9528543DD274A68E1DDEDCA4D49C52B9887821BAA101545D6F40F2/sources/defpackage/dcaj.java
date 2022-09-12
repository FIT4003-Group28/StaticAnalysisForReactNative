package defpackage;

import java.lang.Comparable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcaj  reason: default package */
/* loaded from: classes5.dex */
public final class dcaj<C extends Comparable> extends dcak<C> {
    private static final long serialVersionUID = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcaj(C c) {
        super(c);
        dbsk.s(c);
    }

    @Override // defpackage.dcak
    public final boolean b(C c) {
        return dclz.t(this.b, c) <= 0;
    }

    @Override // defpackage.dcak
    public final dcak<C> c(dbyz dbyzVar, dcau<C> dcauVar) {
        dbyz dbyzVar2 = dbyz.OPEN;
        int ordinal = dbyzVar.ordinal();
        if (ordinal == 0) {
            C c = dcauVar.c(this.b);
            return c == null ? dcai.a : new dcah(c);
        } else if (ordinal != 1) {
            throw new AssertionError();
        } else {
            return this;
        }
    }

    @Override // defpackage.dcak
    public final dcak<C> d(dbyz dbyzVar, dcau<C> dcauVar) {
        dbyz dbyzVar2 = dbyz.OPEN;
        int ordinal = dbyzVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                C c = dcauVar.c(this.b);
                return c == null ? dcag.a : new dcah(c);
            }
            throw new AssertionError();
        }
        return this;
    }

    @Override // defpackage.dcak
    public final void e(StringBuilder sb) {
        sb.append('[');
        sb.append(this.b);
    }

    @Override // defpackage.dcak
    public final void f(StringBuilder sb) {
        sb.append(this.b);
        sb.append(')');
    }

    @Override // defpackage.dcak
    public final C g(dcau<C> dcauVar) {
        return this.b;
    }

    @Override // defpackage.dcak
    public final C h(dcau<C> dcauVar) {
        return dcauVar.c(this.b);
    }

    @Override // defpackage.dcak
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2);
        sb.append("\\");
        sb.append(valueOf);
        sb.append("/");
        return sb.toString();
    }
}
