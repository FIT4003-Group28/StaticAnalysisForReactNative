package defpackage;
/* compiled from: PG */
/* renamed from: aacq  reason: default package */
/* loaded from: classes2.dex */
public final class aacq {
    public static final aacq a = new aacq();
    private final dbsg<dehn<aaco>> b;

    private aacq() {
        this.b = dbpy.a;
    }

    public aacq(dehn<aaco> dehnVar) {
        this.b = dbsg.i(dehnVar);
    }

    public final boolean a() {
        return this.b.a();
    }

    public final dehn<aaco> b() {
        if (!a()) {
            return deha.b(new RuntimeException("CacheLookup's response should only be accessed if there is a cache hit."));
        }
        return this.b.b();
    }
}
