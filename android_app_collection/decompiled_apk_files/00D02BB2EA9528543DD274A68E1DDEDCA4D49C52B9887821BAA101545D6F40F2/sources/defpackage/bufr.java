package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.impl.JavaCronetProvider;
/* compiled from: PG */
/* renamed from: bufr  reason: default package */
/* loaded from: classes.dex */
public class bufr {
    protected final Context a;
    protected final Context b;
    public final btpa c;
    protected final ckcw e;
    private final btuh g;
    private final bubu h;
    private final Executor i;
    private final dxio<btup> j;
    private final dxio<bttx> k;
    private final dxio<buft> l;
    private final btyd m;
    protected final AtomicBoolean d = new AtomicBoolean(false);
    protected final AtomicBoolean f = new AtomicBoolean(true);

    public bufr(Context context, Context context2, btuh btuhVar, bubu bubuVar, btpa btpaVar, Executor executor, dxio<btup> dxioVar, dxio<bttx> dxioVar2, dxio<buft> dxioVar3, btyd btydVar, ckcw ckcwVar) {
        this.a = context;
        this.b = context2;
        this.g = btuhVar;
        this.h = bubuVar;
        this.c = btpaVar;
        this.i = executor;
        this.j = dxioVar;
        this.k = dxioVar2;
        this.l = dxioVar3;
        this.m = btydVar;
        this.e = ckcwVar;
    }

    public final boolean a() {
        dbsk.l(this.d.get());
        return this.f.get();
    }

    public ExperimentalCronetEngine b() {
        ((ckcn) this.e.a(ckip.ao)).a();
        return e(d(), false);
    }

    public ExperimentalCronetEngine c() {
        return e(d(), true);
    }

    protected ExperimentalCronetEngine.Builder d() {
        try {
            return new ExperimentalCronetEngine.Builder(this.b);
        } catch (LinkageError | RuntimeException e) {
            bvoo.f(new RuntimeException("Exception trying to create ExperimentalCronetEngine.Builder", e));
            if (e instanceof LinkageError) {
                ((ckco) this.e.a(ckip.an)).a(ckim.a(4));
            } else {
                ((ckco) this.e.a(ckip.an)).a(ckim.a(2));
            }
            return f();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(25:1|(1:3)(1:58)|4|5|6|(20:53|54|13|(1:15)|16|17|18|19|20|21|(2:43|44)|23|(1:25)|26|27|28|29|(1:31)(1:35)|32|33)|12|13|(0)|16|17|18|19|20|21|(0)|23|(0)|26|27|28|29|(0)(0)|32|33) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00df, code lost:
        r6 = new org.json.JSONObject();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e8, code lost:
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e9, code lost:
        defpackage.bvoo.j(new java.lang.RuntimeException("Exception trying to set QUIC experimental options", r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x014c, code lost:
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x014f, code lost:
        if ((r8 instanceof java.lang.LinkageError) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0151, code lost:
        ((defpackage.ckco) r7.e.a(defpackage.ckip.an)).a(defpackage.ckim.a(4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0164, code lost:
        ((defpackage.ckco) r7.e.a(defpackage.ckip.an)).a(defpackage.ckim.a(2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0175, code lost:
        r9 = f().mo32build();
        defpackage.bvoo.j(r8);
        r8 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final org.chromium.net.ExperimentalCronetEngine e(org.chromium.net.ExperimentalCronetEngine.Builder r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bufr.e(org.chromium.net.ExperimentalCronetEngine$Builder, boolean):org.chromium.net.ExperimentalCronetEngine");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ExperimentalCronetEngine.Builder f() {
        JavaCronetProvider javaCronetProvider = new JavaCronetProvider(this.b);
        this.f.set(false);
        this.d.set(true);
        return (ExperimentalCronetEngine.Builder) javaCronetProvider.createBuilder();
    }
}
