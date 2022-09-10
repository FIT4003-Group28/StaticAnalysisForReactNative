package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: afjr  reason: default package */
/* loaded from: classes.dex */
public final class afjr extends afhx {
    public static final dbsl<afga> d = afjo.a;
    public final dxio<qbt> a;
    public final dxio<brba> b;
    public final asik c;
    private final Runnable e;
    private final gga i;
    private final dxio<ckcw> j;
    private final Runnable k;
    private final Runnable l;

    public afjr(Intent intent, @dzsi String str, gga ggaVar, dxio<qbt> dxioVar, dxio<brba> dxioVar2, asik asikVar, dxio<ckcw> dxioVar3) {
        super(intent, str, afid.RESET_ACTIVITY);
        Runnable afjpVar = new afjp(this);
        this.k = afjpVar;
        Runnable afjqVar = new afjq(this);
        this.l = afjqVar;
        this.i = ggaVar;
        this.a = dxioVar;
        this.b = dxioVar2;
        this.j = dxioVar3;
        this.e = !d(afhg.c(intent)) ? afjqVar : afjpVar;
        this.c = asikVar;
    }

    public static boolean d(String str) {
        return str.endsWith("DestinationActivity");
    }

    @Override // defpackage.afhx
    public final void a() {
        if (this.c.a()) {
            ((ckco) this.j.a().a(ckee.x)).a(asij.a(7));
        }
        this.i.B(this.e);
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_RESET_ACTIVITY;
    }
}
