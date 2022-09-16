package defpackage;

import com.google.android.apps.gmm.locationsharing.api.PersonId;
/* compiled from: PG */
/* renamed from: ahus  reason: default package */
/* loaded from: classes2.dex */
final class ahus implements akey {
    final /* synthetic */ PersonId a;
    final /* synthetic */ ahwe b;
    final /* synthetic */ ahuu c;

    public ahus(ahuu ahuuVar, PersonId personId, ahwe ahweVar) {
        this.c = ahuuVar;
        this.a = personId;
        this.b = ahweVar;
    }

    @Override // defpackage.akey
    public final void a(boolean z) {
        bvrj.UI_THREAD.c();
        this.c.s(dbsg.i(this.a), this.b, false);
    }

    @Override // defpackage.akey
    public final void b() {
        bvrj.UI_THREAD.c();
        this.c.s(dbsg.i(this.a), this.b, false);
    }
}
