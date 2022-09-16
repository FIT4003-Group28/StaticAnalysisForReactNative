package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.android.apps.maps.R;
import java.io.IOException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ayyz  reason: default package */
/* loaded from: classes3.dex */
public final class ayyz extends ges {
    public cpv a;
    public EditText ad;
    private baad ae;
    private azbg af;
    private cqkf<azbe> ag;
    public gga b;
    public bwqv c;
    public efg d;
    public cqkj e;
    public azbh f;
    public gfq g;

    @Override // defpackage.ges, defpackage.gfv
    public final void Nw(@dzsi Object obj) {
        gfw ba = ba();
        if (obj != null && ba != null) {
            ba.Qn(obj);
        }
        gfq.l(this);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        cqkf<azbe> cqkfVar = this.ag;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
        super.Qe();
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<azbe> c = this.e.c(new ayzs(), null);
        this.ag = c;
        c.e(this.af);
        return this.ag.c();
    }

    @Override // defpackage.fd
    public final void ah(View view, @dzsi Bundle bundle) {
        this.ad = (EditText) view.findViewById(R.id.multiline_text_property_editor_text_field);
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        azbg azbgVar = this.af;
        if (azbgVar == null || !azbgVar.k()) {
            return false;
        }
        iii iiiVar = new iii();
        iiiVar.a = this.b.getString(R.string.EDIT_LIST_DISCARD_DIALOG_MESSAGE);
        iiiVar.d(this.b.getString(R.string.DISCARD_BUTTON), new View.OnClickListener(this) { // from class: ayyy
            private final ayyz a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gn gnVar;
                ayyz ayyzVar = this.a;
                if (ayyzVar.aD && (gnVar = ayyzVar.A) != null) {
                    gnVar.f();
                }
            }
        }, null);
        iiiVar.c(this.b.getString(R.string.GO_BACK_BUTTON), null, null);
        iiiVar.a(this.b, this.e).k();
        return true;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (bundle == null) {
            bundle = this.o;
        }
        try {
            bwrs e = this.c.e(baad.class, bundle, "local_list_ref");
            dbsk.s(e);
            baad baadVar = (baad) e.c();
            dbsk.s(baadVar);
            this.ae = baadVar;
            azbh azbhVar = this.f;
            bvqg bvqgVar = new bvqg(this) { // from class: ayyv
                private final ayyz a;

                {
                    this.a = this;
                }

                @Override // defpackage.bvqg
                public final void NU(Object obj) {
                    this.a.Nw((baad) obj);
                }
            };
            gga a = azbhVar.a.a();
            azbh.a(a, 1);
            btvo a2 = azbhVar.b.a();
            azbh.a(a2, 2);
            Executor a3 = azbhVar.c.a();
            azbh.a(a3, 3);
            aymh a4 = azbhVar.d.a();
            azbh.a(a4, 4);
            axwi a5 = azbhVar.e.a();
            azbh.a(a5, 5);
            azbh.a(baadVar, 6);
            azbh.a(bvqgVar, 7);
            this.af = new azbg(a, a2, a3, a4, a5, baadVar, bvqgVar);
        } catch (IOException e2) {
            Throwable cause = e2.getCause();
            dbsk.s(cause);
            dbue.b(cause);
            Throwable cause2 = e2.getCause();
            dbsk.s(cause2);
            throw new RuntimeException(cause2);
        }
    }

    @Override // defpackage.ges
    @dzsi
    public final ddho p() {
        return dtyb.n;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        efg efgVar = this.d;
        egj egjVar = new egj(this);
        egjVar.ag(null);
        cqkf<azbe> cqkfVar = this.ag;
        dbsk.s(cqkfVar);
        egjVar.w(cqkfVar.c());
        egjVar.av(null);
        egjVar.ak(jkc.q, jkc.q);
        egjVar.ai(jjn.FULLY_EXPANDED);
        egf a = egf.a();
        a.n();
        egjVar.A(a);
        egjVar.J(new egq(this) { // from class: ayyw
            private final ayyz a;

            {
                this.a = this;
            }

            @Override // defpackage.egq
            public final void Qs(egu eguVar) {
                EditText editText;
                final ayyz ayyzVar = this.a;
                if (!ayyzVar.aD || (editText = ayyzVar.ad) == null) {
                    return;
                }
                editText.requestFocus();
                ayyzVar.a.c(ayyzVar.ad, 8);
                ayyzVar.ad.post(new Runnable(ayyzVar) { // from class: ayyx
                    private final ayyz a;

                    {
                        this.a = ayyzVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ayyz ayyzVar2 = this.a;
                        EditText editText2 = ayyzVar2.ad;
                        dbsk.s(editText2);
                        editText2.setSelection(ayyzVar2.ad.length());
                        ((InputMethodManager) ayyzVar2.b.getSystemService("input_method")).showSoftInput(ayyzVar2.ad, 1);
                    }
                });
            }
        });
        egjVar.e(this);
        efgVar.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        baad baadVar = this.ae;
        if (baadVar != null) {
            this.c.c(bundle, "local_list_ref", bwrs.a(baadVar));
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        jmw.d(this.b, null);
        super.u();
    }
}
