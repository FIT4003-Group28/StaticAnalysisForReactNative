package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bzpr  reason: default package */
/* loaded from: classes4.dex */
public class bzpr {
    private final Activity a;
    private final dxio<akfa> b;
    private final cjxd c;
    private final awnm d;
    private final dxio<axwy> e;
    private final axwy f;
    private final dxio<btvo> g;
    private final dxio<bzpz> h;

    @Deprecated
    public bzpr(Activity activity, dxio<akfa> dxioVar, cjxd cjxdVar, awnm awnmVar, axwy axwyVar, dxio<btvo> dxioVar2, dxio<bzpz> dxioVar3) {
        this.a = activity;
        this.b = dxioVar;
        this.c = cjxdVar;
        this.d = awnmVar;
        this.e = null;
        this.f = axwyVar;
        this.g = dxioVar2;
        this.h = dxioVar3;
    }

    public bzpr(Activity activity, dxio<akfa> dxioVar, cjxd cjxdVar, awnm awnmVar, dxio<axwy> dxioVar2, dxio<btvo> dxioVar3, dxio<bzpz> dxioVar4) {
        this.a = activity;
        this.b = dxioVar;
        this.c = cjxdVar;
        this.d = awnmVar;
        this.e = dxioVar2;
        this.f = null;
        this.g = dxioVar3;
        this.h = dxioVar4;
    }

    public final bzpv a(bzpu bzpuVar) {
        Activity activity = this.a;
        dxio<akfa> dxioVar = this.b;
        cjxd cjxdVar = this.c;
        awnm awnmVar = this.d;
        dxio<axwy> dxioVar2 = this.e;
        return new bzpv(bzpuVar, null, activity, dxioVar, cjxdVar, awnmVar, dxioVar2 != null ? dxioVar2.a() : this.f, this.g, this.h);
    }

    public final bzpv b(awnl awnlVar) {
        Activity activity = this.a;
        dxio<akfa> dxioVar = this.b;
        cjxd cjxdVar = this.c;
        awnm awnmVar = this.d;
        dxio<axwy> dxioVar2 = this.e;
        return new bzpv(null, awnlVar, activity, dxioVar, cjxdVar, awnmVar, dxioVar2 != null ? dxioVar2.a() : this.f, this.g, this.h);
    }
}
