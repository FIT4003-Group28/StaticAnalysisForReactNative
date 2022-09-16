package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.youtube.app.extensions.upload.UploadActivity;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ijn  reason: default package */
/* loaded from: classes3.dex */
public final class ijn implements abv {
    final /* synthetic */ ijo a;

    public ijn(ijo ijoVar) {
        this.a = ijoVar;
    }

    @Override // defpackage.abv
    public final void a(Context context) {
        ijo ijoVar = this.a;
        if (!ijoVar.g) {
            ijoVar.g = true;
            Object lI = ijoVar.lI();
            UploadActivity uploadActivity = (UploadActivity) ijoVar;
            dwq dwqVar = (dwq) lI;
            uploadActivity.a = (zah) dwqVar.a.av.get();
            uploadActivity.b = (fpg) dwqVar.ad.get();
            uploadActivity.c = (taq) dwqVar.hX.get();
            uploadActivity.d = (yvs) dwqVar.jE.get();
            uploadActivity.e = axot.a(dwqVar.iQ);
            uploadActivity.f = (yiv) dwqVar.fS.get();
            uploadActivity.y = (tdb) dwqVar.a.nO.get();
            dwqVar.iA();
            uploadActivity.z = (yzj) dwqVar.a.je.get();
            uploadActivity.A = (yni) dwqVar.a.y.get();
            uploadActivity.B = (aynx) dwqVar.a.yK.get();
            uploadActivity.C = (aadd) dwqVar.a.K.get();
            uploadActivity.D = (ajyi) dwqVar.ah.get();
            uploadActivity.E = dwqVar.jF;
            uploadActivity.F = dwqVar.a.cI();
            uploadActivity.G = new ajyx();
            uploadActivity.H = dwqVar.hQ();
            uploadActivity.I = (akdr) dwqVar.a.yY.get();
            uploadActivity.f214J = dwqVar.iK();
            uploadActivity.K = dwqVar.iT();
            uploadActivity.h = (ankw) dwqVar.a.h.get();
            uploadActivity.i = (aafo) dwqVar.H.get();
            uploadActivity.j = dwqVar.iO();
            uploadActivity.am = (aqxo) dwqVar.a.mO.get();
            uploadActivity.k = (afvn) dwqVar.a.au.get();
            uploadActivity.l = (ajmy) dwqVar.a.kC.get();
            uploadActivity.m = (aaqp) dwqVar.a.ih.get();
            uploadActivity.n = dwqVar.gw();
            uploadActivity.o = (afre) dwqVar.hv.get();
            uploadActivity.p = (afwc) dwqVar.a.vo.get();
            uploadActivity.q = dwqVar.hM();
            uploadActivity.r = (vxk) dwqVar.ga.get();
            akzg fV = dwqVar.a.fV();
            akyh akyhVar = (akyh) dwqVar.a.nc.get();
            akys akysVar = (akys) dwqVar.a.mY.get();
            albf albfVar = (albf) dwqVar.a.mT.get();
            akyc akycVar = new akyc(dwqVar.a.b.a.getContentResolver());
            fud aB = dwqVar.aB();
            fvf fvfVar = (fvf) dwqVar.bf.get();
            afvn afvnVar = (afvn) dwqVar.a.au.get();
            akzd akzdVar = (akzd) dwqVar.a.wh.get();
            akze akzeVar = (akze) dwqVar.a.mS.get();
            akdr akdrVar = (akdr) dwqVar.a.yY.get();
            azqb azqbVar = dwqVar.jI;
            wig wigVar = (wig) dwqVar.a.xc.get();
            uploadActivity.s = new ilh(dwqVar.cx(), (ankw) dwqVar.a.h.get(), (aafo) dwqVar.H.get(), (yrj) dwqVar.a.as.get(), dwqVar.a.gz(), (aadd) dwqVar.a.K.get(), (wia) dwqVar.a.xb.get(), (aqxo) dwqVar.a.mO.get(), dwqVar.gw(), (akvm) dwqVar.a.hl.get(), fV, akyhVar, akysVar, albfVar, akycVar, aB, fvfVar, afvnVar, akzdVar, akzeVar, akdrVar, azqbVar, null, null, null);
            uploadActivity.t = (albc) dwqVar.a.wj.get();
            uploadActivity.ak = dwqVar.a.ap();
            uploadActivity.u = (SharedPreferences) dwqVar.a.t.get();
            uploadActivity.v = dwqVar.fv();
            uploadActivity.al = (vne) dwqVar.a.a.ai.get();
            uploadActivity.w = (akge) dwqVar.af.get();
            uploadActivity.x = (albf) dwqVar.a.mT.get();
            uploadActivity.S = (akze) dwqVar.a.mS.get();
            uploadActivity.T = (akrh) dwqVar.a.a.aj.get();
            uploadActivity.U = (fqd) dwqVar.I.get();
            uploadActivity.V = (iix) dwqVar.jG.get();
            uploadActivity.aa = (iln) dwqVar.jJ.get();
        }
    }
}
