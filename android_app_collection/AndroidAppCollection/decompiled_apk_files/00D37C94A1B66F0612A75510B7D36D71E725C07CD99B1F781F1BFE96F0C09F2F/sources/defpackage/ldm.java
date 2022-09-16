package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.search.voice.VoiceSearchActivity;
/* compiled from: PG */
/* renamed from: ldm  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ldm implements View.OnClickListener {
    public final /* synthetic */ VoiceSearchActivity a;
    private final /* synthetic */ int b;

    public /* synthetic */ ldm(VoiceSearchActivity voiceSearchActivity) {
        this.a = voiceSearchActivity;
    }

    public /* synthetic */ ldm(VoiceSearchActivity voiceSearchActivity, int i) {
        this.b = i;
        this.a = voiceSearchActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i == 0) {
            VoiceSearchActivity voiceSearchActivity = this.a;
            voiceSearchActivity.H.setVisibility(4);
            voiceSearchActivity.I.setVisibility(8);
            if (voiceSearchActivity.h) {
                voiceSearchActivity.p.H(3, new acte(actj.VOICE_SEARCH_MIC_BUTTON), null);
                voiceSearchActivity.i(voiceSearchActivity.f);
                voiceSearchActivity.W = true;
                voiceSearchActivity.j();
                return;
            }
            voiceSearchActivity.m();
        } else if (i != 1) {
            VoiceSearchActivity voiceSearchActivity2 = this.a;
            voiceSearchActivity2.j();
            voiceSearchActivity2.H.setVisibility(8);
            voiceSearchActivity2.G.setVisibility(8);
            ldi aG = ldi.aG(voiceSearchActivity2.Y, voiceSearchActivity2.p);
            voiceSearchActivity2.p.H(3, new acte(actj.VOICE_SEARCH_LANGUAGE_SELECTOR_VOZ_PLATE_ENTRY_POINT), null);
            ex l = voiceSearchActivity2.j.l();
            l.r(aG, "VOICE_LANGUAGE_SELECTOR_FRAGMENT");
            l.a();
        } else {
            VoiceSearchActivity voiceSearchActivity3 = this.a;
            voiceSearchActivity3.onBackPressed();
            voiceSearchActivity3.h();
        }
    }
}
