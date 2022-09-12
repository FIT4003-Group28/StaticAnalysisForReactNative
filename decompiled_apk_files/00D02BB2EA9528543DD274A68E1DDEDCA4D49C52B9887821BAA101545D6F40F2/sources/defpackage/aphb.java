package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aphb  reason: default package */
/* loaded from: classes2.dex */
public final class aphb implements apfz {
    private String a;
    private ddho b;
    private final boolean c;

    public aphb(Resources resources, aowo aowoVar, boolean z) {
        int ordinal = aowoVar.ordinal();
        if (ordinal == 0) {
            this.a = resources.getString(R.string.MAPS_ACTIVITY_DAY_TAB_TITLE);
            this.b = dtyi.bb;
        } else if (ordinal == 1) {
            this.a = resources.getString(R.string.MAPS_ACTIVITY_PLACES_TAB_TITLE);
            this.b = dtyi.bc;
        } else if (ordinal == 2) {
            this.a = resources.getString(R.string.MAPS_ACTIVITY_CITIES_TAB_TITLE);
            this.b = dtyi.aZ;
        } else if (ordinal == 3) {
            this.a = resources.getString(R.string.MAPS_ACTIVITY_COUNTRIES_TAB_TITLE);
            this.b = dtyi.ba;
        }
        this.c = z;
    }

    @Override // defpackage.apfz
    public Boolean a() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.apfz
    public String b() {
        return this.a;
    }

    @Override // defpackage.apfz
    public cjtd c() {
        return cjtd.a(this.b);
    }
}
