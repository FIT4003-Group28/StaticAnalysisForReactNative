package defpackage;
/* compiled from: PG */
/* renamed from: cyoc  reason: default package */
/* loaded from: classes5.dex */
interface cyoc {
    public static final dsqg a;
    public static final dsqg b;
    public static final dcdc<String> c;
    public static final dcdc<String> d;
    public static final dcdc<String> e;
    public static final dcdc<String> f;
    public static final dcdc<String> g;

    static {
        dsqf bZ = dsqg.b.bZ();
        bZ.b("person.contact_group_membership");
        bZ.b("person.cover_photo");
        bZ.b("person.email");
        bZ.b("person.email.certificate");
        bZ.b("person.email.contact_group_preference");
        bZ.b("person.email.metadata.verified");
        bZ.b("person.gender");
        bZ.b("person.in_app_notification_target");
        bZ.b("person.in_app_notification_target.client_data");
        bZ.b("person.metadata");
        bZ.b("person.metadata.best_display_name");
        bZ.b("person.name");
        bZ.b("person.name.metadata.verified");
        bZ.b("person.person_id");
        bZ.b("person.phone");
        bZ.b("person.phone.metadata.verified");
        bZ.b("person.photo");
        bZ.b("person.sort_keys");
        a = bZ.bK();
        dsqf bZ2 = dsqg.b.bZ();
        bZ2.b("person.email");
        bZ2.b("person.email.certificate");
        bZ2.b("person.email.metadata.verified");
        bZ2.b("person.in_app_notification_target");
        bZ2.b("person.metadata");
        bZ2.b("person.name");
        bZ2.b("person.name.metadata.verified");
        bZ2.b("person.person_id");
        bZ2.b("person.phone");
        bZ2.b("person.phone.metadata.verified");
        bZ2.b("person.photo");
        b = bZ2.bK();
        c = dcdc.i("person.metadata", "person.name", "person.name.metadata.verified", "person.photo");
        d = dcdc.g("person.email", "person.email.metadata.verified");
        e = dcdc.f("person.email.certificate");
        f = dcdc.g("person.phone", "person.phone.metadata.verified");
        g = dcdc.f("person.in_app_notification_target");
    }
}
