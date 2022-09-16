package defpackage;

import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.internal.DeviceStatus;
/* compiled from: PG */
/* renamed from: qpf  reason: default package */
/* loaded from: classes4.dex */
final class qpf implements Runnable {
    final /* synthetic */ qpj a;
    final /* synthetic */ DeviceStatus b;

    public qpf(qpj qpjVar, DeviceStatus deviceStatus) {
        this.a = qpjVar;
        this.b = deviceStatus;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2;
        qpj qpjVar = this.a;
        DeviceStatus deviceStatus = this.b;
        ApplicationMetadata applicationMetadata = deviceStatus.d;
        if (!qpl.j(applicationMetadata, qpjVar.b)) {
            qpjVar.b = applicationMetadata;
            qpjVar.o.c(qpjVar.b);
        }
        double d = deviceStatus.a;
        boolean z3 = true;
        if (Double.isNaN(d) || Math.abs(d - qpjVar.i) <= 1.0E-7d) {
            z = false;
        } else {
            qpjVar.i = d;
            z = true;
        }
        boolean z4 = deviceStatus.b;
        if (z4 != qpjVar.f) {
            qpjVar.f = z4;
            z = true;
        }
        Double.isNaN(deviceStatus.g);
        tfo tfoVar = qpjVar.o;
        if (tfoVar != null && (z || qpjVar.h)) {
            tfoVar.f();
        }
        int i = deviceStatus.c;
        int i2 = qpjVar.k;
        if (i != i2) {
            qpjVar.k = i;
            z2 = true;
        } else {
            i = i2;
            z2 = false;
        }
        tfo tfoVar2 = qpjVar.o;
        if (tfoVar2 != null && (z2 || qpjVar.h)) {
            tfoVar2.a(i);
        }
        int i3 = deviceStatus.e;
        int i4 = qpjVar.l;
        if (i3 != i4) {
            qpjVar.l = i3;
        } else {
            i3 = i4;
            z3 = false;
        }
        tfo tfoVar3 = qpjVar.o;
        if (tfoVar3 != null && (z3 || qpjVar.h)) {
            tfoVar3.e(i3);
        }
        if (!qpl.j(qpjVar.j, deviceStatus.f)) {
            qpjVar.j = deviceStatus.f;
        }
        qpjVar.h = false;
    }
}
