package a.a.o;

import a.g.m.a0;
import a.g.m.b0;
import a.g.m.z;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class h {

    /* renamed from: c  reason: collision with root package name */
    private Interpolator f69c;

    /* renamed from: d  reason: collision with root package name */
    a0 f70d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f71e;

    /* renamed from: b  reason: collision with root package name */
    private long f68b = -1;

    /* renamed from: f  reason: collision with root package name */
    private final b0 f72f = new a();

    /* renamed from: a  reason: collision with root package name */
    final ArrayList<z> f67a = new ArrayList<>();

    /* loaded from: classes.dex */
    class a extends b0 {

        /* renamed from: a  reason: collision with root package name */
        private boolean f73a = false;

        /* renamed from: b  reason: collision with root package name */
        private int f74b = 0;

        a() {
        }

        void a() {
            this.f74b = 0;
            this.f73a = false;
            h.this.b();
        }

        @Override // a.g.m.a0
        public void b(View view) {
            int i = this.f74b + 1;
            this.f74b = i;
            if (i == h.this.f67a.size()) {
                a0 a0Var = h.this.f70d;
                if (a0Var != null) {
                    a0Var.b(null);
                }
                a();
            }
        }

        @Override // a.g.m.b0, a.g.m.a0
        public void c(View view) {
            if (this.f73a) {
                return;
            }
            this.f73a = true;
            a0 a0Var = h.this.f70d;
            if (a0Var == null) {
                return;
            }
            a0Var.c(null);
        }
    }

    public h a(long j) {
        if (!this.f71e) {
            this.f68b = j;
        }
        return this;
    }

    public h a(a0 a0Var) {
        if (!this.f71e) {
            this.f70d = a0Var;
        }
        return this;
    }

    public h a(z zVar) {
        if (!this.f71e) {
            this.f67a.add(zVar);
        }
        return this;
    }

    public h a(z zVar, z zVar2) {
        this.f67a.add(zVar);
        zVar2.b(zVar.b());
        this.f67a.add(zVar2);
        return this;
    }

    public h a(Interpolator interpolator) {
        if (!this.f71e) {
            this.f69c = interpolator;
        }
        return this;
    }

    public void a() {
        if (!this.f71e) {
            return;
        }
        Iterator<z> it = this.f67a.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f71e = false;
    }

    void b() {
        this.f71e = false;
    }

    public void c() {
        if (this.f71e) {
            return;
        }
        Iterator<z> it = this.f67a.iterator();
        while (it.hasNext()) {
            z next = it.next();
            long j = this.f68b;
            if (j >= 0) {
                next.a(j);
            }
            Interpolator interpolator = this.f69c;
            if (interpolator != null) {
                next.a(interpolator);
            }
            if (this.f70d != null) {
                next.a(this.f72f);
            }
            next.c();
        }
        this.f71e = true;
    }
}
