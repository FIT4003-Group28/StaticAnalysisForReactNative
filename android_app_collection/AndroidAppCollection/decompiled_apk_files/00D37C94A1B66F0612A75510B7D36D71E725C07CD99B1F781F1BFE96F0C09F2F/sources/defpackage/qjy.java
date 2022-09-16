package defpackage;

import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.internal.ApplicationStatus;
import com.google.android.gms.cast.internal.DeviceStatus;
import com.google.android.gms.common.api.Status;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qjy  reason: default package */
/* loaded from: classes4.dex */
public final class qjy extends qpq {
    final /* synthetic */ qjz a;

    public qjy(qjz qjzVar) {
        this.a = qjzVar;
    }

    @Override // defpackage.qpr
    public final void a(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
        qjz qjzVar = this.a;
        qjzVar.j = applicationMetadata;
        qjzVar.k = str;
        qpd qpdVar = new qpd(new Status(0), applicationMetadata, str, str2, z);
        synchronized (qjzVar.h) {
            rvh rvhVar = qjzVar.e;
            if (rvhVar != null) {
                rvhVar.b(qpdVar);
            }
            qjzVar.e = null;
        }
    }

    @Override // defpackage.qpr
    public final void b(int i) {
        this.a.i(i);
    }

    @Override // defpackage.qpr
    public final void c(int i) {
        this.a.k(i);
        qjz qjzVar = this.a;
        if (qjzVar.v != null) {
            qjzVar.d().post(new qju(this, i, 1));
        }
    }

    @Override // defpackage.qpr
    public final void d(int i) {
        this.a.k(i);
    }

    @Override // defpackage.qpr
    public final void e(final ApplicationStatus applicationStatus) {
        this.a.d().post(new Runnable() { // from class: qjv
            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                qjy qjyVar = qjy.this;
                ApplicationStatus applicationStatus2 = applicationStatus;
                qjz qjzVar = qjyVar.a;
                String str = applicationStatus2.a;
                if (!qpl.j(str, qjzVar.k)) {
                    qjzVar.k = str;
                    z = true;
                } else {
                    z = false;
                }
                tfo tfoVar = qjzVar.v;
                if (tfoVar != null && (z || qjzVar.d)) {
                    tfoVar.d();
                }
                qjzVar.d = false;
            }
        });
    }

    @Override // defpackage.qpr
    public final void f(int i) {
        this.a.k(i);
    }

    @Override // defpackage.qpr
    public final void g(int i) {
        this.a.d().post(new qju(this, i));
    }

    @Override // defpackage.qpr
    public final void h(final DeviceStatus deviceStatus) {
        this.a.d().post(new Runnable() { // from class: qjw
            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                boolean z2;
                qjy qjyVar = qjy.this;
                DeviceStatus deviceStatus2 = deviceStatus;
                qjz qjzVar = qjyVar.a;
                ApplicationMetadata applicationMetadata = deviceStatus2.d;
                if (!qpl.j(applicationMetadata, qjzVar.j)) {
                    qjzVar.j = applicationMetadata;
                    qjzVar.v.c(qjzVar.j);
                }
                double d = deviceStatus2.a;
                boolean z3 = true;
                if (Double.isNaN(d) || Math.abs(d - qjzVar.l) <= 1.0E-7d) {
                    z = false;
                } else {
                    qjzVar.l = d;
                    z = true;
                }
                boolean z4 = deviceStatus2.b;
                if (z4 != qjzVar.m) {
                    qjzVar.m = z4;
                    z = true;
                }
                tfo tfoVar = qjzVar.v;
                if (tfoVar != null && (z || qjzVar.c)) {
                    tfoVar.f();
                }
                Double.isNaN(deviceStatus2.g);
                int i = deviceStatus2.c;
                int i2 = qjzVar.n;
                if (i != i2) {
                    qjzVar.n = i;
                    z2 = true;
                } else {
                    i = i2;
                    z2 = false;
                }
                tfo tfoVar2 = qjzVar.v;
                if (tfoVar2 != null && (z2 || qjzVar.c)) {
                    tfoVar2.a(i);
                }
                int i3 = deviceStatus2.e;
                int i4 = qjzVar.o;
                if (i3 != i4) {
                    qjzVar.o = i3;
                } else {
                    i3 = i4;
                    z3 = false;
                }
                tfo tfoVar3 = qjzVar.v;
                if (tfoVar3 != null && (z3 || qjzVar.c)) {
                    tfoVar3.e(i3);
                }
                if (!qpl.j(qjzVar.p, deviceStatus2.f)) {
                    qjzVar.p = deviceStatus2.f;
                }
                qjzVar.c = false;
            }
        });
    }

    @Override // defpackage.qpr
    public final void i(int i) {
        this.a.d().post(new qju(this, i, 2));
    }

    @Override // defpackage.qpr
    public final void j(int i) {
        this.a.d().post(new qju(this, i, 3));
    }

    @Override // defpackage.qpr
    public final void k(final String str, final String str2) {
        qpu qpuVar = qjz.a;
        this.a.d().post(new Runnable() { // from class: qjx
            @Override // java.lang.Runnable
            public final void run() {
                qjh qjhVar;
                qjy qjyVar = qjy.this;
                String str3 = str;
                String str4 = str2;
                synchronized (qjyVar.a.s) {
                    qjhVar = (qjh) qjyVar.a.s.get(str3);
                }
                if (qjhVar != null) {
                    qjhVar.a(str3, str4);
                }
            }
        });
    }

    @Override // defpackage.qpr
    public final void l(long j) {
        this.a.j(j, 0);
    }

    @Override // defpackage.qpr
    public final void m(long j, int i) {
        this.a.j(j, i);
    }

    @Override // defpackage.qpr
    public final void n() {
        qpu qpuVar = qjz.a;
    }

    @Override // defpackage.qpr
    public final void o(byte[] bArr) {
        qpu qpuVar = qjz.a;
        int length = bArr.length;
    }
}
