package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.Locale;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: nnb  reason: default package */
/* loaded from: classes7.dex */
public class nnb implements nmz {
    public final nml a;
    public final cjqy b;
    public final cjqq c;
    public final crzm<Boolean> d;
    public final Executor e;
    public final cqhn f;
    public nmk g;
    public final crzp<Boolean> h = new nna(this);
    public final kcx i;
    public final nmc j;
    private final bttf k;
    private final jzp l;
    private final Context m;

    public nnb(nml nmlVar, kcx kcxVar, bttf bttfVar, cjqy cjqyVar, cjqq cjqqVar, jzp jzpVar, Context context, nmc nmcVar, crzm crzmVar, Executor executor, nmk nmkVar, cqhn cqhnVar) {
        this.a = nmlVar;
        this.i = kcxVar;
        this.k = bttfVar;
        this.b = cjqyVar;
        this.c = cjqqVar;
        this.l = jzpVar;
        this.m = context;
        this.j = nmcVar;
        this.d = crzmVar;
        this.e = executor;
        dbsk.s(nmkVar);
        this.g = nmkVar;
        this.f = cqhnVar;
    }

    private static void i(SpannableString spannableString, String str, ClickableSpan clickableSpan) {
        int indexOf = spannableString.toString().indexOf(str);
        spannableString.setSpan(clickableSpan, indexOf, str.length() + indexOf, 33);
    }

    @Override // defpackage.nmz
    public Boolean a() {
        boolean z = false;
        if (this.g != nmk.NONE) {
            Boolean l = this.d.l();
            dbsk.s(l);
            if (l.booleanValue()) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.nmz
    public Boolean b() {
        boolean z = false;
        if (this.g == nmk.MAPS_TERMS_OF_SERVICE) {
            Boolean l = this.d.l();
            dbsk.s(l);
            if (!l.booleanValue()) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.nmz
    public CharSequence c() {
        return this.m.getResources().getString(R.string.CAR_MAPS_TERMS_LOCKOUT);
    }

    @Override // defpackage.nmz
    public CharSequence d() {
        return this.m.getResources().getString(R.string.WELCOME_TO_GOOGLE_MAPS);
    }

    @Override // defpackage.nmz
    public CharSequence e() {
        String string;
        final nmj nmjVar;
        String string2 = this.m.getResources().getString(R.string.TERMS_OF_SERVICE);
        String string3 = this.m.getResources().getString(R.string.KOREAN_LOCATION_TERMS_OF_SERVICE);
        String string4 = this.m.getResources().getString(R.string.PRIVACY_POLICY_IN_FULL_LEGAL_TEXT);
        if (bycr.a(this.k)) {
            string = this.m.getResources().getString(R.string.KOREA_LEGAL_TEXT, string2, string3, string4);
        } else {
            string = this.m.getResources().getString(R.string.LEGAL_TEXT, string2, string4);
        }
        SpannableString spannableString = new SpannableString(string);
        if (Locale.GERMANY.getCountry().equals(this.k.a())) {
            nmjVar = nmj.TERMS_OF_SERVICE_DE;
        } else {
            nmjVar = nmj.TERMS_OF_SERVICE;
        }
        i(spannableString, string2, new URLSpan(nmjVar) { // from class: com.google.android.apps.gmm.car.terms.TermsViewModelImpl$TermsURLSpan
            private final nmj b;
            @dzsi
            private final cjql c;

            {
                super(nmjVar.a());
                this.b = nmjVar;
                ddho ddhoVar = nmjVar.h;
                this.c = ddhoVar != null ? nnb.this.c.g().d(cjtd.a(ddhoVar)) : null;
            }

            @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
            public final void onClick(View view) {
                cjql cjqlVar;
                nml nmlVar = nnb.this.a;
                nmlVar.a(this.b);
                nmlVar.b();
                ddho ddhoVar = this.b.h;
                if (ddhoVar == null || (cjqlVar = this.c) == null) {
                    return;
                }
                nnb.this.b.n(cjqlVar, new cjte(deaf.TAP), cjtd.a(ddhoVar));
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
            }
        });
        if (bycr.a(this.k)) {
            final nmj nmjVar2 = nmj.KOREAN_LOCATION_TERMS_OF_SERVICE;
            i(spannableString, string3, new URLSpan(nmjVar2) { // from class: com.google.android.apps.gmm.car.terms.TermsViewModelImpl$TermsURLSpan
                private final nmj b;
                @dzsi
                private final cjql c;

                {
                    super(nmjVar2.a());
                    this.b = nmjVar2;
                    ddho ddhoVar = nmjVar2.h;
                    this.c = ddhoVar != null ? nnb.this.c.g().d(cjtd.a(ddhoVar)) : null;
                }

                @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
                public final void onClick(View view) {
                    cjql cjqlVar;
                    nml nmlVar = nnb.this.a;
                    nmlVar.a(this.b);
                    nmlVar.b();
                    ddho ddhoVar = this.b.h;
                    if (ddhoVar == null || (cjqlVar = this.c) == null) {
                        return;
                    }
                    nnb.this.b.n(cjqlVar, new cjte(deaf.TAP), cjtd.a(ddhoVar));
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setUnderlineText(false);
                }
            });
        }
        final nmj nmjVar3 = nmj.PRIVACY_POLICY_IN_FULL_LEGAL_TEXT;
        i(spannableString, string4, new URLSpan(nmjVar3) { // from class: com.google.android.apps.gmm.car.terms.TermsViewModelImpl$TermsURLSpan
            private final nmj b;
            @dzsi
            private final cjql c;

            {
                super(nmjVar3.a());
                this.b = nmjVar3;
                ddho ddhoVar = nmjVar3.h;
                this.c = ddhoVar != null ? nnb.this.c.g().d(cjtd.a(ddhoVar)) : null;
            }

            @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
            public final void onClick(View view) {
                cjql cjqlVar;
                nml nmlVar = nnb.this.a;
                nmlVar.a(this.b);
                nmlVar.b();
                ddho ddhoVar = this.b.h;
                if (ddhoVar == null || (cjqlVar = this.c) == null) {
                    return;
                }
                nnb.this.b.n(cjqlVar, new cjte(deaf.TAP), cjtd.a(ddhoVar));
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
            }
        });
        return spannableString;
    }

    @Override // defpackage.nmz
    public cqkl f() {
        nml nmlVar = this.a;
        nmk nmkVar = this.g;
        nmk nmkVar2 = nmk.NONE;
        if (nmkVar.ordinal() == 1) {
            nmb.a(nmlVar.a);
            nmlVar.e.b();
            nnb nnbVar = nmlVar.o;
            nnbVar.d.c(nnbVar.h);
            nnb nnbVar2 = nmlVar.o;
            nnbVar2.g = nmk.NONE;
            cqhn cqhnVar = nnbVar2.f;
            cqkx.p(nnbVar2);
            ((nst) nmlVar.n.c()).setDefaultViewProvider(null);
            nmlVar.f.a();
            nmlVar.d.h(nmlVar.n.c());
            nmlVar.n.e(null);
        }
        return cqkl.a;
    }

    @Override // defpackage.nmz
    public cqkl g() {
        nmj nmjVar;
        nml nmlVar = this.a;
        if (Locale.GERMANY.equals(bycr.b(nmlVar.a))) {
            nmjVar = nmj.TERMS_OF_SERVICE_DE;
        } else {
            nmjVar = nmj.TERMS_OF_SERVICE;
        }
        nmlVar.a(nmjVar);
        nmlVar.a(nmj.PRIVACY_POLICY);
        if (bycr.a(nmlVar.a)) {
            nmlVar.a(nmj.KOREAN_LOCATION_TERMS_OF_SERVICE);
        }
        nmlVar.b();
        return cqkl.a;
    }

    @Override // defpackage.nmz
    public Boolean h() {
        return Boolean.valueOf(this.l.h());
    }
}
