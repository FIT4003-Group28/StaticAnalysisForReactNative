package c.d.e;
/* loaded from: classes.dex */
public abstract class b<T> implements e<T> {
    @Override // c.d.e.e
    public void a(c<T> cVar) {
    }

    @Override // c.d.e.e
    public void b(c<T> cVar) {
        boolean d2 = cVar.d();
        try {
            f(cVar);
        } finally {
            if (d2) {
                cVar.close();
            }
        }
    }

    @Override // c.d.e.e
    public void c(c<T> cVar) {
        try {
            e(cVar);
        } finally {
            cVar.close();
        }
    }

    @Override // c.d.e.e
    public void d(c<T> cVar) {
    }

    protected abstract void e(c<T> cVar);

    protected abstract void f(c<T> cVar);
}
