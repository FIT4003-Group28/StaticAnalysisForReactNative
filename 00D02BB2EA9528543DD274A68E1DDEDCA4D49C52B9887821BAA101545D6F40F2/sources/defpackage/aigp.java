package defpackage;

import com.google.android.apps.gmm.locationsharing.api.PersonId;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aigp  reason: default package */
/* loaded from: classes2.dex */
final class aigp implements dbsl<PersonId> {
    final /* synthetic */ Map a;
    final /* synthetic */ aigs b;

    public aigp(aigs aigsVar, Map map) {
        this.b = aigsVar;
        this.a = map;
    }

    @Override // defpackage.dbsl
    public final /* bridge */ /* synthetic */ boolean a(PersonId personId) {
        aigr a = this.b.a(personId);
        ahwl ahwlVar = (ahwl) this.a.get(a.a);
        boolean z = a.d;
        boolean B = ahwlVar == null ? false : ahwlVar.B();
        a.d = B;
        return B != z;
    }
}
