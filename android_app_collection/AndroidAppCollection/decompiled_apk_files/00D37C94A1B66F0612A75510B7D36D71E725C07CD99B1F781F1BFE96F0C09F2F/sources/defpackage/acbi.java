package defpackage;

import android.os.Process;
/* compiled from: PG */
/* renamed from: acbi  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class acbi implements Runnable {
    public final /* synthetic */ acbk a;
    private final /* synthetic */ int b;

    public /* synthetic */ acbi(acbk acbkVar, int i) {
        this.b = i;
        this.a = acbkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            this.a.i();
            return;
        }
        acbk acbkVar = this.a;
        try {
            Process.setThreadPriority(0);
            acbkVar.j();
        } catch (Throwable th) {
            try {
                if (!acbkVar.b) {
                    zep.f("ExternalAudioInput", "Unexpected throwable in audio main loop", th);
                    acbkVar.e = true;
                }
            } finally {
                acbkVar.c = true;
                acbkVar.a = null;
            }
        }
    }
}
