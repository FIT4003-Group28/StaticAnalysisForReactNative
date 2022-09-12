package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
/* compiled from: PG */
/* renamed from: cllq  reason: default package */
/* loaded from: classes5.dex */
public final class cllq {
    public clrc a;
    public int b;
    public float c = 1.0f;
    private final AudioManager d;
    private final cllo e;
    private final cllp f;
    private int g;

    public cllq(Context context, Handler handler, cllp cllpVar) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        cmmn.f(audioManager);
        this.d = audioManager;
        this.f = cllpVar;
        this.e = new cllo(this, handler);
        this.g = 0;
    }

    public final void a() {
        if (this.g == 0) {
            return;
        }
        if (cmny.a < 26) {
            this.d.abandonAudioFocus(this.e);
        }
        b(0);
    }

    public final void b(int i) {
        if (this.g == i) {
            return;
        }
        this.g = i;
        float f = i == 3 ? 0.2f : 1.0f;
        if (this.c == f) {
            return;
        }
        this.c = f;
        cllp cllpVar = this.f;
        if (cllpVar == null) {
            return;
        }
        ((clos) cllpVar).a.q();
    }

    public final void c(int i) {
        cllp cllpVar = this.f;
        if (cllpVar != null) {
            clos closVar = (clos) cllpVar;
            boolean f = closVar.a.f();
            closVar.a.r(f, i, clot.w(f, i));
        }
    }

    public final int d(boolean z) {
        a();
        return z ? 1 : -1;
    }
}
