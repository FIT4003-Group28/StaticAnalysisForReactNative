package defpackage;
/* compiled from: PG */
/* renamed from: azrb  reason: default package */
/* loaded from: classes3.dex */
public class azrb {
    @dzsi
    public final baad a;
    public final int b;

    private azrb(int i, @dzsi baad baadVar) {
        this.b = i;
        this.a = baadVar;
    }

    public static azrb b(int i, baad baadVar) {
        return new azrb(i, baadVar);
    }

    public static azrb c(int i) {
        return new azrb(i, null);
    }

    public final boolean a() {
        return this.a == null;
    }
}
