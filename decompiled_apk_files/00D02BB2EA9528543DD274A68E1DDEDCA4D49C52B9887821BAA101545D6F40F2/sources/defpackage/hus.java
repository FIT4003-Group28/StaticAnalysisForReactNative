package defpackage;
/* compiled from: PG */
/* renamed from: hus  reason: default package */
/* loaded from: classes.dex */
enum hus {
    PORTRAIT_NO_NAV(2, false),
    LANDSCAPE_NO_NAV(3, false),
    PORTRAIT_WITH_NAV(2, true),
    LANDSCAPE_WITH_NAV(3, true);
    
    public final boolean e;
    public final int f;

    hus(int i, boolean z) {
        this.f = i;
        this.e = z;
    }
}
