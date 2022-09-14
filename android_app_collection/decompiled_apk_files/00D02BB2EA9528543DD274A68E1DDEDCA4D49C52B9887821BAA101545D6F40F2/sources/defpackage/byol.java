package defpackage;

import android.app.Application;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
/* compiled from: PG */
/* renamed from: byol  reason: default package */
/* loaded from: classes4.dex */
public final class byol {
    public final Object a = new Object();
    private final long b = 3145728;
    private final String c;
    private final Application d;
    private final ExecutorService e;

    public byol(Application application, String str, long j, ExecutorService executorService) {
        this.c = str;
        this.d = application;
        this.e = executorService;
    }

    public static void d(dxdz dxdzVar) {
        try {
            dxdzVar.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <T extends dssj> Future<dbsg<T>> a(String str, dssr<T> dssrVar) {
        return this.e.submit(new byoj(this, str, dssrVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <T extends dssj> Future<Boolean> b(String str, T t) {
        return this.e.submit(new byok(this, str, t));
    }

    @dzsi
    public final dxdz c() {
        try {
            return dxdz.k(new File(this.d.getCacheDir(), this.c), 3145728L);
        } catch (Exception e) {
            e.getStackTrace();
            return null;
        }
    }
}
