package defpackage;

import android.os.Handler;
/* compiled from: PG */
/* renamed from: aiqf  reason: default package */
/* loaded from: classes.dex */
public final class aiqf {
    public final ahfm a;
    public final Handler b;
    public final axnm c;
    public final azqb d;
    public final azqb e;
    public final Runnable f;
    public final Runnable g;
    public boolean h;
    public int i;
    public boolean j;
    public final aiqp k;
    private final aynx l;
    private final aynx m;
    private final aynx n;
    private final aisp o;

    public aiqf(aiqp aiqpVar, ahfm ahfmVar, Handler handler, axnm axnmVar, aynx aynxVar, aynx aynxVar2, aynx aynxVar3, aisp aispVar, azqb azqbVar, azqb azqbVar2) {
        this.k = aiqpVar;
        ahfmVar.getClass();
        this.a = ahfmVar;
        this.b = handler;
        this.c = axnmVar;
        this.l = aynxVar;
        this.m = aynxVar2;
        this.n = aynxVar3;
        this.o = aispVar;
        this.d = azqbVar;
        this.e = azqbVar2;
        this.f = new aiqe(this, 1);
        this.g = new aiqe(this);
    }

    public final void a() {
        this.i = 0;
        this.h = false;
    }

    public final void b() {
        this.o.a.Z(new aiqd(this, 2));
        this.o.f.Z(new aiqd(this, 4));
        this.l.Z(new aiqd(this, 3));
        this.n.Z(new aiqd(this, 1));
        this.m.Z(new aiqd(this));
    }
}
