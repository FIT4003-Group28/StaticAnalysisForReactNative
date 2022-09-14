package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: cxyn  reason: default package */
/* loaded from: classes5.dex */
final class cxyn implements Comparator<dsgt> {
    private final cywm a;

    public cxyn(cywm cywmVar) {
        this.a = cywmVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(dsgt dsgtVar, dsgt dsgtVar2) {
        dsgt dsgtVar3 = dsgtVar2;
        dbsg<cyfz> f = this.a.f(dsgtVar);
        cyfx cyfxVar = null;
        cyfx b = f.a() ? f.b().b() : null;
        boolean z = b != null && b.a();
        dbsg<cyfz> f2 = this.a.f(dsgtVar3);
        if (f2.a()) {
            cyfxVar = f2.b().b();
        }
        boolean z2 = cyfxVar != null && cyfxVar.a();
        if (z) {
            if (!z2) {
                return -1;
            }
            z2 = true;
        }
        return (z || !z2) ? 0 : 1;
    }
}
