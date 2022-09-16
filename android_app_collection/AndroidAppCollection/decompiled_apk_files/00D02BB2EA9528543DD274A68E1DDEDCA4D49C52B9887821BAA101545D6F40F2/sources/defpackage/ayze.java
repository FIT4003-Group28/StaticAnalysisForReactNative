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
/* renamed from: ayze  reason: default package */
/* loaded from: classes3.dex */
public final class ayze extends ges {
    public cpv a;
    public EditText ad;
    private baal ae;
    private azbj af;
    private cqkf<azbe> ag;
    public gga b;
    public bwqv c;
    public efg d;
    public cqkj e;
    public azbk f;
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
        azbj azbjVar = this.af;
        if (azbjVar == null || !azbjVar.k()) {
            return false;
        }
        iii iiiVar = new iii();
        iiiVar.a = this.b.getString(R.string.EDIT_LIST_DISCARD_DIALOG_MESSAGE);
        iiiVar.d(this.b.getString(R.string.DISCARD_BUTTON), new View.OnClickListener(this) { // from class: ayzd
            private final ayze a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gn gnVar;
                ayze ayzeVar = this.a;
                if (ayzeVar.aD && (gnVar = ayzeVar.A) != null) {
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
            bwrs e = this.c.e(baal.class, bundle, "local_list_item_ref");
            dbsk.s(e);
            baal baalVar = (baal) e.c();
            dbsk.s(baalVar);
            this.ae = baalVar;
            azbk azbkVar = this.f;
            bvqg bvqgVar = new bvqg(this) { // from class: ayza
                private final ayze a;

                {
                    this.a = this;
                }

                @Override // defpackage.bvqg
                public final void NU(Object obj) {
                    this.a.Nw((baal) obj);
                }
            };
            gga a = azbkVar.a.a();
            azbk.a(a, 1);
            btvo a2 = azbkVar.b.a();
            azbk.a(a2, 2);
            Executor a3 = azbkVar.c.a();
            azbk.a(a3, 3);
            aymh a4 = azbkVar.d.a();
            azbk.a(a4, 4);
            axwi a5 = azbkVar.e.a();
            azbk.a(a5, 5);
            azbk.a(baalVar, 6);
            azbk.a(bvqgVar, 7);
            this.af = new azbj(a, a2, a3, a4, a5, baalVar, bvqgVar);
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
        return dtyb.p;
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
        egjVar.J(new egq(this) { // from class: ayzb
            private final ayze a;

            {
                this.a = this;
            }

            @Override // defpackage.egq
            public final void Qs(egu eguVar) {
                EditText editText;
                final ayze ayzeVar = this.a;
                if (!ayzeVar.aD || (editText = ayzeVar.ad) == null) {
                    return;
                }
                editText.requestFocus();
                ayzeVar.a.c(ayzeVar.ad, 8);
                ayzeVar.ad.post(new Runnable(ayzeVar) { // from class: ayzc
                    private final ayze a;

                    {
                        this.a = ayzeVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ayze ayzeVar2 = this.a;
                        EditText editText2 = ayzeVar2.ad;
                        dbsk.s(editText2);
                        editText2.setSelection(ayzeVar2.ad.length());
                        ((InputMethodManager) ayzeVar2.b.getSystemService("input_method")).showSoftInput(ayzeVar2.ad, 1);
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
        baal baalVar = this.ae;
        if (baalVar != null) {
            this.c.c(bundle, "local_list_item_ref", bwrs.a(baalVar));
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        jmw.d(this.b, null);
        super.u();
    }
}
