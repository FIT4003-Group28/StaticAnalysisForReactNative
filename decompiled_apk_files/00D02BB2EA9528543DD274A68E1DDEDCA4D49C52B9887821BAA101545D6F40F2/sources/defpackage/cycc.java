package defpackage;

import com.google.android.libraries.social.populous.core.AutoValue_Phone;
import com.google.android.libraries.social.populous.core.PersonFieldMetadata;
import com.google.android.libraries.social.populous.core.Phone;
/* compiled from: PG */
/* renamed from: cycc  reason: default package */
/* loaded from: classes5.dex */
public final class cycc extends cygh {
    public CharSequence a;
    private CharSequence b;
    private PersonFieldMetadata c;

    @Override // defpackage.cygh
    protected final dbsg<PersonFieldMetadata> a() {
        PersonFieldMetadata personFieldMetadata = this.c;
        return personFieldMetadata == null ? dbpy.a : dbsg.i(personFieldMetadata);
    }

    @Override // defpackage.cygh, defpackage.cyeo
    /* renamed from: c */
    public final void d(PersonFieldMetadata personFieldMetadata) {
        if (personFieldMetadata != null) {
            this.c = personFieldMetadata;
            return;
        }
        throw new NullPointerException("Null metadata");
    }

    @Override // defpackage.cygh
    public final void e(CharSequence charSequence) {
        if (charSequence != null) {
            this.b = charSequence;
            return;
        }
        throw new NullPointerException("Null value");
    }

    @Override // defpackage.cygh
    protected final Phone b() {
        String str = this.b == null ? " value" : "";
        if (this.c == null) {
            str = str.concat(" metadata");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new AutoValue_Phone(this.b, this.a, this.c);
    }
}
