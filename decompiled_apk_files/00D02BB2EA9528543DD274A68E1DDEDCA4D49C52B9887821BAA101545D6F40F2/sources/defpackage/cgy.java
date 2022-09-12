package defpackage;

import android.content.Context;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cgy  reason: default package */
/* loaded from: classes4.dex */
public final class cgy extends fd {
    public final cfz a;
    public final cgv b;
    public bsa c;
    private final Set<cgy> d;
    private cgy e;

    public cgy() {
        cfz cfzVar = new cfz();
        this.b = new cgx(this);
        this.d = new HashSet();
        this.a = cfzVar;
    }

    private final void d() {
        cgy cgyVar = this.e;
        if (cgyVar != null) {
            cgyVar.d.remove(this);
            this.e = null;
        }
    }

    @Override // defpackage.fd
    public final void Qd() {
        super.Qd();
        d();
    }

    @Override // defpackage.fd
    public final void Qi(Context context) {
        super.Qi(context);
        cgy cgyVar = this;
        while (true) {
            fd fdVar = cgyVar.D;
            if (fdVar == null) {
                break;
            }
            cgyVar = fdVar;
        }
        gn gnVar = cgyVar.A;
        if (gnVar == null) {
            return;
        }
        try {
            Context H = H();
            d();
            cgy e = brc.a(H).e.e(gnVar);
            this.e = e;
            if (equals(e)) {
                return;
            }
            this.e.d.add(this);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // defpackage.fd
    public final void am() {
        super.am();
        this.a.e();
        d();
    }

    @Override // defpackage.fd
    public final void s() {
        super.s();
        this.a.c();
    }

    @Override // defpackage.fd
    public final String toString() {
        String fdVar = super.toString();
        fd fdVar2 = this.D;
        if (fdVar2 == null) {
            fdVar2 = null;
        }
        String valueOf = String.valueOf(fdVar2);
        StringBuilder sb = new StringBuilder(String.valueOf(fdVar).length() + 9 + String.valueOf(valueOf).length());
        sb.append(fdVar);
        sb.append("{parent=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    @Override // defpackage.fd
    public final void u() {
        super.u();
        this.a.d();
    }
}
