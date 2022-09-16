package defpackage;

import android.media.AudioTrack;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: pmd  reason: default package */
/* loaded from: classes4.dex */
public final class pmd extends AudioTrack.StreamEventCallback {
    final /* synthetic */ pme a;

    public pmd(pme pmeVar) {
        this.a = pmeVar;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i) {
        ptx.e(audioTrack == this.a.c.c);
        pmf pmfVar = this.a.c;
        pll pllVar = pmfVar.b;
        if (pllVar == null || !pmfVar.d) {
            return;
        }
        pllVar.b();
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        ptx.e(audioTrack == this.a.c.c);
        pmf pmfVar = this.a.c;
        pll pllVar = pmfVar.b;
        if (pllVar == null || !pmfVar.d) {
            return;
        }
        pllVar.b();
    }
}
