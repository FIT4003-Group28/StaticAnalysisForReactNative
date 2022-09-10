package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bqgp  reason: default package */
/* loaded from: classes4.dex */
final class bqgp extends bqgx {
    public dcdc<bqgw> a;
    public bqhf b;
    public bqhr c;
    public int d;

    @Override // defpackage.bqgx
    public final void a(List<bqgw> list) {
        this.a = dcdc.r(list);
    }

    @Override // defpackage.bqgx
    public final void b(bqhr bqhrVar) {
        if (bqhrVar != null) {
            this.c = bqhrVar;
            return;
        }
        throw new NullPointerException("Null nextRoadId");
    }

    @Override // defpackage.bqgx
    public final void c(bqhf bqhfVar) {
        if (bqhfVar != null) {
            this.b = bqhfVar;
            return;
        }
        throw new NullPointerException("Null roadUnderConstructionState");
    }

    @Override // defpackage.bqgx
    public final void d(int i) {
        this.d = i;
    }
}
