package defpackage;

import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* compiled from: PG */
/* renamed from: bbj  reason: default package */
/* loaded from: classes.dex */
public final class bbj {
    public final Executor a = b();
    public final Executor b = b();
    public final bcq c;
    public final bbt d;
    public final int e;
    public final int f;
    public final int g;
    public final bcs h;

    public bbj(bbh bbhVar) {
        bcq bcqVar = bbhVar.a;
        if (bcqVar == null) {
            this.c = bcq.c();
        } else {
            this.c = bcqVar;
        }
        this.d = new bbs();
        this.h = new bcs();
        this.e = 4;
        this.f = bbhVar.b;
        this.g = bbhVar.c;
    }

    public static final int a() {
        return Build.VERSION.SDK_INT == 23 ? 10 : 20;
    }

    private static final Executor b() {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)));
    }
}
