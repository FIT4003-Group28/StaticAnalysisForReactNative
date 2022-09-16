package defpackage;

import android.content.Context;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: apl  reason: default package */
/* loaded from: classes2.dex */
public class apl<D> {
    public int b;
    public final Context c;
    public ape h;
    public boolean d = false;
    public boolean e = false;
    private boolean a = true;
    public boolean f = false;
    public boolean g = false;

    public apl(Context context) {
        this.c = context.getApplicationContext();
    }

    public static final String q(D d) {
        StringBuilder sb = new StringBuilder(64);
        if (d == null) {
            sb.append("null");
        } else {
            sb.append(d.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(d)));
            sb.append("}");
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a() {
    }

    @Deprecated
    public void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.b);
        printWriter.print(" mListener=");
        printWriter.println(this.h);
        if (this.d || this.f || this.g) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.g);
        }
        if (this.e || this.a) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.e);
            printWriter.print(" mReset=");
            printWriter.println(this.a);
        }
    }

    public void f() {
    }

    public void g(D d) {
        ape apeVar = this.h;
        if (apeVar != null) {
            if (api.d(2)) {
                String str = "onLoadComplete: " + apeVar;
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                apeVar.g(d);
            } else {
                apeVar.f(d);
            }
        }
    }

    public final void h() {
        this.d = true;
        this.a = false;
        this.e = false;
        i();
    }

    protected void i() {
    }

    public final void j() {
        this.d = false;
        k();
    }

    protected void k() {
    }

    public void l() {
    }

    public final void m() {
        n();
        this.a = true;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = false;
    }

    protected void n() {
    }

    public final void o() {
        this.g = false;
    }

    public final void p() {
        if (this.d) {
            a();
        } else {
            this.f = true;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" id=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
