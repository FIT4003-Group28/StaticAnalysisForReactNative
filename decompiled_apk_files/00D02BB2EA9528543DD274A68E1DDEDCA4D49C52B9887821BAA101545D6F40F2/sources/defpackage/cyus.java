package defpackage;

import com.google.android.libraries.social.populous.core.GroupOrigin;
import com.google.android.libraries.social.populous.core.InAppNotificationTarget;
import com.google.android.libraries.social.populous.core.PeopleApiAffinity;
import com.google.android.libraries.social.populous.core.PersonExtendedData;
import com.google.android.libraries.social.populous.core.Photo;
import com.google.android.libraries.social.populous.core.SourceIdentity;
/* compiled from: PG */
/* renamed from: cyus  reason: default package */
/* loaded from: classes5.dex */
public final class cyus extends cywf {
    public PersonExtendedData a;
    public dcdc<GroupOrigin> b;
    public String c;
    public dcdc<cywi> d;
    public int e;
    private cyxk f;
    private dcdc<cywh> g;
    private dcdc<String> h;
    private dcdc<SourceIdentity> i;
    private dcdc<cyvy> j;
    private dcdc<cyvy> k;
    private dcdc<InAppNotificationTarget> l;
    private dcdc<Photo> m;
    private PeopleApiAffinity n;
    private Integer o;

    @Override // defpackage.cywf
    public final void b(dcdc<cywh> dcdcVar) {
        if (dcdcVar != null) {
            this.g = dcdcVar;
            return;
        }
        throw new NullPointerException("Null displayNames");
    }

    @Override // defpackage.cywf
    public final void c(int i) {
        this.o = Integer.valueOf(i);
    }

    @Override // defpackage.cywf
    public final void d(dcdc<cyvy> dcdcVar) {
        if (dcdcVar != null) {
            this.j = dcdcVar;
            return;
        }
        throw new NullPointerException("Null orderedEmails");
    }

    @Override // defpackage.cywf
    public final void e(dcdc<InAppNotificationTarget> dcdcVar) {
        if (dcdcVar != null) {
            this.l = dcdcVar;
            return;
        }
        throw new NullPointerException("Null orderedIants");
    }

    @Override // defpackage.cywf
    public final void f(dcdc<cyvy> dcdcVar) {
        if (dcdcVar != null) {
            this.k = dcdcVar;
            return;
        }
        throw new NullPointerException("Null orderedPhones");
    }

    @Override // defpackage.cywf
    public final void g(PeopleApiAffinity peopleApiAffinity) {
        if (peopleApiAffinity != null) {
            this.n = peopleApiAffinity;
            return;
        }
        throw new NullPointerException("Null peopleApiAffinity");
    }

    @Override // defpackage.cywf
    public final void h(dcdc<Photo> dcdcVar) {
        if (dcdcVar != null) {
            this.m = dcdcVar;
            return;
        }
        throw new NullPointerException("Null photos");
    }

    @Override // defpackage.cywf
    public final void i(dcdc<String> dcdcVar) {
        if (dcdcVar != null) {
            this.h = dcdcVar;
            return;
        }
        throw new NullPointerException("Null profileIds");
    }

    @Override // defpackage.cywf
    public final void j(cyxk cyxkVar) {
        if (cyxkVar != null) {
            this.f = cyxkVar;
            return;
        }
        throw new NullPointerException("Null resultType");
    }

    @Override // defpackage.cywf
    public final void k(dcdc<SourceIdentity> dcdcVar) {
        if (dcdcVar != null) {
            this.i = dcdcVar;
            return;
        }
        throw new NullPointerException("Null sourceIdentities");
    }

    @Override // defpackage.cywf
    public final cywi a() {
        String str = this.f == null ? " resultType" : "";
        if (this.g == null) {
            str = str.concat(" displayNames");
        }
        if (this.e == 0) {
            str = String.valueOf(str).concat(" internalResultSource");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" profileIds");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" sourceIdentities");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" orderedEmails");
        }
        if (this.k == null) {
            str = String.valueOf(str).concat(" orderedPhones");
        }
        if (this.l == null) {
            str = String.valueOf(str).concat(" orderedIants");
        }
        if (this.m == null) {
            str = String.valueOf(str).concat(" photos");
        }
        if (this.n == null) {
            str = String.valueOf(str).concat(" peopleApiAffinity");
        }
        if (this.o == null) {
            str = String.valueOf(str).concat(" groupSize");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cyut(this.f, this.g, this.e, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.a, this.o.intValue(), this.b, this.c, this.d);
    }
}
