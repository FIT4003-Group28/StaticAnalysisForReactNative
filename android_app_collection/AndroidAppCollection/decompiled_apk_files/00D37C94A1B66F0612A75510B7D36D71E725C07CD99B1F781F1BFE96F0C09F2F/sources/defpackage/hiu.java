package defpackage;

import android.os.Bundle;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand;
import java.util.Map;
/* compiled from: PG */
/* renamed from: hiu  reason: default package */
/* loaded from: classes3.dex */
public final class hiu implements aafl {
    private final dt a;
    private final /* synthetic */ int b;

    public hiu(dt dtVar) {
        this.a = dtVar;
    }

    public hiu(dt dtVar, int i) {
        this.b = i;
        this.a = dtVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        int i = this.b;
        if (i == 0) {
            aqxo.p(apzgVar.qn(ausx.b));
            eo supportFragmentManager = this.a.getSupportFragmentManager();
            if (!(supportFragmentManager.f("SFV_AUDIO_SEARCH_FRAGMENT_TAG") instanceof hig)) {
                return;
            }
            ((hig) supportFragmentManager.f("SFV_AUDIO_SEARCH_FRAGMENT_TAG")).o(((ausx) apzgVar.qm(ausx.b)).c);
        } else if (i != 1) {
            if (i == 2) {
                Bundle bundle = new Bundle();
                bundle.putByteArray("navigation_endpoint", apzgVar.toByteArray());
                kqq kqqVar = new kqq();
                kqqVar.ae(bundle);
                kqqVar.qv(this.a.getSupportFragmentManager(), "PlaylistInfoFragment");
                return;
            }
            dp f = this.a.getSupportFragmentManager().f("comment_dialog_fragment");
            if (f == null || !f.at()) {
                return;
            }
            ((dh) f).dismiss();
        } else {
            aqxo.p(apzgVar.qn(SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand.sfvAudioSearchCommand));
            eo supportFragmentManager2 = this.a.getSupportFragmentManager();
            if (!(supportFragmentManager2.f("SFV_AUDIO_SEARCH_FRAGMENT_TAG") instanceof hig)) {
                hid hidVar = new hid();
                Bundle bundle2 = new Bundle();
                bundle2.putByteArray("SfvMusicSearchFragmentCommandKey", apzgVar.toByteArray());
                hidVar.ae(bundle2);
                ex l = supportFragmentManager2.l();
                l.q(R.id.accessibility_layer_container, hidVar, "SFV_AUDIO_SEARCH_FRAGMENT_TAG");
                l.s();
                l.a();
                supportFragmentManager2.ab();
                return;
            }
            hid hidVar2 = (hid) supportFragmentManager2.f("SFV_AUDIO_SEARCH_FRAGMENT_TAG");
            String str = ((SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand) apzgVar.qm(SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand.sfvAudioSearchCommand)).e;
            hin hinVar = hidVar2.ag;
            hinVar.a.clearFocus();
            zag.i(hinVar.a);
            hinVar.a.setText(str);
            hidVar2.af.b(hidVar2.ah.getText().toString());
            hidVar2.q(str);
        }
    }
}
