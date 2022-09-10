package defpackage;

import android.os.Handler;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: clsq  reason: default package */
/* loaded from: classes5.dex */
public final class clsq {
    final /* synthetic */ clsr a;

    public clsq(clsr clsrVar) {
        this.a = clsrVar;
    }

    public final void a() {
        clmv clmvVar = this.a.f;
        if (clmvVar != null) {
            clmvVar.a.d.e(2);
        }
    }

    public final void b(Exception exc) {
        Handler handler = this.a.d.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: clrr
                @Override // java.lang.Runnable
                public final void run() {
                    int i = cmny.a;
                }
            });
        }
    }
}
