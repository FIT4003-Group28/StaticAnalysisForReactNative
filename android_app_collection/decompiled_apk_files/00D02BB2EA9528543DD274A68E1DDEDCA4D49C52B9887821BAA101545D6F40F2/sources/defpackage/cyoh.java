package defpackage;

import com.google.android.libraries.social.populous.logging.AutoValue_LogEntity;
import com.google.android.libraries.social.populous.logging.LogEntity;
import java.util.EnumSet;
/* compiled from: PG */
/* renamed from: cyoh  reason: default package */
/* loaded from: classes5.dex */
public final class cyoh extends cyoz {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Long f;
    public int g;
    private EnumSet<cygl> h;
    private EnumSet<cygl> i;
    private String j;
    private Integer k;
    private Integer l;
    private Boolean m;
    private Boolean n;
    private Boolean o;
    private Boolean p;
    private Boolean q;
    private Integer r;
    private int s;

    public cyoh() {
    }

    public cyoh(LogEntity logEntity) {
        this.h = logEntity.a();
        this.i = logEntity.b();
        this.a = logEntity.c();
        this.j = logEntity.d();
        this.k = Integer.valueOf(logEntity.e());
        this.l = Integer.valueOf(logEntity.f());
        this.b = logEntity.g();
        this.c = logEntity.h();
        this.d = logEntity.i();
        this.e = logEntity.j();
        this.f = logEntity.k();
        this.s = logEntity.s();
        this.g = logEntity.t();
        this.m = Boolean.valueOf(logEntity.l());
        this.n = Boolean.valueOf(logEntity.m());
        this.o = Boolean.valueOf(logEntity.n());
        this.p = Boolean.valueOf(logEntity.o());
        this.q = Boolean.valueOf(logEntity.p());
        this.r = logEntity.q();
    }

    @Override // defpackage.cyoz
    public final EnumSet<cygl> a() {
        EnumSet<cygl> enumSet = this.h;
        if (enumSet != null) {
            return enumSet;
        }
        throw new IllegalStateException("Property \"personProvenance\" has not been set");
    }

    @Override // defpackage.cyoz
    public final EnumSet<cygl> b() {
        EnumSet<cygl> enumSet = this.i;
        if (enumSet != null) {
            return enumSet;
        }
        throw new IllegalStateException("Property \"provenance\" has not been set");
    }

    @Override // defpackage.cyoz
    @dzsi
    public final String c() {
        return this.e;
    }

    @Override // defpackage.cyoz
    public final void e(boolean z) {
        this.p = Boolean.valueOf(z);
    }

    @Override // defpackage.cyoz
    public final void f(Integer num) {
        this.r = num;
    }

    @Override // defpackage.cyoz
    public final void g(int i) {
        if (i != 0) {
            this.s = i;
            return;
        }
        throw new NullPointerException("Null entityType");
    }

    @Override // defpackage.cyoz
    public final void h(int i) {
        this.l = Integer.valueOf(i);
    }

    @Override // defpackage.cyoz
    public final void i(String str) {
        if (str != null) {
            this.j = str;
            return;
        }
        throw new NullPointerException("Null fieldLoggingId");
    }

    @Override // defpackage.cyoz
    public final void j(boolean z) {
        this.o = Boolean.valueOf(z);
    }

    @Override // defpackage.cyoz
    public final void k(boolean z) {
        this.m = Boolean.valueOf(z);
    }

    @Override // defpackage.cyoz
    public final void l(boolean z) {
        this.n = Boolean.valueOf(z);
    }

    @Override // defpackage.cyoz
    public final void m(boolean z) {
        this.q = Boolean.valueOf(z);
    }

    @Override // defpackage.cyoz
    public final void n(int i) {
        this.g = i;
    }

    @Override // defpackage.cyoz
    public final void o(int i) {
        this.k = Integer.valueOf(i);
    }

    @Override // defpackage.cyoz
    public final void p(String str) {
        this.a = str;
    }

    @Override // defpackage.cyoz
    public final void q(EnumSet<cygl> enumSet) {
        if (enumSet != null) {
            this.h = enumSet;
            return;
        }
        throw new NullPointerException("Null personProvenance");
    }

    @Override // defpackage.cyoz
    public final void r(EnumSet<cygl> enumSet) {
        if (enumSet != null) {
            this.i = enumSet;
            return;
        }
        throw new NullPointerException("Null provenance");
    }

    @Override // defpackage.cyoz
    public final LogEntity d() {
        String str = this.h == null ? " personProvenance" : "";
        if (this.i == null) {
            str = str.concat(" provenance");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" fieldLoggingId");
        }
        if (this.k == null) {
            str = String.valueOf(str).concat(" personLevelPosition");
        }
        if (this.l == null) {
            str = String.valueOf(str).concat(" fieldLevelPosition");
        }
        if (this.s == 0) {
            str = String.valueOf(str).concat(" entityType");
        }
        if (this.g == 0) {
            str = String.valueOf(str).concat(" personEntityType");
        }
        if (this.m == null) {
            str = String.valueOf(str).concat(" hasDisplayNameMatches");
        }
        if (this.n == null) {
            str = String.valueOf(str).concat(" hasFieldMatches");
        }
        if (this.o == null) {
            str = String.valueOf(str).concat(" hasAvatar");
        }
        if (this.p == null) {
            str = String.valueOf(str).concat(" boosted");
        }
        if (this.q == null) {
            str = String.valueOf(str).concat(" isExternalEventSource");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new AutoValue_LogEntity(this.h, this.i, this.a, this.j, this.k.intValue(), this.l.intValue(), this.b, this.c, this.d, this.e, this.f, this.s, this.g, this.m.booleanValue(), this.n.booleanValue(), this.o.booleanValue(), this.p.booleanValue(), this.q.booleanValue(), this.r);
    }
}
