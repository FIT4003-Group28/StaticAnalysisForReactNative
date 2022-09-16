package defpackage;

import com.google.android.apps.youtube.app.search.voice.VoiceSearchHalfPlateV0Activity;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: les  reason: default package */
/* loaded from: classes3.dex */
public final class les implements akip {
    final /* synthetic */ VoiceSearchHalfPlateV0Activity a;

    public les(VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity) {
        this.a = voiceSearchHalfPlateV0Activity;
    }

    @Override // defpackage.akip
    public final void a(int i) {
        if (i > 0) {
            if (eog.z(this.a.o) && this.a.n.m(asny.LATENCY_ACTION_VOICE_ASSISTANT)) {
                VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity = this.a;
                if (!voiceSearchHalfPlateV0Activity.f152J) {
                    voiceSearchHalfPlateV0Activity.f152J = true;
                    voiceSearchHalfPlateV0Activity.n.t("voz_ss", asny.LATENCY_ACTION_VOICE_ASSISTANT);
                }
            }
            this.a.c.b(i);
        }
    }

    @Override // defpackage.akip
    public final void b() {
        if (eog.z(this.a.o) && this.a.n.m(asny.LATENCY_ACTION_VOICE_ASSISTANT)) {
            VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity = this.a;
            voiceSearchHalfPlateV0Activity.K = true;
            voiceSearchHalfPlateV0Activity.n.t("voz_mf", asny.LATENCY_ACTION_VOICE_ASSISTANT);
        }
        VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity2 = this.a;
        voiceSearchHalfPlateV0Activity2.h = false;
        akiq akiqVar = voiceSearchHalfPlateV0Activity2.i;
        if (akiqVar != null) {
            akiqVar.d();
        }
        voiceSearchHalfPlateV0Activity2.c.setEnabled(false);
        voiceSearchHalfPlateV0Activity2.c.f();
    }

    @Override // defpackage.akip
    public final void c() {
        this.a.d.setVisibility(0);
        this.a.F.setVisibility(0);
        this.a.c.c();
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
                this.a.L = true;
            }
            VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity = this.a;
            if (voiceSearchHalfPlateV0Activity.c.b != 1) {
                voiceSearchHalfPlateV0Activity.H.setVisibility(8);
                this.a.G.setVisibility(8);
            }
            if (amnwVar.c >= 0.8d) {
                this.a.F.setText("");
                this.a.d.setText(amnwVar.b);
                if (eog.z(this.a.o) && this.a.n.m(asny.LATENCY_ACTION_VOICE_ASSISTANT)) {
                    VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity2 = this.a;
                    if (!voiceSearchHalfPlateV0Activity2.K) {
                        voiceSearchHalfPlateV0Activity2.n.t("voz_sf", asny.LATENCY_ACTION_VOICE_ASSISTANT);
                    }
                }
            } else {
                this.a.F.setText(amnwVar.b);
            }
        }
    }
}
