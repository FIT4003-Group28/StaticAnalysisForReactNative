package defpackage;

import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qzg  reason: default package */
/* loaded from: classes4.dex */
public final class qzg implements Runnable {
    final /* synthetic */ qzh a;

    public qzg(qzh qzhVar) {
        this.a = qzhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.c == null) {
            return;
        }
        qzh qzhVar = this.a;
        qzi qziVar = qzhVar.b;
        qziVar.b--;
        try {
            qzk qzkVar = qzhVar.c;
            qzkVar.py(3, qzkVar.pv());
        } catch (Exception unused) {
            Log.e("DGProcessor", "Error while closing handle.");
        }
        this.a.c = null;
        this.a.b.d();
    }
}
