package defpackage;

import com.google.android.libraries.social.populous.core.AutoValue_InAppNotificationTarget;
import com.google.android.libraries.social.populous.core.ContactMethodField;
import com.google.android.libraries.social.populous.core.InAppNotificationTarget;
import com.google.android.libraries.social.populous.core.PersonFieldMetadata;
/* compiled from: PG */
/* renamed from: cyca  reason: default package */
/* loaded from: classes5.dex */
public final class cyca extends cyfi {
    public String a;
    public int b;
    private cyep c;
    private PersonFieldMetadata d;
    private dcdc<ContactMethodField> e;
    private CharSequence f;

    public cyca() {
    }

    public cyca(InAppNotificationTarget inAppNotificationTarget) {
        this.c = inAppNotificationTarget.SA();
        this.d = inAppNotificationTarget.b();
        this.b = inAppNotificationTarget.g();
        this.e = inAppNotificationTarget.d();
        this.a = inAppNotificationTarget.e();
        this.f = inAppNotificationTarget.a();
    }

    @Override // defpackage.cyfi
    protected final dbsg<PersonFieldMetadata> a() {
        PersonFieldMetadata personFieldMetadata = this.d;
        return personFieldMetadata == null ? dbpy.a : dbsg.i(personFieldMetadata);
    }

    @Override // defpackage.cyfi
    protected final dbsg<dcdc<ContactMethodField>> b() {
        dcdc<ContactMethodField> dcdcVar = this.e;
        return dcdcVar == null ? dbpy.a : dbsg.i(dcdcVar);
    }

    @Override // defpackage.cyfi, defpackage.cyeo
    /* renamed from: e */
    public final void d(PersonFieldMetadata personFieldMetadata) {
        this.d = personFieldMetadata;
    }

    @Override // defpackage.cyfi
    public final void f(dcdc<ContactMethodField> dcdcVar) {
        if (dcdcVar != null) {
            this.e = dcdcVar;
            return;
        }
        throw new NullPointerException("Null originatingFields");
    }

    @Override // defpackage.cyfi
    public final void g(cyep cyepVar) {
        if (cyepVar != null) {
            this.c = cyepVar;
            return;
        }
        throw new NullPointerException("Null type");
    }

    @Override // defpackage.cyfi
    public final void h(CharSequence charSequence) {
        if (charSequence != null) {
            this.f = charSequence;
            return;
        }
        throw new NullPointerException("Null value");
    }

    @Override // defpackage.cyfi
    protected final InAppNotificationTarget c() {
        String str = this.c == null ? " type" : "";
        if (this.d == null) {
            str = str.concat(" metadata");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" originatingFields");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" value");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new AutoValue_InAppNotificationTarget(this.c, this.d, this.b, this.e, this.a, this.f);
    }
}
