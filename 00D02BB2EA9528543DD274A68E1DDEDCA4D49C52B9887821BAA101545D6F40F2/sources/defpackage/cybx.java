package defpackage;

import com.google.android.libraries.social.populous.core.AutoValue_Email;
import com.google.android.libraries.social.populous.core.Email;
import com.google.android.libraries.social.populous.core.PersonFieldMetadata;
/* compiled from: PG */
/* renamed from: cybx  reason: default package */
/* loaded from: classes5.dex */
public final class cybx extends cyey {
    public Email.ExtendedData a;
    private CharSequence b;
    private PersonFieldMetadata c;
    private dcdc<Email.Certificate> d;

    @Override // defpackage.cyey
    protected final dbsg<PersonFieldMetadata> a() {
        PersonFieldMetadata personFieldMetadata = this.c;
        return personFieldMetadata == null ? dbpy.a : dbsg.i(personFieldMetadata);
    }

    @Override // defpackage.cyey
    public final void c(dcdc<Email.Certificate> dcdcVar) {
        if (dcdcVar != null) {
            this.d = dcdcVar;
            return;
        }
        throw new NullPointerException("Null certificates");
    }

    @Override // defpackage.cyey, defpackage.cyeo
    /* renamed from: e */
    public final void d(PersonFieldMetadata personFieldMetadata) {
        if (personFieldMetadata != null) {
            this.c = personFieldMetadata;
            return;
        }
        throw new NullPointerException("Null metadata");
    }

    @Override // defpackage.cyey
    public final void f(CharSequence charSequence) {
        if (charSequence != null) {
            this.b = charSequence;
            return;
        }
        throw new NullPointerException("Null value");
    }

    @Override // defpackage.cyey
    protected final Email b() {
        String str = this.b == null ? " value" : "";
        if (this.c == null) {
            str = str.concat(" metadata");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" certificates");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new AutoValue_Email(this.b, this.c, this.a, this.d);
    }
}
