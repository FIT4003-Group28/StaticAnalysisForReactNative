package defpackage;

import com.google.android.apps.gmm.locationsharing.api.PersonId;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aigs  reason: default package */
/* loaded from: classes2.dex */
final class aigs {
    public final Map<PersonId, aigr> a = new HashMap();

    public final aigr a(PersonId personId) {
        if (!this.a.containsKey(personId)) {
            this.a.put(personId, new aigr(personId));
        }
        aigr aigrVar = this.a.get(personId);
        dbsk.s(aigrVar);
        return aigrVar;
    }

    public final void b(Iterable<PersonId> iterable, float f, float f2) {
        HashSet<PersonId> hashSet = new HashSet(this.a.keySet());
        boolean z = false;
        for (PersonId personId : iterable) {
            aigr a = a(personId);
            dbsk.l(f > 0.0f);
            a.e += f;
            hashSet.remove(personId);
            z = true;
        }
        if (!z) {
            return;
        }
        for (PersonId personId2 : hashSet) {
            aigr a2 = a(personId2);
            dbsk.l(f2 > 0.0f && f2 < 1.0f);
            a2.e *= f2;
        }
    }
}
