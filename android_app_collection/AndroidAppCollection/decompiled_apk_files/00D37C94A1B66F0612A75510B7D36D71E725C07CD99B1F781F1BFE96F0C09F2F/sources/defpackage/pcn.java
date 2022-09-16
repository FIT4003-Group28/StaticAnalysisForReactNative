package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Collections;
import java.util.concurrent.CancellationException;
/* compiled from: PG */
/* renamed from: pcn  reason: default package */
/* loaded from: classes4.dex */
public final class pcn implements pbv {
    public final pcc a;
    public final Looper b;
    public final pbz c = new pbz("manifestLoader:single");
    public long d;
    final /* synthetic */ pco e;
    private final pcl f;

    public pcn(pco pcoVar, pcc pccVar, Looper looper, pcl pclVar) {
        this.e = pcoVar;
        this.a = pccVar;
        this.b = looper;
        this.f = pclVar;
    }

    private final void a() {
        this.c.b();
    }

    @Override // defpackage.pbv
    public final void n(pbx pbxVar) {
        try {
            Object obj = this.a.a;
            pco pcoVar = this.e;
            long j = this.d;
            pcoVar.l = obj;
            pcoVar.m = j;
            pcoVar.n = SystemClock.elapsedRealtime();
            pcl pclVar = this.f;
            ylr.b();
            if (((aefz) pclVar).c != null) {
                final aefz aefzVar = (aefz) pclVar;
                ((aefz) pclVar).a.post(new Runnable() { // from class: aefv
                    @Override // java.lang.Runnable
                    public final void run() {
                        aefz aefzVar2 = aefz.this;
                        afdd afddVar = aefzVar2.c;
                        afddVar.f.U(afddVar.a.k(Collections.emptyList(), Collections.emptyList(), aefzVar2.b), afddVar.b, afddVar.c, afddVar.d, afddVar.e);
                        afdv afdvVar = afddVar.f;
                        if (afdvVar.z != null) {
                            afdvVar.z = null;
                        }
                    }
                });
            }
            aefz.d();
        } finally {
            a();
        }
    }

    @Override // defpackage.pbv
    public final void o(pbx pbxVar, IOException iOException) {
        try {
            this.f.a(iOException);
        } finally {
            a();
        }
    }

    @Override // defpackage.pbv
    public final void p() {
        try {
            this.f.a(new pcm(new CancellationException()));
        } finally {
            a();
        }
    }
}
