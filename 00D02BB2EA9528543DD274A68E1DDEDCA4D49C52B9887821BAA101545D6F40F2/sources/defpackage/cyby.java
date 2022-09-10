package defpackage;

import com.google.android.libraries.social.populous.core.AutoValue_GroupMetadata;
import com.google.android.libraries.social.populous.core.GroupMetadata;
import com.google.android.libraries.social.populous.core.PeopleApiAffinity;
/* compiled from: PG */
/* renamed from: cyby  reason: default package */
/* loaded from: classes5.dex */
public final class cyby extends cyfg {
    private Integer a;
    private Boolean b;
    private Long c;
    private String d;
    private PeopleApiAffinity e;
    private Integer f;

    @Override // defpackage.cyfg
    public final void b(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    @Override // defpackage.cyfg
    public final void c(PeopleApiAffinity peopleApiAffinity) {
        if (peopleApiAffinity != null) {
            this.e = peopleApiAffinity;
            return;
        }
        throw new NullPointerException("Null peopleApiAffinity");
    }

    @Override // defpackage.cyfg
    public final void d(int i) {
        this.f = Integer.valueOf(i);
    }

    @Override // defpackage.cyfg
    public final void e(String str) {
        if (str != null) {
            this.d = str;
            return;
        }
        throw new NullPointerException("Null query");
    }

    @Override // defpackage.cyfg
    public final void f(long j) {
        this.c = Long.valueOf(j);
    }

    @Override // defpackage.cyfg
    public final void g(int i) {
        this.a = Integer.valueOf(i);
    }

    @Override // defpackage.cyfg
    public final GroupMetadata a() {
        String str = this.a == null ? " size" : "";
        if (this.b == null) {
            str = str.concat(" canExpandMembers");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" querySessionId");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" query");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" peopleApiAffinity");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" personLevelPosition");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new AutoValue_GroupMetadata(this.a.intValue(), this.b.booleanValue(), this.c.longValue(), this.d, this.e, this.f.intValue());
    }
}
