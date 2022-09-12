package defpackage;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
/* compiled from: PG */
/* renamed from: bnta  reason: default package */
/* loaded from: classes.dex */
public final class bnta {
    @dzsi
    private static bnsz a;

    /* JADX WARN: Removed duplicated region for block: B:65:0x01ee A[Catch: all -> 0x020b, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:63:0x01ea, B:65:0x01ee, B:9:0x0012, B:12:0x0019, B:14:0x0024, B:16:0x0032, B:18:0x00b3, B:20:0x00e3, B:29:0x0128, B:32:0x0132, B:36:0x0156, B:38:0x0182, B:40:0x0188, B:43:0x0192, B:45:0x019e, B:46:0x01a1, B:48:0x01a9, B:51:0x01b3, B:50:0x01b1, B:55:0x01bc, B:60:0x01ca, B:61:0x01d6, B:62:0x01de, B:24:0x0117, B:66:0x0207), top: B:74:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized defpackage.bnsz a() {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bnta.a():bnsz");
    }

    private static void b(EGL10 egl10, EGLDisplay eGLDisplay, int[] iArr, EGLConfig[] eGLConfigArr, int i, int[] iArr2) {
        egl10.eglChooseConfig(eGLDisplay, iArr, eGLConfigArr, i, iArr2);
    }

    private static void c(EGL10 egl10) {
        egl10.eglGetError();
    }
}
