package defpackage;

import android.content.Context;
import android.provider.ContactsContract;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: czac  reason: default package */
/* loaded from: classes5.dex */
public final class czac implements cyuc {
    public final Context a;
    public final Executor b;
    public final cyph c;
    private final cych d;

    public czac(Context context, cych cychVar, Executor executor, cyph cyphVar) {
        this.a = context;
        this.d = cychVar;
        this.b = executor;
        this.c = cyphVar;
    }

    @Override // defpackage.cyuc
    public final dehn<cyts> a(final cytq cytqVar) {
        if (!cyzj.i(this.a)) {
            cytr c = cyts.c();
            c.f = cyer.DIRECTORY;
            c.e = cyes.SKIPPED;
            c.b(dcdc.e());
            return deha.a(c.a());
        }
        dbtp b = this.c.b();
        Context context = this.a;
        final cych cychVar = this.d;
        Executor executor = this.b;
        dehn<cyts> h = deew.h(deew.g(deew.h(cyzh.a(context.getContentResolver(), executor, ContactsContract.Directory.CONTENT_URI, cyzy.a).d(cyzu.a, executor).f(), new dbrn(cychVar) { // from class: cyzv
            private final cych a;

            {
                this.a = cychVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                cych cychVar2 = this.a;
                dcdc dcdcVar = (dcdc) obj;
                int size = dcdcVar.size();
                int i = 0;
                while (i < size) {
                    cyzy cyzyVar = (cyzy) dcdcVar.get(i);
                    i++;
                    if (dbqa.e(dbsj.e(cyzyVar.d), dbsj.e(cychVar2.a)) && dbqa.e(dbsj.e(cyzyVar.e), dbsj.e(cychVar2.b))) {
                        return dbsg.i(cyzyVar);
                    }
                }
                return dbpy.a;
            }
        }, dege.a), new defg(this, cytqVar) { // from class: cyzz
            private final czac a;
            private final cytq b;

            {
                this.a = this;
                this.b = cytqVar;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                czac czacVar = this.a;
                cytq cytqVar2 = this.b;
                dbsg dbsgVar = (dbsg) obj;
                if (dbsgVar.a()) {
                    Context context2 = czacVar.a;
                    cyzy cyzyVar = (cyzy) dbsgVar.b();
                    Executor executor2 = czacVar.b;
                    return cyzh.a(context2.getContentResolver(), executor2, ContactsContract.CommonDataKinds.Email.CONTENT_FILTER_URI.buildUpon().appendPath(cytqVar2.b).appendQueryParameter("directory", String.valueOf(cyzyVar.b)).appendQueryParameter("limit", String.valueOf(cytqVar2.f.c())).appendQueryParameter("name_for_primary_account", cyzyVar.d).appendQueryParameter("type_for_primary_account", cyzyVar.e).build(), cyzx.a).d(cyzw.a, executor2).f();
                }
                return deha.a(null);
            }
        }, dege.a), new dbrn() { // from class: czaa
            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                dcdc<dsgk> dcdcVar = (dcdc) obj;
                cytr c2 = cyts.c();
                c2.f = cyer.DIRECTORY;
                if (dcdcVar == null) {
                    c2.e = cyes.SKIPPED;
                } else {
                    dccx F = dcdc.F();
                    for (dsgk dsgkVar : dcdcVar) {
                        F.g(new cywm(dsgkVar));
                    }
                    dcdc f = F.f();
                    int size = f.size();
                    for (int i = 0; i < size; i++) {
                        f.get(i).e(cygl.DIRECTORY);
                    }
                    c2.e = cyes.SUCCESS;
                    c2.b(f);
                }
                return c2.a();
            }
        }, this.b);
        deha.q(h, new czab(this, b, cytqVar, h), dege.a);
        return h;
    }

    @Override // defpackage.cyuc
    public final cyer b() {
        return cyer.DIRECTORY;
    }

    @Override // defpackage.cyuc
    public final dehn<Void> c() {
        return dehk.a;
    }

    @Override // defpackage.cyuc
    public final void d(cydz cydzVar) {
    }
}
