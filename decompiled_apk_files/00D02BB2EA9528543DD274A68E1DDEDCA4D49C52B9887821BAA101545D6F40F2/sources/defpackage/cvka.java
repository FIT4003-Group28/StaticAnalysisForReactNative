package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cvka  reason: default package */
/* loaded from: classes5.dex */
public final class cvka {
    public Long a;
    public Long b;
    public Long c;
    public String d;
    public dsok e;
    public String f;
    public Long g;
    public Long h;
    public dsfr i;
    private String j;
    private dsch k;
    private List<dscq> l;
    private String m;
    private List<cvkg> n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;

    public cvka() {
    }

    public cvka(cvkj cvkjVar) {
        cvkb cvkbVar = (cvkb) cvkjVar;
        this.j = cvkbVar.a;
        this.o = cvkbVar.o;
        this.p = cvkbVar.p;
        this.q = cvkbVar.q;
        this.r = cvkbVar.r;
        this.a = cvkbVar.b;
        this.b = cvkbVar.c;
        this.k = cvkbVar.d;
        this.l = cvkbVar.e;
        this.c = cvkbVar.f;
        this.d = cvkbVar.g;
        this.e = cvkbVar.h;
        this.f = cvkbVar.i;
        this.m = cvkbVar.j;
        this.g = cvkbVar.k;
        this.h = cvkbVar.l;
        this.s = cvkbVar.s;
        this.i = cvkbVar.m;
        this.n = cvkbVar.n;
    }

    public final void b(List<cvkg> list) {
        if (list != null) {
            this.n = list;
            return;
        }
        throw new NullPointerException("Null actionList");
    }

    public final void c(dsch dschVar) {
        if (dschVar != null) {
            this.k = dschVar;
            return;
        }
        throw new NullPointerException("Null androidSdkMessage");
    }

    public final void d(String str) {
        if (str != null) {
            this.m = str;
            return;
        }
        throw new NullPointerException("Null groupId");
    }

    public final void e(String str) {
        if (str != null) {
            this.j = str;
            return;
        }
        throw new NullPointerException("Null id");
    }

    public final void f(List<dscq> list) {
        if (list != null) {
            this.l = list;
            return;
        }
        throw new NullPointerException("Null notificationMetadataList");
    }

    public final void g(int i) {
        if (i != 0) {
            this.q = i;
            return;
        }
        throw new NullPointerException("Null countBehavior");
    }

    public final void h(int i) {
        this.p = i;
    }

    public final void i(int i) {
        if (i != 0) {
            this.o = i;
            return;
        }
        throw new NullPointerException("Null readState");
    }

    public final void j(int i) {
        if (i != 0) {
            this.s = i;
            return;
        }
        throw new NullPointerException("Null storageMode");
    }

    public final void k(int i) {
        if (i != 0) {
            this.r = i;
            return;
        }
        throw new NullPointerException("Null systemTrayBehavior");
    }

    public final cvkj a() {
        String str = this.j == null ? " id" : "";
        if (this.o == 0) {
            str = str.concat(" readState");
        }
        if (this.p == 0) {
            str = String.valueOf(str).concat(" deletionStatus");
        }
        if (this.q == 0) {
            str = String.valueOf(str).concat(" countBehavior");
        }
        if (this.r == 0) {
            str = String.valueOf(str).concat(" systemTrayBehavior");
        }
        if (this.a == null) {
            str = String.valueOf(str).concat(" lastUpdatedVersion");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" lastNotificationVersion");
        }
        if (this.k == null) {
            str = String.valueOf(str).concat(" androidSdkMessage");
        }
        if (this.l == null) {
            str = String.valueOf(str).concat(" notificationMetadataList");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" creationId");
        }
        if (this.m == null) {
            str = String.valueOf(str).concat(" groupId");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" expirationTimestampUsec");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" insertionTimeMs");
        }
        if (this.s == 0) {
            str = String.valueOf(str).concat(" storageMode");
        }
        if (this.n == null) {
            str = String.valueOf(str).concat(" actionList");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cvkb(this.j, this.o, this.p, this.q, this.r, this.a, this.b, this.k, this.l, this.c, this.d, this.e, this.f, this.m, this.g, this.h, this.s, this.i, this.n);
    }
}
