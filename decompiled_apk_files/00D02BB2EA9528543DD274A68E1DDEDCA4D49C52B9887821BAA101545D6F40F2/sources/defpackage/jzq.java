package defpackage;
/* compiled from: PG */
/* renamed from: jzq  reason: default package */
/* loaded from: classes7.dex */
public final class jzq {
    public final boolean a;
    public final boolean b;
    private final boolean c;

    public jzq(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final String toString() {
        return String.format("isKeyboardRestricted: %b, isConfigRestricted: %b, isMapInteractionRestricted: %b", Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c));
    }
}
