package defpackage;

import com.google.android.libraries.social.populous.core.Email;
import com.google.android.libraries.social.populous.core.PersonFieldMetadata;
/* compiled from: PG */
/* renamed from: cyvy  reason: default package */
/* loaded from: classes5.dex */
public abstract class cyvy {
    public static cyvx i() {
        cyuo cyuoVar = new cyuo();
        cyuoVar.e(dcdc.e());
        cyuoVar.i(cyxg.a);
        return cyuoVar;
    }

    public abstract cyfj a();

    public abstract String b();

    public abstract PersonFieldMetadata c();

    public abstract String d();

    @dzsi
    public abstract Email.ExtendedData e();

    public abstract dcdc<Email.Certificate> f();

    public abstract cyxg g();

    public abstract String h();

    public final cygg j() {
        cyge c = cygg.c();
        c.c(a().e);
        c.b(b());
        return c.a();
    }
}
