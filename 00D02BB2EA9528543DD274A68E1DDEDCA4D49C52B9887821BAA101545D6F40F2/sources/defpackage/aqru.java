package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aqru  reason: default package */
/* loaded from: classes2.dex */
public class aqru {
    public final Activity a;
    public final apyx b;
    public final dxio<apyz> c;
    private final Executor d;
    private final cqkj e;
    private final dxio<akfa> f;
    private final dxio<apyu> g;
    @dzsi
    private jeo<bhed> h;

    public aqru(Activity activity, Executor executor, apyx apyxVar, cqkj cqkjVar, dxio<akfa> dxioVar, dxio<apyu> dxioVar2, dxio<apyz> dxioVar3) {
        this.a = activity;
        this.d = executor;
        this.b = apyxVar;
        this.e = cqkjVar;
        this.f = dxioVar;
        this.g = dxioVar2;
        this.c = dxioVar3;
    }

    public final void a(String str) {
        b(str, null);
    }

    public final void b(String str, @dzsi Runnable runnable) {
        btlu j = this.f.a().j();
        if (j == null || !j.l()) {
            return;
        }
        if (this.h == null) {
            jeo<bhed> jeoVar = new jeo<>(this.a, 16973840, new bhee(), new bhed(), this.e);
            this.h = jeoVar;
            jeoVar.setCancelable(false);
            this.h.show();
        }
        deha.q(this.g.a().d(str, j), new aqrs(this, this.c.a(), str, runnable), this.d);
    }

    public final void c() {
        jeo<bhed> jeoVar = this.h;
        if (jeoVar != null) {
            jeoVar.dismiss();
            this.h = null;
        }
    }
}
