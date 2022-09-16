package defpackage;

import java.io.UnsupportedEncodingException;
import java.util.concurrent.CountDownLatch;
/* compiled from: PG */
/* renamed from: duv  reason: default package */
/* loaded from: classes3.dex */
final class duv implements Runnable {
    final /* synthetic */ duw a;

    public duv(duw duwVar) {
        this.a = duwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        Class loadClass;
        duw duwVar = this.a;
        try {
            dtq dtqVar = duwVar.a;
            loadClass = dtqVar.c.loadClass(duw.a(dtqVar.d, duwVar.b));
        } catch (dtb | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException unused) {
        } catch (NullPointerException unused2) {
            countDownLatch = duwVar.f;
        } catch (Throwable th) {
            duwVar.f.countDown();
            throw th;
        }
        if (loadClass == null) {
            countDownLatch = duwVar.f;
        } else {
            duwVar.d = loadClass.getMethod(duw.a(duwVar.a.d, duwVar.c), duwVar.e);
            if (duwVar.d == null) {
                countDownLatch = duwVar.f;
            }
            countDownLatch = duwVar.f;
        }
        countDownLatch.countDown();
    }
}
