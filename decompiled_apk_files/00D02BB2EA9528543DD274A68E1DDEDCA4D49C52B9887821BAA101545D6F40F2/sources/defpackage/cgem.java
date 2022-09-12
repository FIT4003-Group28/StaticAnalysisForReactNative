package defpackage;
/* compiled from: PG */
/* renamed from: cgem  reason: default package */
/* loaded from: classes4.dex */
public enum cgem {
    UNKNOWN(false, false),
    CONTRIBUTIONS_PAGE(false, false),
    SHORTCUT_INTENT(false, false),
    URL_INTENT(true, true),
    NOTIFICATION(true, true),
    DOOR_TO_DOOR_NOTIFICATION(true, true);
    
    public final boolean g;
    public final boolean h;

    cgem(boolean z, boolean z2) {
        this.g = z;
        this.h = z2;
    }
}
