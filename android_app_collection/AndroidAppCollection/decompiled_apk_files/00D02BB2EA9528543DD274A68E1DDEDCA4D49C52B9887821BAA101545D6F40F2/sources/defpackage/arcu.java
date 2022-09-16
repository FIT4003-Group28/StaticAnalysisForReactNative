package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: arcu  reason: default package */
/* loaded from: classes2.dex */
public enum arcu {
    CHEVRON("Navigation chevron", 3),
    CHEVRON_DISC("Navigation chevron disc", 2),
    BEARINGLESS_CHEVRON("Navigation bearingless chevron", 3),
    DEBUG_CHEVRON("Navigation debug chevron", 3),
    DIM_CHEVRON("Navigation dim chevron", 3),
    DIM_CHEVRON_DISC("Navigation dim chevron disc", 2),
    DIM_BEARINGLESS_CHEVRON("Navigation dim bearingless chevron", 3),
    ASSISTED_DRIVE_AVAILABLE_DISC("Navigation iota available chevron disc", 1),
    ASSISTED_DRIVE_ENGAGED_DISC("Navigation iota engaged chevron disc", 1),
    ASSISTED_DRIVE_DRIVER_SUSPENDED_DISC("Navigation iota driver-suspended chevron disc", 1),
    ALTERNATE_LOCATION_HYPOTHESIS_CHEVRON("Alternate Hypothesis Chevron", 16);
    
    public final String l;
    public final int m;

    arcu(String str, int i) {
        this.l = str;
        this.m = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(arcw arcwVar) {
        switch (ordinal()) {
            case 0:
                return arcwVar.a;
            case 1:
                return arcwVar.c;
            case 2:
                return arcwVar.b;
            case 3:
                return arcwVar.a;
            case 4:
                return arcwVar.i;
            case 5:
                return arcwVar.k;
            case 6:
                return arcwVar.j;
            case 7:
                int i = arcwVar.m;
                if (i == 0) {
                    throw new NullPointerException("iota resource was not provisioned, was null");
                }
                return i;
            case 8:
                int i2 = arcwVar.l;
                if (i2 == 0) {
                    throw new NullPointerException("iota resource was not provisioned, was null");
                }
                return i2;
            case 9:
                int i3 = arcwVar.n;
                if (i3 == 0) {
                    throw new NullPointerException("iota resource was not provisioned, was null");
                }
                return i3;
            case 10:
                return R.drawable.breadcrumb_red_pointer;
            default:
                throw null;
        }
    }
}
