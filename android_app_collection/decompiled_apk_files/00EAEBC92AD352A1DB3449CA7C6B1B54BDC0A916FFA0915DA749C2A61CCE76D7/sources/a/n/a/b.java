package a.n.a;

import a.e.h;
import a.n.b.c;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.i;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b extends a.n.a.a {

    /* renamed from: c  reason: collision with root package name */
    static boolean f466c = false;

    /* renamed from: a  reason: collision with root package name */
    private final i f467a;

    /* renamed from: b  reason: collision with root package name */
    private final c f468b;

    /* loaded from: classes.dex */
    public static class a<D> extends n<D> implements c.InterfaceC0027c<D> {
        private final int k;
        private final Bundle l;
        private final a.n.b.c<D> m;
        private i n;
        private C0025b<D> o;
        private a.n.b.c<D> p;

        a.n.b.c<D> a(boolean z) {
            if (b.f466c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.m.b();
            this.m.a();
            C0025b<D> c0025b = this.o;
            if (c0025b != null) {
                a((o) c0025b);
                if (z) {
                    c0025b.b();
                    throw null;
                }
            }
            this.m.a((c.InterfaceC0027c) this);
            if (c0025b != null) {
                c0025b.a();
                throw null;
            } else if (!z) {
                return this.m;
            } else {
                this.m.q();
                return this.p;
            }
        }

        @Override // a.n.b.c.InterfaceC0027c
        public void a(a.n.b.c<D> cVar, D d2) {
            if (b.f466c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                b((a<D>) d2);
                return;
            }
            if (b.f466c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            a((a<D>) d2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void a(o<? super D> oVar) {
            super.a((o) oVar);
            this.n = null;
            this.o = null;
        }

        public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.k);
            printWriter.print(" mArgs=");
            printWriter.println(this.l);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.m);
            a.n.b.c<D> cVar = this.m;
            cVar.a(str + "  ", fileDescriptor, printWriter, strArr);
            C0025b<D> c0025b = this.o;
            printWriter.print(str);
            if (c0025b == null) {
                printWriter.print("mData=");
                printWriter.println(e().a((a.n.b.c<D>) a()));
                printWriter.print(str);
                printWriter.print("mStarted=");
                printWriter.println(b());
                return;
            }
            printWriter.print("mCallbacks=");
            printWriter.println(this.o);
            C0025b<D> c0025b2 = this.o;
            c0025b2.a(str + "  ", printWriter);
            throw null;
        }

        @Override // androidx.lifecycle.n, androidx.lifecycle.LiveData
        public void b(D d2) {
            super.b((a<D>) d2);
            a.n.b.c<D> cVar = this.p;
            if (cVar != null) {
                cVar.q();
                this.p = null;
            }
        }

        @Override // androidx.lifecycle.LiveData
        protected void c() {
            if (b.f466c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.m.s();
        }

        @Override // androidx.lifecycle.LiveData
        protected void d() {
            if (b.f466c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.m.t();
        }

        a.n.b.c<D> e() {
            return this.m;
        }

        void f() {
            i iVar = this.n;
            C0025b<D> c0025b = this.o;
            if (iVar == null || c0025b == null) {
                return;
            }
            super.a((o) c0025b);
            a(iVar, c0025b);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.k);
            sb.append(" : ");
            androidx.core.util.a.a(this.m, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.n.a.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0025b<D> implements o<D> {
        public void a(String str, PrintWriter printWriter) {
            throw null;
        }

        boolean a() {
            throw null;
        }

        void b() {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    static class c extends s {

        /* renamed from: c  reason: collision with root package name */
        private static final t.a f469c = new a();

        /* renamed from: b  reason: collision with root package name */
        private h<a> f470b = new h<>();

        /* loaded from: classes.dex */
        static class a implements t.a {
            a() {
            }

            @Override // androidx.lifecycle.t.a
            public <T extends s> T a(Class<T> cls) {
                return new c();
            }
        }

        c() {
        }

        static c a(u uVar) {
            return (c) new t(uVar, f469c).a(c.class);
        }

        public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f470b.b() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i = 0; i < this.f470b.b(); i++) {
                    a e2 = this.f470b.e(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f470b.c(i));
                    printWriter.print(": ");
                    printWriter.println(e2.toString());
                    e2.a(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.lifecycle.s
        public void b() {
            super.b();
            int b2 = this.f470b.b();
            for (int i = 0; i < b2; i++) {
                this.f470b.e(i).a(true);
            }
            this.f470b.a();
        }

        void c() {
            int b2 = this.f470b.b();
            for (int i = 0; i < b2; i++) {
                this.f470b.e(i).f();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(i iVar, u uVar) {
        this.f467a = iVar;
        this.f468b = c.a(uVar);
    }

    @Override // a.n.a.a
    public void a() {
        this.f468b.c();
    }

    @Override // a.n.a.a
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f468b.a(str, fileDescriptor, printWriter, strArr);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        androidx.core.util.a.a(this.f467a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
