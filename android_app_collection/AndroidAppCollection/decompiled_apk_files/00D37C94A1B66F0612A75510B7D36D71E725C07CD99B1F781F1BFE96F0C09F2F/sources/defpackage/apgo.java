package defpackage;
/* compiled from: PG */
/* renamed from: apgo  reason: default package */
/* loaded from: classes.dex */
public enum apgo implements aopm {
    ICON_IMAGE_STYLE_DEFAULT(0),
    ICON_IMAGE_STYLE_SCALE(1),
    ICON_IMAGE_STYLE_CROP(2);
    
    private final int e;

    apgo(int i) {
        this.e = i;
    }

    public static aopo a() {
        return apfa.n;
    }

    public static apgo b(int i) {
        if (i != 0) {
            if (i == 1) {
                return ICON_IMAGE_STYLE_SCALE;
            }
            if (i == 2) {
                return ICON_IMAGE_STYLE_CROP;
            }
            return null;
        }
        return ICON_IMAGE_STYLE_DEFAULT;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
