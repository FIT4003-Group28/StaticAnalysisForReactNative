package defpackage;
/* compiled from: PG */
/* renamed from: awqv  reason: default package */
/* loaded from: classes3.dex */
final class awqv {
    final /* synthetic */ awqz a;

    public awqv(awqz awqzVar) {
        this.a = awqzVar;
    }

    public final void a(@dzsi awtn awtnVar) {
        long d;
        String str;
        bvrj.UI_THREAD.c();
        this.a.f.b();
        awqz awqzVar = this.a;
        awqzVar.o = null;
        awqzVar.i.a(awtnVar);
        awpu awpuVar = this.a.j;
        if (awtnVar == null || !awtnVar.o()) {
            awpuVar.a();
        } else if (awpuVar.h.a.w(bvjk.cV, -1L) != awtnVar.b()) {
            awpuVar.a();
            long b = awtnVar.b();
            if (b >= awpuVar.f.b() + awpu.a) {
                awpuVar.b(awtnVar, awpuVar.c(b), "com.google.android.apps.gmm.parkinglocation.ACTION_PARKING_LOCATION_EXPIRES_SOON_NOTIFICATION");
                d = awpuVar.d(b);
                str = "com.google.android.apps.gmm.parkinglocation.ACTION_PARKING_LOCATION_EXPIRED_NOTIFICATION";
            } else {
                d = awpuVar.d(b);
                str = "com.google.android.apps.gmm.parkinglocation.ACTION_UPDATE_PARKING_LOCATION_NOTIFICATION";
            }
            awpuVar.b(awtnVar, d, str);
        }
        this.a.g.c(awtnVar);
        if (awtnVar == null) {
            awqz awqzVar2 = this.a;
            awqe p = awqzVar2.p();
            if (p == null || !p.U()) {
                return;
            }
            p.q();
            awqzVar2.b.g().e();
            return;
        }
        if (awtnVar.e() == null) {
            this.a.n(awtnVar);
        }
        this.a.l(awtnVar);
    }
}
