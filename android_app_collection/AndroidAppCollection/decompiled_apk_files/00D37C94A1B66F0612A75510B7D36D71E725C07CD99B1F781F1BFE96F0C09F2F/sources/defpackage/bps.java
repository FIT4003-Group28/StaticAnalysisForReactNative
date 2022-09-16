package defpackage;

import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* compiled from: PG */
/* renamed from: bps  reason: default package */
/* loaded from: classes2.dex */
public final class bps {
    public final Executor a;
    public final Executor b;
    public final bqt c;
    public final bqm d;
    public final String e;
    public final int f;
    public final int g;
    public final ado h;

    public bps(bpq bpqVar) {
        Executor executor = bpqVar.a;
        if (executor == null) {
            this.a = b();
        } else {
            this.a = executor;
        }
        Executor executor2 = bpqVar.c;
        if (executor2 == null) {
            this.b = b();
        } else {
            this.b = executor2;
        }
        bqt bqtVar = bpqVar.b;
        if (bqtVar == null) {
            this.c = bqt.c();
        } else {
            this.c = bqtVar;
        }
        this.h = new ado();
        bqm bqmVar = bpqVar.d;
        this.d = bqmVar == null ? new bqu() : bqmVar;
        this.f = bpqVar.e;
        this.g = Integer.MAX_VALUE;
        this.e = null;
    }

    public static final int a() {
        return Build.VERSION.SDK_INT == 23 ? 10 : 20;
    }

    private static final Executor b() {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)));
    }
}
