package defpackage;

import android.content.Intent;
import com.google.android.apps.youtube.app.search.voice.VoiceSearchActivity;
/* compiled from: PG */
/* renamed from: ldp  reason: default package */
/* loaded from: classes3.dex */
public final class ldp implements akio {
    final /* synthetic */ VoiceSearchActivity a;

    public ldp(VoiceSearchActivity voiceSearchActivity) {
        this.a = voiceSearchActivity;
    }

    @Override // defpackage.akio
    public final void a() {
        VoiceSearchActivity voiceSearchActivity = this.a;
        if (voiceSearchActivity.h || voiceSearchActivity.N) {
            return;
        }
        if (voiceSearchActivity.c.b != 1) {
            voiceSearchActivity.i(voiceSearchActivity.g);
        }
        this.a.l();
    }

    @Override // defpackage.akio
    public final void b(Throwable th) {
        VoiceSearchActivity voiceSearchActivity = this.a;
        if (voiceSearchActivity.c.b != 1) {
            voiceSearchActivity.i(voiceSearchActivity.g);
        }
        if (th.getMessage() != null) {
            String format = String.format("%s (YtConnectionType = %d)", th.getMessage(), Integer.valueOf(this.a.t.a()));
            afus.c(2, 32, format, th);
            String valueOf = String.valueOf(format);
            zep.d(valueOf.length() != 0 ? "VoiceSearchActivity error: ".concat(valueOf) : new String("VoiceSearchActivity error: "), th);
        }
        VoiceSearchActivity voiceSearchActivity2 = this.a;
        if (voiceSearchActivity2.h) {
            voiceSearchActivity2.j();
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
                VoiceSearchActivity voiceSearchActivity = this.a;
                byte[] I = aoobVar.I();
                Intent intent = voiceSearchActivity.getIntent();
                intent.putExtra("RecognizedText", I);
                intent.putExtra("AssistantCsn", voiceSearchActivity.p.k());
                intent.putExtra("SearchboxStats", voiceSearchActivity.S);
                voiceSearchActivity.setResult(-1, intent);
                voiceSearchActivity.i(voiceSearchActivity.e);
                voiceSearchActivity.h();
            } else if (arkzVar.f.size() > 0) {
                VoiceSearchActivity voiceSearchActivity2 = this.a;
                voiceSearchActivity2.Q = arkzVar.f;
                voiceSearchActivity2.g();
                this.a.f150J.setVisibility(0);
                if (!eog.z(this.a.o) || !this.a.n.m(asny.LATENCY_ACTION_VOICE_ASSISTANT)) {
                    return;
                }
                this.a.n.t("voz_vt", asny.LATENCY_ACTION_VOICE_ASSISTANT);
            } else {
                VoiceSearchActivity voiceSearchActivity3 = this.a;
                if (voiceSearchActivity3.c.b != 1) {
                    voiceSearchActivity3.i(voiceSearchActivity3.g);
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
