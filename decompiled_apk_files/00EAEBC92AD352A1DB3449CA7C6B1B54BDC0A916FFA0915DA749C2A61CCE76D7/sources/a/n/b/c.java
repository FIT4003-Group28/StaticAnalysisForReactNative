package a.n.b;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* loaded from: classes.dex */
public class c<D> {

    /* renamed from: a  reason: collision with root package name */
    int f471a;

    /* renamed from: b  reason: collision with root package name */
    InterfaceC0027c<D> f472b;

    /* renamed from: c  reason: collision with root package name */
    b<D> f473c;

    /* renamed from: d  reason: collision with root package name */
    Context f474d;

    /* renamed from: e  reason: collision with root package name */
    boolean f475e = false;

    /* renamed from: f  reason: collision with root package name */
    boolean f476f = false;

    /* renamed from: g  reason: collision with root package name */
    boolean f477g = true;

    /* renamed from: h  reason: collision with root package name */
    boolean f478h = false;
    boolean i = false;

    /* loaded from: classes.dex */
    public final class a extends ContentObserver {
        public a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            c.this.l();
        }
    }

    /* loaded from: classes.dex */
    public interface b<D> {
        void a(c<D> cVar);
    }

    /* renamed from: a.n.b.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0027c<D> {
        void a(c<D> cVar, D d2);
    }

    public c(Context context) {
        this.f474d = context.getApplicationContext();
    }

    public String a(D d2) {
        StringBuilder sb = new StringBuilder(64);
        androidx.core.util.a.a(d2, sb);
        sb.append("}");
        return sb.toString();
    }

    public void a() {
        this.f476f = true;
        j();
    }

    public void a(InterfaceC0027c<D> interfaceC0027c) {
        InterfaceC0027c<D> interfaceC0027c2 = this.f472b;
        if (interfaceC0027c2 != null) {
            if (interfaceC0027c2 != interfaceC0027c) {
                throw new IllegalArgumentException("Attempting to unregister the wrong listener");
            }
            this.f472b = null;
            return;
        }
        throw new IllegalStateException("No listener register");
    }

    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f471a);
        printWriter.print(" mListener=");
        printWriter.println(this.f472b);
        if (this.f475e || this.f478h || this.i) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f475e);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f478h);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.i);
        }
        if (this.f476f || this.f477g) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f476f);
            printWriter.print(" mReset=");
            printWriter.println(this.f477g);
        }
    }

    public void b(D d2) {
        InterfaceC0027c<D> interfaceC0027c = this.f472b;
        if (interfaceC0027c != null) {
            interfaceC0027c.a(this, d2);
        }
    }

    public boolean b() {
        return k();
    }

    public void c() {
        this.i = false;
    }

    public void d() {
        b<D> bVar = this.f473c;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    public void e() {
        m();
    }

    public Context f() {
        return this.f474d;
    }

    public boolean g() {
        return this.f476f;
    }

    public boolean h() {
        return this.f477g;
    }

    public boolean i() {
        return this.f475e;
    }

    protected void j() {
    }

    protected boolean k() {
        throw null;
    }

    public void l() {
        if (this.f475e) {
            e();
        } else {
            this.f478h = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void m() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void n() {
    }

    protected void o() {
        throw null;
    }

    protected void p() {
        throw null;
    }

    public void q() {
        n();
        this.f477g = true;
        this.f475e = false;
        this.f476f = false;
        this.f478h = false;
        this.i = false;
    }

    public void r() {
        if (this.i) {
            l();
        }
    }

    public final void s() {
        this.f475e = true;
        this.f477g = false;
        this.f476f = false;
        o();
    }

    public void t() {
        this.f475e = false;
        p();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        androidx.core.util.a.a(this, sb);
        sb.append(" id=");
        sb.append(this.f471a);
        sb.append("}");
        return sb.toString();
    }

    public boolean u() {
        boolean z = this.f478h;
        this.f478h = false;
        this.i |= z;
        return z;
    }
}
