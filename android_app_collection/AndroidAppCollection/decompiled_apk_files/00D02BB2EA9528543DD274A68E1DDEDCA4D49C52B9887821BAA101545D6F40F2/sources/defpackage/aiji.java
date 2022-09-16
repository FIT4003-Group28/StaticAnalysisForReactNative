package defpackage;

import com.google.android.apps.gmm.locationsharing.api.PersonId;
/* compiled from: PG */
/* renamed from: aiji  reason: default package */
/* loaded from: classes2.dex */
final class aiji implements dbrn<PersonId, dbsg<ahwl>> {
    final /* synthetic */ btlu a;
    final /* synthetic */ aijp b;

    public aiji(aijp aijpVar, btlu btluVar) {
        this.b = aijpVar;
        this.a = btluVar;
    }

    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ dbsg<ahwl> a(PersonId personId) {
        return dbsg.j(this.b.e(this.a, personId));
    }
}
