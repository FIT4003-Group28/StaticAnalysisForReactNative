package defpackage;

import com.google.android.apps.gmm.locationsharing.api.PersonId;
/* compiled from: PG */
/* renamed from: ahun  reason: default package */
/* loaded from: classes2.dex */
public final class ahun implements dbrn<PersonId, ahwl> {
    final /* synthetic */ btlu a;
    final /* synthetic */ ahup b;

    public ahun(ahup ahupVar, btlu btluVar) {
        this.b = ahupVar;
        this.a = btluVar;
    }

    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ ahwl a(PersonId personId) {
        ahwl e = this.b.a.i.e(this.a, personId);
        dbsk.s(e);
        return e;
    }
}
