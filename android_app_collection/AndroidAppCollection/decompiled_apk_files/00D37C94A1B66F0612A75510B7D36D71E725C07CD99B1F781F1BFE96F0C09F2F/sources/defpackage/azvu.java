package defpackage;

import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azvu  reason: default package */
/* loaded from: classes2.dex */
public final class azvu implements azvm {
    public final azvz a;
    private final aztu c;
    public final aztr b = ayme.d(false);
    private final aztu d = ayme.f(null);

    public azvu(azvz azvzVar, Throwable th) {
        this.a = azvzVar;
        this.c = ayme.f(th);
    }

    public static final ArrayList i() {
        return new ArrayList(4);
    }

    public final Object c() {
        return this.d.a;
    }

    public final Throwable d() {
        return (Throwable) this.c.a;
    }

    public final void e(Throwable th) {
        Throwable d = d();
        if (d == null) {
            aztu aztuVar = this.c;
            int i = aztv.a;
            aztuVar.a = th;
        } else if (th == d) {
        } else {
            Object c = c();
            if (c == null) {
                f(th);
            } else if (!(c instanceof Throwable)) {
                if (!(c instanceof ArrayList)) {
                    throw new IllegalStateException(azst.a("State is ", c).toString());
                }
                ((ArrayList) c).add(th);
            } else if (th == c) {
            } else {
                ArrayList i2 = i();
                i2.add(c);
                i2.add(th);
                f(i2);
            }
        }
    }

    public final void f(Object obj) {
        aztu aztuVar = this.d;
        int i = aztv.a;
        aztuVar.a = obj;
    }

    public final boolean g() {
        return d() != null;
    }

    public final boolean h() {
        return this.b.a();
    }

    @Override // defpackage.azvm
    public final azvz su() {
        return this.a;
    }

    @Override // defpackage.azvm
    public final boolean sv() {
        return d() == null;
    }

    public final String toString() {
        return "Finishing[cancelling=" + g() + ", completing=" + h() + ", rootCause=" + d() + ", exceptions=" + c() + ", list=" + this.a + ']';
    }
}
