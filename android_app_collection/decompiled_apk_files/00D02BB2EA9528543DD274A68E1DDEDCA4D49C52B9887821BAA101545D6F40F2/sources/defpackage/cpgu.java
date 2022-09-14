package defpackage;

import android.os.Looper;
import android.os.Message;
/* compiled from: PG */
/* renamed from: cpgu  reason: default package */
/* loaded from: classes5.dex */
final class cpgu extends cojb {
    final /* synthetic */ cphg a;
    private boolean b;
    private final cpgt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpgu(cphg cphgVar, Looper looper) {
        super(looper);
        this.a = cphgVar;
        this.c = new cpgt();
    }

    private final synchronized void c() {
        if (this.b) {
            return;
        }
        cphg cphgVar = this.a;
        cphgVar.bindService(cphgVar.d, this.c, 1);
        this.b = true;
    }

    public final synchronized void a() {
        if (this.b) {
            try {
                this.a.unbindService(this.c);
            } catch (RuntimeException unused) {
            }
            this.b = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cojb
    public final void b(Message message) {
        c();
        try {
            super.b(message);
            if (hasMessages(0)) {
                return;
            }
            a();
        } catch (Throwable th) {
            if (!hasMessages(0)) {
                a();
            }
            throw th;
        }
    }
}
