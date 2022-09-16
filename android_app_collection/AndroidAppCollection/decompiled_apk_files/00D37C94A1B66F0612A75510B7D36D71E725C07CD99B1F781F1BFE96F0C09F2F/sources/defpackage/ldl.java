package defpackage;

import com.google.android.apps.youtube.app.search.voice.VoiceSearchActivity;
/* compiled from: PG */
/* renamed from: ldl  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ldl implements Runnable {
    public final /* synthetic */ VoiceSearchActivity a;
    private final /* synthetic */ int b;

    public /* synthetic */ ldl(VoiceSearchActivity voiceSearchActivity) {
        this.a = voiceSearchActivity;
    }

    public /* synthetic */ ldl(VoiceSearchActivity voiceSearchActivity, int i) {
        this.b = i;
        this.a = voiceSearchActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            VoiceSearchActivity voiceSearchActivity = this.a;
            if (voiceSearchActivity.isFinishing() || voiceSearchActivity.U == null) {
                return;
            }
            ex l = voiceSearchActivity.j.l();
            l.m(voiceSearchActivity.U);
            l.a();
            voiceSearchActivity.U.c = null;
            voiceSearchActivity.U = null;
            voiceSearchActivity.n();
            voiceSearchActivity.R.setVisibility(8);
        } else if (i == 1) {
            this.a.recreate();
        } else if (i == 2) {
            VoiceSearchActivity voiceSearchActivity2 = this.a;
            if (voiceSearchActivity2.h) {
                voiceSearchActivity2.i(voiceSearchActivity2.g);
            }
            voiceSearchActivity2.k();
        } else {
            VoiceSearchActivity voiceSearchActivity3 = this.a;
            if (voiceSearchActivity3.isFinishing() || voiceSearchActivity3.k == null) {
                return;
            }
            ex l2 = voiceSearchActivity3.j.l();
            l2.m(voiceSearchActivity3.k);
            l2.a();
            voiceSearchActivity3.k.aF(null);
            voiceSearchActivity3.k = null;
        }
    }
}
