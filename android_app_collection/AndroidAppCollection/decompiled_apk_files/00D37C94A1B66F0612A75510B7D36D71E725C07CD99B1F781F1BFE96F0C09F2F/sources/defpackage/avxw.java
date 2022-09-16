package defpackage;
/* compiled from: PG */
/* renamed from: avxw  reason: default package */
/* loaded from: classes2.dex */
public enum avxw implements aopm {
    TEXT_STICKER_FONT_NAME_UNKNOWN(0),
    TEXT_STICKER_FONT_NAME_CLASSIC(1),
    TEXT_STICKER_FONT_NAME_LIGHT(2),
    TEXT_STICKER_FONT_NAME_HEAVY(3),
    TEXT_STICKER_FONT_NAME_MARKER(4),
    TEXT_STICKER_FONT_NAME_BRUSH(5),
    TEXT_STICKER_FONT_NAME_TYPEWRITER(6);
    
    public final int h;

    avxw(int i2) {
        this.h = i2;
    }

    public static aopo a() {
        return avxs.h;
    }

    public static avxw b(int i2) {
        switch (i2) {
            case 0:
                return TEXT_STICKER_FONT_NAME_UNKNOWN;
            case 1:
                return TEXT_STICKER_FONT_NAME_CLASSIC;
            case 2:
                return TEXT_STICKER_FONT_NAME_LIGHT;
            case 3:
                return TEXT_STICKER_FONT_NAME_HEAVY;
            case 4:
                return TEXT_STICKER_FONT_NAME_MARKER;
            case 5:
                return TEXT_STICKER_FONT_NAME_BRUSH;
            case 6:
                return TEXT_STICKER_FONT_NAME_TYPEWRITER;
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
