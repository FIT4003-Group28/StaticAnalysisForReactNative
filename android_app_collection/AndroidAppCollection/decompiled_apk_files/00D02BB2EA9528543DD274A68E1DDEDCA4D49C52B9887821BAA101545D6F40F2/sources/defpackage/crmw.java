package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: crmw  reason: default package */
/* loaded from: classes5.dex */
public abstract class crmw implements Serializable {
    public static crmw f(ddom ddomVar, dcdc<akra> dcdcVar, Long l, Boolean bool, String str) {
        return new crmv(bvrt.b(ddomVar), dcdcVar, l, bool, str);
    }

    public abstract bvrt<ddom> a();

    public abstract dcdc<akra> b();

    public abstract Long c();

    public abstract Boolean d();

    public abstract String e();

    public final ddom g() {
        return a().e((dssr) ddom.aj.cu(7), ddom.aj);
    }
}
