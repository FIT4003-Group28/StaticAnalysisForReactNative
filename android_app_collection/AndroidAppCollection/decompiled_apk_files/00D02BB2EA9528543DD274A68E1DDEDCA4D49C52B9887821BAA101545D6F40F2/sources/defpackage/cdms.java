package defpackage;

import com.google.android.apps.gmm.ugc.post.editor.StructuredQuestionAnswer;
import com.google.android.apps.gmm.ugc.post.photo.MediaData;
/* compiled from: PG */
/* renamed from: cdms  reason: default package */
/* loaded from: classes4.dex */
public final class cdms extends an {
    public static final bbtu a = new bbpz(new bbpx());
    public final z<ilo> d;
    public final v<Boolean> e;
    public final cdkb<CharSequence> f;
    public final cdkb<Float> g;
    public final cdkb<dcdc<MediaData>> h;
    public final v<cdjd> i;
    public final v<String> j;
    public final v<CharSequence> k;
    public final z<dcdc<MediaData>> l;
    public final z<dcdc<drfo>> m;
    public final cdkb<StructuredQuestionAnswer> n;
    public final v<Boolean> o;
    public final z<Boolean> p;
    public akqi q;

    public cdms(ad adVar) {
        z<ilo> zVar = new z<>();
        this.d = zVar;
        v<cdjd> a2 = am.a(zVar, cdlx.a);
        this.i = a2;
        this.j = am.a(zVar, cdmh.a);
        this.k = am.a(zVar, cdmk.a);
        z<dcdc<MediaData>> zVar2 = new z<>(dcdc.e());
        this.l = zVar2;
        z<dcdc<drfo>> zVar3 = new z<>(dcdc.e());
        this.m = zVar3;
        am.a(zVar, cdml.a);
        this.q = null;
        cdkb<CharSequence> cdkbVar = new cdkb<>(adVar.a("content"), am.a(a2, cdmm.a), cdmn.a);
        this.f = cdkbVar;
        cdkb<Float> cdkbVar2 = new cdkb<>(adVar.a("rating"), am.a(a2, cdmo.a));
        this.g = cdkbVar2;
        cdkb<StructuredQuestionAnswer> cdkbVar3 = new cdkb<>(adVar.a("answerData"), am.a(a2, cdmp.a));
        this.n = cdkbVar3;
        zVar.c(new aa(this) { // from class: cdmq
            private final cdms a;

            {
                this.a = this;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                cdms cdmsVar = this.a;
                ilo iloVar = (ilo) obj;
                akqi ai = iloVar.ai();
                cdjd c = cdms.c(iloVar);
                if (!ai.equals(cdmsVar.q) || c.a().c().equals(cdja.PUBLISHED)) {
                    cdmsVar.f.p(cdms.g(c));
                    cdmsVar.g.p(cdms.h(c));
                    cdmsVar.l.g(dcbg.b(cdrr.q(iloVar.bq(), dqgr.PUBLISHED).c().a()).s(cdmi.a).s(cdmj.a).z());
                    cdmsVar.n.p(cdms.i(c));
                }
                cdmsVar.q = ai;
            }
        });
        this.h = new cdkb<>(adVar.a("mediaList"), zVar2);
        this.o = cdkt.a(cdkt.a(cdkbVar.i, cdkbVar2.i), cdkbVar3.i);
        z<Boolean> b = adVar.b("isInitialOpen", true);
        this.p = b;
        this.e = b;
        am.a(zVar3, cdmr.a);
    }

    public static cdjd c(ilo iloVar) {
        docg bq;
        dqgr dqgrVar;
        if (iloVar.br()) {
            bq = iloVar.bs();
            dqgrVar = dqgr.DRAFT;
        } else {
            bq = iloVar.bq();
            dqgrVar = dqgr.PUBLISHED;
        }
        return cdrr.q(bq, dqgrVar);
    }

    public static Long d(ilo iloVar) {
        return Long.valueOf(iloVar.ai().n().a);
    }

    public static dcdc e(dcdc<drfo> dcdcVar) {
        drfl drflVar;
        dsrj<drfj> dsrjVar;
        drff drffVar;
        dccx F = dcdc.F();
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            drfo drfoVar = dcdcVar.get(i);
            boolean z = true;
            boolean z2 = drfoVar.a == 4;
            String str = drfoVar.d;
            int a2 = drfn.a(drfoVar.f);
            if (a2 == 0 || a2 != 2) {
                z = false;
            }
            F.g(new cdol(str, z));
            String str2 = drfoVar.e;
            if (z2) {
                if (drfoVar.a == 4) {
                    drffVar = (drff) drfoVar.b;
                } else {
                    drffVar = drff.b;
                }
                dsrjVar = drffVar.a;
            } else {
                if (drfoVar.a == 3) {
                    drflVar = (drfl) drfoVar.b;
                } else {
                    drflVar = drfl.b;
                }
                dsrjVar = drflVar.a;
            }
            dcdc z3 = dcbg.b(dsrjVar).s(cdmg.a).z();
            drfq drfqVar = drfoVar.c;
            if (drfqVar == null) {
                drfqVar = drfq.a;
            }
            F.g(cdop.f(str2, z3, z2, drfqVar));
        }
        return F.f();
    }

    public static CharSequence f(ilo iloVar) {
        String str = iloVar.bv().e;
        if (!str.isEmpty()) {
            return str;
        }
        return null;
    }

    public static String g(cdjd cdjdVar) {
        dbsg<cdjl> b = cdjdVar.c().b();
        cdrs h = cdrt.h();
        h.c("");
        h.d(false);
        h.e(false);
        return b.c(h.a()).a();
    }

    public static Float h(cdjd cdjdVar) {
        return Float.valueOf(cdjdVar.c().e().c(0).floatValue());
    }

    public static StructuredQuestionAnswer i(cdjd cdjdVar) {
        if (cdjdVar == null) {
            return StructuredQuestionAnswer.c(dcdc.e());
        }
        return StructuredQuestionAnswer.c(cdjdVar.c().i());
    }
}
