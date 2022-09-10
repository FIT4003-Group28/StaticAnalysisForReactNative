package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: awga  reason: default package */
/* loaded from: classes3.dex */
public final class awga {
    public final awgb a;
    public final bvjj c;
    public final Context d;
    public final cjqy e;
    @dzsi
    public final btlu f;
    @dzsi
    public cjtd h;
    @dzsi
    public cjtd i;
    @dzsi
    public cjtd j;
    @dzsi
    public cjql k;
    @dzsi
    public cjql l;
    private final cjqq m;
    private final awgr n;
    public final List<Runnable> b = new ArrayList();
    @dzsi
    public Runnable g = null;

    public awga(Activity activity, bvjj bvjjVar, awgb awgbVar, dxio<akfa> dxioVar, cjqy cjqyVar, cjqq cjqqVar, bvoh bvohVar) {
        this.d = activity;
        this.c = bvjjVar;
        btlu j = dxioVar.a().j();
        this.f = j;
        this.e = cjqyVar;
        this.m = cjqqVar;
        this.a = awgbVar;
        awgr awgrVar = new awgr(activity, awgbVar, 1, bvohVar);
        this.n = awgrVar;
        awgbVar.b(dcdc.g(new awgf(activity, awgbVar, 0, bvohVar), awgrVar), !bvjjVar.o(bvjk.ei, j, true));
    }

    public final void a() {
        this.a.m();
        cjqp f = this.m.f(this.a.l());
        this.k = null;
        this.l = null;
        int j = this.a.j();
        cjtd cjtdVar = this.i;
        if (cjtdVar != null && j != 0) {
            this.k = f.d(cjtdVar);
        }
        if (this.j != null && j != 1 && this.n.j()) {
            cjtd cjtdVar2 = this.j;
            dbsk.s(cjtdVar2);
            this.l = f.d(cjtdVar2);
        }
        cjtd cjtdVar3 = this.h;
        if (cjtdVar3 != null) {
            f.d(cjtdVar3);
        }
    }

    public final void b(Runnable runnable) {
        this.b.add(runnable);
    }
}
