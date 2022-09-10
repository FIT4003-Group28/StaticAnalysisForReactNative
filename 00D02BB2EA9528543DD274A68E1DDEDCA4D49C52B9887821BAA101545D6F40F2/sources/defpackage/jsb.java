package defpackage;

import android.app.Activity;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: jsb  reason: default package */
/* loaded from: classes7.dex */
public class jsb implements jre {
    private final String a;
    @dzsi
    private final List<jrg> b;
    @dzsi
    private final List<jrd> c;
    private final boolean d;

    public jsb(jsf jsfVar, jsa jsaVar, String str, List<dhmz> list, Map<String, dhnd> map, dcna<String, dkdt> dcnaVar, jry jryVar) {
        this.a = str;
        int i = 1;
        boolean z = !map.isEmpty();
        this.d = z;
        jic e = jryVar.e();
        int i2 = 6;
        int i3 = 5;
        int i4 = 4;
        int i5 = 3;
        if (z) {
            this.c = null;
            dccx dccxVar = new dccx();
            for (dhmz dhmzVar : list) {
                dhnd dhndVar = map.get(dhmzVar.b);
                dbsk.s(dhndVar);
                Activity activity = (Activity) ((dxjd) jsfVar.a).a;
                jsf.a(activity, i);
                dzsj<ahjq> dzsjVar = jsfVar.b;
                bvsl a = jsfVar.c.a();
                jsf.a(a, i5);
                dxio a2 = ((dxjh) jsfVar.d).a();
                jsf.a(a2, i4);
                jsf.a(dhmzVar, i3);
                jsf.a(dhndVar, i2);
                jsf.a(e, 7);
                dccxVar.g(new jse(activity, dzsjVar, a, a2, dhmzVar, dhndVar, e));
                i = 1;
                i5 = 3;
                i4 = 4;
                i3 = 5;
                i2 = 6;
            }
            this.b = dccxVar.f();
            return;
        }
        int i6 = 4;
        this.b = null;
        dccx dccxVar2 = new dccx();
        for (dhmz dhmzVar2 : list) {
            Set<dkdt> c = dcnaVar.c(dhmzVar2.b);
            Activity activity2 = (Activity) ((dxjd) jsaVar.a).a;
            jsa.a(activity2, 1);
            dzsj<ahjq> dzsjVar2 = jsaVar.b;
            bvsl a3 = jsaVar.c.a();
            jsa.a(a3, 3);
            dxio a4 = ((dxjh) jsaVar.d).a();
            jsa.a(a4, i6);
            jsa.a(dhmzVar2, 5);
            jsa.a(c, 6);
            jsa.a(e, 7);
            dccxVar2.g(new jrz(activity2, dzsjVar2, a3, a4, dhmzVar2, c, e));
            i6 = 4;
        }
        this.c = dccxVar2.f();
    }

    @Override // defpackage.jre
    public String a() {
        return this.a;
    }

    @Override // defpackage.jre
    public Boolean b() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.jre
    public List<jrg> c() {
        List<jrg> list = this.b;
        dbsk.s(list);
        return list;
    }

    @Override // defpackage.jre
    public List<jrd> d() {
        List<jrd> list = this.c;
        dbsk.s(list);
        return list;
    }
}
