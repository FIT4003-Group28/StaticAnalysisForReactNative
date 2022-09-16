package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.apps.youtube.app.search.voice.VoiceSearchActivity;
import java.util.concurrent.ScheduledExecutorService;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lcc  reason: default package */
/* loaded from: classes3.dex */
public final class lcc implements abv {
    final /* synthetic */ lcd a;

    public lcc(lcd lcdVar) {
        this.a = lcdVar;
    }

    @Override // defpackage.abv
    public final void a(Context context) {
        lcd lcdVar = this.a;
        if (!lcdVar.a) {
            lcdVar.a = true;
            Object lI = lcdVar.lI();
            VoiceSearchActivity voiceSearchActivity = (VoiceSearchActivity) lcdVar;
            dwq dwqVar = (dwq) lI;
            voiceSearchActivity.b = (Handler) dwqVar.a.an.get();
            voiceSearchActivity.ad = (apwt) dwqVar.jK.get();
            voiceSearchActivity.n = (acvh) dwqVar.a.ef.get();
            voiceSearchActivity.o = (aadd) dwqVar.a.K.get();
            voiceSearchActivity.aa = (aacz) dwqVar.a.D.get();
            voiceSearchActivity.p = dwqVar.a.cI();
            voiceSearchActivity.q = dwqVar.jf();
            voiceSearchActivity.r = (akjb) dwqVar.a.zw.get();
            voiceSearchActivity.s = (aaqp) dwqVar.a.ih.get();
            voiceSearchActivity.t = (yrj) dwqVar.a.as.get();
            voiceSearchActivity.u = (gfu) dwqVar.a.eA.get();
            voiceSearchActivity.v = (yni) dwqVar.a.y.get();
            voiceSearchActivity.w = dwqVar.dF();
            voiceSearchActivity.x = dwqVar.dH();
            voiceSearchActivity.ac = (acgf) dwqVar.a.a.T.get();
            voiceSearchActivity.y = (ScheduledExecutorService) dwqVar.a.h.get();
            voiceSearchActivity.z = (akge) dwqVar.af.get();
            voiceSearchActivity.ab = new akdy();
            voiceSearchActivity.A = (axxo) dwqVar.a.a.ak.get();
            voiceSearchActivity.B = (afvn) dwqVar.a.au.get();
        }
    }
}
