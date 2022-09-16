package defpackage;

import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ShortsCreationSelectedTrack;
import com.google.protos.youtube.api.innertube.SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand;
import java.util.Map;
/* compiled from: PG */
/* renamed from: hex  reason: default package */
/* loaded from: classes3.dex */
public final class hex implements aafl {
    private final dt a;
    private final hfn b;
    private final acth c;

    public hex(dt dtVar, hfn hfnVar, acth acthVar) {
        this.a = dtVar;
        this.b = hfnVar;
        this.c = acthVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        ShortsCreationSelectedTrack a;
        aqxo.p(apzgVar.qn(SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.sfvAudioItemSelectCommand));
        eo supportFragmentManager = this.a.getSupportFragmentManager();
        for (int a2 = supportFragmentManager.a(); a2 > 0; a2--) {
            supportFragmentManager.aa();
        }
        this.c.oi().H(3, new acte(apzgVar.c), null);
        hfn hfnVar = this.b;
        SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand = (SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand) apzgVar.qm(SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.sfvAudioItemSelectCommand);
        hfnVar.g = false;
        azpa azpaVar = hfnVar.b;
        hfo m = ShortsCreationSelectedTrack.m();
        m.d(sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.c);
        if ((sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.b & 4) == 0) {
            a = m.a();
        } else {
            auss aussVar = sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.e;
            if (aussVar == null) {
                aussVar = auss.a;
            }
            if ((aussVar.b & 1) != 0) {
                auss aussVar2 = sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.e;
                if (aussVar2 == null) {
                    aussVar2 = auss.a;
                }
                avhn avhnVar = aussVar2.c;
                if (avhnVar == null) {
                    avhnVar = avhn.a;
                }
                m.c = avhnVar;
            }
            auss aussVar3 = sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.e;
            if (aussVar3 == null) {
                aussVar3 = auss.a;
            }
            if ((aussVar3.b & 2) != 0) {
                auss aussVar4 = sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.e;
                if (aussVar4 == null) {
                    aussVar4 = auss.a;
                }
                m.e = aussVar4.d;
            }
            if ((sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.b & 8) != 0) {
                apzg apzgVar2 = sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.g;
                if (apzgVar2 == null) {
                    apzgVar2 = apzg.a;
                }
                m.b = apzgVar2;
            }
            m.a = sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.d;
            m.b(false);
            m.c(hhw.e(sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand));
            a = m.a();
        }
        azpaVar.c(ampq.j(a));
        if ((sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.b & 8) == 0) {
            hfnVar.g(hhw.e(sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand));
        }
        String str = sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.c;
        String str2 = sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.d;
        apzg apzgVar3 = sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.g;
        if (apzgVar3 == null) {
            apzgVar3 = apzg.a;
        }
        hfnVar.d(str, str2, apzgVar3);
    }
}
