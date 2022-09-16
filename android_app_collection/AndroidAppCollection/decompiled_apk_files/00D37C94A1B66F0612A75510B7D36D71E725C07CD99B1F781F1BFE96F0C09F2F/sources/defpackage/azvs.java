package defpackage;
/* compiled from: PG */
/* renamed from: azvs  reason: default package */
/* loaded from: classes2.dex */
public abstract class azvs extends azum implements azve, azvm {
    public azvw b;

    @Override // defpackage.azve
    public final void d() {
        Object p;
        azvw e = e();
        do {
            p = e.p();
            if (!(p instanceof azvs)) {
                if (!(p instanceof azvm) || ((azvm) p).su() == null) {
                    return;
                }
                m();
                return;
            } else if (p != this) {
                return;
            }
        } while (!e.c.c(p, azvx.f));
    }

    public final azvw e() {
        azvw azvwVar = this.b;
        if (azvwVar != null) {
            return azvwVar;
        }
        azql azqlVar = new azql(null);
        azst.e(azqlVar, azst.class.getName());
        throw azqlVar;
    }

    @Override // defpackage.azvm
    public final azvz su() {
        return null;
    }

    @Override // defpackage.azvm
    public final boolean sv() {
        return true;
    }

    @Override // defpackage.azxw
    public final String toString() {
        return banl.j(this) + '@' + banl.k(this) + "[job@" + banl.k(e()) + ']';
    }
}
