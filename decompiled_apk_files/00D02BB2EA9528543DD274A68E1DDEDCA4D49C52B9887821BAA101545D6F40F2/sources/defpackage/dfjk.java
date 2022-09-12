package defpackage;

import android.graphics.Picture;
import com.google.geo.ar.arlo.api.jni.NativeObserver;
import com.google.geo.ar.arlo.api.jni.PlacePinJniImpl;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dfjk  reason: default package */
/* loaded from: classes6.dex */
public final class dfjk implements dfer {
    public final dfez<dfhp> a;
    public final dfez<dfgm> b;
    private final Object c;
    private final dfew d;
    private final dffi e;
    private final dfet f;
    private final dfet g;
    private boolean h;
    private boolean i;
    private dfew j;
    @dzsi
    private dfew k;

    public dfjk(long j, Executor executor, dfkg dfkgVar) {
        PlacePinJniImpl placePinJniImpl = new PlacePinJniImpl();
        dfet a = dfkgVar.a();
        dfet a2 = dfkgVar.a();
        Object obj = new Object();
        this.c = obj;
        dfew dfewVar = new dfew(dfjk.class, j);
        this.d = dfewVar;
        this.e = placePinJniImpl;
        this.f = a;
        this.g = a2;
        this.a = new dfez<>(executor, true);
        this.b = new dfez<>(executor, true);
        synchronized (obj) {
            if (dfewVar.c()) {
                return;
            }
            this.j = new dfew("PlacePinPlacePinStateObserver", PlacePinJniImpl.nativeAddPlacePinStateObserver(dfewVar.b(), new NativeObserver(this) { // from class: dfji
                private final dfjk a;

                {
                    this.a = this;
                }

                @Override // com.google.geo.ar.arlo.api.jni.NativeObserver
                public final void onNext(byte[] bArr) {
                    try {
                        this.a.a.c((dfhp) dsqw.cq(dfhp.d, bArr));
                    } catch (dsrm unused) {
                    }
                }
            }));
            this.k = new dfew("PlacePinIndicatorScreenPositionObserver", PlacePinJniImpl.nativeAddIndicatorScreenPositionObserver(dfewVar.b(), new NativeObserver(this) { // from class: dfjj
                private final dfjk a;

                {
                    this.a = this;
                }

                @Override // com.google.geo.ar.arlo.api.jni.NativeObserver
                public final void onNext(byte[] bArr) {
                    try {
                        this.a.b.c((dfgm) dsqw.cq(dfgm.d, bArr));
                    } catch (dsrm unused) {
                    }
                }
            }));
        }
    }

    @Override // defpackage.dfer
    public final void a(dfeq<dfhp> dfeqVar) {
        this.a.a(dfeqVar);
    }

    @Override // defpackage.dfer
    public final void b(dfeq<dfhp> dfeqVar) {
        this.a.b(dfeqVar);
    }

    @Override // defpackage.dfer
    public final void c(dfeq<dfgm> dfeqVar) {
        this.b.a(dfeqVar);
    }

    @Override // defpackage.dfer
    public final void d(dfeq<dfgm> dfeqVar) {
        this.b.b(dfeqVar);
    }

    @Override // defpackage.dfer
    public final void e(dfhx dfhxVar) {
        byte[] bS = dfhxVar.bS();
        synchronized (this.c) {
            if (!this.d.c()) {
                PlacePinJniImpl.nativeUpdatePin(this.d.b(), bS);
            }
        }
    }

    @Override // defpackage.dfer
    public final void f(Picture picture) {
        synchronized (this.c) {
            if (!this.d.c() && picture.getWidth() > 0 && picture.getHeight() > 0) {
                this.f.c(picture);
                if (!this.h) {
                    PlacePinJniImpl.nativeShowLabel(this.d.b(), this.f.d());
                }
                this.h = true;
            }
        }
    }

    @Override // defpackage.dfer
    public final void g(Picture picture) {
        synchronized (this.c) {
            if (!this.d.c() && picture.getWidth() > 0 && picture.getHeight() > 0) {
                this.g.c(picture);
                if (!this.i) {
                    PlacePinJniImpl.nativeShowIcon(this.d.b(), this.g.d());
                }
                this.i = true;
            }
        }
    }

    @Override // defpackage.dfer
    public final void h() {
        synchronized (this.c) {
            if (this.d.c()) {
                return;
            }
            dfew dfewVar = this.j;
            if (dfewVar != null && !dfewVar.c()) {
                PlacePinJniImpl.nativeRemoveObserver(this.j.b());
                this.j.a();
            }
            this.j = null;
            dfew dfewVar2 = this.k;
            if (dfewVar2 != null && !dfewVar2.c()) {
                PlacePinJniImpl.nativeRemoveObserver(this.k.b());
                this.k.a();
            }
            this.k = null;
            this.f.e();
            this.g.e();
            PlacePinJniImpl.nativeDestroy(this.d.b());
            this.d.a();
        }
    }
}
