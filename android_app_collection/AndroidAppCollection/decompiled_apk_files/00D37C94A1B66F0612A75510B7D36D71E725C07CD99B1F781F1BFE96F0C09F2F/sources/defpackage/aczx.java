package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aczx  reason: default package */
/* loaded from: classes.dex */
public final class aczx implements aimx, aatg, abea {
    private final azqb a;
    private final azqb b;
    private final Executor c;

    public aczx(azqb azqbVar, azqb azqbVar2, Executor executor) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = executor;
    }

    private final void c(final aczw aczwVar) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            b(aczwVar);
        } else {
            this.c.execute(new Runnable() { // from class: aczv
                @Override // java.lang.Runnable
                public final void run() {
                    aczx.this.b(aczwVar);
                }
            });
        }
    }

    @Override // defpackage.aatg
    public final void a(final aatf aatfVar) {
        c(new aczw() { // from class: aczs
            @Override // defpackage.aczw
            public final void a(atcp atcpVar) {
                aatf.this.z = atcpVar;
            }
        });
    }

    public final void b(aczw aczwVar) {
        aczwVar.a(((aczy) this.a.get()).a(((adeo) this.b.get()).a()));
    }

    @Override // defpackage.abea
    public final void nq(final abed abedVar) {
        c(new aczw() { // from class: aczt
            @Override // defpackage.aczw
            public final void a(atcp atcpVar) {
                abed.this.C = atcpVar;
            }
        });
    }

    @Override // defpackage.aimx
    public final void rj(final aina ainaVar) {
        c(new aczw() { // from class: aczu
            @Override // defpackage.aczw
            public final void a(atcp atcpVar) {
                aina.this.U = atcpVar;
            }
        });
    }
}
