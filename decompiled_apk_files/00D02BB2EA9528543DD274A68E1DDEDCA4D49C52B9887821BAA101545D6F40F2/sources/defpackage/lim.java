package defpackage;
/* compiled from: PG */
/* renamed from: lim  reason: default package */
/* loaded from: classes7.dex */
public final class lim implements lil {
    int a = 1;

    @Override // defpackage.lil
    public final boolean a() {
        return this.a == 2;
    }

    @Override // defpackage.lil
    public final boolean b() {
        return this.a == 3;
    }

    @Override // defpackage.lil
    public final void c() {
        this.a = 1;
    }

    @Override // defpackage.lil
    public final void d(boolean z) {
        if (!z) {
            this.a = 1;
        } else if (this.a != 1) {
        } else {
            this.a = 3;
        }
    }

    @Override // defpackage.lil
    public final void e() {
        int i = this.a;
        if (i == 2) {
            this.a = 3;
        } else if (i != 3) {
        } else {
            this.a = 2;
        }
    }

    @Override // defpackage.lil
    public final void f() {
        if (this.a == 3) {
            this.a = 2;
        }
    }
}
