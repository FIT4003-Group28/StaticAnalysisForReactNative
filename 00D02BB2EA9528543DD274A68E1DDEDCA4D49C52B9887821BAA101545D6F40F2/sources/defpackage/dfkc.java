package defpackage;

import com.google.geo.ar.arlo.api.jni.NativeObserver;
import com.google.geo.ar.arlo.api.jni.SituationalAwarenessJniImpl;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dfkc  reason: default package */
/* loaded from: classes6.dex */
public final class dfkc {
    public final Object a;
    public final dfew b;
    public final dffj c;
    public final dfez<dfiy> d;
    @dzsi
    public dfew e;

    public dfkc(long j, Executor executor) {
        SituationalAwarenessJniImpl situationalAwarenessJniImpl = new SituationalAwarenessJniImpl();
        this.a = new Object();
        dfew dfewVar = new dfew(dfkc.class, j);
        this.b = dfewVar;
        this.c = situationalAwarenessJniImpl;
        dfewVar.d();
        this.d = new dfez<>(executor, false);
        this.e = new dfew("SituationalAwarenessObserver", SituationalAwarenessJniImpl.nativeAddObserver(dfewVar.b(), new NativeObserver(this) { // from class: dfkb
            private final dfkc a;

            {
                this.a = this;
            }

            @Override // com.google.geo.ar.arlo.api.jni.NativeObserver
            public final void onNext(byte[] bArr) {
                try {
                    this.a.d.c((dfiy) dsqw.cq(dfiy.b, bArr));
                } catch (dsrm unused) {
                }
            }
        }));
    }

    public final void a() {
        synchronized (this.a) {
            if (!this.b.c()) {
                SituationalAwarenessJniImpl.nativeStart(this.b.b());
            }
        }
    }

    public final void b() {
        synchronized (this.a) {
            if (!this.b.c()) {
                SituationalAwarenessJniImpl.nativeStop(this.b.b());
            }
        }
    }

    public final void c(dfeq<dfiy> dfeqVar) {
        synchronized (this.a) {
            if (this.b.c()) {
                return;
            }
            this.d.a(dfeqVar);
        }
    }

    public final void d(dfeq<dfiy> dfeqVar) {
        synchronized (this.a) {
            if (this.b.c()) {
                return;
            }
            this.d.b(dfeqVar);
        }
    }

    public final void e(dfiu dfiuVar) {
        synchronized (this.a) {
            if (!this.b.c()) {
                SituationalAwarenessJniImpl.nativeConfigure(this.b.b(), dfiuVar.bS());
            }
        }
    }
}
