package defpackage;

import android.app.Application;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: lww  reason: default package */
/* loaded from: classes.dex */
public final class lww extends cnm implements btph {
    public final lxa e;
    public final btrm f;
    public boolean g = false;
    public final AtomicInteger h = new AtomicInteger(0);
    public final AtomicInteger i = new AtomicInteger(0);
    public final lwv j;
    private final lwu k;

    public lww(lxb lxbVar, btrm btrmVar) {
        lwu lwuVar = new lwu(this);
        this.k = lwuVar;
        this.j = new lwv(this);
        this.f = btrmVar;
        lxb.a(lwuVar, 1);
        Application a = lxbVar.a.a();
        lxb.a(a, 2);
        dxio a2 = ((dxjh) lxbVar.b).a();
        lxb.a(a2, 3);
        dxio a3 = ((dxjh) lxbVar.c).a();
        lxb.a(a3, 4);
        cqat a4 = lxbVar.d.a();
        lxb.a(a4, 5);
        Executor a5 = lxbVar.e.a();
        lxb.a(a5, 6);
        this.e = new lxa(lwuVar, a, a2, a3, a4, a5);
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        throw null;
    }
}
