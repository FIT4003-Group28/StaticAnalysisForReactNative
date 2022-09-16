package defpackage;

import android.content.Intent;
import com.google.android.apps.youtube.app.search.voice.VoiceSearchHalfPlateV0Activity;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: ler  reason: default package */
/* loaded from: classes3.dex */
public final class ler implements akio {
    final /* synthetic */ VoiceSearchHalfPlateV0Activity a;

    public ler(VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity) {
        this.a = voiceSearchHalfPlateV0Activity;
    }

    @Override // defpackage.akio
    public final void a() {
        VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity = this.a;
        if (voiceSearchHalfPlateV0Activity.h || voiceSearchHalfPlateV0Activity.L) {
            return;
        }
        if (voiceSearchHalfPlateV0Activity.c.b != 1) {
            voiceSearchHalfPlateV0Activity.i(voiceSearchHalfPlateV0Activity.g);
        }
        this.a.l();
    }

    @Override // defpackage.akio
    public final void b(Throwable th) {
        VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity = this.a;
        if (voiceSearchHalfPlateV0Activity.c.b != 1) {
            voiceSearchHalfPlateV0Activity.i(voiceSearchHalfPlateV0Activity.g);
        }
        if (th.getMessage() != null) {
            String format = String.format(Locale.US, "%s (YtConnectionType = %d)", th.getMessage(), Integer.valueOf(this.a.t.a()));
            afus.c(2, 32, format, th);
            String valueOf = String.valueOf(format);
            zep.d(valueOf.length() != 0 ? "VoiceSearchHalfPlateV0Activity error: ".concat(valueOf) : new String("VoiceSearchHalfPlateV0Activity error: "), th);
        }
        VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity2 = this.a;
        if (voiceSearchHalfPlateV0Activity2.h) {
            voiceSearchHalfPlateV0Activity2.j();
        }
    }

    @Override // defpackage.akio
    public final void c(aoob aoobVar) {
        aoob aoobVar2;
        try {
            awxk awxkVar = (awxk) aopi.parseFrom(awxk.a, aoobVar);
            aaqp aaqpVar = this.a.s;
            if (awxkVar.b == 1) {
                aoobVar2 = (aoob) awxkVar.c;
            } else {
                aoobVar2 = aoob.b;
            }
            arkz arkzVar = (arkz) aaqpVar.a(aoobVar2.I(), arkz.a);
            if (arkzVar == null) {
                return;
            }
            if ((arkzVar.b & 4) != 0 && arkzVar.f.size() <= 0) {
                this.a.p.n(new acte(arkzVar.c.I()));
            }
            if ((arkzVar.b & 128) != 0) {
                if (eog.z(this.a.o) && this.a.n.m(asny.LATENCY_ACTION_VOICE_ASSISTANT)) {
                    this.a.n.t("voz_rqf", asny.LATENCY_ACTION_VOICE_ASSISTANT);
                }
                VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity = this.a;
                byte[] I = aoobVar.I();
                Intent intent = voiceSearchHalfPlateV0Activity.getIntent();
                intent.putExtra("RecognizedText", I);
                intent.putExtra("AssistantCsn", voiceSearchHalfPlateV0Activity.p.k());
                intent.putExtra("SearchboxStats", voiceSearchHalfPlateV0Activity.Q);
                voiceSearchHalfPlateV0Activity.setResult(-1, intent);
                voiceSearchHalfPlateV0Activity.i(voiceSearchHalfPlateV0Activity.e);
                voiceSearchHalfPlateV0Activity.h();
            } else if (arkzVar.f.size() > 0) {
                VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity2 = this.a;
                voiceSearchHalfPlateV0Activity2.O = arkzVar.f;
                voiceSearchHalfPlateV0Activity2.g();
                this.a.H.setVisibility(0);
                if (!eog.z(this.a.o) || !this.a.n.m(asny.LATENCY_ACTION_VOICE_ASSISTANT)) {
                    return;
                }
                this.a.n.t("voz_vt", asny.LATENCY_ACTION_VOICE_ASSISTANT);
            } else {
                VoiceSearchHalfPlateV0Activity voiceSearchHalfPlateV0Activity3 = this.a;
                if (voiceSearchHalfPlateV0Activity3.c.b != 1) {
                    voiceSearchHalfPlateV0Activity3.i(voiceSearchHalfPlateV0Activity3.g);
                }
                this.a.j();
            }
        } catch (aopx unused) {
        }
    }

    @Override // defpackage.akio
    public final /* synthetic */ void d() {
    }
}
