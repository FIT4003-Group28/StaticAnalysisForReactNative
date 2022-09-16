package defpackage;

import java.util.Collection;
/* compiled from: PG */
/* renamed from: ahlo  reason: default package */
/* loaded from: classes2.dex */
public final class ahlo implements degu<Collection<cspy<eavq>>> {
    final /* synthetic */ cohi a;

    public ahlo(cohi cohiVar) {
        this.a = cohiVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.a.b(13, "MoonLander failed to fetch the data.");
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Collection<cspy<eavq>> collection) {
        Collection<cspy<eavq>> collection2 = collection;
        try {
            dccx F = dcdc.F();
            if (collection2 != null) {
                for (cspy<eavq> cspyVar : collection2) {
                    F.g(cspyVar.a().bS());
                }
            }
            this.a.a(new ahlp(F.f()));
        } catch (csqa unused) {
            this.a.b(13, "Error while parsing the returned examples.");
        }
    }
}
