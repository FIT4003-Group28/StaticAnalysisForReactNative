package defpackage;

import android.graphics.Picture;
import com.google.geo.ar.arlo.api.jni.NativeObserver;
import com.google.geo.ar.arlo.api.jni.NavigationStepJniImpl;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dfjg  reason: default package */
/* loaded from: classes6.dex */
public final class dfjg implements dfep {
    public final dfez<dfha> a;
    public final dfez<dfgm> b;
    private final Object c;
    private final dfew d;
    private final dffh e;
    private final dfet f;
    private boolean g;
    private dfew h;
    @dzsi
    private dfew i;

    public dfjg(long j, Executor executor, dfkg dfkgVar) {
        NavigationStepJniImpl navigationStepJniImpl = new NavigationStepJniImpl();
        dfet a = dfkgVar.a();
        Object obj = new Object();
        this.c = obj;
        dfew dfewVar = new dfew(dfjg.class, j);
        this.d = dfewVar;
        this.e = navigationStepJniImpl;
        this.f = a;
        this.a = new dfez<>(executor, true);
        this.b = new dfez<>(executor, true);
        this.g = false;
        synchronized (obj) {
            if (dfewVar.c()) {
                return;
            }
            this.h = new dfew("NavigationStepNavigationStepStateObserver", NavigationStepJniImpl.nativeAddNavigationStepStateObserver(dfewVar.b(), new NativeObserver(this) { // from class: dfje
                private final dfjg a;

                {
                    this.a = this;
                }

                @Override // com.google.geo.ar.arlo.api.jni.NativeObserver
                public final void onNext(byte[] bArr) {
                    try {
                        this.a.a.c((dfha) dsqw.cq(dfha.b, bArr));
                    } catch (dsrm unused) {
                    }
                }
            }));
            this.i = new dfew("NavigationStepIndicatorScreenPositionObserver", NavigationStepJniImpl.nativeAddIndicatorScreenPositionObserver(dfewVar.b(), new NativeObserver(this) { // from class: dfjf
                private final dfjg a;

                {
                    this.a = this;
                }

                @Override // com.google.geo.ar.arlo.api.jni.NativeObserver
                public final void onNext(byte[] bArr) {
                    dfjg dfjgVar = this.a;
                    try {
                        dsqa c = dsqa.c();
                        dfjgVar.b.c((dfgm) dsqw.cr(dfgm.d, bArr, c));
                    } catch (dsrm unused) {
                    }
                }
            }));
        }
    }

    @Override // defpackage.dfep
    public final void a(dfeq<dfha> dfeqVar) {
        this.a.a(dfeqVar);
    }

    @Override // defpackage.dfep
    public final void b(dfeq<dfha> dfeqVar) {
        this.a.b(dfeqVar);
    }

    @Override // defpackage.dfep
    public final void c(dfeq<dfgm> dfeqVar) {
        this.b.a(dfeqVar);
    }

    @Override // defpackage.dfep
    public final void d(dfeq<dfgm> dfeqVar) {
        this.b.b(dfeqVar);
    }

    @Override // defpackage.dfep
    public final void e(Picture picture) {
        int width = picture.getWidth();
        int height = picture.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        synchronized (this.c) {
            if (this.d.c()) {
                return;
            }
            this.f.c(picture);
            if (!this.g) {
                NavigationStepJniImpl.nativeSetCalloutTexture(this.d.b(), this.f.d());
            }
            this.g = true;
        }
    }

    @Override // defpackage.dfep
    public final void f(dfhc dfhcVar) {
        byte[] bS = dfhcVar.bS();
        synchronized (this.c) {
            if (!this.d.c()) {
                NavigationStepJniImpl.nativeUpdateSnapshotParams(this.d.b(), bS);
            }
        }
    }

    @Override // defpackage.dfep
    public final void g() {
        synchronized (this.c) {
            if (this.d.c()) {
                return;
            }
            dfew dfewVar = this.h;
            if (dfewVar != null && !dfewVar.c()) {
                NavigationStepJniImpl.nativeRemoveObserver(this.h.b());
                this.h.a();
            }
            this.h = null;
            dfew dfewVar2 = this.i;
            if (dfewVar2 != null && !dfewVar2.c()) {
                NavigationStepJniImpl.nativeRemoveObserver(this.i.b());
                this.i.a();
            }
            this.i = null;
            NavigationStepJniImpl.nativeDestroy(this.d.b());
            this.d.a();
            this.f.e();
        }
    }
}
