package defpackage;

import android.view.Surface;
import com.google.geo.ar.arlo.api.jni.ArloViewBridgeJniImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dfjy  reason: default package */
/* loaded from: classes6.dex */
public final class dfjy implements dfel {
    public final Object a;
    public final dfew b;
    private final dfjm c;

    public dfjy(long j, dfjm dfjmVar) {
        int i = ArloViewBridgeJniImpl.a;
        this.a = new Object();
        dfew dfewVar = new dfew(dfjy.class, j);
        this.b = dfewVar;
        this.c = dfjmVar;
        dfewVar.d();
    }

    @Override // defpackage.dfel
    public final void a(@dzsi Surface surface) {
        synchronized (this.a) {
            if (this.b.c()) {
                return;
            }
            long b = this.b.b();
            if (surface != null) {
                ArloViewBridgeJniImpl.nativeSetSurface(b, surface);
            } else {
                ArloViewBridgeJniImpl.nativeClearSurface(b);
            }
        }
    }

    @Override // defpackage.dfel
    public final void b(int i, int i2, int i3) {
        synchronized (this.a) {
            if (!this.b.c()) {
                ArloViewBridgeJniImpl.nativeSetSurfaceDimensionsAndRotation(this.b.b(), i, i2, i3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0039 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.dfel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(@defpackage.dzsi defpackage.dfeh r8) {
        /*
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L35
            dfjm r2 = r7.c
            dfjx r2 = r2.a
            java.lang.Object r3 = r2.h
            monitor-enter(r3)
            java.util.Set<dfeh> r2 = r2.i     // Catch: java.lang.Throwable -> L32
            boolean r2 = r2.contains(r8)     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L16
            dfiz r8 = (defpackage.dfiz) r8     // Catch: java.lang.Throwable -> L32
            goto L17
        L16:
            r8 = 0
        L17:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L32
            if (r8 == 0) goto L35
            java.lang.Object r2 = r8.a
            monitor-enter(r2)
            dfew r3 = r8.b     // Catch: java.lang.Throwable -> L2f
            boolean r3 = r3.c()     // Catch: java.lang.Throwable -> L2f
            if (r3 == 0) goto L27
            r3 = r0
            goto L2d
        L27:
            dfew r8 = r8.b     // Catch: java.lang.Throwable -> L2f
            long r3 = r8.b()     // Catch: java.lang.Throwable -> L2f
        L2d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            goto L36
        L2f:
            r8 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            throw r8
        L32:
            r8 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L32
            throw r8
        L35:
            r3 = r0
        L36:
            java.lang.Object r8 = r7.a
            monitor-enter(r8)
            dfew r2 = r7.b     // Catch: java.lang.Throwable -> L56
            boolean r2 = r2.c()     // Catch: java.lang.Throwable -> L56
            if (r2 == 0) goto L43
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L56
            return
        L43:
            dfew r2 = r7.b     // Catch: java.lang.Throwable -> L56
            long r5 = r2.b()     // Catch: java.lang.Throwable -> L56
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto L51
            com.google.geo.ar.arlo.api.jni.ArloViewBridgeJniImpl.nativeSetScene(r5, r3)     // Catch: java.lang.Throwable -> L56
            goto L54
        L51:
            com.google.geo.ar.arlo.api.jni.ArloViewBridgeJniImpl.nativeClearScene(r5)     // Catch: java.lang.Throwable -> L56
        L54:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L56
            return
        L56:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L56
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dfjy.c(dfeh):void");
    }
}
