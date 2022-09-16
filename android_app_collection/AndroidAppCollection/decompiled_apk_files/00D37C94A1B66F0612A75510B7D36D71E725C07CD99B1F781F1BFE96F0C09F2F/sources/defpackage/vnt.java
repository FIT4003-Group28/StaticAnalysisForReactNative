package defpackage;

import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: vnt  reason: default package */
/* loaded from: classes4.dex */
public final class vnt implements Callable {
    volatile boolean a;
    final /* synthetic */ vow b;
    final /* synthetic */ vox c;
    final /* synthetic */ vnv d;

    public vnt(vnv vnvVar, vow vowVar, vox voxVar) {
        this.d = vnvVar;
        this.b = vowVar;
        this.c = voxVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        aqxo.z(!this.d.a.inTransaction(), "Thread is already in a transaction! This should never happen, or this will be treated as a nested transaction.");
        this.d.a.beginTransactionWithListener(new vns(this));
        try {
            this.a = true;
            Object a = this.b.a(this.c);
            vox.c();
            this.d.a.setTransactionSuccessful();
            this.a = false;
            return a;
        } finally {
            this.d.a.endTransaction();
        }
    }
}
