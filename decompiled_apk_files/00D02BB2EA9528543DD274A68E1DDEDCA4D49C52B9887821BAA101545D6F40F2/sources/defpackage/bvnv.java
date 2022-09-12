package defpackage;

import android.view.animation.AnimationUtils;
/* compiled from: PG */
/* renamed from: bvnv  reason: default package */
/* loaded from: classes4.dex */
public final class bvnv implements cqat, bvnx {
    public final long a;
    public final long b;
    private final long c;
    private final long d;
    private final long e;
    private final long f;

    public bvnv(cqat cqatVar) {
        this.a = cqatVar.b();
        this.c = cqatVar.c();
        this.d = cqatVar.d();
        this.b = cqatVar.e();
        this.e = cqatVar.f();
        this.f = cqatVar.g();
    }

    @Override // defpackage.bvnx
    public final long a() {
        return AnimationUtils.currentAnimationTimeMillis();
    }

    @Override // defpackage.cqat
    public final long b() {
        return this.a;
    }

    @Override // defpackage.cqat
    public final long c() {
        return this.c;
    }

    @Override // defpackage.cqat
    public final long d() {
        return this.d;
    }

    @Override // defpackage.cqat
    public final long e() {
        return this.b;
    }

    @Override // defpackage.cqat
    public final long f() {
        return this.e;
    }

    @Override // defpackage.cqat
    public final long g() {
        return this.f;
    }
}
