package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.gmm.ugc.serviceareabusiness.webview.ServiceAreaBusinessWebViewCallbacks;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cfpj  reason: default package */
/* loaded from: classes4.dex */
public final class cfpj extends itb implements cfpk {
    private final dxio<bvvw> a;
    private final ckcw b;
    private final gga c;
    private final ahjq d;
    private final akzh e;

    public cfpj(dxio<bvvw> dxioVar, ckcw ckcwVar, gga ggaVar, ahjq ahjqVar, akzh akzhVar) {
        this.a = dxioVar;
        this.b = ckcwVar;
        this.c = ggaVar;
        this.d = ahjqVar;
        this.e = akzhVar;
    }

    @Override // defpackage.cfpk
    public final void e(String str, cfpl cfplVar) {
        dbsg i;
        ((ckhe) this.b.a(cfplVar.c)).a();
        ((ckcn) this.b.a(cfplVar.d)).a();
        bvxn bZ = bvxu.A.bZ();
        debv a = debv.a(str);
        GmmLocation a2 = this.d.a();
        if (a2 != null) {
            i = dbsg.i(a2.B());
        } else {
            alad p = this.e.p();
            i = alad.a.equals(p) ? dbpy.a : dbsg.i(p.i);
        }
        if (i.a()) {
            a.d("center", ((akqq) i.b()).a());
        }
        String debuVar = a.c().toString();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar = (bvxu) bZ.b;
        debuVar.getClass();
        int i2 = bvxuVar.a | 1;
        bvxuVar.a = i2;
        bvxuVar.b = debuVar;
        int i3 = i2 | 4;
        bvxuVar.a = i3;
        bvxuVar.d = true;
        bvxuVar.a = i3 | 8;
        bvxuVar.e = true;
        bvxu.b(bvxuVar);
        String str2 = cfplVar.f;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar2 = (bvxu) bZ.b;
        str2.getClass();
        int i4 = bvxuVar2.a | 64;
        bvxuVar2.a = i4;
        bvxuVar2.h = str2;
        bvxuVar2.a = i4 | 512;
        bvxuVar2.k = true;
        String string = this.c.getString(R.string.TODO_SERVICE_AREA_BUSINESS_PROMO_TITLE_V2);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar3 = (bvxu) bZ.b;
        string.getClass();
        bvxuVar3.a |= 8192;
        bvxuVar3.o = string;
        dkyw bZ2 = dkyx.f.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dkyx.b((dkyx) bZ2.b);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dkyx.c((dkyx) bZ2.b);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar4 = (bvxu) bZ.b;
        dkyx bK = bZ2.bK();
        bK.getClass();
        bvxuVar4.j = bK;
        bvxuVar4.a |= 256;
        bvvr e = bvvs.e();
        e.b(bZ.bK());
        ServiceAreaBusinessWebViewCallbacks serviceAreaBusinessWebViewCallbacks = new ServiceAreaBusinessWebViewCallbacks(cfplVar);
        bvvn bvvnVar = (bvvn) e;
        bvvnVar.b = serviceAreaBusinessWebViewCallbacks;
        bvvnVar.a = cfpi.class;
        this.a.a().r(e.a(), dtyd.Q);
    }
}
