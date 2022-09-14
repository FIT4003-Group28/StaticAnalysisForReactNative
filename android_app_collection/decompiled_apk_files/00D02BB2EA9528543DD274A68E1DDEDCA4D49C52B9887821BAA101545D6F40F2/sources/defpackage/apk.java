package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import android.os.SystemClock;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: apk  reason: default package */
/* loaded from: classes2.dex */
public abstract class apk<D> extends apl<D> {
    public volatile apj a;
    private Executor i;
    private volatile apj j;

    public apk(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.apl
    public final void a() {
        f();
        this.a = new apj(this);
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        if (this.j != null || this.a == null) {
            return;
        }
        boolean z = this.a.a;
        if (this.i == null) {
            this.i = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        apj apjVar = this.a;
        Executor executor = this.i;
        if (apjVar.f == 1) {
            apjVar.f = 2;
            executor.execute(apjVar.c);
            return;
        }
        int i = apjVar.f;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i2 == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    public abstract D c();

    @Override // defpackage.apl
    @Deprecated
    public final void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.d(str, fileDescriptor, printWriter, strArr);
        if (this.a != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.a);
            printWriter.print(" waiting=");
            boolean z = this.a.a;
            printWriter.println(false);
        }
        if (this.j != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.j);
            printWriter.print(" waiting=");
            boolean z2 = this.j.a;
            printWriter.println(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(apj apjVar) {
        if (this.j == apjVar) {
            if (this.g) {
                p();
            }
            SystemClock.uptimeMillis();
            this.j = null;
            b();
        }
    }

    @Override // defpackage.apl
    public final void f() {
        if (this.a != null) {
            if (!this.d) {
                p();
            }
            if (this.j != null) {
                boolean z = this.a.a;
                this.a = null;
                return;
            }
            boolean z2 = this.a.a;
            apj apjVar = this.a;
            apjVar.d.set(true);
            if (apjVar.c.cancel(false)) {
                this.j = this.a;
            }
            this.a = null;
        }
    }
}
