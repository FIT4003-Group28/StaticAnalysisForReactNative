package defpackage;

import com.google.geo.ar.arlo.api.jni.LocalizationStateManagerJniImpl;
import com.google.geo.ar.arlo.api.jni.NativeObserver;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dfka  reason: default package */
/* loaded from: classes6.dex */
final class dfka implements dfeo {
    public final Object a;
    public final dfew b;
    @dzsi
    public dfew c;
    public final dffg d;
    public final dfez<dfgv> e;
    private int f;
    private boolean g;

    public dfka(long j, Executor executor) {
        LocalizationStateManagerJniImpl localizationStateManagerJniImpl = new LocalizationStateManagerJniImpl();
        this.f = 0;
        Object obj = new Object();
        this.a = obj;
        dfew dfewVar = new dfew(dfka.class, j);
        this.b = dfewVar;
        this.e = new dfez<>(executor, true);
        this.d = localizationStateManagerJniImpl;
        synchronized (obj) {
            if (dfewVar.c()) {
                return;
            }
            this.c = new dfew("LocalizationStatusObserver", LocalizationStateManagerJniImpl.nativeAddObserver(dfewVar.b(), new NativeObserver(this) { // from class: dfjz
                private final dfka a;

                {
                    this.a = this;
                }

                @Override // com.google.geo.ar.arlo.api.jni.NativeObserver
                public final void onNext(byte[] bArr) {
                    try {
                        this.a.e.c((dfgv) dsqw.cq(dfgv.d, bArr));
                    } catch (dsrm unused) {
                    }
                }
            }));
        }
    }

    private final void h() {
        synchronized (this.a) {
            if (!this.b.c()) {
                LocalizationStateManagerJniImpl.nativeStop(this.b.b());
            }
        }
    }

    @Override // defpackage.dfeo
    public final void a() {
        synchronized (this.a) {
            this.g = true;
            if (this.f != 0) {
                return;
            }
            if (this.b.c()) {
                return;
            }
            LocalizationStateManagerJniImpl.nativeStart(this.b.b());
        }
    }

    @Override // defpackage.dfeo
    public final void b() {
        synchronized (this.a) {
            this.g = false;
            h();
        }
    }

    @Override // defpackage.dfeo
    public final void c() {
        synchronized (this.a) {
            int i = this.f + 1;
            this.f = i;
            if (i == 1) {
                h();
            }
        }
    }

    @Override // defpackage.dfeo
    public final void d() {
        synchronized (this.a) {
            int i = this.f - 1;
            this.f = i;
            dbsk.l(i >= 0);
            if (this.f == 0 && this.g) {
                a();
            }
        }
    }

    @Override // defpackage.dfeo
    public final void e(dfeq<dfgv> dfeqVar) {
        this.e.a(dfeqVar);
    }

    @Override // defpackage.dfeo
    public final void f(dfeq<dfgv> dfeqVar) {
        this.e.b(dfeqVar);
    }

    @Override // defpackage.dfeo
    public final void g() {
        synchronized (this.a) {
            if (!this.b.c()) {
                LocalizationStateManagerJniImpl.nativeReset(this.b.b());
            }
        }
    }
}
