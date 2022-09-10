package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: arxg  reason: default package */
/* loaded from: classes2.dex */
public abstract class arxg implements aryg {
    private final cqtd a;
    private final cqtd b;
    private final int c;
    private final int d;
    private final Resources e;
    private final ddho f;

    public arxg(int i, boolean z, int i2, int i3, Resources resources, ddho ddhoVar) {
        this.a = g(i, z);
        this.b = h(i, z);
        this.c = i2;
        this.d = i3;
        this.e = resources;
        this.f = ddhoVar;
    }

    public static cqtd g(int i, boolean z) {
        if (z) {
            return iut.a(iup.c(i, iva.b(ibl.m(), ibl.s())));
        }
        return iut.a(cqrt.i(cqrt.f(i), iva.b(ibl.m(), ibl.s())));
    }

    public static cqtd h(int i, boolean z) {
        if (z) {
            return iut.a(iup.c(i, iva.b(ibl.q(), ibl.o())));
        }
        return iut.a(cqrt.i(cqrt.f(i), iva.b(ibl.q(), ibl.o())));
    }

    public static arxg i(arxa arxaVar, Resources resources) {
        return new arxb(resources, dtxv.ai, arxaVar);
    }

    public static arxg j(arxa arxaVar, Resources resources) {
        return new arxc(resources, dtxv.aj, arxaVar);
    }

    public static arxg k(arxa arxaVar, Resources resources, arxf arxfVar) {
        return new arxd(arxfVar.c, resources, dtxv.ae, arxaVar);
    }

    public static arxg l(arxa arxaVar, Resources resources, arxf arxfVar) {
        return new arxe(arxfVar.d, resources, dtxv.ah, arxaVar);
    }

    @Override // defpackage.aryg
    public cqtd c() {
        return this.b;
    }

    @Override // defpackage.aryg
    public cqtd d() {
        return this.a;
    }

    @Override // defpackage.aryg
    public CharSequence e() {
        if (a().booleanValue()) {
            return this.e.getString(this.c);
        }
        return this.e.getString(this.d);
    }

    @Override // defpackage.aryg
    public cjtd f() {
        return cjtd.a(this.f);
    }
}
