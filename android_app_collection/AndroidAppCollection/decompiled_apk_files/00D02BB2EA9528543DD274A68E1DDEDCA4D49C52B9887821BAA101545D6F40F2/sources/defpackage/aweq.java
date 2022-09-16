package defpackage;

import android.view.InflateException;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aweq  reason: default package */
/* loaded from: classes3.dex */
final class aweq implements avid {
    final /* synthetic */ awet a;

    public aweq(awet awetVar) {
        this.a = awetVar;
    }

    @Override // defpackage.avid
    public final void a() {
        this.a.e.execute(new Runnable(this) { // from class: aweo
            private final aweq a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.d();
            }
        });
    }

    @Override // defpackage.avid
    public final void b(final boolean z) {
        this.a.e.execute(new Runnable(this, z) { // from class: awep
            private final aweq a;
            private final boolean b;

            {
                this.a = this;
                this.b = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.c(this.b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void c(boolean z) {
        awet awetVar = this.a;
        if (awetVar.d.aD) {
            if (!z) {
                try {
                    ckos.b(awetVar.a.findViewById(16908290), R.string.OFFLINE_MAPS_CANNOT_SAVE_OFFLINE, 0).c();
                } catch (InflateException unused) {
                }
            }
            gn gnVar = this.a.d.A;
            dbsk.s(gnVar);
            gnVar.e();
            this.a.q(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void d() {
        awet awetVar = this.a;
        if (awetVar.d.aD) {
            try {
                ckos.b(awetVar.a.findViewById(16908290), R.string.OFFLINE_MANUAL_DOWNLOAD_STARTED_SNACKBAR, 0).c();
            } catch (InflateException unused) {
            }
            gfq.l(this.a.d);
            this.a.q(false);
        }
    }
}
