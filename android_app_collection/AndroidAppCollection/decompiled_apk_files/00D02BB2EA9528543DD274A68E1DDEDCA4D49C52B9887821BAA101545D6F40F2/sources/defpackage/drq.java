package defpackage;

import android.os.Bundle;
import com.google.android.apps.gmm.locationsharing.api.PersonId;
import java.io.Serializable;
/* compiled from: PG */
/* renamed from: drq  reason: default package */
/* loaded from: classes6.dex */
public abstract class drq implements Serializable {
    public static drq a(bwrs<ilo> bwrsVar) {
        dbsk.s(bwrsVar.c());
        drr drrVar = new drr();
        drrVar.c = 1;
        drrVar.a = dbsg.i(bwrsVar);
        drrVar.b(false);
        return drrVar.a();
    }

    @dzsi
    public static drq f(Bundle bundle, String str, bwqv bwqvVar) {
        return (drq) bwqvVar.d(drq.class, bundle, str);
    }

    public abstract dbsg<bwrs<ilo>> b();

    public abstract dbsg<PersonId> c();

    public abstract boolean d();

    public abstract drp e();

    public abstract int g();
}
