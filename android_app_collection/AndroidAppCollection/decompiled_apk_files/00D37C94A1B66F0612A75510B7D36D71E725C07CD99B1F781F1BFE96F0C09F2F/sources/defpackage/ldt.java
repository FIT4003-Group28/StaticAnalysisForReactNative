package defpackage;

import com.google.android.apps.youtube.app.search.voice.VoiceSearchActivityV2;
/* compiled from: PG */
/* renamed from: ldt  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ldt implements Runnable {
    public final /* synthetic */ VoiceSearchActivityV2 a;
    private final /* synthetic */ int b;

    public /* synthetic */ ldt(VoiceSearchActivityV2 voiceSearchActivityV2) {
        this.a = voiceSearchActivityV2;
    }

    public /* synthetic */ ldt(VoiceSearchActivityV2 voiceSearchActivityV2, int i) {
        this.b = i;
        this.a = voiceSearchActivityV2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            VoiceSearchActivityV2 voiceSearchActivityV2 = this.a;
            if (voiceSearchActivityV2.isFinishing() || voiceSearchActivityV2.r == null) {
                return;
            }
            ex l = voiceSearchActivityV2.c.l();
            l.m(voiceSearchActivityV2.r);
            l.a();
            voiceSearchActivityV2.r.c = null;
            voiceSearchActivityV2.r = null;
            voiceSearchActivityV2.i();
            voiceSearchActivityV2.q.setVisibility(8);
        } else if (i == 1) {
            this.a.recreate();
        } else {
            VoiceSearchActivityV2 voiceSearchActivityV22 = this.a;
            if (voiceSearchActivityV22.isFinishing() || voiceSearchActivityV22.d == null) {
                return;
            }
            ex l2 = voiceSearchActivityV22.c.l();
            l2.m(voiceSearchActivityV22.d);
            l2.a();
            voiceSearchActivityV22.d.aF(null);
            voiceSearchActivityV22.d = null;
        }
    }
}
