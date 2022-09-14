package defpackage;

import com.google.android.libraries.social.populous.core.ContactMethodField;
import com.google.android.libraries.social.populous.core.SessionContext;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cygq  reason: default package */
/* loaded from: classes5.dex */
public abstract class cygq {
    public final ArrayList<ContactMethodField> b = new ArrayList<>();
    public final ArrayList<ContactMethodField> c = new ArrayList<>();
    public final ArrayList<ContactMethodField> d = new ArrayList<>();
    public final ArrayList<ContactMethodField> e = new ArrayList<>();
    public Long f = null;

    public static void g(@dzsi Long l) {
        if (l != null) {
            dbsk.b(((long) ((double) l.longValue())) == l.longValue(), "Long SubmitSessionId should be able to be represented as an IEEE 64-bit floating point without losing precision");
        }
    }

    public abstract SessionContext a();

    public abstract void b(dcdc<ContactMethodField> dcdcVar);

    public abstract void c(dcdc<ContactMethodField> dcdcVar);

    public abstract void d(dcdc<ContactMethodField> dcdcVar);

    public abstract void e(dcdc<ContactMethodField> dcdcVar);

    public final SessionContext f() {
        d(dcdc.r(this.b));
        b(dcdc.r(this.c));
        e(dcdc.r(this.d));
        c(dcdc.r(this.e));
        SessionContext a = a();
        a.f = this.f;
        return a;
    }

    public final void h(dcdc<ContactMethodField> dcdcVar) {
        dbsk.t(dcdcVar, "field is a required parameter");
        dbsk.b(!dcdcVar.isEmpty(), "fields must contain elements");
        this.e.addAll(dcdcVar);
    }
}
