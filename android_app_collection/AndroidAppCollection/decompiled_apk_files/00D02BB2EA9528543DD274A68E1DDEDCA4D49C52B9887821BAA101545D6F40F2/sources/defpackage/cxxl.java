package defpackage;

import com.google.android.libraries.social.populous.Autocompletion;
import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.core.ContactMethodField;
import com.google.android.libraries.social.populous.logging.LogEntity;
/* compiled from: PG */
/* renamed from: cxxl  reason: default package */
/* loaded from: classes5.dex */
public final class cxxl {
    private final ClientConfigInternal a;
    private final long b;
    @dzsi
    private final cypb c;

    public cxxl(ClientConfigInternal clientConfigInternal, long j, @dzsi cypb cypbVar) {
        this.a = clientConfigInternal;
        this.b = j;
        this.c = cypbVar;
    }

    public final cxxk a(dcdc<cyvs> dcdcVar) {
        ContactMethodField[] e;
        dccx F = dcdc.F();
        dccx F2 = dcdc.F();
        cxyo c = cxyo.c(this.a, "", this.b);
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            cyvs cyvsVar = dcdcVar.get(i);
            Autocompletion a = c.a(cyvsVar);
            if (cyvsVar.A) {
                F.g(a);
            }
            F2.g(a);
            if (this.c != null) {
                for (ContactMethodField contactMethodField : a.e()) {
                    cyoz w = LogEntity.w(contactMethodField, a.b().q());
                    w.p(cyvsVar.n);
                    w.q(cyvsVar.e());
                    w.m(true);
                    this.c.putIfAbsent(contactMethodField.k(), w.s());
                }
            }
        }
        dcdc f = F.f();
        dcdc f2 = F2.f();
        int size2 = f.size();
        dccx G = dcdc.G(f2.size() + size2);
        G.i(f);
        G.i(f2);
        return new cxxk(size2, G.f());
    }
}
