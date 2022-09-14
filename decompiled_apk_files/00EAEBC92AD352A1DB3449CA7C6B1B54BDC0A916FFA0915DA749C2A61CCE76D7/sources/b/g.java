package b;
/* loaded from: classes.dex */
public class g<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final f<TResult> f2197a = new f<>();

    public f<TResult> a() {
        return this.f2197a;
    }

    public void a(Exception exc) {
        if (b(exc)) {
            return;
        }
        throw new IllegalStateException("Cannot set the error on a completed task.");
    }

    public void a(TResult tresult) {
        if (b((g<TResult>) tresult)) {
            return;
        }
        throw new IllegalStateException("Cannot set the result of a completed task.");
    }

    public void b() {
        if (c()) {
            return;
        }
        throw new IllegalStateException("Cannot cancel a completed task.");
    }

    public boolean b(Exception exc) {
        return this.f2197a.a(exc);
    }

    public boolean b(TResult tresult) {
        return this.f2197a.a((f<TResult>) tresult);
    }

    public boolean c() {
        return this.f2197a.f();
    }
}
