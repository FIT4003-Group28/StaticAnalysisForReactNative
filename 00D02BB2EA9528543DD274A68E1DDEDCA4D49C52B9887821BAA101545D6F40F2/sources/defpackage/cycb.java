package defpackage;

import com.google.android.libraries.social.populous.core.AutoValue_Name;
import com.google.android.libraries.social.populous.core.Name;
import com.google.android.libraries.social.populous.core.PersonFieldMetadata;
/* compiled from: PG */
/* renamed from: cycb  reason: default package */
/* loaded from: classes5.dex */
public final class cycb extends cyfw {
    public CharSequence a;
    public CharSequence b;
    private CharSequence c;
    private CharSequence d;
    private PersonFieldMetadata e;

    @Override // defpackage.cyfw
    public final void b(CharSequence charSequence) {
        if (charSequence != null) {
            this.c = charSequence;
            return;
        }
        throw new NullPointerException("Null displayName");
    }

    @Override // defpackage.cyfw
    public final void c(CharSequence charSequence) {
        if (charSequence != null) {
            this.d = charSequence;
            return;
        }
        throw new NullPointerException("Null label");
    }

    @Override // defpackage.cyfw
    public final void d(PersonFieldMetadata personFieldMetadata) {
        if (personFieldMetadata != null) {
            this.e = personFieldMetadata;
            return;
        }
        throw new NullPointerException("Null metadata");
    }

    @Override // defpackage.cyfw
    public final Name a() {
        String str = this.c == null ? " displayName" : "";
        if (this.d == null) {
            str = str.concat(" label");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" metadata");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new AutoValue_Name(this.c, this.a, this.b, this.d, this.e);
    }
}
