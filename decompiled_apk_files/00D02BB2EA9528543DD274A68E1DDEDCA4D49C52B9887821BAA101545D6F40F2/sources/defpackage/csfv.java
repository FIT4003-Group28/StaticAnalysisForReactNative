package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: csfv  reason: default package */
/* loaded from: classes5.dex */
public final class csfv implements csfw {
    public final dehp a;
    public final Set<csfw> b;
    public final dbsg c;

    public csfv(dehp dehpVar, Set<csfw> set, dbsg dbsgVar) {
        this.a = dehpVar;
        this.b = set;
        this.c = dbsgVar;
    }

    @Override // defpackage.csfw
    public final dehn<csfs> a(final csgc csgcVar) {
        return deha.f(dazv.f(new deff(this, csgcVar) { // from class: csft
            private final csfv a;
            private final csgc b;

            {
                this.a = this;
                this.b = csgcVar;
            }

            @Override // defpackage.deff
            public final dehn a() {
                csfv csfvVar = this.a;
                csgc csgcVar2 = this.b;
                final ArrayList arrayList = new ArrayList(1);
                dcpd it = ((dcnn) csfvVar.b).iterator();
                while (it.hasNext()) {
                    arrayList.add(((csfw) it.next()).a(csgcVar2));
                }
                return deha.n(arrayList).b(new Callable(arrayList) { // from class: csfu
                    private final List a;

                    {
                        this.a = arrayList;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        csfs csfsVar = null;
                        for (dehn dehnVar : this.a) {
                            csfs csfsVar2 = (csfs) deha.r(dehnVar);
                            if (csfsVar2 != null) {
                                dbsk.m(csfsVar == null, "More than one auth provider provided result.");
                                csfsVar = csfsVar2;
                            }
                        }
                        if (csfsVar != null) {
                            return csfsVar;
                        }
                        throw new UnsupportedOperationException("Unknown LogAuthSpec or Missing Module.");
                    }
                }, csfvVar.a);
            }
        }), this.a);
    }
}
