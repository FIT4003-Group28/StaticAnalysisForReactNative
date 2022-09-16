package defpackage;

import com.google.android.apps.youtube.app.search.voice.VoiceSearchHalfPlateV0Activity;
/* compiled from: PG */
/* renamed from: leo  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class leo implements Runnable {
    public final /* synthetic */ VoiceSearchHalfPlateV0Activity a;
    private final /* synthetic */ int b;

    public /* synthetic */ leo(VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity) {
        this.a = voiceSearchHalfPlateV0Activity;
    }

    public /* synthetic */ leo(VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity, int i) {
        this.b = i;
        this.a = voiceSearchHalfPlateV0Activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity = this.a;
            if (voiceSearchHalfPlateV0Activity.isFinishing() || voiceSearchHalfPlateV0Activity.m == null) {
                return;
            }
            ex l = voiceSearchHalfPlateV0Activity.j.l();
            l.m(voiceSearchHalfPlateV0Activity.m);
            l.a();
            voiceSearchHalfPlateV0Activity.m.c = null;
            voiceSearchHalfPlateV0Activity.m = null;
            voiceSearchHalfPlateV0Activity.n();
            voiceSearchHalfPlateV0Activity.P.setVisibility(8);
        } else if (i == 1) {
            this.a.recreate();
        } else if (i == 2) {
            VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity2 = this.a;
            if (voiceSearchHalfPlateV0Activity2.h) {
                voiceSearchHalfPlateV0Activity2.i(voiceSearchHalfPlateV0Activity2.g);
            }
            voiceSearchHalfPlateV0Activity2.k();
        } else {
            VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity3 = this.a;
            if (voiceSearchHalfPlateV0Activity3.isFinishing() || voiceSearchHalfPlateV0Activity3.k == null) {
                return;
            }
            ex l2 = voiceSearchHalfPlateV0Activity3.j.l();
            l2.m(voiceSearchHalfPlateV0Activity3.k);
            l2.a();
            voiceSearchHalfPlateV0Activity3.k.aF(null);
            voiceSearchHalfPlateV0Activity3.k = null;
        }
    }
}
