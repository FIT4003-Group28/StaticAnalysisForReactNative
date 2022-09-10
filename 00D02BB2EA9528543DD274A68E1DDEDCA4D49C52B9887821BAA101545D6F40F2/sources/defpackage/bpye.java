package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bpye  reason: default package */
/* loaded from: classes4.dex */
public final class bpye extends itb implements bpyf {
    private final gga a;
    private final bwqv b;
    private final dxio<akfa> c;
    private final cztz d;
    private final btpc e;
    private final bqai f;
    private final bqdl g;

    public bpye(gga ggaVar, bwqv bwqvVar, dxio<akfa> dxioVar, cztz cztzVar, btpc btpcVar, bqai bqaiVar, bqdl bqdlVar) {
        this.a = ggaVar;
        this.b = bwqvVar;
        this.c = dxioVar;
        this.d = cztzVar;
        this.e = btpcVar;
        this.f = bqaiVar;
        this.g = bqdlVar;
    }

    private final boolean i() {
        if (!this.e.i()) {
            cztq a = cztt.a(this.d);
            a.e(R.string.REPORT_A_PROBLEM_NOT_AVAILABLE_OFFLINE, new Object[0]);
            a.c();
            return true;
        }
        return false;
    }

    private final void j(bpyc bpycVar) {
        btlu j = this.c.a().j();
        if (btlu.i(j) == btlt.INCOGNITO) {
            bwqv bwqvVar = this.b;
            afdr i = afdt.i();
            i.b(R.string.DISABLE_INCOGNITO_BODY_TEXT);
            i.c(bpycVar);
            this.a.D(afaw.aR(bwqvVar, i.a()));
        } else if (j == null || !j.u()) {
            this.a.D(akef.i(this.b, bpycVar, R.string.RAP_AAP_LOGIN_SCREEN_TITLE, R.string.RAP_AAP_LOGIN_SCREEN_SUBTITLE));
        } else {
            bpycVar.a(this.a, true);
        }
    }

    @Override // defpackage.bpyf
    public final void e(dnqb dnqbVar, akqq akqqVar) {
        if (i()) {
            return;
        }
        dnps bZ = dnqe.i.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqe dnqeVar = (dnqe) bZ.b;
        dnqeVar.b = dnqbVar.ah;
        dnqeVar.a |= 1;
        j(new bpyd(bZ.bK(), akqqVar));
    }

    @Override // defpackage.bpyf
    public final void f(dnqe dnqeVar, @dzsi akqq akqqVar) {
        if (i()) {
            return;
        }
        bqai bqaiVar = this.f;
        if (bqaiVar.a) {
            dnqeVar = bpun.a(dnqeVar, dnpv.EXPERIMENT_ARM_FEATURE_MULTI_MISSING_ROAD, "Launch");
            bqdl bqdlVar = this.g;
            if (bqdlVar.a) {
                dnqeVar = bpun.a(dnqeVar, dnpv.EXPERIMENT_ARM_FEATURE_MULTI_MISSING_ROAD_SNAPPING, "Launch");
            } else if (bqdlVar.b) {
                dnqeVar = bpun.a(dnqeVar, dnpv.EXPERIMENT_ARM_FEATURE_MULTI_MISSING_ROAD_SNAPPING, "Control");
            }
        } else if (bqaiVar.b) {
            dnqeVar = bpun.a(dnqeVar, dnpv.EXPERIMENT_ARM_FEATURE_MULTI_MISSING_ROAD, "Control");
        }
        j(new bpya(dnqeVar, akqqVar, true != this.f.a ? 2 : 3));
    }
}
