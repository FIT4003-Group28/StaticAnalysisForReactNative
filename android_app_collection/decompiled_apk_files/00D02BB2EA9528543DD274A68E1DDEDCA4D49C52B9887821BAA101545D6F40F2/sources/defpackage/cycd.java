package defpackage;

import com.google.android.libraries.social.populous.core.AutoValue_Photo;
import com.google.android.libraries.social.populous.core.PersonFieldMetadata;
import com.google.android.libraries.social.populous.core.Photo;
/* compiled from: PG */
/* renamed from: cycd  reason: default package */
/* loaded from: classes5.dex */
public final class cycd extends cygi {
    private Integer a;
    private String b;
    private PersonFieldMetadata c;
    private Boolean d;

    public cycd() {
    }

    public cycd(Photo photo) {
        this.a = Integer.valueOf(photo.a());
        this.b = photo.c();
        this.c = photo.b();
        this.d = Boolean.valueOf(photo.d());
    }

    @Override // defpackage.cygi
    public final void b(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    @Override // defpackage.cygi
    public final void c(PersonFieldMetadata personFieldMetadata) {
        this.c = personFieldMetadata;
    }

    @Override // defpackage.cygi
    public final void d(int i) {
        this.a = Integer.valueOf(i);
    }

    @Override // defpackage.cygi
    public final void e(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null value");
    }

    @Override // defpackage.cygi
    public final Photo a() {
        String str = this.a == null ? " source" : "";
        if (this.b == null) {
            str = str.concat(" value");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" metadata");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" isDefault");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new AutoValue_Photo(this.a.intValue(), this.b, this.c, this.d.booleanValue());
    }
}
