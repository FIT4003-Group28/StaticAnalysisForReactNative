package defpackage;

import com.google.vr.sdk.audio.GvrAudioSurround;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: PG */
/* renamed from: aexj  reason: default package */
/* loaded from: classes.dex */
class aexj implements pky {
    private final aevy a;
    private GvrAudioSurround d;
    private boolean g;
    private float i;
    private float j;
    private float k;
    private float h = 1.0f;
    private pkw b = pkw.a;
    private ByteBuffer e = f;
    private int c = 0;

    static {
        piq.b("goog.exo.gvr");
    }

    public aexj(aevy aevyVar) {
        this.a = aevyVar;
    }

    private final void b() {
        GvrAudioSurround gvrAudioSurround = this.d;
        if (gvrAudioSurround != null) {
            gvrAudioSurround.release();
            this.d = null;
        }
    }

    public final synchronized void a(float f, float f2, float f3, float f4) {
        this.h = f;
        this.i = f2;
        this.j = f3;
        this.k = f4;
        GvrAudioSurround gvrAudioSurround = this.d;
        if (gvrAudioSurround != null) {
            gvrAudioSurround.updateNativeOrientation(f, f2, f3, f4);
        }
    }

    @Override // defpackage.pky
    public void h(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        ptx.a(this.d);
        byteBuffer.position(position + this.d.addInput(byteBuffer, position, byteBuffer.limit() - position));
    }

    @Override // defpackage.pky
    public final synchronized pkw j(pkw pkwVar) {
        if (pkwVar.d != 2) {
            b();
            throw new pkx(pkwVar);
        }
        int i = pkwVar.c;
        if (i == 1) {
            this.c = 1;
        } else if (i != 2) {
            int i2 = 4;
            if (i != 4) {
                i2 = 6;
                if (i == 6) {
                    this.c = 3;
                } else if (i == 9) {
                    this.c = 5;
                } else if (i != 16) {
                    throw new pkx(pkwVar);
                }
            }
            this.c = i2;
        } else {
            this.c = 2;
        }
        if (this.e == f) {
            this.e = ByteBuffer.allocateDirect(4096).order(ByteOrder.nativeOrder());
        }
        this.b = pkwVar;
        return new pkw(pkwVar.b, 2, 2);
    }

    @Override // defpackage.pky
    public ByteBuffer k() {
        GvrAudioSurround gvrAudioSurround = this.d;
        if (gvrAudioSurround == null) {
            return f;
        }
        ByteBuffer byteBuffer = this.e;
        this.e.position(0).limit(gvrAudioSurround.getOutput(byteBuffer, 0, byteBuffer.capacity()));
        return this.e;
    }

    @Override // defpackage.pky
    public final void l() {
        if (this.c != 0) {
            b();
            try {
                int i = this.c;
                pkw pkwVar = this.b;
                GvrAudioSurround gvrAudioSurround = new GvrAudioSurround(i, pkwVar.b, pkwVar.c, 1024);
                this.d = gvrAudioSurround;
                gvrAudioSurround.updateNativeOrientation(this.h, this.i, this.j, this.k);
                this.c = 0;
            } catch (UnsatisfiedLinkError e) {
                afbi afbiVar = this.a.n;
                if (afbiVar == null) {
                    return;
                }
                aeub aeubVar = afbiVar.K;
                afkk afkkVar = new afkk("android.audiotrack", 0L);
                afkkVar.c = e;
                afkkVar.b = "c.GvrAudio";
                aeubVar.d(afkkVar.a());
                return;
            }
        } else {
            GvrAudioSurround gvrAudioSurround2 = this.d;
            if (gvrAudioSurround2 != null) {
                gvrAudioSurround2.flush();
            }
        }
        this.g = false;
    }

    @Override // defpackage.pky
    public final void m() {
        GvrAudioSurround gvrAudioSurround = this.d;
        if (gvrAudioSurround != null) {
            gvrAudioSurround.triggerProcessing();
        }
        this.g = true;
    }

    @Override // defpackage.pky
    public final synchronized void n() {
        b();
        a(1.0f, 0.0f, 0.0f, 0.0f);
        this.g = false;
        this.b = pkw.a;
        this.e = f;
        this.c = 0;
    }

    @Override // defpackage.pky
    public final boolean o() {
        return (this.c == 0 && this.d == null) ? false : true;
    }

    @Override // defpackage.pky
    public final boolean p() {
        GvrAudioSurround gvrAudioSurround;
        return this.g && ((gvrAudioSurround = this.d) == null || gvrAudioSurround.getAvailableOutputSize() == 0);
    }
}
