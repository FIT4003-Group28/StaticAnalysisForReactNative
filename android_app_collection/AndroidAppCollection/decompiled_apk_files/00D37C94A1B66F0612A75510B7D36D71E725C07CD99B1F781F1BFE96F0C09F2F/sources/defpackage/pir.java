package defpackage;
/* compiled from: PG */
/* renamed from: pir  reason: default package */
/* loaded from: classes4.dex */
public final class pir extends RuntimeException {
    public final int a;

    public pir(int i) {
        super(i != 1 ? i != 2 ? "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.");
        this.a = i;
    }
}
