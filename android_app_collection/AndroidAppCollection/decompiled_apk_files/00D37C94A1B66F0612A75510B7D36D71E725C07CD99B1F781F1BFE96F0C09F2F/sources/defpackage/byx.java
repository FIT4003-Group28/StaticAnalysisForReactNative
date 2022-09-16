package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: byx  reason: default package */
/* loaded from: classes2.dex */
final class byx implements byv {
    private final cdi a;
    private float b = -1.0f;

    public byx(List list) {
        this.a = (cdi) list.get(0);
    }

    @Override // defpackage.byv
    public final float a() {
        return this.a.b();
    }

    @Override // defpackage.byv
    public final float b() {
        return this.a.c();
    }

    @Override // defpackage.byv
    public final cdi c() {
        return this.a;
    }

    @Override // defpackage.byv
    public final boolean d(float f) {
        if (this.b == f) {
            return true;
        }
        this.b = f;
        return false;
    }

    @Override // defpackage.byv
    public final boolean e() {
        return false;
    }

    @Override // defpackage.byv
    public final boolean f(float f) {
        return !this.a.e();
    }
}
