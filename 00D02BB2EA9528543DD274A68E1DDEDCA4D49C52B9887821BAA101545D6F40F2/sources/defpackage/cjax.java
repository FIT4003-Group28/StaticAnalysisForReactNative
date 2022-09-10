package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: cjax  reason: default package */
/* loaded from: classes4.dex */
public class cjax implements cjar {
    public static final /* synthetic */ int f = 0;
    private static final dcdc<dbsi<dgox, dlmq>> g = dcdc.j(dbsi.a(dgox.VERY_DISSATISFIED, dlmq.VERY_SAD_FACE), dbsi.a(dgox.DISSATISFIED, dlmq.SAD_FACE), dbsi.a(dgox.NEUTRAL, dlmq.NEUTRAL_FACE), dbsi.a(dgox.SATISFIED, dlmq.HAPPY_FACE), dbsi.a(dgox.VERY_SATISFIED, dlmq.VERY_HAPPY_FACE));
    public final CharSequence c;
    public final CharSequence d;
    public final List<cfhc> e;
    private final cjav h;
    private final cfhd i;
    private boolean j = true;

    public cjax(cqhn cqhnVar, Resources resources, cfig cfigVar, final cjau cjauVar, cjav cjavVar, cjaw cjawVar, CharSequence charSequence) {
        this.h = cjavVar;
        this.c = resources.getString(R.string.ARRIVAL_DASHBOARD_SENTIMENT_SURVEY_MINIMUM_SATISFACTION);
        this.d = resources.getString(R.string.ARRIVAL_DASHBOARD_SENTIMENT_SURVEY_MAXIMUM_SATISFACTION);
        dccx F = dcdc.F();
        dcdc<dbsi<dgox, dlmq>> dcdcVar = g;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dbsi<dgox, dlmq> dbsiVar = dcdcVar.get(i);
            dspd b = dgmr.b(dbsiVar.a);
            dddi bo = ((cjah) cjawVar).a.bo(b);
            dlmo bZ = dlmr.d.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dlmr dlmrVar = (dlmr) bZ.b;
            b.getClass();
            int i2 = dlmrVar.a | 1;
            dlmrVar.a = i2;
            dlmrVar.b = b;
            dlmrVar.c = dbsiVar.b.g;
            dlmrVar.a = i2 | 2;
            F.g(cfigVar.a(bo, bZ.bK(), new cfjm(cjauVar) { // from class: cjas
                private final cjau a;

                {
                    this.a = cjauVar;
                }

                @Override // defpackage.cfjm
                public final void a(cfgd cfgdVar) {
                    cjau cjauVar2 = this.a;
                    int i3 = cjax.f;
                    dspd dspdVar = cfgdVar.b;
                    cjal cjalVar = ((cjaf) cjauVar2).a;
                    cjalVar.bq(dspdVar);
                    if (cjalVar.ag.a()) {
                        if (cjalVar.ah.a()) {
                            cjalVar.ah.b().a();
                        }
                        List<cfgf> bp = cjalVar.bp(cjalVar.ag.b(), dspdVar);
                        cedo g2 = cedo.g(cjalVar.ag.b().b);
                        cezv cezvVar = cjalVar.e;
                        dbsk.s(cezvVar);
                        if (cezvVar.e(cjalVar.ag.b(), bp, g2)) {
                            return;
                        }
                        cjalVar.br();
                        return;
                    }
                    if (cjalVar.ai.a()) {
                        cjalVar.ai.b().a();
                    }
                    cjalVar.br();
                }
            }));
        }
        this.e = F.f();
        this.i = new cjat(this, charSequence);
    }

    @Override // defpackage.cjar
    public cfhd a() {
        return this.i;
    }

    @Override // defpackage.cjar
    public Boolean b() {
        return Boolean.valueOf(this.j);
    }

    @Override // defpackage.cjar
    public cqkl c() {
        ((cjag) this.h).a.aT();
        return cqkl.a;
    }

    @Override // defpackage.cjar
    public void d() {
        this.j = false;
        cqkx.p(this);
    }
}
