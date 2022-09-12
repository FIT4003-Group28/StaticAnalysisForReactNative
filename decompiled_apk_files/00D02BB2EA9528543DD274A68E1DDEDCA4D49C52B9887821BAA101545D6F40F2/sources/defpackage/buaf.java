package defpackage;
/* compiled from: PG */
/* renamed from: buaf  reason: default package */
/* loaded from: classes4.dex */
public final class buaf implements buex {
    private final bufb a;

    public buaf(bufb bufbVar) {
        this.a = bufbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.buex
    @dzsi
    public final <Q extends dssj, S extends dssj> dyib<Q, S> a(Q q) {
        Class<?> cls = q.getClass();
        if (!"dryj".equals(cls.getName()) && !"dryn".equals(cls.getName()) && !"dryr".equals(cls.getName()) && !"dryv".equals(cls.getName()) && !"dryz".equals(cls.getName()) && !"drze".equals(cls.getName()) && !"drzi".equals(cls.getName()) && !"drzm".equals(cls.getName()) && !"drzq".equals(cls.getName()) && !"drzu".equals(cls.getName()) && !"drzy".equals(cls.getName())) {
            return null;
        }
        return (dyib) dcft.c(this.a.a(cls));
    }
}
