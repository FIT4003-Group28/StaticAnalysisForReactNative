package defpackage;

import com.google.geo.ar.arlo.api.exception.ArloStatusException;
import com.google.geo.ar.arlo.api.jni.ArloSessionJniImpl;
import com.google.geo.ar.arlo.api.jni.NativeObserver;
import java.util.concurrent.locks.ReadWriteLock;
/* renamed from: dfjp  reason: default package */
/* loaded from: classes6.dex */
public final /* synthetic */ class dfjp {
    private final dfjx a;

    public dfjp(dfjx dfjxVar) {
        this.a = dfjxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [dfjx] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.concurrent.locks.Lock] */
    public final void a() {
        ReadWriteLock readWriteLock;
        final dfjx dfjxVar = this.a;
        dfej.a(dfjxVar.j);
        if (dfjxVar.f.get() != dfjw.CREATED) {
            return;
        }
        dfjxVar.e.readLock().lock();
        try {
            try {
                ArloSessionJniImpl.nativeDoFrame(dfjxVar.g.b(), new NativeObserver(dfjxVar) { // from class: dfjs
                    private final dfjx a;

                    {
                        this.a = dfjxVar;
                    }

                    @Override // com.google.geo.ar.arlo.api.jni.NativeObserver
                    public final void onNext(byte[] bArr) {
                        dfjx dfjxVar2 = this.a;
                        if (bArr != null) {
                            try {
                                dsqa c = dsqa.c();
                                dfjxVar2.c.c((dffq) dsqw.cr(dffq.c, bArr, c));
                            } catch (dsrm unused) {
                            }
                        }
                    }
                });
                readWriteLock = dfjxVar.e;
            } catch (ArloStatusException e) {
                dfjxVar.k(e);
                readWriteLock = dfjxVar.e;
            }
            dfjxVar = readWriteLock.readLock();
            dfjxVar.unlock();
        } catch (Throwable th) {
            dfjxVar.e.readLock().unlock();
            throw th;
        }
    }
}
