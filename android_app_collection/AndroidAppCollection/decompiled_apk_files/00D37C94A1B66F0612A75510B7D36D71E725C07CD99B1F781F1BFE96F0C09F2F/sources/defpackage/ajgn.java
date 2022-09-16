package defpackage;
/* compiled from: PG */
/* renamed from: ajgn  reason: default package */
/* loaded from: classes.dex */
enum ajgn {
    LIGHT(300, "Light"),
    REGULAR(400, "Regular"),
    MEDIUM(500, "Medium"),
    SEMIBOLD(600, "SemiBold"),
    BOLD(700, "Bold"),
    EXTRABOLD(800, "ExtraBold"),
    BLACK(900, "Black");
    
    final int h;
    final String i;

    ajgn(int i, String str) {
        this.h = i;
        this.i = str.length() != 0 ? "YouTubeSans-".concat(str) : new String("YouTubeSans-");
    }
}
