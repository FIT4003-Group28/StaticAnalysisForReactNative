package defpackage;

import android.os.SystemClock;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: apj  reason: default package */
/* loaded from: classes2.dex */
public final class apj extends app implements Runnable {
    boolean a;
    final /* synthetic */ apk b;

    public apj(apk apkVar) {
        this.b = apkVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.app
    public final Object a() {
        try {
            return this.b.c();
        } catch (akx e) {
            if (!f()) {
                throw e;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.app
    public final void b(Object obj) {
        apk apkVar = this.b;
        if (apkVar.a != this) {
            apkVar.e(this);
        } else if (apkVar.e) {
        } else {
            apkVar.o();
            SystemClock.uptimeMillis();
            apkVar.a = null;
            apkVar.g(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.app
    public final void c() {
        this.b.e(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a = false;
        this.b.b();
    }
}
