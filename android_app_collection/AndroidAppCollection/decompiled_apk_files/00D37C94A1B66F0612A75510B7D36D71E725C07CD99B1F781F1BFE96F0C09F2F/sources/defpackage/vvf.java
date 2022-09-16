package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.opengl.GLES20;
import com.google.android.libraries.video.media.VideoMetaData;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.PriorityBlockingQueue;
import javax.microedition.khronos.egl.EGL10;
/* compiled from: PG */
/* renamed from: vvf  reason: default package */
/* loaded from: classes4.dex */
public final class vvf extends Thread {
    public volatile Exception b;
    private final Context c;
    private final VideoMetaData d;
    private final int e;
    private final int f;
    private final vrw g;
    private final vrp h;
    private final PriorityBlockingQueue i;
    private final vrt j;
    private final vsj k;
    private volatile boolean l;
    private vuy m;
    private ByteBuffer[] o;
    private boolean p;
    private vrx q;
    private vru r;
    private final MediaCodec.BufferInfo n = new MediaCodec.BufferInfo();
    public final CountDownLatch a = new CountDownLatch(1);

    public vvf(Context context, VideoMetaData videoMetaData, int i, int i2, PriorityBlockingQueue priorityBlockingQueue, vrw vrwVar, vrp vrpVar, vrt vrtVar) {
        this.c = context;
        this.d = videoMetaData;
        this.e = i;
        this.f = i2;
        this.i = priorityBlockingQueue;
        this.g = vrwVar;
        this.h = vrpVar;
        this.j = vrtVar;
        this.k = new vsj(vrtVar);
        setName("Extractor Thread");
    }

    private final void b() {
        vuy vuyVar = this.m;
        if (vuyVar != null) {
            vva vvaVar = (vva) vuyVar;
            viu.d(vvaVar.d != EGL10.EGL_NO_DISPLAY);
            GLES20.glDeleteProgram(vvaVar.l);
            vvaVar.l = 0;
            vvaVar.c.eglDestroySurface(vvaVar.d, vvaVar.f);
            vvaVar.c.eglDestroyContext(vvaVar.d, vvaVar.e);
            vvaVar.c.eglMakeCurrent(vvaVar.d, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
            vvaVar.c.eglTerminate(vvaVar.d);
            vvaVar.d = EGL10.EGL_NO_DISPLAY;
            vvaVar.e = EGL10.EGL_NO_CONTEXT;
            vvaVar.f = EGL10.EGL_NO_SURFACE;
            vvaVar.s.release();
            vvaVar.s = null;
            vvaVar.r.release();
            vvaVar.r = null;
            this.m = null;
        }
        vrx vrxVar = this.q;
        if (vrxVar != null) {
            vrxVar.c();
            this.q = null;
        }
    }

    private final void c() {
        vru vruVar = this.r;
        if (vruVar != null) {
            if (this.p) {
                try {
                    vruVar.f();
                } catch (IllegalStateException e) {
                    vqy.c("IllegalStateException while stopping decoder", e);
                }
                this.p = false;
            }
            this.r.c();
            this.r = null;
        }
    }

    private final boolean d(vvb vvbVar) {
        vvb vvbVar2 = (vvb) this.i.peek();
        return vvbVar2 != null && vvbVar2.a > vvbVar.a;
    }

    public final synchronized void a() {
        if (!this.l) {
            this.l = true;
            interrupt();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x036d, code lost:
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x037f, code lost:
        throw new java.lang.Exception(java.lang.String.format("Decoder failed with status %d", java.lang.Integer.valueOf(r12)));
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x039b A[Catch: all -> 0x0388, TRY_LEAVE, TryCatch #4 {all -> 0x0388, blocks: (B:35:0x00d0, B:38:0x00d9, B:41:0x00f1, B:43:0x00f9, B:45:0x00ff, B:50:0x012e, B:49:0x0119, B:51:0x0133, B:53:0x013e, B:55:0x0151, B:56:0x0158, B:71:0x01b0, B:73:0x02e9, B:84:0x0309, B:134:0x0390, B:139:0x039b, B:87:0x0311, B:89:0x0315, B:91:0x031b, B:93:0x031f, B:100:0x032f, B:102:0x0332, B:74:0x02ed, B:133:0x038d, B:81:0x02fe, B:82:0x02ff, B:106:0x034c, B:121:0x036b, B:123:0x036e, B:124:0x037f), top: B:205:0x00d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03a4 A[Catch: all -> 0x0434, TRY_ENTER, TryCatch #11 {all -> 0x0434, blocks: (B:4:0x0027, B:5:0x002c, B:7:0x0030, B:9:0x003e, B:10:0x004d, B:12:0x0051, B:143:0x03a4, B:144:0x03a9, B:145:0x03ab, B:159:0x03cc, B:172:0x03e4, B:173:0x03e9, B:178:0x03f9, B:187:0x0418, B:188:0x041a, B:197:0x042b, B:23:0x0078, B:27:0x0095, B:29:0x00a7, B:31:0x00b2, B:32:0x00b5, B:33:0x00c5, B:153:0x03ba, B:154:0x03bf, B:30:0x00ac, B:3:0x0002, B:186:0x0411, B:196:0x0424, B:14:0x005b, B:15:0x005f, B:141:0x039f, B:149:0x03b4, B:150:0x03b7, B:157:0x03c2, B:161:0x03d4, B:22:0x0073, B:165:0x03d8, B:170:0x03dd), top: B:216:0x0002, inners: #6, #13, #18, #15 }] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1091
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vvf.run():void");
    }
}
