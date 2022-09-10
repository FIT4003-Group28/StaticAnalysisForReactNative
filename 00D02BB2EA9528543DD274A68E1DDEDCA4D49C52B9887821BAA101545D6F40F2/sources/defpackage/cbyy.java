package defpackage;

import android.net.Uri;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.gmm.ugc.hashtags.webview.HashtagSearchWebViewCallbacks;
/* compiled from: PG */
/* renamed from: cbyy  reason: default package */
/* loaded from: classes4.dex */
public final class cbyy implements cbzd {
    private final gga a;
    private final bvvw b;
    private final btvo c;
    private final ckcw d;
    private final akox e;
    private final begg f;
    private final dxio<cbzw> g;
    private final dxio<ahjq> h;

    public cbyy(gga ggaVar, bvvw bvvwVar, btvo btvoVar, ckcw ckcwVar, akox akoxVar, begg beggVar, dxio<cbzw> dxioVar, dxio<ahjq> dxioVar2) {
        this.a = ggaVar;
        this.b = bvvwVar;
        this.c = btvoVar;
        this.d = ckcwVar;
        this.e = akoxVar;
        this.g = dxioVar;
        this.f = beggVar;
        this.h = dxioVar2;
    }

    private static String d(dtaq dtaqVar) {
        return Uri.encode(String.format("w+%s", ddae.e.h().i(dtaqVar.bS())), "+");
    }

    @Override // defpackage.cbzd
    public final void a(String str, cbzc cbzcVar) {
        if (cbzcVar.b().booleanValue()) {
            this.a.w();
        }
        ((ckhe) this.d.a(ckfi.b)).a();
        bvvr e = bvvs.e();
        String a = cbzcVar.a();
        Uri.Builder buildUpon = Uri.parse(cjxr.x(this.c)).buildUpon();
        Object[] objArr = new Object[1];
        akox akoxVar = this.e;
        GmmLocation a2 = this.h.a().a();
        String d = a2 == null ? "" : d(a2.a());
        dtap bZ = dtaq.m.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dtaq dtaqVar = (dtaq) bZ.b;
        dtaqVar.b = 7;
        dtaqVar.a |= 1;
        dtaq dtaqVar2 = (dtaq) bZ.b;
        dtaqVar2.c = 40;
        dtaqVar2.a |= 2;
        dcvu f = akyx.m(akoxVar.Y(akoxVar.n())).f();
        dtal bZ2 = dtam.d.bZ();
        dtaj bZ3 = dtak.d.bZ();
        int c = f.k().c();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dtak dtakVar = (dtak) bZ3.b;
        dtakVar.a |= 1;
        dtakVar.b = c;
        int c2 = f.m().c();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dtak dtakVar2 = (dtak) bZ3.b;
        dtakVar2.a |= 2;
        dtakVar2.c = c2;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dtam dtamVar = (dtam) bZ2.b;
        dtak bK = bZ3.bK();
        bK.getClass();
        dtamVar.b = bK;
        dtamVar.a |= 1;
        dtaj bZ4 = dtak.d.bZ();
        int c3 = f.l().c();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dtak dtakVar3 = (dtak) bZ4.b;
        dtakVar3.a |= 1;
        dtakVar3.b = c3;
        int c4 = f.n().c();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dtak dtakVar4 = (dtak) bZ4.b;
        dtakVar4.a |= 2;
        dtakVar4.c = c4;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dtam dtamVar2 = (dtam) bZ2.b;
        dtak bK2 = bZ4.bK();
        bK2.getClass();
        dtamVar2.c = bK2;
        dtamVar2.a |= 2;
        dtam bK3 = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dtaq dtaqVar3 = (dtaq) bZ.b;
        bK3.getClass();
        dtaqVar3.f = bK3;
        dtaqVar3.a |= 64;
        StringBuilder sb = new StringBuilder(d(bZ.bK()));
        if (!d.isEmpty()) {
            sb.append("+");
            sb.append(d);
        }
        objArr[0] = sb.toString();
        Uri.Builder appendQueryParameter = buildUpon.encodedQuery(String.format("uule=%s", objArr)).appendQueryParameter("q", str);
        if (!dbsj.d(a)) {
            appendQueryParameter = appendQueryParameter.appendQueryParameter("lei", a);
        }
        String uri = appendQueryParameter.build().toString();
        bvxn bZ5 = bvxu.A.bZ();
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        bvxu bvxuVar = (bvxu) bZ5.b;
        uri.getClass();
        int i = bvxuVar.a | 1;
        bvxuVar.a = i;
        bvxuVar.b = uri;
        bvxuVar.a = i | 8;
        bvxuVar.e = true;
        bvxu.b(bvxuVar);
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        bvxu bvxuVar2 = (bvxu) bZ5.b;
        bvxuVar2.a |= 512;
        bvxuVar2.k = true;
        String valueOf = String.valueOf(str);
        String concat = valueOf.length() != 0 ? "#".concat(valueOf) : new String("#");
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        bvxu bvxuVar3 = (bvxu) bZ5.b;
        concat.getClass();
        bvxuVar3.a |= 8192;
        bvxuVar3.o = concat;
        dkyw bZ6 = dkyx.f.bZ();
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        dkyx.b((dkyx) bZ6.b);
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        bvxu bvxuVar4 = (bvxu) bZ5.b;
        dkyx bK4 = bZ6.bK();
        bK4.getClass();
        bvxuVar4.j = bK4;
        bvxuVar4.a |= 256;
        e.b(bZ5.bK());
        bvvn bvvnVar = (bvvn) e;
        bvvnVar.b = new HashtagSearchWebViewCallbacks();
        bvvnVar.a = ccat.class;
        this.b.r(e.a(), dtxr.a);
    }

    @Override // defpackage.cbzd
    public final void b(akqi akqiVar) {
        ily ilyVar = new ily();
        ilyVar.j(akqiVar);
        ilo d = ilyVar.d();
        begj begjVar = new begj();
        begjVar.b(d);
        begjVar.n = true;
        begjVar.c = jjn.EXPANDED;
        this.f.n(begjVar, false, null);
    }

    @Override // defpackage.cbzd
    public final Boolean c(String str) {
        cbzw a = this.g.a();
        if (!a.a.b) {
            return false;
        }
        cbzv cbzvVar = new cbzv(str);
        a.b.a(str.toString(), cbzvVar);
        return Boolean.valueOf(cbzvVar.a);
    }
}
