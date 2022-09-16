package defpackage;
/* compiled from: PG */
/* renamed from: amva  reason: default package */
/* loaded from: classes2.dex */
public final class amva {
    public final amvb a;
    public final boolean b;

    public amva(amvb amvbVar, boolean z) {
        this.a = amvbVar;
        this.b = z;
    }

    public final int a() {
        amvb amvbVar = this.a;
        int i = amvbVar.a;
        return i == 0 ? amvbVar.d - 1 : amvbVar.d - i;
    }

    public final String toString() {
        return "StopAfterLocation{" + this.a + ", atStop=" + this.b + ", remainingStopsCount=" + a() + '}';
    }
}
