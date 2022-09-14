package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: crdz  reason: default package */
/* loaded from: classes5.dex */
public final class crdz {
    public static final dcqe a = dcqe.c("crdz");
    public final bvjj b;
    @dzsi
    public String c;
    private final btvo d;

    public crdz(btvo btvoVar, bvjj bvjjVar) {
        this.d = btvoVar;
        this.b = bvjjVar;
    }

    public final boolean a() {
        return this.d.getTextToSpeechParameters().n;
    }

    public final String b() {
        if (!a()) {
            bvoo.h("getVoiceName() called when VoicePreferenceManager not enabled.", new Object[0]);
        }
        if (this.c == null) {
            c();
        }
        return this.c;
    }

    public final void c() {
        String z = this.b.z(bvjk.eI, "");
        if (!dbsd.a(Locale.getDefault(), bvom.b(this.b.z(bvjk.eJ, ""))) || z.isEmpty()) {
            if ((this.d.getTextToSpeechParameters().a & 512) != 0) {
                this.c = this.d.getTextToSpeechParameters().m;
                return;
            } else {
                this.c = "";
                return;
            }
        }
        this.c = z;
    }

    public final boolean d() {
        if (!a()) {
            bvoo.h("isDefaultMapsVoice() called when VoicePreferenceManager not enabled.", new Object[0]);
        }
        return b().equals(this.d.getTextToSpeechParameters().m);
    }
}
