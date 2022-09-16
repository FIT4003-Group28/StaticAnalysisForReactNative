package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: abuz  reason: default package */
/* loaded from: classes.dex */
public final class abuz implements abto {
    public static final /* synthetic */ int c = 0;
    public final acbo a;
    public final Handler b;
    private final acbw d;
    private final Handler e;

    static {
        TimeUnit.SECONDS.toNanos(1L);
    }

    public abuz(int i, int i2, int i3, acbo acboVar, acbt acbtVar, acbw acbwVar, Handler handler) {
        new acca(10);
        this.b = new Handler(Looper.getMainLooper());
        acboVar.getClass();
        this.a = acboVar;
        acbtVar.getClass();
        acbwVar.getClass();
        this.d = acbwVar;
        handler.getClass();
        this.e = handler;
        boolean z = true;
        aqxo.p(i <= i2 && i2 <= i3);
        aqxo.p(i2 <= 0 ? false : z);
        if (acboVar.b() != i2) {
            acboVar.a(i2);
        }
    }

    @Override // defpackage.abto
    public final long a() {
        return this.d.d();
    }

    @Override // defpackage.abto
    public final void b(abug abugVar) {
    }

    @Override // defpackage.abto
    public final void c(final int i, final abxd abxdVar) {
        this.e.post(new Runnable() { // from class: abuy
            @Override // java.lang.Runnable
            public final void run() {
                abuz abuzVar = abuz.this;
                int i2 = i;
                abxd abxdVar2 = abxdVar;
                abuzVar.a.a(i2);
                abuzVar.b.post(new abvm(abxdVar2, 1));
            }
        });
    }

    @Override // defpackage.abto
    public final void d(boolean z) {
    }

    @Override // defpackage.abto
    public final void e(int i) {
    }
}
