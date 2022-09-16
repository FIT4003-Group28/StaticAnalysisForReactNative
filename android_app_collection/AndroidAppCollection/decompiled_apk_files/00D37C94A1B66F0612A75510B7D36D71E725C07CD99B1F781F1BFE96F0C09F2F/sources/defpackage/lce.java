package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.apps.youtube.app.search.voice.VoiceSearchActivityV2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lce  reason: default package */
/* loaded from: classes3.dex */
public final class lce implements abv {
    final /* synthetic */ lcf a;

    public lce(lcf lcfVar) {
        this.a = lcfVar;
    }

    @Override // defpackage.abv
    public final void a(Context context) {
        lcf lcfVar = this.a;
        if (!lcfVar.a) {
            lcfVar.a = true;
            Object lI = lcfVar.lI();
            VoiceSearchActivityV2 voiceSearchActivityV2 = (VoiceSearchActivityV2) lcfVar;
            dwq dwqVar = (dwq) lI;
            voiceSearchActivityV2.b = (Handler) dwqVar.a.an.get();
            voiceSearchActivityV2.e = dwqVar.dI();
            voiceSearchActivityV2.f = new lel(dwqVar.f);
            voiceSearchActivityV2.g = (acvh) dwqVar.a.ef.get();
            voiceSearchActivityV2.h = (aadd) dwqVar.a.K.get();
            voiceSearchActivityV2.s = (aacz) dwqVar.a.D.get();
            voiceSearchActivityV2.i = dwqVar.a.cI();
            voiceSearchActivityV2.j = (gfu) dwqVar.a.eA.get();
            voiceSearchActivityV2.k = (yni) dwqVar.a.y.get();
            voiceSearchActivityV2.l = dwqVar.dF();
            voiceSearchActivityV2.t = new akdy();
            voiceSearchActivityV2.m = new ldb(dwqVar.a.D, dwqVar.jL, dwqVar.jK, dwqVar.af);
            voiceSearchActivityV2.n = (axxo) dwqVar.a.a.ak.get();
            voiceSearchActivityV2.o = (afvn) dwqVar.a.au.get();
        }
    }
}
