package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: bhs  reason: default package */
/* loaded from: classes2.dex */
final class bhs extends bgg implements bhp {
    final /* synthetic */ bhu a;
    private final String b;
    private boolean c;
    private int e;
    private bho f;
    private int d = -1;
    private int g = -1;

    public bhs(bhu bhuVar, String str) {
        this.a = bhuVar;
        this.b = str;
    }

    @Override // defpackage.bgj
    public final void a() {
        this.a.m(this);
    }

    @Override // defpackage.bgj
    public final void b(int i) {
        bho bhoVar = this.f;
        if (bhoVar != null) {
            bhoVar.d(this.g, i);
            return;
        }
        this.d = i;
        this.e = 0;
    }

    @Override // defpackage.bgj
    public final void c(int i) {
        bho bhoVar = this.f;
        if (bhoVar != null) {
            bhoVar.f(this.g, i);
        } else {
            this.e += i;
        }
    }

    @Override // defpackage.bhp
    public final int d() {
        return this.g;
    }

    @Override // defpackage.bhp
    public final void e(bho bhoVar) {
        bhr bhrVar = new bhr();
        this.f = bhoVar;
        String str = this.b;
        int i = bhoVar.d;
        bhoVar.d = i + 1;
        int i2 = bhoVar.c;
        bhoVar.c = i2 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", str);
        bhoVar.g(11, i2, i, null, bundle);
        bhoVar.g.put(i2, bhrVar);
        this.g = i;
        if (this.c) {
            bhoVar.b(i);
            int i3 = this.d;
            if (i3 >= 0) {
                bhoVar.d(this.g, i3);
                this.d = -1;
            }
            int i4 = this.e;
            if (i4 == 0) {
                return;
            }
            bhoVar.f(this.g, i4);
            this.e = 0;
        }
    }

    @Override // defpackage.bhp
    public final void f() {
        bho bhoVar = this.f;
        if (bhoVar != null) {
            bhoVar.a(this.g);
            this.f = null;
            this.g = 0;
        }
    }

    @Override // defpackage.bgj
    public final void g() {
        this.c = true;
        bho bhoVar = this.f;
        if (bhoVar != null) {
            bhoVar.b(this.g);
        }
    }

    @Override // defpackage.bgj
    public final void h() {
        i(0);
    }

    @Override // defpackage.bgj
    public final void i(int i) {
        this.c = false;
        bho bhoVar = this.f;
        if (bhoVar != null) {
            bhoVar.e(this.g, i);
        }
    }
}
