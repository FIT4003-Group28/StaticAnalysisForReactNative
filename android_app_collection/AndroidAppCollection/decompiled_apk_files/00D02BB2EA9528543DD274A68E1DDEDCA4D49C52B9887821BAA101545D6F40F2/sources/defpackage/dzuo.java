package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dzuo  reason: default package */
/* loaded from: classes6.dex */
public final class dzuo extends dzvy implements dzvi<dzup, dzum, dzup> {
    public static final dzuo a = new dzuo();

    @Override // defpackage.dzvi
    public final /* bridge */ /* synthetic */ dzup a(dzup dzupVar, dzum dzumVar) {
        dzup dzupVar2 = dzupVar;
        dzum dzumVar2 = dzumVar;
        dzvx.c(dzupVar2, "acc");
        dzvx.c(dzumVar2, "element");
        dzup minusKey = dzupVar2.minusKey(dzumVar2.getKey());
        if (minusKey == dzuq.a) {
            return dzumVar2;
        }
        dzuk dzukVar = (dzuk) minusKey.get(dzuk.a);
        if (dzukVar == null) {
            return new dzui(minusKey, dzumVar2);
        }
        dzup minusKey2 = minusKey.minusKey(dzuk.a);
        return minusKey2 == dzuq.a ? new dzui(dzumVar2, dzukVar) : new dzui(new dzui(minusKey2, dzumVar2), dzukVar);
    }
}
