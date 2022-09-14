package android.support.v4.app;

import android.arch.lifecycle.o;
import android.os.Bundle;
import android.support.v4.a.b;
import android.support.v4.app.w;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class LoaderManagerImpl extends w {

    /* renamed from: a  reason: collision with root package name */
    static boolean f172a = false;

    /* renamed from: b  reason: collision with root package name */
    private final android.arch.lifecycle.e f173b;

    /* renamed from: c  reason: collision with root package name */
    private final LoaderViewModel f174c;

    /* loaded from: classes.dex */
    public static class a<D> extends android.arch.lifecycle.j<D> implements b.a<D> {

        /* renamed from: a  reason: collision with root package name */
        private final int f177a;

        /* renamed from: b  reason: collision with root package name */
        private final Bundle f178b;

        /* renamed from: c  reason: collision with root package name */
        private final android.support.v4.a.b<D> f179c;

        /* renamed from: d  reason: collision with root package name */
        private android.arch.lifecycle.e f180d;
        private b<D> e;
        private android.support.v4.a.b<D> f;

        android.support.v4.a.b<D> e() {
            return this.f179c;
        }

        @Override // android.arch.lifecycle.LiveData
        protected void b() {
            if (LoaderManagerImpl.f172a) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f179c.a();
        }

        @Override // android.arch.lifecycle.LiveData
        protected void c() {
            if (LoaderManagerImpl.f172a) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f179c.e();
        }

        void f() {
            android.arch.lifecycle.e eVar = this.f180d;
            b<D> bVar = this.e;
            if (eVar == null || bVar == null) {
                return;
            }
            super.a(bVar);
            a(eVar, bVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.arch.lifecycle.LiveData
        public void a(android.arch.lifecycle.k<D> kVar) {
            super.a(kVar);
            this.f180d = null;
            this.e = null;
        }

        android.support.v4.a.b<D> a(boolean z) {
            if (LoaderManagerImpl.f172a) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f179c.c();
            this.f179c.g();
            b<D> bVar = this.e;
            if (bVar != null) {
                a(bVar);
                if (z) {
                    bVar.b();
                }
            }
            this.f179c.a((b.a) this);
            if ((bVar != null && !bVar.a()) || z) {
                this.f179c.i();
                return this.f;
            }
            return this.f179c;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f177a);
            sb.append(" : ");
            android.support.v4.i.d.a(this.f179c, sb);
            sb.append("}}");
            return sb.toString();
        }

        public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f177a);
            printWriter.print(" mArgs=");
            printWriter.println(this.f178b);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f179c);
            android.support.v4.a.b<D> bVar = this.f179c;
            bVar.a(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.e != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.e);
                b<D> bVar2 = this.e;
                bVar2.a(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(e().a((android.support.v4.a.b<D>) a()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(d());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b<D> implements android.arch.lifecycle.k<D> {

        /* renamed from: a  reason: collision with root package name */
        private final android.support.v4.a.b<D> f181a;

        /* renamed from: b  reason: collision with root package name */
        private final w.a<D> f182b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f183c;

        @Override // android.arch.lifecycle.k
        public void a(D d2) {
            if (LoaderManagerImpl.f172a) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f181a + ": " + this.f181a.a((android.support.v4.a.b<D>) d2));
            }
            this.f182b.a(this.f181a, d2);
            this.f183c = true;
        }

        boolean a() {
            return this.f183c;
        }

        void b() {
            if (this.f183c) {
                if (LoaderManagerImpl.f172a) {
                    Log.v("LoaderManager", "  Resetting: " + this.f181a);
                }
                this.f182b.a(this.f181a);
            }
        }

        public String toString() {
            return this.f182b.toString();
        }

        public void a(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f183c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class LoaderViewModel extends android.arch.lifecycle.n {

        /* renamed from: a  reason: collision with root package name */
        private static final o.a f175a = new o.a() { // from class: android.support.v4.app.LoaderManagerImpl.LoaderViewModel.1
            @Override // android.arch.lifecycle.o.a
            public <T extends android.arch.lifecycle.n> T a(Class<T> cls) {
                return new LoaderViewModel();
            }
        };

        /* renamed from: b  reason: collision with root package name */
        private android.support.v4.i.m<a> f176b = new android.support.v4.i.m<>();

        LoaderViewModel() {
        }

        static LoaderViewModel a(android.arch.lifecycle.p pVar) {
            return (LoaderViewModel) new android.arch.lifecycle.o(pVar, f175a).a(LoaderViewModel.class);
        }

        void b() {
            int b2 = this.f176b.b();
            for (int i = 0; i < b2; i++) {
                this.f176b.e(i).f();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.arch.lifecycle.n
        public void a() {
            super.a();
            int b2 = this.f176b.b();
            for (int i = 0; i < b2; i++) {
                this.f176b.e(i).a(true);
            }
            this.f176b.c();
        }

        public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f176b.b() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i = 0; i < this.f176b.b(); i++) {
                    a e = this.f176b.e(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f176b.d(i));
                    printWriter.print(": ");
                    printWriter.println(e.toString());
                    e.a(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LoaderManagerImpl(android.arch.lifecycle.e eVar, android.arch.lifecycle.p pVar) {
        this.f173b = eVar;
        this.f174c = LoaderViewModel.a(pVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.f174c.b();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        android.support.v4.i.d.a(this.f173b, sb);
        sb.append("}}");
        return sb.toString();
    }

    @Override // android.support.v4.app.w
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f174c.a(str, fileDescriptor, printWriter, strArr);
    }
}
