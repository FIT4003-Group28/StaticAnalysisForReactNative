package defpackage;

import com.google.android.libraries.social.populous.core.Photo;
import com.google.android.libraries.social.populous.core.SourceIdentity;
/* compiled from: PG */
/* renamed from: cyzl  reason: default package */
/* loaded from: classes5.dex */
public abstract class cyzl {
    public abstract long a();

    public abstract String b();

    public abstract dcdc<cyvv> c();

    @dzsi
    public abstract Photo d();

    public abstract dcdc<cyvy> e();

    public abstract cyxg f();

    public final cyvt g() {
        return h(null);
    }

    public final cyvt h(@dzsi dcdn<cyvy, Double> dcdnVar) {
        Double d;
        String hexString = Long.toHexString(a());
        cyvt a = cyvt.a();
        a.a = cyxk.PERSON;
        a.d = c();
        a.g(cygl.DEVICE);
        cygv d2 = SourceIdentity.d();
        d2.b(duej.DEVICE_CONTACT);
        cycf cycfVar = (cycf) d2;
        cycfVar.a = hexString;
        cycfVar.b = b();
        a.l.add(d2.a());
        dcdc<cyvy> e = e();
        int size = e.size();
        for (int i = 0; i < size; i++) {
            cyvy cyvyVar = e.get(i);
            cyvi h = cyvi.h(cyvyVar).h();
            if (dcdnVar != null && (d = dcdnVar.get(cyvyVar)) != null) {
                h.b().i = d.doubleValue();
            }
            a.d(h);
        }
        if (d() != null) {
            a.f(d());
        }
        return a;
    }
}
