package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bjci  reason: default package */
/* loaded from: classes3.dex */
public class bjci implements bjcg {
    private final String a;
    private final jic b;
    private final Runnable c;
    private final cjtd d;
    private final cjtd e;
    private final bjhc f;
    private final cafi g;
    private final Boolean h;

    public bjci(gga ggaVar, bwqv bwqvVar, bjhc bjhcVar, cafi cafiVar, bjgb bjgbVar, bwrs<ilo> bwrsVar, ddho ddhoVar) {
        this(ggaVar, bwqvVar, bjhcVar, cafiVar, bjgbVar, bwrsVar, ddhoVar, ggaVar.getString(R.string.PLACE_QA_INPUT_QUESTION_HINT_TEXT));
    }

    @Override // defpackage.bjcg
    public cqkl a() {
        this.g.k(null, null);
        return cqkl.a;
    }

    @Override // defpackage.bjcg
    public cqkl b() {
        this.f.c(this.c);
        return cqkl.a;
    }

    @Override // defpackage.bjcg
    public cjtd c() {
        return this.d;
    }

    @Override // defpackage.bjcg
    public cjtd d() {
        return this.e;
    }

    @Override // defpackage.bjcg
    public String e() {
        return this.a;
    }

    @Override // defpackage.bjcg
    public jic f() {
        return this.b;
    }

    @Override // defpackage.bjcg
    public Boolean g() {
        return this.h;
    }

    public bjci(final gga ggaVar, final bwqv bwqvVar, bjhc bjhcVar, cafi cafiVar, bjgb bjgbVar, final bwrs<ilo> bwrsVar, ddho ddhoVar, String str) {
        this.f = bjhcVar;
        this.g = cafiVar;
        ilo c = bwrsVar.c();
        dbsk.s(c);
        this.b = bjhcVar.b(c);
        this.a = bjgb.a(c) ? ggaVar.getString(R.string.PLACE_QA_INPUT_QUESTION_HINT_TEXT_CITY_QA, new Object[]{c.n()}) : str;
        this.c = new Runnable(ggaVar, bwqvVar, bwrsVar) { // from class: bjch
            private final gga a;
            private final bwqv b;
            private final bwrs c;

            {
                this.a = ggaVar;
                this.b = bwqvVar;
                this.c = bwrsVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.D(bjck.q(this.b, this.c));
            }
        };
        cjta c2 = cjtd.c(c.bZ());
        c2.d = ddhoVar;
        this.d = c2.a();
        cjta c3 = cjtd.c(c.bZ());
        c3.d = dtxy.fS;
        this.e = c3.a();
        this.h = Boolean.valueOf(bjhcVar.d(c));
    }
}
