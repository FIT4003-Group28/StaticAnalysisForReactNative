package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gmm.base.mod.components.appbar.ModAppBar;
import com.google.android.apps.maps.R;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: ayrr  reason: default package */
/* loaded from: classes3.dex */
public final class ayrr extends ges {
    public acyp a;
    public dzsj<aywl> ad;
    @dzsi
    public bwrs<baad> ae;
    @dzsi
    private bwrs<baal> af;
    private cqkf<ayvf> ag;
    @dzsi
    private ayvf ah;
    private boolean ai;
    @dzsi
    private Integer aj;
    public gga b;
    public bwqv c;
    public efg d;
    public cqkj e;
    public jmz f;
    public aywc g;

    public static ayrr g(bwqv bwqvVar, bwrs<baad> bwrsVar) {
        ayrr ayrrVar = new ayrr();
        Bundle bundle = new Bundle();
        bwqvVar.c(bundle, "arg_local_list", bwrsVar);
        ayrrVar.B(bundle);
        return ayrrVar;
    }

    @dzsi
    private final View i() {
        cqjg cqjgVar;
        View view = this.P;
        if (view != null) {
            if (!this.ai) {
                cqjgVar = aysy.c;
            } else {
                cqjgVar = aysy.b;
            }
            return cqhu.a(view, cqjgVar);
        }
        return null;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        super.Qe();
        cqkf<ayvf> cqkfVar = this.ag;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        ayvf ayvfVar;
        ayvf ayvfVar2;
        if (!this.ai || !(obj instanceof azrk) || (ayvfVar2 = this.ah) == null) {
            if (!(obj instanceof bdhk) || (ayvfVar = this.ah) == null) {
                return;
            }
            ayvfVar.A((bdhk) obj);
            return;
        }
        ayvfVar2.z((azrk) obj);
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        View a;
        super.ag(layoutInflater, viewGroup, bundle);
        cqkf<ayvf> c = this.e.c(new aysy(), viewGroup);
        this.ag = c;
        if (c.c() != null && (a = cqhu.a(this.ag.c(), aysy.a)) != null) {
            ((ModAppBar) a).b();
        }
        cqkf<ayvf> cqkfVar = this.ag;
        ayvf ayvfVar = this.ah;
        dbsk.s(ayvfVar);
        cqkfVar.e(ayvfVar);
        return this.ag.c();
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        ayvf ayvfVar = this.ah;
        dbsk.s(ayvfVar);
        if (ayvfVar.p().booleanValue()) {
            int i = true != ayvfVar.n().booleanValue() ? R.string.EDIT_LIST_DISCARD_DIALOG_MESSAGE : R.string.CREATE_LIST_DISCARD_DIALOG_MESSAGE;
            iii iiiVar = new iii();
            String string = this.b.getString(i);
            dbsk.s(string);
            iiiVar.a = string;
            iiiVar.d(this.b.getString(R.string.DISCARD_BUTTON), new View.OnClickListener(this) { // from class: ayrq
                private final ayrr a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ayrr ayrrVar = this.a;
                    if (!ayrrVar.aD) {
                        return;
                    }
                    bwrs<baad> bwrsVar = ayrrVar.ae;
                    if (bwrsVar != null) {
                        baad c = bwrsVar.c();
                        dbsk.s(c);
                        c.ad();
                        bwrs<baad> bwrsVar2 = ayrrVar.ae;
                        dbsk.s(bwrsVar2);
                        bwrsVar2.d(c);
                    }
                    gn gnVar = ayrrVar.A;
                    if (gnVar == null) {
                        return;
                    }
                    gnVar.f();
                }
            }, null);
            iiiVar.c(this.b.getString(R.string.GO_BACK_BUTTON), null, null);
            iiiVar.a(this.b, this.e).k();
            return true;
        }
        return false;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (bundle == null) {
            bundle = this.o;
        }
        try {
            if (bundle.getBoolean("is_starred_places_list")) {
                this.ai = true;
                this.ah = this.ad.a();
                return;
            }
            this.ai = false;
            this.ae = this.c.e(baad.class, bundle, "arg_local_list");
            this.af = this.c.e(baal.class, bundle, "arg_local_list_item");
            ayrp ayrpVar = new ayrp(this);
            bwrs<baal> bwrsVar = this.af;
            if (bwrsVar == null) {
                bwrs<baad> bwrsVar2 = this.ae;
                if (bwrsVar2 == null) {
                    return;
                }
                aywc aywcVar = this.g;
                baad c = bwrsVar2.c();
                dbsk.s(c);
                this.ah = aywcVar.a(this, c, null, ayrpVar);
                return;
            }
            baal c2 = bwrsVar.c();
            if (c2 == null || c2.b() == null) {
                return;
            }
            aywc aywcVar2 = this.g;
            baad b = c2.b();
            dbsk.s(b);
            this.ah = aywcVar2.a(this, b, c2, ayrpVar);
        } catch (IOException e) {
            Throwable cause = e.getCause();
            dbsk.s(cause);
            dbue.b(cause);
            Throwable cause2 = e.getCause();
            dbsk.s(cause2);
            throw new RuntimeException(cause2);
        }
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtyg.s;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        if (!this.ai) {
            this.aj = Integer.valueOf(J().getWindow().getAttributes().softInputMode);
        }
        egj egjVar = new egj(this);
        egjVar.w(this.P);
        egjVar.ag(null);
        ayvf ayvfVar = this.ah;
        dbsk.s(ayvfVar);
        egjVar.J(ayvfVar);
        if (this.a.c()) {
            egjVar.aq(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
        }
        this.d.a(egjVar.a());
        if (i() != null) {
            jmz jmzVar = this.f;
            View i = i();
            dbsk.s(i);
            jmzVar.b(i);
        }
        ayvf ayvfVar2 = this.ah;
        dbsk.s(ayvfVar2);
        ayvfVar2.h();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putBoolean("is_starred_places_list", this.ai);
        this.c.c(bundle, "arg_local_list", this.ae);
        this.c.c(bundle, "arg_local_list_item", this.af);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
        if (r0.q() == false) goto L13;
     */
    @Override // defpackage.ges, defpackage.fd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u() {
        /*
            r4 = this;
            ayvf r0 = r4.ah
            defpackage.dbsk.s(r0)
            r0.i()
            java.lang.Integer r0 = r4.aj
            if (r0 == 0) goto L20
            ff r0 = r4.J()
            android.view.Window r0 = r0.getWindow()
            java.lang.Integer r1 = r4.aj
            defpackage.dbsk.s(r1)
            int r1 = r1.intValue()
            r0.setSoftInputMode(r1)
        L20:
            android.view.View r0 = r4.i()
            if (r0 == 0) goto L2b
            jmz r1 = r4.f
            r1.a(r0)
        L2b:
            boolean r0 = r4.ai
            if (r0 != 0) goto L7f
            bwrs<baad> r0 = r4.ae
            if (r0 == 0) goto L42
            java.io.Serializable r0 = r0.c()
            baad r0 = (defpackage.baad) r0
            defpackage.dbsk.s(r0)
            boolean r0 = r0.q()
            if (r0 != 0) goto L7f
        L42:
            android.view.View r0 = r4.P
            if (r0 != 0) goto L4a
            super.u()
            return
        L4a:
            cqjg r1 = defpackage.aysy.d
            java.lang.Class<android.widget.EditText> r2 = android.widget.EditText.class
            android.view.View r1 = defpackage.cqkx.e(r0, r1, r2)
            android.widget.EditText r1 = (android.widget.EditText) r1
            cqjg r2 = defpackage.aysy.e
            java.lang.Class<android.widget.EditText> r3 = android.widget.EditText.class
            android.view.View r0 = defpackage.cqkx.e(r0, r2, r3)
            android.widget.EditText r0 = (android.widget.EditText) r0
            gga r2 = r4.b
            java.lang.String r3 = "input_method"
            java.lang.Object r2 = r2.getSystemService(r3)
            android.view.inputmethod.InputMethodManager r2 = (android.view.inputmethod.InputMethodManager) r2
            r3 = 2
            if (r1 == 0) goto L72
            android.os.IBinder r1 = r1.getWindowToken()
            r2.hideSoftInputFromWindow(r1, r3)
        L72:
            if (r0 == 0) goto L7b
            android.os.IBinder r0 = r0.getWindowToken()
            r2.hideSoftInputFromWindow(r0, r3)
        L7b:
            super.u()
            return
        L7f:
            super.u()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayrr.u():void");
    }
}
