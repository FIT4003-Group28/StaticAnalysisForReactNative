package defpackage;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.AppMetadata;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: roh  reason: default package */
/* loaded from: classes4.dex */
final class roh implements Runnable {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ AppMetadata d;
    final /* synthetic */ boolean e;
    final /* synthetic */ rom f;

    public roh(rom romVar, AtomicReference atomicReference, String str, String str2, AppMetadata appMetadata, boolean z) {
        this.f = romVar;
        this.a = atomicReference;
        this.b = str;
        this.c = str2;
        this.d = appMetadata;
        this.e = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        rom romVar;
        rkj rkjVar;
        synchronized (this.a) {
            try {
                romVar = this.f;
                rkjVar = romVar.c;
            } catch (RemoteException e) {
                this.f.aG().c.d("(legacy) Failed to get user properties; remote exception", null, this.b, e);
                this.a.set(Collections.emptyList());
                atomicReference = this.a;
            }
            if (rkjVar != null) {
                if (TextUtils.isEmpty(null)) {
                    this.a.set(rkjVar.h(this.b, this.c, this.e, this.d));
                } else {
                    this.a.set(rkjVar.i(null, this.b, this.c, this.e));
                }
                this.f.s();
                atomicReference = this.a;
                atomicReference.notify();
                return;
            }
            romVar.aG().c.d("(legacy) Failed to get user properties; not connected to service", null, this.b, this.c);
            this.a.set(Collections.emptyList());
            this.a.notify();
        }
    }
}
