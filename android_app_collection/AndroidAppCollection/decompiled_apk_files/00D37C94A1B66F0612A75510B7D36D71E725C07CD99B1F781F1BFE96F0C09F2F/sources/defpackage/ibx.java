package defpackage;

import android.os.Process;
/* compiled from: PG */
/* renamed from: ibx  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ibx implements Runnable {
    public final /* synthetic */ Runnable a;
    private final /* synthetic */ int b;

    public ibx(Runnable runnable, int i) {
        this.b = i;
        this.a = runnable;
    }

    public /* synthetic */ ibx(Runnable runnable, int i, byte[] bArr) {
        this.b = i;
        this.a = runnable;
    }

    public /* synthetic */ ibx(Runnable runnable, int i, char[] cArr) {
        this.b = i;
        this.a = runnable;
    }

    public /* synthetic */ ibx(Runnable runnable, int i, short[] sArr) {
        this.b = i;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            Runnable runnable = this.a;
            int i2 = ico.bD;
            runnable.run();
        } else if (i == 1) {
            Process.setThreadPriority(10);
            this.a.run();
        } else if (i == 2) {
            Runnable runnable2 = this.a;
            sox.a.set(true);
            runnable2.run();
        } else if (i == 3) {
            uwp.i(this.a);
        } else {
            Runnable runnable3 = this.a;
            Process.setThreadPriority(10);
            runnable3.run();
        }
    }
}
