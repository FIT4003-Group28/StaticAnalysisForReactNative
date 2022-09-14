package defpackage;
/* compiled from: PG */
/* renamed from: drga  reason: default package */
/* loaded from: classes6.dex */
public enum drga {
    MOD_CAROUSEL,
    COMPONENTDEFINITION_NOT_SET;

    public static drga a(int i) {
        if (i != 0) {
            if (i == 1) {
                return MOD_CAROUSEL;
            }
            return null;
        }
        return COMPONENTDEFINITION_NOT_SET;
    }
}
