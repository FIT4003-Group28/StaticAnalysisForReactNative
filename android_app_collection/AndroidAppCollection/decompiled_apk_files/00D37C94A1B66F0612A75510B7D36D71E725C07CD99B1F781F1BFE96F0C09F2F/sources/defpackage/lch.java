package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.apps.youtube.app.search.voice.VoiceSearchHalfPlateV0Activity;
import java.util.concurrent.ScheduledExecutorService;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lch  reason: default package */
/* loaded from: classes3.dex */
public final class lch implements abv {
    final /* synthetic */ lci a;

    public lch(lci lciVar) {
        this.a = lciVar;
    }

    @Override // defpackage.abv
    public final void a(Context context) {
        lci lciVar = this.a;
        if (!lciVar.a) {
            lciVar.a = true;
            Object lI = lciVar.lI();
            VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity = (VoiceSearchHalfPlateV0Activity) lciVar;
            dwq dwqVar = (dwq) lI;
            voiceSearchHalfPlateV0Activity.b = (Handler) dwqVar.a.an.get();
            voiceSearchHalfPlateV0Activity.aa = (apwt) dwqVar.jK.get();
            voiceSearchHalfPlateV0Activity.n = (acvh) dwqVar.a.ef.get();
            voiceSearchHalfPlateV0Activity.o = (aadd) dwqVar.a.K.get();
            voiceSearchHalfPlateV0Activity.X = (aacz) dwqVar.a.D.get();
            voiceSearchHalfPlateV0Activity.p = dwqVar.a.cI();
            voiceSearchHalfPlateV0Activity.q = dwqVar.jf();
            voiceSearchHalfPlateV0Activity.r = (akjb) dwqVar.a.zw.get();
            voiceSearchHalfPlateV0Activity.s = (aaqp) dwqVar.a.ih.get();
            voiceSearchHalfPlateV0Activity.t = (yrj) dwqVar.a.as.get();
            voiceSearchHalfPlateV0Activity.u = (gfu) dwqVar.a.eA.get();
            voiceSearchHalfPlateV0Activity.v = (yni) dwqVar.a.y.get();
            voiceSearchHalfPlateV0Activity.w = dwqVar.dF();
            voiceSearchHalfPlateV0Activity.x = dwqVar.dH();
            voiceSearchHalfPlateV0Activity.Z = (acgf) dwqVar.a.a.T.get();
            voiceSearchHalfPlateV0Activity.y = (ScheduledExecutorService) dwqVar.a.h.get();
            voiceSearchHalfPlateV0Activity.z = (akge) dwqVar.af.get();
            voiceSearchHalfPlateV0Activity.Y = new akdy();
            voiceSearchHalfPlateV0Activity.A = (axxo) dwqVar.a.a.ak.get();
            voiceSearchHalfPlateV0Activity.B = (afvn) dwqVar.a.au.get();
        }
    }
}
