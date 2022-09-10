package defpackage;
/* compiled from: PG */
/* renamed from: axgf  reason: default package */
/* loaded from: classes3.dex */
public abstract class axgf {
    public abstract axgg a();

    public abstract axgh b();

    public abstract void c(boolean z);

    public abstract void d(dimp dimpVar);

    public abstract void e(axgg axggVar);

    public abstract void f(@dzsi Throwable th);

    public final axgh g() {
        if (a() != axgg.INITIAL_LOAD_ERROR && a() != axgg.SUBSEQUENT_LOAD_ERROR) {
            f(null);
        }
        return b();
    }
}
