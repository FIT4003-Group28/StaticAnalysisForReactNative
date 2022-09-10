package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bjyq  reason: default package */
/* loaded from: classes3.dex */
public class bjyq implements bjwn {
    private final jic a;
    private final CharSequence b;
    private final Boolean c;
    private final Boolean d;
    private final CharSequence e;
    private final cqss f;
    private final Boolean g;
    private final Runnable h;
    private final cjtd i;

    public bjyq(gga ggaVar, final afgy afgyVar, bwrs<ilo> bwrsVar, djam djamVar, boolean z) {
        Runnable runnable;
        ilo c = bwrsVar.c();
        dbsk.s(c);
        djag djagVar = djamVar.c;
        this.a = bjgr.e(djagVar == null ? djag.d : djagVar);
        djag djagVar2 = djamVar.c;
        this.b = bjgr.a(ggaVar, c, djagVar2 == null ? djag.d : djagVar2);
        djag djagVar3 = djamVar.c;
        this.d = bjgr.f(djagVar3 == null ? djag.d : djagVar3);
        this.c = Boolean.valueOf(z);
        String str = djamVar.i;
        this.e = z ? ggaVar.getString(R.string.PLACE_QA_POST_HEADER_POST_DATE, new Object[]{str}) : str;
        this.f = z ? ibm.n() : ibm.o();
        djag djagVar4 = djamVar.c;
        final String g = bjgr.g(djagVar4 == null ? djag.d : djagVar4);
        Boolean valueOf = Boolean.valueOf(!g.isEmpty());
        this.g = valueOf;
        if (valueOf.booleanValue()) {
            runnable = new Runnable(afgyVar, g) { // from class: bjyp
                private final afgy a;
                private final String b;

                {
                    this.a = afgyVar;
                    this.b = g;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.f(this.b);
                }
            };
        } else {
            runnable = deic.a;
        }
        this.h = runnable;
        cjta c2 = cjtd.c(c.bZ());
        c2.d = dtxy.ga;
        this.i = c2.a();
    }

    @Override // defpackage.bjwn
    public jic a() {
        return this.a;
    }

    @Override // defpackage.bjwn
    public CharSequence b() {
        return this.b;
    }

    @Override // defpackage.bjwn
    public Boolean c() {
        return this.c;
    }

    @Override // defpackage.bjwn
    public Boolean d() {
        return this.d;
    }

    @Override // defpackage.bjwn
    public CharSequence e() {
        return this.e;
    }

    @Override // defpackage.bjwn
    public cqss f() {
        return this.f;
    }

    @Override // defpackage.bjwn
    public Boolean g() {
        return this.g;
    }

    @Override // defpackage.bjwn
    public cqkl h() {
        this.h.run();
        return cqkl.a;
    }

    @Override // defpackage.bjwn
    public cjtd i() {
        return this.i;
    }
}
