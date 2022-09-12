package defpackage;

import android.os.Handler;
/* compiled from: PG */
/* renamed from: aoz  reason: default package */
/* loaded from: classes.dex */
public final class aoz implements m {
    public static final aoz g = new aoz();
    public Handler d;
    public int a = 0;
    public int b = 0;
    public boolean c = true;
    private boolean i = true;
    public final o e = new o(this);
    public final Runnable f = new aov(this);
    final aow h = new aow(this);

    private aoz() {
    }

    @Override // defpackage.m
    public final k Nh() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        int i = this.a + 1;
        this.a = i;
        if (i != 1 || !this.i) {
            return;
        }
        this.e.e(i.ON_START);
        this.i = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        int i = this.b + 1;
        this.b = i;
        if (i == 1) {
            if (this.c) {
                this.e.e(i.ON_RESUME);
                this.c = false;
                return;
            }
            this.d.removeCallbacks(this.f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        if (this.a != 0 || !this.c) {
            return;
        }
        this.e.e(i.ON_STOP);
        this.i = true;
    }
}
