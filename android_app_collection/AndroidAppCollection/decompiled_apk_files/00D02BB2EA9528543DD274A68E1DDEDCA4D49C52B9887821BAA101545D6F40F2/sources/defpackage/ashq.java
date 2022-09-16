package defpackage;

import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ashq  reason: default package */
/* loaded from: classes2.dex */
public class ashq implements asho {
    final crzp<aufb> a = new ashp(this);
    private final gga b;
    private final cpwx c;
    private final aufc d;
    private final dehq e;
    private boolean f;

    public ashq(gga ggaVar, cpwx cpwxVar, aufc aufcVar, dehq dehqVar) {
        this.b = ggaVar;
        this.c = cpwxVar;
        this.d = aufcVar;
        this.e = dehqVar;
    }

    @Override // defpackage.asho
    public void a() {
        if (!this.f) {
            this.d.i().a(this.a, this.e);
            this.f = true;
        }
        g();
    }

    @Override // defpackage.asho
    public void b() {
        if (this.f) {
            this.d.i().c(this.a);
            this.f = false;
        }
    }

    @Override // defpackage.asho
    public cqkl c() {
        if (this.c.a() == 3) {
            cpwx cpwxVar = this.c;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            cpwxVar.l(256);
            if (cpwxVar.m.a() == 3) {
                cpwxVar.h();
                cpzj bZ = cpzy.g.bZ();
                cpzm bZ2 = cpzn.c.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                cpzn cpznVar = (cpzn) bZ2.b;
                cpznVar.a |= 2;
                cpznVar.b = elapsedRealtimeNanos;
                cpzn bK = bZ2.bK();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                cpzy cpzyVar = (cpzy) bZ.b;
                bK.getClass();
                cpzyVar.b = bK;
                cpzyVar.a |= 2;
                try {
                    cpwxVar.i(bZ);
                } catch (RemoteException unused) {
                }
                deha.a(cpyl.a);
            } else {
                throw new IllegalStateException("Check connected state before use.");
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.asho
    public CharSequence d() {
        return this.b.getString(R.string.MENU_MIC_BUTTON);
    }

    @Override // defpackage.asho
    public void e(int i) {
        if (this.c.a() == 3) {
            cpwx cpwxVar = this.c;
            if (cpwxVar.i == i) {
                return;
            }
            cpwxVar.i = i;
            if (!cpwxVar.m.c()) {
                return;
            }
            cpzs e = cpwxVar.e();
            if (e.c) {
                e.bF();
                e.c = false;
            }
            cpzx cpzxVar = (cpzx) e.b;
            cpzx cpzxVar2 = cpzx.h;
            cpzxVar.a |= 32;
            cpzxVar.f = i;
            cpwxVar.c();
        }
    }

    @Override // defpackage.asho
    public Boolean f() {
        return Boolean.valueOf(this.b.getResources().getConfiguration().smallestScreenWidthDp <= 360);
    }

    public final void g() {
        int i = true != this.d.b() ? 1 : 2;
        cpwx cpwxVar = this.c;
        if (cpwxVar.h == i) {
            return;
        }
        cpwxVar.h = i;
        if (!cpwxVar.m.c()) {
            return;
        }
        cpzs e = cpwxVar.e();
        int a = cpzw.a(i);
        if (e.c) {
            e.bF();
            e.c = false;
        }
        cpzx cpzxVar = (cpzx) e.b;
        int i2 = a - 1;
        cpzx cpzxVar2 = cpzx.h;
        if (a == 0) {
            throw null;
        }
        cpzxVar.b = i2;
        cpzxVar.a |= 1;
        cpwxVar.c();
    }
}
