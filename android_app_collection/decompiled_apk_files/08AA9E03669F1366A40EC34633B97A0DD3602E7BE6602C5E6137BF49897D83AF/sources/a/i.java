package a;
/* compiled from: TaskCompletionSource.java */
/* loaded from: classes.dex */
public class i<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final h<TResult> f42a = new h<>();

    public h<TResult> a() {
        return this.f42a;
    }

    public boolean b() {
        return this.f42a.g();
    }

    public boolean a(TResult tresult) {
        return this.f42a.b((h<TResult>) tresult);
    }

    public boolean a(Exception exc) {
        return this.f42a.b(exc);
    }

    public void c() {
        if (!b()) {
            throw new IllegalStateException("Cannot cancel a completed task.");
        }
    }

    public void b(TResult tresult) {
        if (!a((i<TResult>) tresult)) {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        }
    }

    public void b(Exception exc) {
        if (!a(exc)) {
            throw new IllegalStateException("Cannot set the error on a completed task.");
        }
    }
}
