package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: boyt  reason: default package */
/* loaded from: classes3.dex */
public class boyt {
    @dzsi
    public dpsn a;
    @dzsi
    public dhjz b;
    @dzsi
    public String c;
    public List<Long> d;
    public dcep<Long> e;
    @dzsi
    public akqs f;
    public bpuh g;
    public long h;

    public boyt(bpuh bpuhVar) {
        this.d = new ArrayList();
        this.e = dcmr.a;
        this.g = bpuhVar;
    }

    public final bpuf a() {
        bpuf bZ = bpui.j.bZ();
        List<Long> list = this.d;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bpui bpuiVar = (bpui) bZ.b;
        dsri dsriVar = bpuiVar.d;
        if (!dsriVar.a()) {
            bpuiVar.d = dsqw.ci(dsriVar);
        }
        dsod.bv(list, bpuiVar.d);
        bpuh bpuhVar = this.g;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bpui bpuiVar2 = (bpui) bZ.b;
        bpuiVar2.g = bpuhVar.f;
        int i = bpuiVar2.a | 16;
        bpuiVar2.a = i;
        long j = this.h;
        bpuiVar2.a = i | 32;
        bpuiVar2.h = j;
        dcep<Long> dcepVar = this.e;
        bpui bpuiVar3 = (bpui) bZ.b;
        dsri dsriVar2 = bpuiVar3.i;
        if (!dsriVar2.a()) {
            bpuiVar3.i = dsqw.ci(dsriVar2);
        }
        dsod.bv(dcepVar, bpuiVar3.i);
        dpsn dpsnVar = this.a;
        if (dpsnVar != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bpui bpuiVar4 = (bpui) bZ.b;
            dpsnVar.getClass();
            bpuiVar4.b = dpsnVar;
            bpuiVar4.a |= 1;
        }
        dhjz dhjzVar = this.b;
        if (dhjzVar != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bpui bpuiVar5 = (bpui) bZ.b;
            dhjzVar.getClass();
            bpuiVar5.c = dhjzVar;
            bpuiVar5.a |= 2;
        }
        String str = this.c;
        if (str != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bpui bpuiVar6 = (bpui) bZ.b;
            str.getClass();
            bpuiVar6.a |= 4;
            bpuiVar6.e = str;
        }
        akqs akqsVar = this.f;
        if (akqsVar != null) {
            dgrt e = akqsVar.e();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bpui bpuiVar7 = (bpui) bZ.b;
            e.getClass();
            bpuiVar7.f = e;
            bpuiVar7.a |= 8;
        }
        return bZ;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dcdc<Long> b() {
        return dcdc.r(this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(List<Long> list) {
        this.d.addAll(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        this.d.clear();
        this.e = dcmr.a;
        this.h = 0L;
        this.f = null;
    }

    public boyt(bpuh bpuhVar, @dzsi dpsn dpsnVar, @dzsi dhjz dhjzVar, @dzsi String str, List<Long> list, @dzsi akqs akqsVar, long j, dcep<Long> dcepVar) {
        this.d = new ArrayList();
        this.e = dcmr.a;
        this.a = dpsnVar;
        this.b = dhjzVar;
        this.c = str;
        this.d = new ArrayList(list);
        this.f = akqsVar;
        this.g = bpuhVar;
        this.h = j;
        this.e = dcepVar;
    }
}
