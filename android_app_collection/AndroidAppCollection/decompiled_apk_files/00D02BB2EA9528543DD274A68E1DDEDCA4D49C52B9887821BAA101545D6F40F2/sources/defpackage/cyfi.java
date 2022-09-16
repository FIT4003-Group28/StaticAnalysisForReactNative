package defpackage;

import com.google.android.libraries.social.populous.core.C$AutoValue_PeopleApiAffinity;
import com.google.android.libraries.social.populous.core.ContactMethodField;
import com.google.android.libraries.social.populous.core.InAppNotificationTarget;
import com.google.android.libraries.social.populous.core.PeopleApiAffinity;
import com.google.android.libraries.social.populous.core.PersonFieldMetadata;
/* compiled from: PG */
/* renamed from: cyfi  reason: default package */
/* loaded from: classes5.dex */
public abstract class cyfi implements cyeo {
    protected abstract dbsg<PersonFieldMetadata> a();

    protected abstract dbsg<dcdc<ContactMethodField>> b();

    protected abstract InAppNotificationTarget c();

    @Override // defpackage.cyeo
    public /* bridge */ /* synthetic */ void d(PersonFieldMetadata personFieldMetadata) {
        throw null;
    }

    public abstract void e(PersonFieldMetadata personFieldMetadata);

    public abstract void f(dcdc<ContactMethodField> dcdcVar);

    public abstract void g(cyep cyepVar);

    public abstract void h(CharSequence charSequence);

    @Override // defpackage.cyeo
    /* renamed from: j */
    public final InAppNotificationTarget i() {
        if (!a().a()) {
            cygd l = PersonFieldMetadata.l();
            l.f = PeopleApiAffinity.e;
            l.g = ((C$AutoValue_PeopleApiAffinity) PeopleApiAffinity.e).a;
            e(l.i());
        }
        if (!b().a()) {
            f(dcdc.e());
        }
        return c();
    }
}
