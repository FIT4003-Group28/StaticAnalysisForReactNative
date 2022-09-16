package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: bowt  reason: default package */
/* loaded from: classes3.dex */
public class bowt implements Serializable {
    public final Boolean a;
    @dzsi
    public final bvrt<dnfw> b;
    @dzsi
    public bvrt<dnfw> c;
    public Boolean d;
    public Boolean e;
    public String f;

    public bowt() {
        this(true, null, null);
    }

    public static String a(dnfw dnfwVar) {
        String str = dnfwVar.b;
        if (str.isEmpty() || str.startsWith("gcid:")) {
            return str;
        }
        String valueOf = String.valueOf(str);
        return valueOf.length() != 0 ? "gcid:".concat(valueOf) : new String("gcid:");
    }

    @dzsi
    public final dnfw b() {
        return (dnfw) bvrt.f(this.b, (dssr) dnfw.d.cu(7), dnfw.d);
    }

    @dzsi
    public final dnfw c() {
        return (dnfw) bvrt.f(this.c, (dssr) dnfw.d.cu(7), dnfw.d);
    }

    public final String d() {
        dnfw dnfwVar = (dnfw) bvrt.f(this.c, (dssr) dnfw.d.cu(7), dnfw.d);
        return dnfwVar == null ? "" : dbsj.e(dnfwVar.c);
    }

    public final void e(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    public bowt(Boolean bool, @dzsi dnfw dnfwVar, @dzsi dnfw dnfwVar2) {
        this.d = false;
        this.e = false;
        this.a = bool;
        this.b = bvrt.a(dnfwVar);
        if (dnfwVar2 != null) {
            this.c = bvrt.a(dnfwVar2);
            this.d = true;
        }
        this.f = "";
    }
}
