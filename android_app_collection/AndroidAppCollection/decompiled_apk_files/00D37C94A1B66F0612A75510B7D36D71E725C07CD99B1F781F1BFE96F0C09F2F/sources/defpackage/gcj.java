package defpackage;

import android.content.res.Configuration;
import android.os.Handler;
/* compiled from: PG */
/* renamed from: gcj  reason: default package */
/* loaded from: classes3.dex */
public final class gcj implements fqb {
    public final gca a;
    public final Handler b;
    public final Runnable c = new Runnable() { // from class: gci
        @Override // java.lang.Runnable
        public final void run() {
            gcj gcjVar = gcj.this;
            Integer num = gcjVar.e;
            if (num == null) {
                return;
            }
            gcjVar.b(num.intValue());
        }
    };
    public boolean d;
    public Integer e;

    public gcj(gca gcaVar, Handler handler) {
        this.a = gcaVar;
        this.b = handler;
    }

    public final int a() {
        return this.a.a();
    }

    public final void b(int i) {
        this.e = Integer.valueOf(i);
        if (this.d) {
            this.b.post(this.c);
        } else {
            this.a.d(i);
        }
    }

    @Override // defpackage.fqb
    public final void g(Configuration configuration) {
        this.a.g(configuration);
    }
}
