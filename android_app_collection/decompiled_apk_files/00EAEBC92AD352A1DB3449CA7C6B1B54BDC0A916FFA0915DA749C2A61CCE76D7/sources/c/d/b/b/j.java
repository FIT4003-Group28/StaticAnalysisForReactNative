package c.d.b.b;

import c.d.b.a.c;
import java.io.IOException;
/* loaded from: classes.dex */
public class j implements c.d.b.a.b {

    /* renamed from: b  reason: collision with root package name */
    private static final Object f2796b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static j f2797c;

    /* renamed from: d  reason: collision with root package name */
    private static int f2798d;

    /* renamed from: a  reason: collision with root package name */
    private j f2799a;

    private j() {
    }

    public static j b() {
        synchronized (f2796b) {
            if (f2797c != null) {
                j jVar = f2797c;
                f2797c = jVar.f2799a;
                jVar.f2799a = null;
                f2798d--;
                return jVar;
            }
            return new j();
        }
    }

    private void c() {
    }

    public j a(long j) {
        return this;
    }

    public j a(c.a aVar) {
        return this;
    }

    public j a(c.d.b.a.d dVar) {
        return this;
    }

    public j a(IOException iOException) {
        return this;
    }

    public j a(String str) {
        return this;
    }

    public void a() {
        synchronized (f2796b) {
            if (f2798d < 5) {
                c();
                f2798d++;
                if (f2797c != null) {
                    this.f2799a = f2797c;
                }
                f2797c = this;
            }
        }
    }

    public j b(long j) {
        return this;
    }

    public j c(long j) {
        return this;
    }
}
