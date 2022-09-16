package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bhmk  reason: default package */
/* loaded from: classes3.dex */
public class bhmk implements zcq {
    private final dcdc<zef> a;

    public bhmk(btvo btvoVar, dxio<qbt> dxioVar, vtn vtnVar, List<doph> list, qdb qdbVar) {
        dccx F = dcdc.F();
        for (doph dophVar : list) {
            F.i(zrp.a(dophVar, vtnVar, dtxy.km, dxioVar, qdbVar));
        }
        this.a = F.f();
    }

    @Override // defpackage.zcq
    /* renamed from: b */
    public dcdc<zef> a() {
        return this.a;
    }
}
