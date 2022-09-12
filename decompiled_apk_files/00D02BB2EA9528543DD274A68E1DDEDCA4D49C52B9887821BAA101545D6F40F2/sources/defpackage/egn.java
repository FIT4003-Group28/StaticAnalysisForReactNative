package defpackage;
/* compiled from: PG */
/* renamed from: egn  reason: default package */
/* loaded from: classes.dex */
public enum egn {
    ONE_FIFTH_EXPANDED_MAP(3.0f),
    ONE_THIRD_EXPANDED_MAP(1.7777778f),
    TWO_FIFTHS_EXPANDED_MAP(1.5f),
    HALF_EXPANDED_MAP(1.125f),
    THREE_FIFTHS_EXPANDED_MAP(1.0f);
    
    private final float f;

    egn(float f) {
        this.f = f;
    }

    public final float a(float f) {
        return f / this.f;
    }
}
