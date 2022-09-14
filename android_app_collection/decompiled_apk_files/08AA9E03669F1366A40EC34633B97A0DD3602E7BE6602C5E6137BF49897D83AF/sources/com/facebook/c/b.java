package com.facebook.c;
/* compiled from: BaseDataSubscriber.java */
/* loaded from: classes.dex */
public abstract class b<T> implements e<T> {
    @Override // com.facebook.c.e
    public void c(c<T> cVar) {
    }

    @Override // com.facebook.c.e
    public void d(c<T> cVar) {
    }

    protected abstract void e(c<T> cVar);

    protected abstract void f(c<T> cVar);

    @Override // com.facebook.c.e
    public void a(c<T> cVar) {
        boolean b2 = cVar.b();
        try {
            e(cVar);
        } finally {
            if (b2) {
                cVar.h();
            }
        }
    }

    @Override // com.facebook.c.e
    public void b(c<T> cVar) {
        try {
            f(cVar);
        } finally {
            cVar.h();
        }
    }
}
