package defpackage;

import android.app.Activity;
import android.text.Html;
import android.view.View;
import com.google.android.apps.gmm.shared.util.IncognitoSafeURLSpan;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: aekn  reason: default package */
/* loaded from: classes2.dex */
public class aekn implements aekg, aekr {
    private final aekm a;
    private final Activity b;
    private final bvjj c;
    private final List<cqix<?>> d;
    private final acpa e;
    private boolean f;

    public aekn(Activity activity, btvo btvoVar, cqhn cqhnVar, bvjj bvjjVar, dqtl dqtlVar, aekm aekmVar) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.b = activity;
        this.c = bvjjVar;
        this.a = aekmVar;
        arrayList.addAll(m(dqtlVar.d, btvoVar));
        arrayList.addAll(m(dqtlVar.c, btvoVar));
        CharSequence a = IncognitoSafeURLSpan.a(Html.fromHtml(activity.getString(R.string.CURRENCY_LOCATION_TOOLTIP, new Object[]{String.format("https://support.google.com/websearch/answer/179386?hl=%s", Locale.getDefault().getLanguage())})));
        this.e = new acpc(a, a, acpc.c);
    }

    private final dcdc<cqix<aeki>> m(List<dqtk> list, btvo btvoVar) {
        return dcbg.b(list).s(new dbrn(this) { // from class: aekl
            private final aekn a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                dqtk dqtkVar = (dqtk) obj;
                return cqgr.fT(new aejz(), new aeks(this.a, dqtkVar.b, dqtkVar.a, dqtkVar.c));
            }
        }).z();
    }

    @Override // defpackage.izz
    public cqkl a() {
        return cqkl.a;
    }

    @Override // defpackage.izz
    public cqkl b() {
        ((aejf) this.a).a.aQ();
        return cqkl.a;
    }

    @Override // defpackage.jaa
    @dzsi
    public jib c() {
        cjtd cjtdVar;
        jhz a = jhz.a();
        a.a = this.b.getString(R.string.PRICE_SETTINGS_TITLE);
        a.A = false;
        a.i = cqrt.g(2131232205, ibm.t());
        if (this.f) {
            cjtdVar = cjtd.a(dtxl.io);
        } else {
            cjtdVar = cjtd.b;
        }
        a.o = cjtdVar;
        a.j = cqrt.l(R.string.ACCESSIBILITY_CLOSE_MENU);
        a.f(new View.OnClickListener(this) { // from class: aekk
            private final aekn a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.b();
            }
        });
        return a.b();
    }

    @Override // defpackage.jaa
    public List<cqix<?>> d() {
        return dcdc.f(cqgr.fT(new aejp(), this));
    }

    @Override // defpackage.jaa
    @dzsi
    public cjtd e() {
        return null;
    }

    @Override // defpackage.jan
    public Boolean f() {
        return Boolean.valueOf(this.f);
    }

    @Override // defpackage.jan
    public Boolean g() {
        return false;
    }

    @Override // defpackage.jan
    public cjio h() {
        cjiv p = cjiw.p();
        String string = this.b.getString(R.string.APPLY_BUTTON);
        cjtd a = cjtd.a(dtxr.cB);
        mw<cjqm> mwVar = new mw() { // from class: cjit
            @Override // defpackage.mw
            public final void a(Object obj) {
                cjqm cjqmVar = (cjqm) obj;
            }
        };
        if (string != null) {
            cjip cjipVar = (cjip) p;
            cjipVar.a = string;
            cjipVar.b = mwVar;
            cjipVar.c = a;
            String string2 = this.b.getString(R.string.CANCEL_BUTTON);
            final Runnable runnable = new Runnable(this) { // from class: aekj
                private final aekn a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b();
                }
            };
            cjtd a2 = cjtd.a(dtxr.cA);
            mw<cjqm> mwVar2 = new mw(runnable) { // from class: cjiu
                private final Runnable a;

                {
                    this.a = runnable;
                }

                @Override // defpackage.mw
                public final void a(Object obj) {
                    cjqm cjqmVar = (cjqm) obj;
                    this.a.run();
                }
            };
            if (string2 == null) {
                throw new NullPointerException("Null defaultActionText");
            }
            cjipVar.e = string2;
            cjipVar.f = mwVar2;
            cjipVar.g = a2;
            String str = cjipVar.a == null ? " promotedActionText" : "";
            if (cjipVar.b == null) {
                str = str.concat(" promotedActionClickHandlerInternal");
            }
            if (cjipVar.d == null) {
                str = String.valueOf(str).concat(" promotedActionEnabled");
            }
            if (cjipVar.e == null) {
                str = String.valueOf(str).concat(" defaultActionText");
            }
            if (cjipVar.f == null) {
                str = String.valueOf(str).concat(" defaultActionClickHandlerInternal");
            }
            if (cjipVar.h == null) {
                str = String.valueOf(str).concat(" defaultActionEnabled");
            }
            if (cjipVar.i == null) {
                str = String.valueOf(str).concat(" elevated");
            }
            if (str.isEmpty()) {
                return new cjiq(cjipVar.a, cjipVar.b, cjipVar.c, cjipVar.d.booleanValue(), cjipVar.e, cjipVar.f, cjipVar.g, cjipVar.h.booleanValue(), cjipVar.i.booleanValue());
            }
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        throw new NullPointerException("Null promotedActionText");
    }

    @Override // defpackage.aekg
    public List<cqix<?>> i() {
        return this.d;
    }

    @Override // defpackage.aekg
    public acpa j() {
        return this.e;
    }

    public void k(boolean z) {
        this.f = true;
        cqkx.p(this);
    }

    @Override // defpackage.aekr
    public void l(String str) {
        boolean z = !this.c.z(bvjk.A, "").equals(str);
        if (z) {
            this.c.ac(bvjk.A, str);
        }
        aekm aekmVar = this.a;
        if (z) {
            ((aejf) aekmVar).a.Nw(new aekf());
        }
        ((aejf) aekmVar).a.aQ();
    }
}
