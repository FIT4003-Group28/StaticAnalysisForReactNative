package defpackage;

import android.graphics.Color;
import java.util.EnumMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: zsz  reason: default package */
/* loaded from: classes4.dex */
public final class zsz {
    public static final Map a;
    public static final Map b;
    public static final znz d;
    public final acrr c;

    static {
        EnumMap enumMap = new EnumMap(axak.class);
        a = enumMap;
        EnumMap enumMap2 = new EnumMap(axak.class);
        b = enumMap2;
        d = new znz();
        enumMap.put((EnumMap) axak.CLASSIC, (axak) avxw.TEXT_STICKER_FONT_NAME_CLASSIC);
        enumMap.put((EnumMap) axak.LIGHT, (axak) avxw.TEXT_STICKER_FONT_NAME_LIGHT);
        enumMap.put((EnumMap) axak.HEAVY, (axak) avxw.TEXT_STICKER_FONT_NAME_HEAVY);
        enumMap.put((EnumMap) axak.MARKER, (axak) avxw.TEXT_STICKER_FONT_NAME_MARKER);
        enumMap.put((EnumMap) axak.BRUSH, (axak) avxw.TEXT_STICKER_FONT_NAME_BRUSH);
        enumMap.put((EnumMap) axak.TYPEWRITER, (axak) avxw.TEXT_STICKER_FONT_NAME_TYPEWRITER);
        enumMap2.put((EnumMap) axak.CLASSIC, (axak) avxx.TEXT_STICKER_FONT_STYLE_ROBOTO);
        enumMap2.put((EnumMap) axak.LIGHT, (axak) avxx.TEXT_STICKER_FONT_STYLE_QUICK_SAND_REGULAR);
        enumMap2.put((EnumMap) axak.HEAVY, (axak) avxx.TEXT_STICKER_FONT_STYLE_OSWALD_BOLD);
        enumMap2.put((EnumMap) axak.MARKER, (axak) avxx.TEXT_STICKER_FONT_STYLE_PERMANENT_MARKER);
        enumMap2.put((EnumMap) axak.BRUSH, (axak) avxx.TEXT_STICKER_FONT_STYLE_TEXT_PACIFICO);
        enumMap2.put((EnumMap) axak.TYPEWRITER, (axak) avxx.TEXT_STICKER_FONT_STYLE_TEXT_CUTIVE);
    }

    public zsz(acrr acrrVar) {
        this.c = acrrVar;
    }

    public static int a(aotk aotkVar) {
        if (aotkVar == null) {
            return 0;
        }
        return Color.argb((int) aotkVar.f, (int) aotkVar.c, (int) aotkVar.d, (int) aotkVar.e);
    }
}
