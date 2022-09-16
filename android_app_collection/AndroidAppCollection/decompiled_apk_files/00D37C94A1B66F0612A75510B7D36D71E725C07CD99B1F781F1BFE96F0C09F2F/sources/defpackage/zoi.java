package defpackage;

import android.opengl.GLES20;
/* compiled from: PG */
/* renamed from: zoi  reason: default package */
/* loaded from: classes4.dex */
public final class zoi {
    public final zou a;
    public long b;
    public long c;
    public zdt d;
    public long e = -1;
    public long f = Long.MIN_VALUE;
    public boolean g;
    private zoc h;

    public zoi(zou zouVar) {
        this.a = zouVar;
        b();
    }

    private final void c(String str) {
        if (this.g) {
            zep.c("PresetFilterDebug", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(ask askVar, zod zodVar, int i, int i2) {
        try {
            if (this.h == null) {
                this.h = zoc.a();
            }
            this.h.c(askVar, zodVar, i, i2);
            zodVar.i();
        } catch (RuntimeException e) {
            c("DrishtiGlInOut:copyOutputToViewShader failed: ");
            zep.d("copyTextureFrameToTarget: copyOutputToViewShader failed: ", e);
            this.h = null;
        }
        GLES20.glFinish();
        c("DrishtiGlInOut:copyTextureFrameToTarget");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.b = Long.MIN_VALUE;
        this.c = Long.MIN_VALUE;
    }
}
