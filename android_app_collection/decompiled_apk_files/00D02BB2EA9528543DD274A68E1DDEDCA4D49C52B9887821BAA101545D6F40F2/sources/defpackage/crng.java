package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: crng  reason: default package */
/* loaded from: classes5.dex */
final class crng implements dbsl<crqw> {
    final /* synthetic */ crnh a;

    public crng(crnh crnhVar) {
        this.a = crnhVar;
    }

    @Override // defpackage.dbsl
    public final /* bridge */ /* synthetic */ boolean a(crqw crqwVar) {
        boolean isEmpty;
        crqw crqwVar2 = crqwVar;
        synchronized (this.a.b) {
            Set<String> set = this.a.a.get(crqwVar2.a());
            dbsk.s(set);
            isEmpty = set.isEmpty();
        }
        return isEmpty;
    }
}
