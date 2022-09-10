package defpackage;

import com.google.android.libraries.social.populous.core.AutoValue_PersonFieldMetadata;
import com.google.android.libraries.social.populous.core.PersonFieldMetadata;
/* compiled from: PG */
/* renamed from: cybr  reason: default package */
/* loaded from: classes5.dex */
public final class cybr extends cygd {
    public String a;
    public String b;
    public Long c;
    private Boolean n;
    private Boolean o;
    private Boolean p;
    private duej q;

    @Override // defpackage.cygd
    public final void b(duej duejVar) {
        if (duejVar != null) {
            this.q = duejVar;
            return;
        }
        throw new NullPointerException("Null containerType");
    }

    @Override // defpackage.cygd
    public final void c(@dzsi String str) {
        this.a = str;
    }

    @Override // defpackage.cygd
    public final void d(boolean z) {
        this.p = Boolean.valueOf(z);
    }

    @Override // defpackage.cygd
    public final void e(boolean z) {
        this.n = Boolean.valueOf(z);
    }

    @Override // defpackage.cygd
    public final void f(boolean z) {
        this.o = Boolean.valueOf(z);
    }

    @Override // defpackage.cygd
    public final void g(@dzsi String str) {
        this.b = str;
    }

    @Override // defpackage.cygd
    public final void h(@dzsi Long l) {
        this.c = l;
    }

    @Override // defpackage.cygd
    public final PersonFieldMetadata a() {
        String str = this.n == null ? " isPrimary" : "";
        if (this.o == null) {
            str = str.concat(" isVerified");
        }
        if (this.p == null) {
            str = String.valueOf(str).concat(" isAzList");
        }
        if (this.q == null) {
            str = String.valueOf(str).concat(" containerType");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new AutoValue_PersonFieldMetadata(this.n.booleanValue(), this.o.booleanValue(), this.p.booleanValue(), this.q, this.a, this.b, this.c);
    }
}
