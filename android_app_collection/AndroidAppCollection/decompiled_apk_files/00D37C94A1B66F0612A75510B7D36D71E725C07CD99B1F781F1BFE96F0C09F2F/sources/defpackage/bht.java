package defpackage;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bht  reason: default package */
/* loaded from: classes2.dex */
public final class bht extends bgj implements bhp {
    final /* synthetic */ bhu a;
    private final String b;
    private final String c;
    private boolean d;
    private int e = -1;
    private int f;
    private bho g;
    private int h;

    public bht(bhu bhuVar, String str, String str2) {
        this.a = bhuVar;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.bgj
    public final void a() {
        this.a.m(this);
    }

    @Override // defpackage.bgj
    public final void b(int i) {
        bho bhoVar = this.g;
        if (bhoVar != null) {
            bhoVar.d(this.h, i);
            return;
        }
        this.e = i;
        this.f = 0;
    }

    @Override // defpackage.bgj
    public final void c(int i) {
        bho bhoVar = this.g;
        if (bhoVar != null) {
            bhoVar.f(this.h, i);
        } else {
            this.f += i;
        }
    }

    @Override // defpackage.bhp
    public final int d() {
        return this.h;
    }

    @Override // defpackage.bhp
    public final void e(bho bhoVar) {
        this.g = bhoVar;
        String str = this.b;
        String str2 = this.c;
        int i = bhoVar.d;
        bhoVar.d = i + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", str);
        bundle.putString("routeGroupId", str2);
        int i2 = bhoVar.c;
        bhoVar.c = i2 + 1;
        bhoVar.g(3, i2, i, null, bundle);
        this.h = i;
        if (this.d) {
            bhoVar.b(i);
            int i3 = this.e;
            if (i3 >= 0) {
                bhoVar.d(this.h, i3);
                this.e = -1;
            }
            int i4 = this.f;
            if (i4 == 0) {
                return;
            }
            bhoVar.f(this.h, i4);
            this.f = 0;
        }
    }

    @Override // defpackage.bhp
    public final void f() {
        bho bhoVar = this.g;
        if (bhoVar != null) {
            bhoVar.a(this.h);
            this.g = null;
            this.h = 0;
        }
    }

    @Override // defpackage.bgj
    public final void g() {
        this.d = true;
        bho bhoVar = this.g;
        if (bhoVar != null) {
            bhoVar.b(this.h);
        }
    }

    @Override // defpackage.bgj
    public final void h() {
        i(0);
    }

    @Override // defpackage.bgj
    public final void i(int i) {
        this.d = false;
        bho bhoVar = this.g;
        if (bhoVar != null) {
            bhoVar.e(this.h, i);
        }
    }
}
