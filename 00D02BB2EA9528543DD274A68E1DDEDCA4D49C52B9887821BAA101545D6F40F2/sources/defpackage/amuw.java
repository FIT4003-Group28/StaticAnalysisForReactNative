package defpackage;
/* compiled from: PG */
/* renamed from: amuw  reason: default package */
/* loaded from: classes2.dex */
public final class amuw {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;
    @dzsi
    private final dbty<dbsg<amul>> e;

    public amuw(amuv amuvVar) {
        this.a = amuvVar.a;
        this.b = amuvVar.b;
        this.c = amuvVar.c;
        this.e = amuvVar.e;
        this.d = amuvVar.d;
    }

    public final boolean a() {
        return this.a == Integer.MAX_VALUE;
    }

    @dzsi
    public final amul b() {
        dbty<dbsg<amul>> dbtyVar = this.e;
        if (dbtyVar == null) {
            return null;
        }
        return dbtyVar.a().f();
    }
}
