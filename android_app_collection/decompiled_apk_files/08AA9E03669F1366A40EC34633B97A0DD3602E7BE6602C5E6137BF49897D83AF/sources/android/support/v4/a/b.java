package android.support.v4.a;

import java.io.FileDescriptor;
import java.io.PrintWriter;
/* compiled from: Loader.java */
/* loaded from: classes.dex */
public class b<D> {

    /* renamed from: a  reason: collision with root package name */
    int f157a;

    /* renamed from: b  reason: collision with root package name */
    a<D> f158b;

    /* renamed from: c  reason: collision with root package name */
    boolean f159c;

    /* renamed from: d  reason: collision with root package name */
    boolean f160d;
    boolean e;
    boolean f;
    boolean g;

    /* compiled from: Loader.java */
    /* loaded from: classes.dex */
    public interface a<D> {
    }

    protected void b() {
    }

    protected boolean d() {
        return false;
    }

    protected void f() {
    }

    protected void h() {
    }

    protected void j() {
    }

    public void a(a<D> aVar) {
        if (this.f158b == null) {
            throw new IllegalStateException("No listener register");
        }
        if (this.f158b != aVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f158b = null;
    }

    public final void a() {
        this.f159c = true;
        this.e = false;
        this.f160d = false;
        b();
    }

    public boolean c() {
        return d();
    }

    public void e() {
        this.f159c = false;
        f();
    }

    public void g() {
        this.f160d = true;
        h();
    }

    public void i() {
        j();
        this.e = true;
        this.f159c = false;
        this.f160d = false;
        this.f = false;
        this.g = false;
    }

    public String a(D d2) {
        StringBuilder sb = new StringBuilder(64);
        android.support.v4.i.d.a(d2, sb);
        sb.append("}");
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        android.support.v4.i.d.a(this, sb);
        sb.append(" id=");
        sb.append(this.f157a);
        sb.append("}");
        return sb.toString();
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f157a);
        printWriter.print(" mListener=");
        printWriter.println(this.f158b);
        if (this.f159c || this.f || this.g) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f159c);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.g);
        }
        if (this.f160d || this.e) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f160d);
            printWriter.print(" mReset=");
            printWriter.println(this.e);
        }
    }
}
