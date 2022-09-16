package defpackage;

import android.media.AudioManager;
/* compiled from: PG */
/* renamed from: ahel  reason: default package */
/* loaded from: classes.dex */
public final class ahel implements AudioManager.OnAudioFocusChangeListener {
    public static final /* synthetic */ int e = 0;
    public final /* synthetic */ ahen c;
    public boolean a = false;
    public boolean b = false;
    public int d = 1;

    public ahel(ahen ahenVar) {
        this.c = ahenVar;
    }

    public final boolean a() {
        return this.d != 1;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        if (this.c.b.m) {
            return;
        }
        boolean z = true;
        if (i == -3) {
            aijb.a(aija.AUDIOMANAGER, "AudioFocus DUCK", new Object[0]);
            ahem ahemVar = this.c.h;
            if (ahemVar == null) {
                return;
            }
            ahemVar.c(true);
            this.c.j = 2;
        } else if (i == -2 || i == -1) {
            aijb.a(aija.AUDIOMANAGER, "AudioFocus LOSS", new Object[0]);
            ahem ahemVar2 = this.c.h;
            if (ahemVar2 != null) {
                if (!ahemVar2.d() || i != -2) {
                    z = false;
                }
                this.a = z;
                ahen ahenVar = this.c;
                if (ahenVar.l == 2) {
                    ahenVar.h.a();
                } else {
                    ahenVar.h.e();
                }
            }
            this.c.j = 0;
        } else if (i != 1 && i != 2 && i != 3) {
        } else {
            aijb.a(aija.AUDIOMANAGER, "AudioFocus GAIN", new Object[0]);
            ahen ahenVar2 = this.c;
            ahenVar2.j = 1;
            ahem ahemVar3 = ahenVar2.h;
            if (ahemVar3 != null) {
                ahemVar3.c(false);
            }
            if (!this.a) {
                return;
            }
            if (this.c.b.k || a()) {
                this.a = false;
                this.b = false;
                ahem ahemVar4 = this.c.h;
                if (ahemVar4 == null) {
                    return;
                }
                ahemVar4.b();
                return;
            }
            this.b = true;
        }
    }
}
