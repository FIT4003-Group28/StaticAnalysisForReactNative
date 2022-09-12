package defpackage;

import com.google.android.libraries.social.populous.core.Email;
import com.google.android.libraries.social.populous.core.PersonFieldMetadata;
/* compiled from: PG */
/* renamed from: cyuo  reason: default package */
/* loaded from: classes5.dex */
public final class cyuo extends cyvx {
    public Email.ExtendedData a;
    private cyfj b;
    private String c;
    private PersonFieldMetadata d;
    private String e;
    private dcdc<Email.Certificate> f;
    private cyxg g;
    private String h;

    @Override // defpackage.cyvx
    public final cyfj a() {
        cyfj cyfjVar = this.b;
        if (cyfjVar != null) {
            return cyfjVar;
        }
        throw new IllegalStateException("Property \"fieldType\" has not been set");
    }

    @Override // defpackage.cyvx
    public final String b() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Property \"canonicalValue\" has not been set");
    }

    @Override // defpackage.cyvx
    public final void d(String str) {
        if (str != null) {
            this.e = str;
            return;
        }
        throw new NullPointerException("Null canonicalValue");
    }

    @Override // defpackage.cyvx
    public final void e(dcdc<Email.Certificate> dcdcVar) {
        if (dcdcVar != null) {
            this.f = dcdcVar;
            return;
        }
        throw new NullPointerException("Null certificates");
    }

    @Override // defpackage.cyvx
    public final void f(cyfj cyfjVar) {
        if (cyfjVar != null) {
            this.b = cyfjVar;
            return;
        }
        throw new NullPointerException("Null fieldType");
    }

    @Override // defpackage.cyvx
    public final void g(String str) {
        if (str != null) {
            this.h = str;
            return;
        }
        throw new NullPointerException("Null key");
    }

    @Override // defpackage.cyvx
    public final void h(PersonFieldMetadata personFieldMetadata) {
        if (personFieldMetadata != null) {
            this.d = personFieldMetadata;
            return;
        }
        throw new NullPointerException("Null metadata");
    }

    @Override // defpackage.cyvx
    public final void i(cyxg cyxgVar) {
        if (cyxgVar != null) {
            this.g = cyxgVar;
            return;
        }
        throw new NullPointerException("Null rankingFeatureSet");
    }

    @Override // defpackage.cyvx
    public final void j(String str) {
        if (str != null) {
            this.c = str;
            return;
        }
        throw new NullPointerException("Null value");
    }

    @Override // defpackage.cyvx
    protected final cyvy c() {
        String str = this.b == null ? " fieldType" : "";
        if (this.c == null) {
            str = str.concat(" value");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" metadata");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" canonicalValue");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" certificates");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" rankingFeatureSet");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" key");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cyup(this.b, this.c, this.d, this.e, this.a, this.f, this.g, this.h);
    }
}
