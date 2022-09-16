package defpackage;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.AppMetadata;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: rof  reason: default package */
/* loaded from: classes4.dex */
final class rof implements Runnable {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ AppMetadata d;
    final /* synthetic */ rom e;

    public rof(rom romVar, AtomicReference atomicReference, String str, String str2, AppMetadata appMetadata) {
        this.e = romVar;
        this.a = atomicReference;
        this.b = str;
        this.c = str2;
        this.d = appMetadata;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        rom romVar;
        rkj rkjVar;
        synchronized (this.a) {
            try {
                romVar = this.e;
                rkjVar = romVar.c;
            } catch (RemoteException e) {
                this.e.aG().c.d("(legacy) Failed to get conditional properties; remote exception", null, this.b, e);
                this.a.set(Collections.emptyList());
                atomicReference = this.a;
            }
            if (rkjVar != null) {
                if (TextUtils.isEmpty(null)) {
                    this.a.set(rkjVar.f(this.b, this.c, this.d));
                } else {
                    this.a.set(rkjVar.g(null, this.b, this.c));
                }
                this.e.s();
                atomicReference = this.a;
                atomicReference.notify();
                return;
            }
            romVar.aG().c.d("(legacy) Failed to get conditional properties; not connected to service", null, this.b, this.c);
            this.a.set(Collections.emptyList());
            this.a.notify();
        }
    }
}
