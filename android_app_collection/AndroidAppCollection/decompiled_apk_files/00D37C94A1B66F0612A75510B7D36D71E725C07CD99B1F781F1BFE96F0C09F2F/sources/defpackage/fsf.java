package defpackage;
/* compiled from: PG */
/* renamed from: fsf  reason: default package */
/* loaded from: classes3.dex */
public final class fsf {
    public static final fsf a = new fsf(0);
    public static final fsf b = new fsf(2);
    public static final fsf c = new fsf(1);
    private final int d;

    private fsf(int i) {
        this.d = i;
    }

    public final boolean a() {
        return this.d == 1;
    }

    public final boolean b() {
        return this.d == 2;
    }

    public final String toString() {
        int i = this.d;
        return i != 0 ? i != 1 ? "HIDE_AFTER_DELAY_THEN_REVEAL_ON_ANY_PULL" : "HIDDEN_REVEAL_ON_ANY_PULL_ACTION" : "ALWAYS_SHOWN";
    }
}
