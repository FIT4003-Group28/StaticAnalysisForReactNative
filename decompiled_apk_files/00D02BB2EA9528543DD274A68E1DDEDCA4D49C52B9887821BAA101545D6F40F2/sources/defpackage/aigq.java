package defpackage;

import com.google.android.apps.gmm.locationsharing.api.PersonId;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aigq  reason: default package */
/* loaded from: classes2.dex */
final class aigq implements dbsl<PersonId> {
    final /* synthetic */ Map a;
    final /* synthetic */ aigs b;

    public aigq(aigs aigsVar, Map map) {
        this.b = aigsVar;
        this.a = map;
    }

    @Override // defpackage.dbsl
    public final /* bridge */ /* synthetic */ boolean a(PersonId personId) {
        aigr a = this.b.a(personId);
        ahwl ahwlVar = (ahwl) this.a.get(a.a);
        boolean z = a.b;
        boolean z2 = ahwlVar != null && (ahwlVar.v() != null || ahwlVar.w());
        a.b = z2;
        return z2 != z;
    }
}
