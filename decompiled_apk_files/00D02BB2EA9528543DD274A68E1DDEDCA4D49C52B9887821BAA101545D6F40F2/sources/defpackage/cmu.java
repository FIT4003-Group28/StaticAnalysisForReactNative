package defpackage;

import android.os.RemoteException;
import com.google.android.gms.car.CarInfo;
/* compiled from: PG */
/* renamed from: cmu  reason: default package */
/* loaded from: classes5.dex */
public final class cmu {
    public int a = 0;
    public clh b;
    public final cmb c;
    private final boolean d;
    private final boolean e;
    private final boolean f;

    public cmu(cmb cmbVar, cnia cniaVar) {
        this.c = cmbVar;
        if (cniaVar == null) {
            this.d = false;
            this.e = false;
            this.f = false;
            return;
        }
        CarInfo carInfo = cniaVar.a;
        boolean z = carInfo.g;
        this.d = z;
        boolean z2 = carInfo.o;
        this.e = z2;
        boolean z3 = carInfo.n;
        this.f = z3;
        if (z) {
            try {
                cmbVar.l();
            } catch (RemoteException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
                sb.append("error setting initial status bar state: ");
                sb.append(valueOf);
                sb.toString();
                return;
            }
        }
        if (z2) {
            cmbVar.j();
        }
        if (!z3) {
            return;
        }
        cmbVar.h();
    }

    public final void a(boolean z) {
        StringBuilder sb = new StringBuilder(34);
        sb.append("setSystemStatusUiVisibility: ");
        sb.append(z);
        sb.toString();
        try {
            this.c.p(z);
        } catch (RemoteException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 43);
            sb2.append("error setting system status ui visibility: ");
            sb2.append(valueOf);
            sb2.toString();
        }
        try {
            if (z) {
                if (!this.f) {
                    this.c.g();
                }
                if (!this.e) {
                    this.c.i();
                }
                if (this.d) {
                    return;
                }
                this.c.k();
                return;
            }
            this.c.h();
            this.c.j();
            this.c.l();
        } catch (RemoteException e2) {
            String valueOf2 = String.valueOf(e2);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 50);
            sb3.append("error setting system status ui visibility compat: ");
            sb3.append(valueOf2);
            sb3.toString();
        }
    }

    public final void b(int i) {
        StringBuilder sb = new StringBuilder(28);
        sb.append("setDayNightStyle ");
        sb.append(i);
        sb.toString();
        try {
            this.c.o(i);
        } catch (RemoteException unused) {
        }
    }
}
