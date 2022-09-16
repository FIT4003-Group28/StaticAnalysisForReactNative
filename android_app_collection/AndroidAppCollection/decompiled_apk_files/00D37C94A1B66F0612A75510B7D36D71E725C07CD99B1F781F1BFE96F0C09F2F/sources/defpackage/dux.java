package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: dux  reason: default package */
/* loaded from: classes3.dex */
public abstract class dux implements Callable {
    protected final dtq a;
    protected final String b;
    protected final String c;
    protected Method d;
    protected final int e;
    protected final int f;
    protected final aopa g;

    public dux(dtq dtqVar, String str, String str2, aopa aopaVar, int i, int i2) {
        getClass().getSimpleName();
        this.a = dtqVar;
        this.b = str;
        this.c = str2;
        this.g = aopaVar;
        this.e = i;
        this.f = i2;
    }

    protected abstract void a();

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        ks();
        return null;
    }

    public void ks() {
        int i;
        try {
            long nanoTime = System.nanoTime();
            Method c = this.a.c(this.b, this.c);
            this.d = c;
            if (c == null) {
                return;
            }
            a();
            dso dsoVar = this.a.k;
            if (dsoVar == null || (i = this.e) == Integer.MIN_VALUE) {
                return;
            }
            dsoVar.a(this.f, i, (System.nanoTime() - nanoTime) / 1000, null, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }
}
