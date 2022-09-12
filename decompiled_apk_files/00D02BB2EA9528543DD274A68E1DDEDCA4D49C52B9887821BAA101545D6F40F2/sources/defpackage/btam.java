package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: btam  reason: default package */
/* loaded from: classes4.dex */
public class btam implements btak {
    gcd a;
    private final gce b;
    private final gcr c;
    private final Runnable d;
    private final Runnable e;

    public btam(gce gceVar, gcr gcrVar, Runnable runnable, Runnable runnable2) {
        this.b = gceVar;
        this.c = gcrVar;
        this.d = runnable;
        this.e = runnable2;
        this.a = gceVar.f();
    }

    @Override // defpackage.btak
    public Boolean a(gcd gcdVar) {
        return Boolean.valueOf(this.a.equals(gcdVar));
    }

    @Override // defpackage.btak
    public View.OnClickListener b(final gcd gcdVar) {
        return new View.OnClickListener(this, gcdVar) { // from class: btal
            private final btam a;
            private final gcd b;

            {
                this.a = this;
                this.b = gcdVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a = this.b;
            }
        };
    }

    @Override // defpackage.btak
    public cqkl c() {
        this.d.run();
        this.e.run();
        return cqkl.a;
    }

    public void d() {
        gcd f = this.b.f();
        gcd gcdVar = this.a;
        if (f == gcdVar) {
            return;
        }
        this.b.e(gcdVar);
        if (this.a != gcd.OFF) {
            return;
        }
        gcr gcrVar = this.c;
        if (!gcrVar.b.a().a()) {
            return;
        }
        gcrVar.a.a().i(dvum.DARK_MODE_OPT_OUT, null);
    }
}
