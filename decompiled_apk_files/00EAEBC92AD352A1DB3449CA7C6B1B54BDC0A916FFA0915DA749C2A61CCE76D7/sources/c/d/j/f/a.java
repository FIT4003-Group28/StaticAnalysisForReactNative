package c.d.j.f;

import c.d.d.h.a;
import java.io.Closeable;
import java.io.PrintWriter;
import java.io.StringWriter;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final a.c f3275a;

    /* renamed from: c.d.j.f.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0085a implements a.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c.d.j.h.a f3276a;

        C0085a(a aVar, c.d.j.h.a aVar2) {
            this.f3276a = aVar2;
        }

        @Override // c.d.d.h.a.c
        public void a(c.d.d.h.d<Object> dVar, Throwable th) {
            this.f3276a.a(dVar, th);
            c.d.d.e.a.c("Fresco", "Finalized without closing: %x %x (type = %s).\nStack:\n%s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(dVar)), dVar.c().getClass().getName(), a.b(th));
        }

        @Override // c.d.d.h.a.c
        public boolean a() {
            return this.f3276a.a();
        }
    }

    public a(c.d.j.h.a aVar) {
        this.f3275a = new C0085a(this, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public <U extends Closeable> c.d.d.h.a<U> a(U u) {
        return c.d.d.h.a.a(u, this.f3275a);
    }

    public <T> c.d.d.h.a<T> a(T t, c.d.d.h.c<T> cVar) {
        return c.d.d.h.a.a(t, cVar, this.f3275a);
    }
}
