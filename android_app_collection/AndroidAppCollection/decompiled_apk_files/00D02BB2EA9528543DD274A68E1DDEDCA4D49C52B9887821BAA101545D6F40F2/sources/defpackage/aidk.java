package defpackage;

import com.google.android.apps.gmm.locationsharing.api.PersonId;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aidk  reason: default package */
/* loaded from: classes2.dex */
public final class aidk implements dbsz<PersonId> {
    final /* synthetic */ aidl a;

    public aidk(aidl aidlVar) {
        this.a = aidlVar;
    }

    @Override // defpackage.dbsz
    public final /* bridge */ /* synthetic */ void NU(PersonId personId) {
        final aics aicsVar;
        aifa remove;
        PersonId personId2 = personId;
        synchronized (this.a) {
            final aidl aidlVar = this.a;
            if (aidlVar.f && (aicsVar = aidlVar.h.get(personId2)) != null && (remove = aidlVar.g.remove(Integer.valueOf(aicsVar.b()))) != null) {
                remove.c();
                aidb a = aidlVar.b.a(aicsVar, aidlVar.i);
                aifa b = aidlVar.a.b(a.a, remove.a(), a.b, aidlVar.e, dcdc.g(aidlVar.c.a(), aidlVar.d.a()), new Runnable(aidlVar, aicsVar) { // from class: aidi
                    private final aidl a;
                    private final aics b;

                    {
                        this.a = aidlVar;
                        this.b = aicsVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.b(this.b.b());
                    }
                });
                aidlVar.g.put(Integer.valueOf(aicsVar.b()), b);
                aidl.c(b, aicsVar);
            }
        }
    }
}
