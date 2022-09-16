package defpackage;

import android.os.Process;
import android.util.Log;
/* compiled from: PG */
/* renamed from: acbx  reason: default package */
/* loaded from: classes.dex */
public final class acbx implements Runnable {
    final /* synthetic */ acbz a;
    private final /* synthetic */ int b;

    public acbx(acbz acbzVar) {
        this.a = acbzVar;
    }

    public /* synthetic */ acbx(acbz acbzVar, int i) {
        this.b = i;
        this.a = acbzVar;
    }

    public acbx(acbz acbzVar, int i, byte[] bArr) {
        this.b = i;
        this.a = acbzVar;
    }

    public acbx(acbz acbzVar, int i, char[] cArr) {
        this.b = i;
        this.a = acbzVar;
    }

    public acbx(acbz acbzVar, int i, short[] sArr) {
        this.b = i;
        this.a = acbzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.k(18);
            return;
        }
        if (i != 1) {
            if (i == 2) {
                this.a.k(16);
                return;
            } else if (i == 3) {
                this.a.k(17);
                return;
            } else {
                this.a.j();
                return;
            }
        }
        acbz acbzVar = this.a;
        try {
            Process.setThreadPriority(-2);
            acbzVar.i();
        } catch (Throwable th) {
            try {
                if (!acbzVar.b) {
                    Log.e("MicInput", "Unexpected throwable in mic main loop", th);
                    acbzVar.e = true;
                }
            } finally {
                acbzVar.c = true;
                acbzVar.a = null;
            }
        }
    }
}
