package defpackage;
/* compiled from: PG */
/* renamed from: araf  reason: default package */
/* loaded from: classes2.dex */
public enum araf {
    OPTIMIZED(false, true),
    NO_LOCATION_DEVICE(false, false),
    ANOTHER_DIALOG_SHOWN(false, false),
    NOT_OPTIMIZED_OR_DISABLED(true, false),
    RECENTLY_SHOWN(false, true),
    CANNOT_BE_SHOWN(false, true),
    SYSTEM_FAILURE(false, true),
    DISABLED_FOR_TESTING(false, true);
    
    public final boolean i;
    public final boolean j;

    araf(boolean z, boolean z2) {
        this.i = z;
        this.j = z2;
    }
}
