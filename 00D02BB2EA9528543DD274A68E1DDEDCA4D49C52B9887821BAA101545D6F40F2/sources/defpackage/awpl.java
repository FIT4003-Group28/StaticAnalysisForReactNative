package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: awpl  reason: default package */
/* loaded from: classes3.dex */
public final class awpl {
    public final dcxh a;
    public final bvjj b;
    public final dxio<ahjq> c;

    public awpl(btvo btvoVar, bvjj bvjjVar, dxio<ahjq> dxioVar) {
        this.b = bvjjVar;
        this.c = dxioVar;
        dksk dkskVar = btvoVar.getParkingPaymentParameters().c;
        dkskVar = dkskVar == null ? dksk.b : dkskVar;
        ArrayList arrayList = new ArrayList();
        for (dksm dksmVar : dkskVar.a) {
            for (String str : dksmVar.a) {
                try {
                    arrayList.add(new dcve(dcvf.t(str)));
                } catch (NumberFormatException unused) {
                }
            }
        }
        this.a = new dcxh(arrayList);
    }

    public static boolean a(btvo btvoVar) {
        dkso parkingPaymentParameters = btvoVar.getParkingPaymentParameters();
        return parkingPaymentParameters.a && !parkingPaymentParameters.b.isEmpty();
    }
}
