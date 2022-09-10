package defpackage;

import android.app.Application;
import java.util.List;
/* compiled from: PG */
/* renamed from: aoiv  reason: default package */
/* loaded from: classes2.dex */
public class aoiv implements aoiu {
    private final dcdc<dvan> a;
    private final aojt b;
    private final aoiz c;
    private final dcdc<aola> d;
    @dzsi
    private final String e;

    public aoiv(aojt aojtVar, aoiz aoizVar, Application application, List<dvan> list, dcdc<aola> dcdcVar, dqgd dqgdVar) {
        this.a = dcdc.r(list);
        this.d = dcdcVar;
        this.b = aojtVar;
        this.c = aoizVar;
        this.e = dqgdVar.b.isEmpty() ? null : aogw.c(application, dqgdVar.a, dcdc.r(dqgdVar.b));
    }

    @Override // defpackage.aoiu
    public dcdc<aojr> a() {
        dccx F = dcdc.F();
        dcdc<dvan> dcdcVar = this.a;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dvan dvanVar = dcdcVar.get(i);
            aojt aojtVar = this.b;
            aojt.a(dvanVar, 1);
            fd fdVar = (fd) ((dxjd) aojtVar.a).a;
            aojt.a(fdVar, 2);
            bbut a = aojtVar.b.a();
            aojt.a(a, 3);
            Application a2 = aojtVar.c.a();
            aojt.a(a2, 4);
            Boolean a3 = aojtVar.d.a();
            aojt.a(a3, 5);
            boolean booleanValue = a3.booleanValue();
            aogw a4 = aojtVar.e.a();
            aojt.a(a4, 6);
            gga a5 = aojtVar.f.a();
            aojt.a(a5, 7);
            F.g(new aojs(dvanVar, fdVar, a, a2, booleanValue, a4, a5));
        }
        return F.f();
    }

    @Override // defpackage.aoiu
    public dcdc<aoix> b() {
        dccx F = dcdc.F();
        dcdc<aola> dcdcVar = this.d;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            aola aolaVar = dcdcVar.get(i);
            aoiz aoizVar = this.c;
            aoiz.a(aolaVar, 1);
            aokw a = aoizVar.a.a();
            aoiz.a(a, 2);
            anhg a2 = aoizVar.b.a();
            aoiz.a(a2, 3);
            F.g(new aoiy(aolaVar, a, a2));
        }
        return F.f();
    }

    @Override // defpackage.aoiu
    @dzsi
    public cqsn c() {
        String str = this.e;
        if (str == null) {
            return null;
        }
        return cqsk.a(str);
    }
}
