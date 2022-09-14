package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: ehb  reason: default package */
/* loaded from: classes6.dex */
public final class ehb extends Enum<ehb> {
    public static final ehb a;
    public static final ehb b;
    public static final ehb c;
    private static final /* synthetic */ ehb[] g;
    final boolean d;
    public final int e;
    public final int f;

    static {
        ehb ehbVar = new ehb("DEFAULT", 0, 250);
        a = ehbVar;
        ehb ehbVar2 = new ehb();
        b = ehbVar2;
        ehb ehbVar3 = new ehb("LONG_TRANSLATION", 2, 500);
        c = ehbVar3;
        g = new ehb[]{ehbVar, ehbVar2, ehbVar3};
    }

    private ehb(String str, int i, int i2) {
        this.e = i2;
        this.f = 0;
        this.d = false;
    }

    public static ehb[] values() {
        return (ehb[]) g.clone();
    }

    private ehb() {
        this.e = 100;
        this.f = 150;
        this.d = true;
    }
}
