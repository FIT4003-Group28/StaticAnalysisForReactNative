package defpackage;

import android.content.Intent;
import android.view.View;
import com.google.android.apps.youtube.app.search.voice.VoiceSearchHalfPlateV0Activity;
/* compiled from: PG */
/* renamed from: lep  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class lep implements View.OnClickListener {
    public final /* synthetic */ VoiceSearchHalfPlateV0Activity a;
    private final /* synthetic */ int b;

    public /* synthetic */ lep(VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity) {
        this.a = voiceSearchHalfPlateV0Activity;
    }

    public /* synthetic */ lep(VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity, int i) {
        this.b = i;
        this.a = voiceSearchHalfPlateV0Activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i == 0) {
            VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity = this.a;
            if (voiceSearchHalfPlateV0Activity.h) {
                voiceSearchHalfPlateV0Activity.p.H(3, new acte(actj.VOICE_SEARCH_MIC_BUTTON), null);
                voiceSearchHalfPlateV0Activity.i(voiceSearchHalfPlateV0Activity.f);
                voiceSearchHalfPlateV0Activity.U = true;
                voiceSearchHalfPlateV0Activity.j();
                return;
            }
            voiceSearchHalfPlateV0Activity.m();
        } else if (i == 1) {
            VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity2 = this.a;
            voiceSearchHalfPlateV0Activity2.p.H(3, new acte(actj.VOICE_SEARCH_CANCEL_BUTTON), null);
            Intent intent = voiceSearchHalfPlateV0Activity2.getIntent();
            intent.putExtra("AssistantCsn", voiceSearchHalfPlateV0Activity2.p.k());
            intent.putExtra("DO_NOT_OPEN_KEYBOARD", true);
            voiceSearchHalfPlateV0Activity2.setResult(1, intent);
            voiceSearchHalfPlateV0Activity2.h();
        } else if (i == 2) {
            this.a.onBackPressed();
        } else if (i != 3) {
            VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity3 = this.a;
            voiceSearchHalfPlateV0Activity3.j();
            voiceSearchHalfPlateV0Activity3.G.setVisibility(8);
            ldi aG = ldi.aG(voiceSearchHalfPlateV0Activity3.W, voiceSearchHalfPlateV0Activity3.p);
            voiceSearchHalfPlateV0Activity3.p.H(3, new acte(actj.VOICE_SEARCH_LANGUAGE_SELECTOR_VOZ_PLATE_ENTRY_POINT), null);
            ex l = voiceSearchHalfPlateV0Activity3.j.l();
            l.r(aG, "VOICE_LANGUAGE_SELECTOR_FRAGMENT");
            l.a();
        } else {
            VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity4 = this.a;
            if (voiceSearchHalfPlateV0Activity4.R == null) {
                return;
            }
            voiceSearchHalfPlateV0Activity4.p.H(3, new acte(actj.VOICE_SEARCH_HALF_PLATE_SUGGESTIONS), null);
            Intent intent2 = voiceSearchHalfPlateV0Activity4.getIntent();
            intent2.putExtra("ABOVE_HALF_PLATE_CLICK_LOCATION", voiceSearchHalfPlateV0Activity4.R);
            voiceSearchHalfPlateV0Activity4.setResult(-1, intent2);
            voiceSearchHalfPlateV0Activity4.h();
        }
    }
}
