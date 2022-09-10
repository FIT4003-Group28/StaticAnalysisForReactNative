package defpackage;

import com.google.android.libraries.social.populous.core.PersonFieldMetadata;
/* compiled from: PG */
/* renamed from: cyum  reason: default package */
/* loaded from: classes5.dex */
public final class cyum extends cyvu {
    public String a;
    public String b;
    public String c;
    private String d;
    private PersonFieldMetadata e;
    private int f;

    @Override // defpackage.cyvu
    protected final dbsg<PersonFieldMetadata> a() {
        PersonFieldMetadata personFieldMetadata = this.e;
        return personFieldMetadata == null ? dbpy.a : dbsg.i(personFieldMetadata);
    }

    @Override // defpackage.cyvu
    public final void c(PersonFieldMetadata personFieldMetadata) {
        if (personFieldMetadata != null) {
            this.e = personFieldMetadata;
            return;
        }
        throw new NullPointerException("Null metadata");
    }

    @Override // defpackage.cyvu
    public final void d(int i) {
        if (i != 0) {
            this.f = i;
            return;
        }
        throw new NullPointerException("Null source");
    }

    @Override // defpackage.cyvu
    public final void e(String str) {
        if (str != null) {
            this.d = str;
            return;
        }
        throw new NullPointerException("Null value");
    }

    @Override // defpackage.cyvu
    protected final cyvv b() {
        String str = this.d == null ? " value" : "";
        if (this.c == null) {
            str = str.concat(" label");
        }
        if (this.f == 0) {
            str = String.valueOf(str).concat(" source");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" metadata");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cyun(this.d, this.a, this.b, this.c, this.f, this.e);
    }
}
