package defpackage;
/* compiled from: PG */
/* renamed from: aovv  reason: default package */
/* loaded from: classes.dex */
public enum aovv implements aopm {
    ACCESSIBILITY_SERVICE_TYPES_UNSPECIFIED(0),
    ACCESSIBILITY_SERVICE_TYPES_FEEDBACK_AUDIBLE(1),
    ACCESSIBILITY_SERVICE_TYPES_FEEDBACK_GENERIC(2),
    ACCESSIBILITY_SERVICE_TYPES_FEEDBACK_HAPTIC(3),
    ACCESSIBILITY_SERVICE_TYPES_FEEDBACK_SPOKEN(4),
    ACCESSIBILITY_SERVICE_TYPES_FEEDBACK_VISUAL(5),
    ACCESSIBILITY_SERVICE_TYPES_FEEDBACK_BRAILLE(6);
    
    public final int h;

    aovv(int i2) {
        this.h = i2;
    }

    public static aopo a() {
        return aotr.n;
    }

    public static aovv b(int i2) {
        switch (i2) {
            case 0:
                return ACCESSIBILITY_SERVICE_TYPES_UNSPECIFIED;
            case 1:
                return ACCESSIBILITY_SERVICE_TYPES_FEEDBACK_AUDIBLE;
            case 2:
                return ACCESSIBILITY_SERVICE_TYPES_FEEDBACK_GENERIC;
            case 3:
                return ACCESSIBILITY_SERVICE_TYPES_FEEDBACK_HAPTIC;
            case 4:
                return ACCESSIBILITY_SERVICE_TYPES_FEEDBACK_SPOKEN;
            case 5:
                return ACCESSIBILITY_SERVICE_TYPES_FEEDBACK_VISUAL;
            case 6:
                return ACCESSIBILITY_SERVICE_TYPES_FEEDBACK_BRAILLE;
            default:
                return null;
        }
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
