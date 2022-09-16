package defpackage;
/* compiled from: PG */
/* renamed from: afgp  reason: default package */
/* loaded from: classes.dex */
public final class afgp implements afgq {
    final int a;

    public afgp(int i) {
        this.a = i <= 0 ? 1 : i;
    }

    @Override // defpackage.afgq
    public final int a(int i, ayy ayyVar) {
        return (i < 0 || ayyVar == null) ? this.a : Math.max(Math.min(this.a, ayyVar.a - i), 1);
    }
}
