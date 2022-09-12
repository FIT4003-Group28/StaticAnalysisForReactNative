package defpackage;
/* compiled from: PG */
/* renamed from: dgox  reason: default package */
/* loaded from: classes6.dex */
public enum dgox implements dsrb {
    UNKNOWN_QUALITATIVE_SCALE_ANSWER(0),
    VERY_SATISFIED(1),
    SATISFIED(2),
    NEUTRAL(3),
    DISSATISFIED(4),
    VERY_DISSATISFIED(5);
    
    public final int g;

    dgox(int i) {
        this.g = i;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
