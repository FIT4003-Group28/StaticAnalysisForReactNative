package defpackage;

import android.view.View;
import com.google.android.apps.gmm.base.mod.components.appbar.ModAppBar;
/* compiled from: PG */
/* renamed from: aymj  reason: default package */
/* loaded from: classes3.dex */
public final class aymj implements begk {
    private final boolean a;
    private String b;
    private drcs c;
    private int d;
    @dzsi
    private baad e;

    public aymj(@dzsi baad baadVar, gcg gcgVar) {
        this.b = "";
        this.c = drcs.UNKNOWN_SHARING_STATE;
        this.a = gcgVar.a();
        this.e = baadVar;
    }

    @Override // defpackage.begk
    public final View a(final fd fdVar) {
        CharSequence b;
        ModAppBar modAppBar = new ModAppBar(fdVar.J(), null);
        jhz a = jhz.a();
        ff J = fdVar.J();
        baad baadVar = this.e;
        a.a = baadVar == null ? this.b : baadVar.E(J);
        ff J2 = fdVar.J();
        cqss p = this.a ? ibm.p() : ibl.s();
        aymh aymhVar = new aymh(J2);
        baad baadVar2 = this.e;
        if (baadVar2 != null) {
            b = aymhVar.a(baadVar2, p, true);
        } else if (this.c == drcs.GROUP) {
            b = aymhVar.d(drcs.GROUP, this.d);
        } else {
            b = aymhVar.b(this.c, p, this.d);
        }
        a.b = b;
        a.f(new View.OnClickListener(fdVar) { // from class: aymi
            private final fd a;

            {
                this.a = fdVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fd fdVar2 = this.a;
                if (fdVar2.U()) {
                    ff J3 = fdVar2.J();
                    if (!(J3 instanceof gga)) {
                        return;
                    }
                    ((gga) J3).s();
                }
            }
        });
        if (!this.a) {
            a.u = ibl.w();
            a.v = ibl.q();
            a.q = ibl.b();
            a.g = ibl.s();
            a.i = cqrt.g(2131231588, ibl.s());
        } else {
            a.u = ibm.t();
            a.v = ibm.n();
            a.q = ibm.b();
            a.i = cqrt.g(2131231588, ibm.p());
        }
        modAppBar.setToolbarProperties(a.b());
        return modAppBar;
    }

    public aymj(String str, drcs drcsVar, int i, gcg gcgVar) {
        this.b = "";
        this.c = drcs.UNKNOWN_SHARING_STATE;
        this.a = gcgVar.a();
        this.b = str;
        this.c = drcsVar;
        this.d = i;
    }
}
