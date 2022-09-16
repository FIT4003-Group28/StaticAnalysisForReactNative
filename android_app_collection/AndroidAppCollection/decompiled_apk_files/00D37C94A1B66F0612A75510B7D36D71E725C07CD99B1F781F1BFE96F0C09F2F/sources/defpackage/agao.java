package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: agao  reason: default package */
/* loaded from: classes.dex */
final class agao extends yua {
    private final uht a;

    public agao(uht uhtVar) {
        super(uhtVar.d != null ? 2 : 1, uhtVar.a.toExternalForm(), null);
        this.a = uhtVar;
    }

    @Override // defpackage.yua
    public final Map f() {
        amum h = amup.h();
        for (uhr uhrVar : this.a.c.keySet()) {
            List list = (List) this.a.c.get(uhrVar);
            if (list != null) {
                h.f(uhrVar.b, ampm.b(",").d(list));
            }
        }
        return h.b();
    }

    @Override // defpackage.yua
    public final String kY() {
        return this.a.b;
    }

    @Override // defpackage.yua
    public final byte[] qA() {
        return this.a.d;
    }

    @Override // defpackage.yua
    public final cfb qy(cew cewVar) {
        amum h = amup.h();
        List<ceu> list = cewVar.d;
        if (list != null) {
            for (ceu ceuVar : list) {
                h.f(uhr.a(ceuVar.a), amuk.r(ceuVar.b));
            }
        }
        uhu a = uhv.a();
        a.b().putAll(h.b());
        a.d = cewVar.b;
        a.b = Integer.valueOf(cewVar.a);
        a.a = true;
        return cfb.b(a.a(), null);
    }

    @Override // defpackage.yua
    public final /* bridge */ /* synthetic */ void qz(Object obj) {
        uhv uhvVar = (uhv) obj;
    }
}
