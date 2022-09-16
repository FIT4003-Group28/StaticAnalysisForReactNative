package defpackage;
/* compiled from: PG */
/* renamed from: tlz  reason: default package */
/* loaded from: classes4.dex */
public final class tlz {
    public final aooq a;
    public final Object b;

    private tlz(aooq aooqVar, Object obj) {
        boolean z = false;
        if (aooqVar.a() >= 100000000 && aooqVar.a() < 200000000) {
            z = true;
        }
        aqxo.p(z);
        this.a = aooqVar;
        this.b = obj;
    }

    public static tlz a(aooq aooqVar, Object obj) {
        return new tlz(aooqVar, obj);
    }
}
