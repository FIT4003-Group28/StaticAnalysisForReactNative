package defpackage;

import android.content.res.Resources;
import com.google.android.apps.gmm.locationsharing.api.Profile;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aitp  reason: default package */
/* loaded from: classes2.dex */
class aitp implements aiot {
    public dbsg<Profile> a;
    private final Resources b;
    private final aito c;

    public aitp(dbsg<Profile> dbsgVar, Resources resources, aito aitoVar) {
        this.a = dbsgVar;
        this.b = resources;
        this.c = aitoVar;
    }

    @Override // defpackage.aiot
    public CharSequence a() {
        if (!this.a.a() || !this.a.b().b().a()) {
            return this.b.getString(R.string.MOD_SHARE_LOCATION_BUTTON_NO_PEERSON);
        }
        return ajsb.a(this.b, alp.a(), R.string.MOD_SHARE_LOCATION_BUTTON_WITH_PEERSON, this.a.b().b().b());
    }

    @Override // defpackage.aiot
    public cqkl b() {
        if (this.a.a()) {
            this.c.g();
        }
        return cqkl.a;
    }
}
