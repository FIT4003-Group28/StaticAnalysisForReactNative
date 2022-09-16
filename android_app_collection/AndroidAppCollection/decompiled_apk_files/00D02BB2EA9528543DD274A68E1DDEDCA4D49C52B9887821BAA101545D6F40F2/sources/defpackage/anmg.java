package defpackage;
/* compiled from: PG */
/* renamed from: anmg  reason: default package */
/* loaded from: classes2.dex */
final class anmg {
    private dbsg<btvo> a = dbpy.a;

    public final synchronized void a(btvr btvrVar) {
        this.a = dbsg.i(btvrVar.a);
    }

    public final synchronized dbsg<btvo> b() {
        dbsg<btvo> dbsgVar;
        dbsgVar = this.a;
        this.a = dbpy.a;
        return dbsgVar;
    }
}
