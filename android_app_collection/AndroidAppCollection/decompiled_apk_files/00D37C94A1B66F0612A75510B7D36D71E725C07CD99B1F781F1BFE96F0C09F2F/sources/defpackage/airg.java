package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
/* renamed from: airg  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class airg implements ayqb {
    public final /* synthetic */ ahen a;
    private final /* synthetic */ int b;

    public /* synthetic */ airg(ahen ahenVar) {
        this.a = ahenVar;
    }

    public /* synthetic */ airg(ahen ahenVar, int i) {
        this.b = i;
        this.a = ahenVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        PlayerConfigModel playerConfigModel;
        int i = this.b;
        if (i == 0) {
            ahen ahenVar = this.a;
            ahhw ahhwVar = (ahhw) obj;
            if (ahhwVar.c() == aika.VIDEO_REQUESTED) {
                ahenVar.k = ahhwVar.b();
            } else if (ahhwVar.c() == aika.INTERSTITIAL_REQUESTED) {
                ahenVar.k = ahhwVar.a();
            } else if (ahhwVar.c() != aika.PLAYBACK_LOADED) {
            } else {
                ahenVar.g.a();
            }
        } else if (i != 1) {
            ahen ahenVar2 = this.a;
            if (((ahia) obj).a() != 2) {
                return;
            }
            ahenVar2.g.a();
            if (ahenVar2.j != 0) {
                return;
            }
            PlayerResponseModel playerResponseModel = ahenVar2.k;
            if (playerResponseModel != null) {
                playerConfigModel = playerResponseModel.c();
            } else {
                playerConfigModel = ahenVar2.c.get();
            }
            if (ahenVar2.b.a() == 0.0f || ahenVar2.b.u == 2) {
                return;
            }
            if (playerConfigModel != null) {
                if (playerConfigModel.aN()) {
                    return;
                }
                if (playerConfigModel.aP() && ahenVar2.b.u == 1) {
                    return;
                }
            }
            ahenVar2.a();
        } else {
            ahen ahenVar3 = this.a;
            if (!((ahhf) obj).a()) {
                ahenVar3.a();
                return;
            }
            aijb.a(aija.AUDIOMANAGER, "AudioFocus Abandoned", new Object[0]);
            ahenVar3.d.abandonAudioFocus(ahenVar3.e);
        }
    }
}
