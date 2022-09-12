package defpackage;

import android.animation.Animator;
/* compiled from: PG */
/* renamed from: dabz  reason: default package */
/* loaded from: classes5.dex */
public abstract class dabz<T extends Animator> {
    protected dacb m;
    protected final float[] n;
    protected final int[] o;

    /* JADX INFO: Access modifiers changed from: protected */
    public dabz(int i) {
        this.n = new float[i + i];
        this.o = new int[i];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(dacb dacbVar) {
        this.m = dacbVar;
    }

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract void g(azu azuVar);

    public abstract void h();
}
