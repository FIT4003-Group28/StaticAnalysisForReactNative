package defpackage;

import com.google.android.apps.youtube.app.search.voice.VoiceSearchActivity;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: ldq  reason: default package */
/* loaded from: classes3.dex */
public final class ldq implements akip {
    final /* synthetic */ VoiceSearchActivity a;

    public ldq(VoiceSearchActivity voiceSearchActivity) {
        this.a = voiceSearchActivity;
    }

    @Override // defpackage.akip
    public final void a(int i) {
        if (i > 0) {
            if (eog.z(this.a.o) && this.a.n.m(asny.LATENCY_ACTION_VOICE_ASSISTANT)) {
                VoiceSearchActivity voiceSearchActivity = this.a;
                if (!voiceSearchActivity.L) {
                    voiceSearchActivity.L = true;
                    voiceSearchActivity.n.t("voz_ss", asny.LATENCY_ACTION_VOICE_ASSISTANT);
                }
            }
            this.a.c.b(i);
        }
    }

    @Override // defpackage.akip
    public final void b() {
        if (eog.z(this.a.o) && this.a.n.m(asny.LATENCY_ACTION_VOICE_ASSISTANT)) {
            VoiceSearchActivity voiceSearchActivity = this.a;
            voiceSearchActivity.M = true;
            voiceSearchActivity.n.t("voz_mf", asny.LATENCY_ACTION_VOICE_ASSISTANT);
        }
        VoiceSearchActivity voiceSearchActivity2 = this.a;
        voiceSearchActivity2.h = false;
        akiq akiqVar = voiceSearchActivity2.i;
        if (akiqVar != null) {
            akiqVar.d();
        }
        voiceSearchActivity2.c.setEnabled(false);
        voiceSearchActivity2.c.f();
        if (voiceSearchActivity2.p()) {
            voiceSearchActivity2.T.animate().alpha(0.0f).setDuration(200L).setInterpolator(voiceSearchActivity2.Z);
        }
    }

    @Override // defpackage.akip
    public final void c() {
        this.a.d.setVisibility(0);
        this.a.F.setVisibility(0);
        VoiceSearchActivity voiceSearchActivity = this.a;
        voiceSearchActivity.c.d(voiceSearchActivity.q());
    }

    @Override // defpackage.akip
    public final void d(List list) {
        if (!this.a.l && !list.isEmpty() && this.a.n.m(asny.LATENCY_ACTION_VOICE_ASSISTANT)) {
            this.a.n.t("voz_ftr", asny.LATENCY_ACTION_VOICE_ASSISTANT);
            this.a.l = true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            amnw amnwVar = (amnw) it.next();
            if (amnwVar.c == 1.0d) {
                this.a.N = true;
            }
            VoiceSearchActivity voiceSearchActivity = this.a;
            if (voiceSearchActivity.c.b != 1) {
                voiceSearchActivity.f150J.setVisibility(8);
                this.a.G.setVisibility(8);
            }
            if (amnwVar.c >= 0.8d) {
                this.a.F.setText("");
                this.a.d.setText(amnwVar.b);
                if (eog.z(this.a.o) && this.a.n.m(asny.LATENCY_ACTION_VOICE_ASSISTANT)) {
                    VoiceSearchActivity voiceSearchActivity2 = this.a;
                    if (!voiceSearchActivity2.M) {
                        voiceSearchActivity2.n.t("voz_sf", asny.LATENCY_ACTION_VOICE_ASSISTANT);
                    }
                }
            } else {
                this.a.F.setText(amnwVar.b);
            }
        }
    }
}
