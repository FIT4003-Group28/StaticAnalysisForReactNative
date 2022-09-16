package defpackage;

import com.google.android.apps.gmm.locationsharing.api.AutoValue_Profile;
import com.google.android.apps.gmm.locationsharing.api.PersonId;
import com.google.android.apps.gmm.locationsharing.api.Profile;
/* compiled from: PG */
/* renamed from: ahuw  reason: default package */
/* loaded from: classes2.dex */
public final class ahuw extends ahwk {
    public PersonId a;
    public dbsg<String> b;
    public dbsg<String> c;
    public dbsg<String> d;
    public dbsg<String> e;

    public ahuw() {
        this.b = dbpy.a;
        this.c = dbpy.a;
        this.d = dbpy.a;
        this.e = dbpy.a;
    }

    public ahuw(Profile profile) {
        this.b = dbpy.a;
        this.c = dbpy.a;
        this.d = dbpy.a;
        this.e = dbpy.a;
        this.a = profile.a();
        this.b = profile.b();
        this.c = profile.c();
        this.d = profile.d();
        this.e = profile.e();
    }

    @Override // defpackage.ahwk
    public final void b(dbsg<String> dbsgVar) {
        this.d = dbsgVar;
    }

    @Override // defpackage.ahwk
    public final void c(dbsg<String> dbsgVar) {
        this.e = dbsgVar;
    }

    @Override // defpackage.ahwk
    public final void d(dbsg<String> dbsgVar) {
        this.b = dbsgVar;
    }

    @Override // defpackage.ahwk
    public final void e(dbsg<String> dbsgVar) {
        this.c = dbsgVar;
    }

    @Override // defpackage.ahwk
    public final Profile a() {
        String str = this.a == null ? " personId" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new AutoValue_Profile(this.a, this.b, this.c, this.d, this.e);
    }
}
