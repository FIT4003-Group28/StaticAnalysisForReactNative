package defpackage;

import com.google.android.libraries.social.populous.core.AutoValue_ProfileId;
import com.google.android.libraries.social.populous.core.PersonFieldMetadata;
import com.google.android.libraries.social.populous.core.ProfileId;
/* compiled from: PG */
/* renamed from: cyce  reason: default package */
/* loaded from: classes5.dex */
public final class cyce extends cygk {
    private CharSequence a;
    private PersonFieldMetadata b;

    @Override // defpackage.cygk
    protected final dbsg<PersonFieldMetadata> a() {
        PersonFieldMetadata personFieldMetadata = this.b;
        return personFieldMetadata == null ? dbpy.a : dbsg.i(personFieldMetadata);
    }

    @Override // defpackage.cygk, defpackage.cyeo
    /* renamed from: c */
    public final void d(PersonFieldMetadata personFieldMetadata) {
        this.b = personFieldMetadata;
    }

    @Override // defpackage.cygk
    public final void e(CharSequence charSequence) {
        if (charSequence != null) {
            this.a = charSequence;
            return;
        }
        throw new NullPointerException("Null value");
    }

    @Override // defpackage.cygk
    protected final ProfileId b() {
        String str = this.a == null ? " value" : "";
        if (this.b == null) {
            str = str.concat(" metadata");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new AutoValue_ProfileId(this.a, this.b);
    }
}
