package defpackage;

import android.content.res.Resources;
import com.google.android.apps.gmm.locationsharing.api.Profile;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ajos  reason: default package */
/* loaded from: classes2.dex */
public class ajos implements ajop {
    public cqtd a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final Resources f;
    private final aikp g;

    public ajos(Profile profile, Resources resources, aikp aikpVar) {
        dbsk.m(profile.b().a(), "Expected profile to have a display name.");
        dbsk.m(profile.e().a(), "Expected profile to have a display email.");
        alp a = alp.a();
        String b = a.b(profile.b().b());
        this.b = b;
        this.c = a.b(profile.c().c(b));
        this.d = a.b(profile.e().b());
        String c = profile.d().c("");
        this.e = c;
        this.f = resources;
        this.g = aikpVar;
        this.a = aikpVar.b(c, aiko.COLOR, new dbsz(this) { // from class: ajor
            private final ajos a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                ajos ajosVar = this.a;
                ajosVar.a = (cqtd) obj;
                cqkx.p(ajosVar);
            }
        });
    }

    @Override // defpackage.ajop
    public String a() {
        return this.f.getString(R.string.REQUEST_LOCATION_INCOMING_REQUEST_DIALOG_DESCRIPTION, this.c);
    }

    @Override // defpackage.ajop
    public String b() {
        return this.f.getString(R.string.REQUEST_LOCATION_INCOMING_REQUEST_DIALOG_CONTINUE, f());
    }

    @Override // defpackage.ajop
    public cqtd c() {
        return this.a;
    }

    @Override // defpackage.ajop
    public String d() {
        return this.b;
    }

    @Override // defpackage.ajop
    public String e() {
        return this.d;
    }

    public String f() {
        return this.f.getString(R.string.REQUEST_LOCATION_CONTINUE);
    }
}
