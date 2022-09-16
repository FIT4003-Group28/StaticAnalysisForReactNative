package defpackage;

import com.google.android.gms.car.CarSensorEvent;
import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: kfl  reason: default package */
/* loaded from: classes.dex */
public final class kfl implements cmwu, btph {
    public final Object a;
    public final dzjs<kfm<?>> b;
    public final dzjw c;
    @dzsi
    public cmwv d;
    private final btrm e;
    private final axru f;
    private final ckcw g;

    public kfl(btrm btrmVar, axru axruVar, ckcw ckcwVar, kly klyVar) {
        dccx F = dcdc.F();
        F.g(new kfj(klyVar));
        F.g(new kfg());
        F.g(new kfh());
        dcdc f = F.f();
        this.a = new Object();
        this.b = new dzjs<>();
        this.c = new dzjw();
        this.e = btrmVar;
        int size = f.size();
        for (int i = 0; i < size; i++) {
            kfm<?> kfmVar = (kfm) f.get(i);
            this.b.a(kfmVar.a(), kfmVar);
        }
        this.f = axruVar;
        this.g = ckcwVar;
    }

    private final void e(kfm<?> kfmVar) {
        cmwv cmwvVar;
        synchronized (this.a) {
            if (this.b.d(kfmVar.a())) {
                kfmVar.a();
                return;
            }
            this.b.a(kfmVar.a(), kfmVar);
            synchronized (this.a) {
                cmwvVar = this.d;
            }
            if (cmwvVar != null) {
                try {
                    d(cmwvVar, kfmVar);
                } catch (cmwm unused) {
                    kfmVar.a();
                }
            }
        }
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        throw null;
    }

    public final void a(boolean z) {
        boolean a = this.f.a("android.permission.ACCESS_FINE_LOCATION");
        boolean a2 = this.f.a("com.google.android.gms.permission.CAR_SPEED");
        int a3 = kfk.a(1);
        if (a) {
            a3 |= kfk.a(2);
            e(new kff());
        }
        if (a2) {
            a3 |= kfk.a(3);
            e(new kfi());
        }
        if (z) {
            ((ckco) this.g.a(ckee.Z)).a(a3);
        }
    }

    @Override // defpackage.cmwu
    public final void b(int i, long j, float[] fArr, byte[] bArr) {
        synchronized (this.a) {
            kfm<?> i2 = this.b.i(i);
            if (i2 != null) {
                Object b = i2.b(new CarSensorEvent(0, i, j, fArr, bArr));
                if (b != null) {
                    this.e.b(b);
                }
            }
        }
    }

    public final void d(cmwv cmwvVar, kfm<?> kfmVar) {
        synchronized (this.a) {
            int a = kfmVar.a();
            if (!cmwvVar.a(a)) {
                Object d = kfmVar.d();
                if (d != null) {
                    this.e.b(d);
                }
                return;
            }
            cmwvVar.d(this, kfmVar.a());
            this.c.b(a);
        }
    }
}
