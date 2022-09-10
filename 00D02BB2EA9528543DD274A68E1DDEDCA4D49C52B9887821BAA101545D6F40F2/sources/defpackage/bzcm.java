package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bzcm  reason: default package */
/* loaded from: classes4.dex */
public final class bzcm {
    public final Executor a;
    public final dxio<bvkx> b;
    private final byyp c;
    private final dxio<akfa> d;
    private final dxio<ahwf> e;
    private final dxio<ahvo> f;

    public bzcm(byyp byypVar, Executor executor, dxio<bvkx> dxioVar, dxio<akfa> dxioVar2, dxio<ahwf> dxioVar3, dxio<ahvo> dxioVar4) {
        this.c = byypVar;
        this.a = executor;
        this.b = dxioVar;
        this.d = dxioVar2;
        this.e = dxioVar3;
        this.f = dxioVar4;
    }

    public final void a(Context context, vnk vnkVar) {
        if (b(context, vnkVar) && this.d.a().j() != null) {
            if (this.f.a().e()) {
                this.f.a().d();
                return;
            }
            this.c.e();
            this.e.a().K(ahvk.TRANSIT_NAVIGATION);
        }
    }

    public final boolean b(Context context, vnk vnkVar) {
        amub w = vnkVar.l().d().w(context);
        if (w == null) {
            return false;
        }
        return this.c.c().a(w);
    }
}
