package defpackage;

import com.google.android.libraries.social.populous.AutoValue_Person;
import com.google.android.libraries.social.populous.Person;
import com.google.android.libraries.social.populous.PersonMetadata;
import com.google.android.libraries.social.populous.core.Email;
import com.google.android.libraries.social.populous.core.InAppNotificationTarget;
import com.google.android.libraries.social.populous.core.Name;
import com.google.android.libraries.social.populous.core.PersonExtendedData;
import com.google.android.libraries.social.populous.core.Phone;
import com.google.android.libraries.social.populous.core.Photo;
/* compiled from: PG */
/* renamed from: cxxi  reason: default package */
/* loaded from: classes5.dex */
public final class cxxi extends cxzx {
    public String a;
    public PersonExtendedData b;
    public dsgo c;
    private PersonMetadata d;
    private dcdc<Name> e;
    private dcdc<Email> f;
    private dcdc<Phone> g;
    private dcdc<Photo> h;
    private dcdc<InAppNotificationTarget> i;
    private Boolean j;

    @Override // defpackage.cxzx
    public final void b(dcdc<Email> dcdcVar) {
        if (dcdcVar != null) {
            this.f = dcdcVar;
            return;
        }
        throw new NullPointerException("Null emailsList");
    }

    @Override // defpackage.cxzx
    public final void c(dcdc<InAppNotificationTarget> dcdcVar) {
        if (dcdcVar != null) {
            this.i = dcdcVar;
            return;
        }
        throw new NullPointerException("Null inAppNotificationTargetsList");
    }

    @Override // defpackage.cxzx
    public final void d(PersonMetadata personMetadata) {
        if (personMetadata != null) {
            this.d = personMetadata;
            return;
        }
        throw new NullPointerException("Null metadata");
    }

    @Override // defpackage.cxzx
    public final void e(dcdc<Name> dcdcVar) {
        if (dcdcVar != null) {
            this.e = dcdcVar;
            return;
        }
        throw new NullPointerException("Null namesList");
    }

    @Override // defpackage.cxzx
    public final void f(dcdc<Phone> dcdcVar) {
        if (dcdcVar != null) {
            this.g = dcdcVar;
            return;
        }
        throw new NullPointerException("Null phonesList");
    }

    @Override // defpackage.cxzx
    public final void g(dcdc<Photo> dcdcVar) {
        if (dcdcVar != null) {
            this.h = dcdcVar;
            return;
        }
        throw new NullPointerException("Null photosList");
    }

    @Override // defpackage.cxzx
    public final void h(boolean z) {
        this.j = Boolean.valueOf(z);
    }

    @Override // defpackage.cxzx
    public final Person a() {
        String str = this.d == null ? " metadata" : "";
        if (this.e == null) {
            str = str.concat(" namesList");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" emailsList");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" phonesList");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" photosList");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" inAppNotificationTargetsList");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" toPromoteNameAndPhotoForFirstContactMethod");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new AutoValue_Person(this.d, this.e, this.f, this.g, this.h, this.i, this.a, this.b, this.j.booleanValue(), this.c);
    }
}
