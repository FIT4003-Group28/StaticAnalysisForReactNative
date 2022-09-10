package defpackage;

import com.google.android.libraries.social.populous.core.Email;
import com.google.android.libraries.social.populous.core.PersonFieldMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cyuk  reason: default package */
/* loaded from: classes5.dex */
public final class cyuk extends cyvh {
    public cyfj a;
    public String b;
    public String c;
    public PersonFieldMetadata d;
    public String e;
    public Email.ExtendedData f;
    private dcdc<Email.Certificate> g;

    public cyuk() {
    }

    public cyuk(cyvi cyviVar) {
        cyul cyulVar = (cyul) cyviVar;
        this.a = cyulVar.a;
        this.b = cyulVar.b;
        this.c = cyulVar.c;
        this.d = cyulVar.d;
        this.e = cyulVar.e;
        this.f = cyulVar.f;
        this.g = cyulVar.g;
    }

    @Override // defpackage.cyvh
    public final cyfj a() {
        cyfj cyfjVar = this.a;
        if (cyfjVar != null) {
            return cyfjVar;
        }
        throw new IllegalStateException("Property \"fieldType\" has not been set");
    }

    @Override // defpackage.cyvh
    @dzsi
    public final String b() {
        return this.b;
    }

    @Override // defpackage.cyvh
    public final String c() {
        String str = this.c;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Property \"value\" has not been set");
    }

    @Override // defpackage.cyvh
    @dzsi
    public final String d() {
        return this.e;
    }

    @Override // defpackage.cyvh
    public final void f(dcdc<Email.Certificate> dcdcVar) {
        if (dcdcVar != null) {
            this.g = dcdcVar;
            return;
        }
        throw new NullPointerException("Null certificates");
    }

    @Override // defpackage.cyvh
    public final void g(String str) {
        this.e = str;
    }

    @Override // defpackage.cyvh
    protected final cyvi e() {
        String str = this.a == null ? " fieldType" : "";
        if (this.c == null) {
            str = str.concat(" value");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" metadata");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" certificates");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cyul(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }
}
