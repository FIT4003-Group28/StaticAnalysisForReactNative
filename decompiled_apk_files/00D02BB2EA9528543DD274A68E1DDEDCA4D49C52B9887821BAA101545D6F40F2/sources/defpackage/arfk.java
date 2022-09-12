package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: arfk  reason: default package */
/* loaded from: classes2.dex */
public final class arfk implements Serializable {
    public static final dcqe a = dcqe.c("arfk");
    public static final arfk b;
    private static final dcdn<String, Boolean> h;
    public final arfj c;
    public final String d;
    public final arfi e;
    public final boolean f;
    public final dcdn<String, Boolean> g;
    private final bvrt<dvcx> i;

    static {
        dcdn dcdnVar = dcmn.a;
        h = dcdnVar;
        b = new arfk(arfj.NO_MAP, null, null, false, dcdnVar);
    }

    public arfk(arfj arfjVar, @dzsi String str, @dzsi dvcx dvcxVar, boolean z, dcdn<String, Boolean> dcdnVar) {
        boolean z2 = true;
        if (dvcxVar != null) {
            dvcw b2 = dvcw.b(dvcxVar.a);
            if ((b2 == null ? dvcw.UNKNOWN : b2) != dvcw.SUCCESS) {
                z2 = false;
            }
        }
        dbsk.a(z2);
        this.c = arfjVar;
        this.d = str;
        this.i = bvrt.a(dvcxVar);
        this.f = z;
        this.g = dcdnVar;
        this.e = arfi.a(null, dvcxVar);
    }

    public static arfk a(String str) {
        dbsk.s(str);
        return new arfk(arfj.MAP_LOADING, str, null, false, h);
    }

    public static arfk b(dwyb dwybVar, dvcx dvcxVar) {
        boolean z;
        dbsk.s(dwybVar);
        dbsk.s(dvcxVar);
        HashMap d = dcjz.d();
        for (dwxz dwxzVar : dwybVar.d) {
            d.put(dwxzVar.b, Boolean.valueOf(dwxzVar.c));
        }
        dcdg p = dcdn.p();
        dvcr dvcrVar = dvcxVar.b;
        if (dvcrVar == null) {
            dvcrVar = dvcr.h;
        }
        boolean z2 = false;
        for (dvcl dvclVar : dvcrVar.e) {
            dxdm dxdmVar = dvclVar.b;
            if (dxdmVar == null) {
                dxdmVar = dxdm.e;
            }
            String str = dxdmVar.d;
            if (d.containsKey(str)) {
                z = ((Boolean) d.get(str)).booleanValue();
            } else {
                z = dvclVar.d;
            }
            p.f(str, Boolean.valueOf(z));
            z2 |= z;
        }
        return new arfk(arfj.MAP_LOADED, dwybVar.b, dvcxVar, dwybVar.c && z2, p.b());
    }

    public static arfk c(String str, arfi arfiVar) {
        dbsk.s(str);
        return new arfk(str, arfiVar);
    }

    public final boolean d(String str) {
        return this.f && this.g.containsKey(str) && this.g.get(str).booleanValue();
    }

    @dzsi
    public final dvcx e() {
        return (dvcx) bvrt.f(this.i, (dssr) dvcx.c.cu(7), dvcx.c);
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof arfk)) {
            return false;
        }
        arfk arfkVar = (arfk) obj;
        return dbsd.a(this.c, arfkVar.c) && dbsd.a(this.d, arfkVar.d) && dbsd.a(this.i, arfkVar.i) && dbsd.a(Boolean.valueOf(this.f), Boolean.valueOf(arfkVar.f)) && dbsd.a(this.g, arfkVar.g) && dbsd.a(this.e, arfkVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.d, this.i, Boolean.valueOf(this.f), this.g, this.e});
    }

    private arfk(String str, arfi arfiVar) {
        this.c = arfj.FAILED_TO_LOAD;
        this.d = str;
        this.i = null;
        this.f = false;
        this.g = dcmn.a;
        this.e = arfiVar;
    }
}
