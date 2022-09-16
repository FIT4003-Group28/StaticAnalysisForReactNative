package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: czy  reason: default package */
/* loaded from: classes3.dex */
public final class czy implements dae {
    public dbn a;
    public dbn b;
    public dbn c;
    public cyr d;
    public float e;
    public float f;
    public int g;
    public int h;
    public final List i = new ArrayList(4);

    @Override // defpackage.dae
    public final float a() {
        return this.f;
    }

    @Override // defpackage.dae
    public final float b() {
        return this.e;
    }

    @Override // defpackage.dae
    public final int c() {
        return this.i.size();
    }

    @Override // defpackage.dae
    public final int d() {
        return this.h;
    }

    @Override // defpackage.dae
    public final int e() {
        return this.g;
    }

    @Override // defpackage.dae
    public final cyr f() {
        return this.d;
    }

    @Override // defpackage.dae
    public final dae g(int i) {
        return (dae) this.i.get(i);
    }

    @Override // defpackage.dae
    public final dbn h() {
        return this.b;
    }

    @Override // defpackage.dae
    public final dbn i() {
        return this.c;
    }

    @Override // defpackage.dae
    public final dbn j() {
        return this.a;
    }

    @Override // defpackage.dae
    public final void kk(int i) {
        this.h = i;
    }

    @Override // defpackage.dae
    public final void kl(float f) {
        this.f = f;
    }

    @Override // defpackage.dae
    public final void km(float f) {
        this.e = f;
    }

    @Override // defpackage.dae
    public final void kn(int i) {
        this.g = i;
    }
}
