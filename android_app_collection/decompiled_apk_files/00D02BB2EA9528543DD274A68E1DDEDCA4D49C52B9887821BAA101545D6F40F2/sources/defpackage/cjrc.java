package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: cjrc  reason: default package */
/* loaded from: classes.dex */
public final class cjrc implements Serializable {
    public final String a;

    public cjrc(ddxz ddxzVar) {
        dbsk.s(ddxzVar);
        this.a = cjra.b(ddxzVar);
    }

    public static dbsg<cjrc> a(@dzsi String str) {
        return str == null ? dbpy.a : dbsg.j(cjra.e(str)).h(cjrb.a);
    }

    public final cjrc b(long j) {
        ddxy bZ = ddxz.d.bZ();
        ddxz e = cjra.e(this.a);
        dbsk.s(e);
        ddyb ddybVar = e.b;
        if (ddybVar == null) {
            ddybVar = ddyb.e;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddxz ddxzVar = (ddxz) bZ.b;
        ddybVar.getClass();
        ddxzVar.b = ddybVar;
        int i = ddxzVar.a | 1;
        ddxzVar.a = i;
        ddxzVar.a = i | 2;
        ddxzVar.c = j;
        return new cjrc(bZ.bK());
    }

    @dzsi
    public final ddxz c() {
        return cjra.e(this.a);
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.a.equals(((cjrc) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
