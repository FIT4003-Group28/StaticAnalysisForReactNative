package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
/* compiled from: PG */
/* renamed from: kls  reason: default package */
/* loaded from: classes7.dex */
public class kls implements klg {
    @dzsi
    public klr a;
    private final Context b;
    @dzsi
    private final cqtd c;
    @dzsi
    private final cqtd d;
    @dzsi
    private final jic e;
    private final int f;
    private final ddho g;
    private ldm h;
    @dzsi
    private CharSequence i;
    private CharSequence j;
    private CharSequence k;
    private boolean l;

    public kls(Context context, CharSequence charSequence, CharSequence charSequence2, ldm ldmVar, @dzsi cqtd cqtdVar, cqtd cqtdVar2, @dzsi CharSequence charSequence3, klr klrVar, int i, ddho ddhoVar) {
        this(context, charSequence, charSequence2, ldmVar, cqtdVar, cqtdVar2, (jic) null, klrVar, i, ddhoVar);
    }

    @Override // defpackage.klg
    public CharSequence a() {
        return this.j;
    }

    @Override // defpackage.klg
    public CharSequence b() {
        return this.k;
    }

    @Override // defpackage.klg
    @dzsi
    public CharSequence c() {
        return this.i;
    }

    @Override // defpackage.klg
    public cqkl d() {
        ldm ldmVar;
        klr klrVar = this.a;
        if (klrVar != null && (ldmVar = this.h) != null) {
            klrVar.a(ldmVar);
        }
        return cqkl.a;
    }

    @Override // defpackage.klg
    public View.OnFocusChangeListener e() {
        return new View.OnFocusChangeListener(this) { // from class: klp
            private final kls a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                klr klrVar;
                kls klsVar = this.a;
                if (!z || (klrVar = klsVar.a) == null) {
                    return;
                }
                klrVar.b();
            }
        };
    }

    @Override // defpackage.klg
    @dzsi
    public cqtd f() {
        return this.c;
    }

    @Override // defpackage.klg
    @dzsi
    public cqtd g() {
        return this.d;
    }

    @Override // defpackage.klg
    @dzsi
    public jic h() {
        return this.e;
    }

    @Override // defpackage.klg
    @dzsi
    public cjtd i() {
        cjta b = cjtd.b();
        b.d = this.g;
        b.i(this.f);
        return b.a();
    }

    @Override // defpackage.klg
    public boolean j() {
        return this.l;
    }

    @Override // defpackage.klg
    public Boolean k() {
        return false;
    }

    public void l(CharSequence charSequence) {
        this.k = charSequence;
        cqkx.p(this);
    }

    public void m(ldm ldmVar) {
        this.h = ldmVar;
        this.l = true;
        if (ldmVar.m() > 0) {
            Resources resources = this.b.getResources();
            amve n = ldmVar.n(0);
            String charSequence = bvtb.c(resources, vyb.x(n), bvsz.ABBREVIATED).toString();
            int b = nql.b(vyb.d(n)).b(this.b);
            bvsv a = new bvsx(resources).a(charSequence);
            a.l(b);
            this.i = a.c();
            cqkx.p(this);
        }
    }

    private kls(Context context, CharSequence charSequence, CharSequence charSequence2, final ldm ldmVar, @dzsi cqtd cqtdVar, @dzsi cqtd cqtdVar2, @dzsi jic jicVar, klr klrVar, int i, ddho ddhoVar) {
        boolean z = false;
        dbsk.l((jicVar != null ? true : z) ^ (cqtdVar2 != null));
        this.b = context;
        this.j = charSequence;
        this.k = charSequence2;
        this.h = ldmVar;
        this.i = null;
        this.c = cqtdVar;
        this.d = cqtdVar2;
        this.e = jicVar;
        this.a = klrVar;
        this.f = i;
        this.g = ddhoVar;
        this.l = true;
        btsp.b(new dbty(ldmVar) { // from class: klo
            private final ldm a;

            {
                this.a = ldmVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                final ldm ldmVar2 = this.a;
                return new kor(new dbty(ldmVar2) { // from class: klq
                    private final ldm a;

                    {
                        this.a = ldmVar2;
                    }

                    @Override // defpackage.dbty
                    public final Object a() {
                        ldm ldmVar3 = this.a;
                        return ldmVar3.m() > 0 ? dbsg.i(ldmVar3.n(0)) : dbpy.a;
                    }
                });
            }
        });
    }

    public kls(Context context, CharSequence charSequence, CharSequence charSequence2, ldm ldmVar, String str, @dzsi CharSequence charSequence3, klr klrVar, int i, ddho ddhoVar) {
        this(context, charSequence, charSequence2, ldmVar, (cqtd) null, (cqtd) null, nqu.ao(str), klrVar, i, ddhoVar);
    }
}
