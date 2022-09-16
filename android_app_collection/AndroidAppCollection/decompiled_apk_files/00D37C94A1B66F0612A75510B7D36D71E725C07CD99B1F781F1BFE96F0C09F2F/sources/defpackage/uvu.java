package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: uvu  reason: default package */
/* loaded from: classes4.dex */
public final class uvu {
    static final long a = TimeUnit.MINUTES.toMillis(1);
    private final amqi d;
    private volatile Process e;
    public volatile boolean c = false;
    public final ampg b = new ampg() { // from class: uvt
        @Override // defpackage.ampg
        public final Object apply(Object obj) {
            try {
                return new ProcessBuilder("/system/bin/trigger_perfetto", (String) obj).start();
            } catch (IOException unused) {
                uvu.this.c = true;
                return null;
            }
        }
    };

    public uvu(amqu amquVar) {
        this.d = amqi.d(amquVar);
    }

    public final void a(String str) {
        if (str.isEmpty()) {
            return;
        }
        if (this.e != null) {
            try {
                if (this.e.exitValue() != 0) {
                    this.c = true;
                    this.e = null;
                }
            } catch (IllegalThreadStateException unused) {
                return;
            }
        }
        if (this.c) {
            return;
        }
        synchronized (this) {
            amqi amqiVar = this.d;
            if (amqiVar.a && amqiVar.a(TimeUnit.MILLISECONDS) < a) {
                return;
            }
            this.d.e();
            this.d.f();
            this.e = (Process) this.b.apply(str);
        }
    }
}
