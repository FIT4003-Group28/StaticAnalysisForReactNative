package defpackage;

import com.google.geo.ar.arlo.api.jni.ArloSceneJniImpl;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dfiz  reason: default package */
/* loaded from: classes6.dex */
public final class dfiz implements dfeh {
    public final Object a;
    public final dfew b;
    private final Executor c;
    @dzsi
    private dfjb d;
    @dzsi
    private dfjc e;
    @dzsi
    private dfjd f;
    private final dfkg g;

    public dfiz(long j, Executor executor, dfkg dfkgVar) {
        int i = ArloSceneJniImpl.a;
        this.a = new Object();
        this.b = new dfew(dfiz.class, j);
        this.c = executor;
        this.g = dfkgVar;
    }

    @Override // defpackage.dfeh
    public final dfen a() {
        boolean c;
        synchronized (this.a) {
            dfjd dfjdVar = this.f;
            if (dfjdVar != null) {
                synchronized (dfjdVar.a) {
                    c = dfjdVar.b.c();
                }
                if (!c) {
                    return this.f;
                }
            }
            dfjd dfjdVar2 = new dfjd(!this.b.c() ? ArloSceneJniImpl.nativeCreateLocalizationStateDisplay(this.b.b()) : 0L);
            this.f = dfjdVar2;
            return dfjdVar2;
        }
    }

    @Override // defpackage.dfeh
    public final dfep b(dfgx dfgxVar) {
        dfjg dfjgVar;
        byte[] bS = dfgxVar.bS();
        synchronized (this.a) {
            long nativeCreateNavigationStep = !this.b.c() ? ArloSceneJniImpl.nativeCreateNavigationStep(this.b.b(), bS) : 0L;
            Executor executor = this.c;
            dfkg dfkgVar = this.g;
            dfjh.a(executor, 2);
            dfjh.a(dfkgVar, 3);
            dfjgVar = new dfjg(nativeCreateNavigationStep, executor, dfkgVar);
        }
        return dfjgVar;
    }

    @Override // defpackage.dfeh
    public final dfer c(dfhj dfhjVar) {
        dfjk dfjkVar;
        byte[] bS = dfhjVar.bS();
        synchronized (this.a) {
            dfjkVar = new dfjk(!this.b.c() ? ArloSceneJniImpl.nativeCreatePlacePin(this.b.b(), bS) : 0L, this.c, this.g);
        }
        return dfjkVar;
    }

    @Override // defpackage.dfeh
    public final void d() {
        synchronized (this.a) {
            ArloSceneJniImpl.nativeDestroy(this.b.b());
            this.b.a();
        }
    }

    @Override // defpackage.dfeh
    public final dfjb e(dfga dfgaVar) {
        boolean c;
        byte[] bS = dfgaVar.bS();
        synchronized (this.a) {
            dfjb dfjbVar = this.d;
            if (dfjbVar != null) {
                synchronized (dfjbVar.a) {
                    c = dfjbVar.b.c();
                }
                if (!c) {
                    return this.d;
                }
            }
            dfjb dfjbVar2 = new dfjb(!this.b.c() ? ArloSceneJniImpl.nativeCreateCameraPreviewEffects(this.b.b(), bS) : 0L);
            this.d = dfjbVar2;
            return dfjbVar2;
        }
    }

    @Override // defpackage.dfeh
    public final dfjc f(dfge dfgeVar) {
        boolean c;
        byte[] bS = dfgeVar.bS();
        synchronized (this.a) {
            dfjc dfjcVar = this.e;
            if (dfjcVar != null) {
                synchronized (dfjcVar.a) {
                    c = dfjcVar.b.c();
                }
                if (!c) {
                    return this.e;
                }
            }
            dfjc dfjcVar2 = new dfjc(!this.b.c() ? ArloSceneJniImpl.nativeCreateHulaMap(this.b.b(), bS) : 0L, this.g);
            this.e = dfjcVar2;
            return dfjcVar2;
        }
    }
}
