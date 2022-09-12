package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: cjsg  reason: default package */
/* loaded from: classes.dex */
public abstract class cjsg implements Serializable {
    public static cjsg b(int i) {
        return new cjrq(i);
    }

    public abstract int a();

    public final ddhm c() {
        ddhl bZ = ddhm.b.bZ();
        int a = a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddhm ddhmVar = (ddhm) bZ.b;
        dsrf dsrfVar = ddhmVar.a;
        if (!dsrfVar.a()) {
            ddhmVar.a = dsqw.cg(dsrfVar);
        }
        ddhmVar.a.h(a);
        return bZ.bK();
    }
}
