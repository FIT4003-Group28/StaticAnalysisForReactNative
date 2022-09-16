package defpackage;
/* compiled from: PG */
/* renamed from: fsn  reason: default package */
/* loaded from: classes3.dex */
public final class fsn {
    public static final fsn a = new fsn(0);
    public static final fsn b = new fsn(2);
    public static final fsn c = new fsn(1);
    public final int d;

    private fsn(int i) {
        this.d = i;
    }

    public final boolean a() {
        return this.d == 1;
    }

    public final String toString() {
        int i = this.d;
        return i != 0 ? i != 1 ? "HIDE_AFTER_DELAY_THEN_REVEAL_ON_ANY_PULL" : "HIDDEN_REVEAL_ON_ANY_PULL_ACTION" : "ALWAYS_SHOWN";
    }
}
