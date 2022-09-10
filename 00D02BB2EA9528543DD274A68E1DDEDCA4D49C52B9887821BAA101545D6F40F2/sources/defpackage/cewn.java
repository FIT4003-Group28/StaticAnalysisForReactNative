package defpackage;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cewn  reason: default package */
/* loaded from: classes4.dex */
public class cewn extends ceve<dkdg, dkdm> implements cevf {
    public boolean a;
    private final Activity b;
    private final cevb c;
    @dzsi
    private final ceuw<dkde> h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cewn(android.app.Activity r17, defpackage.cqhn r18, defpackage.btvo r19, defpackage.cefd r20, defpackage.ceuo r21, defpackage.nvh r22, defpackage.isd r23, defpackage.cese r24, defpackage.cgrc r25, defpackage.cevb r26, java.lang.String r27, @defpackage.dzsi java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cewn.<init>(android.app.Activity, cqhn, btvo, cefd, ceuo, nvh, isd, cese, cgrc, cevb, java.lang.String, java.lang.String):void");
    }

    @Override // defpackage.cevf
    public void a(nxj nxjVar) {
        if (nxjVar != nxj.a) {
            return;
        }
        this.g = true;
        ceuw<dkde> ceuwVar = this.h;
        if (ceuwVar != null) {
            ceuwVar.h("");
        }
        this.e.c();
        this.f.h();
        cqkx.p(this);
    }

    @Override // defpackage.ceey
    public void c(btzy btzyVar) {
        this.f.g();
    }

    @Override // defpackage.cevf
    public void d(String str, dqjh dqjhVar) {
        nvg nvgVar = this.e.a;
        if (nvgVar == null) {
            return;
        }
        nvgVar.m(str, dqjhVar);
    }

    @Override // defpackage.cesp
    public void g(cqiv cqivVar) {
        ceuw<dkde> ceuwVar = this.h;
        if (ceuwVar != null && !ceuwVar.e().isEmpty() && !q()) {
            cqivVar.a(new cehc(), this.h);
        }
        cqivVar.a(new cegl(), this);
    }

    @Override // defpackage.cesp
    public cjtd i() {
        return cjtd.a(dtxl.fm);
    }

    @Override // defpackage.ceve
    protected final nvg j() {
        nvg a = this.d.a(nxl.CONTRIBUTIONS_PHOTOS_PAGE, null);
        a.g = new cewl(this);
        return a;
    }

    @Override // defpackage.cevg
    public void k(Bundle bundle) {
        bundle.putBoolean("edit_performed_key", this.g);
        this.e.d(bundle);
        this.f.j(bundle);
        ceuw<dkde> ceuwVar = this.h;
        if (ceuwVar != null) {
            ceuwVar.i(bundle);
        }
    }

    @Override // defpackage.cevg
    public void l(Bundle bundle) {
        this.g = bundle.getBoolean("edit_performed_key");
        this.e.e(bundle);
        this.f.k(bundle);
        ceuw<dkde> ceuwVar = this.h;
        if (ceuwVar != null) {
            ceuwVar.j(bundle);
        }
    }

    @Override // defpackage.ceey
    /* renamed from: m */
    public void b(dkdm dkdmVar) {
        dkdk dkdkVar;
        dkdk dkdkVar2;
        ArrayList arrayList = new ArrayList();
        for (dkdl dkdlVar : dkdmVar.b) {
            ceuo ceuoVar = this.e;
            if (dkdlVar.a == 1) {
                dkdkVar = (dkdk) dkdlVar.b;
            } else {
                dkdkVar = dkdk.e;
            }
            ceuoVar.b(dkdkVar.c, dkdmVar.d);
            if (dkdlVar.a == 1) {
                dkdkVar2 = (dkdk) dkdlVar.b;
            } else {
                dkdkVar2 = dkdk.e;
            }
            arrayList.addAll(dkdkVar2.b);
        }
        ceuo ceuoVar2 = this.e;
        nvg nvgVar = ceuoVar2.a;
        if (nvgVar != null) {
            nvgVar.k(arrayList);
            ceuoVar2.a.s();
        }
        ceuw<dkde> ceuwVar = this.h;
        if (ceuwVar != null) {
            if ((dkdmVar.a & 1) != 0) {
                ceuwVar.h(dkdmVar.c);
            }
            if (this.a) {
                this.c.i(this.b.getString(R.string.CONTRIBUTIONS_PHOTO_SORTED_ACCESSIBILITY_ANNOUNCEMENT, new Object[]{this.h.d().a}));
                this.a = false;
            }
        }
        cqkx.p(this);
    }
}
