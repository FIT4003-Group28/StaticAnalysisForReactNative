package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: uco  reason: default package */
/* loaded from: classes4.dex */
public final class uco {
    public Long a;
    public Long b;
    public Long c;
    public String d;
    public aono e;
    public String f;
    public Long g;
    public Long h;
    public aomt i;
    private String j;
    private aolz k;
    private List l;
    private String m;
    private List n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;

    public uco() {
    }

    public uco(ucw ucwVar) {
        this.j = ucwVar.a;
        this.o = ucwVar.o;
        this.p = ucwVar.p;
        this.q = ucwVar.q;
        this.r = ucwVar.r;
        this.a = ucwVar.b;
        this.b = ucwVar.c;
        this.k = ucwVar.d;
        this.l = ucwVar.e;
        this.c = ucwVar.f;
        this.d = ucwVar.g;
        this.e = ucwVar.h;
        this.f = ucwVar.i;
        this.m = ucwVar.j;
        this.g = ucwVar.k;
        this.h = ucwVar.l;
        this.s = ucwVar.s;
        this.i = ucwVar.m;
        this.n = ucwVar.n;
    }

    public final void b(List list) {
        if (list != null) {
            this.n = list;
            return;
        }
        throw new NullPointerException("Null actionList");
    }

    public final void c(aolz aolzVar) {
        if (aolzVar != null) {
            this.k = aolzVar;
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

    public final void f(List list) {
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
        if (i != 0) {
            this.p = i;
            return;
        }
        throw new NullPointerException("Null deletionStatus");
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

    public final ucw a() {
        int i;
        int i2;
        int i3;
        int i4;
        Long l;
        Long l2;
        aolz aolzVar;
        List list;
        Long l3;
        String str;
        Long l4;
        Long l5;
        int i5;
        List list2;
        String str2 = this.j;
        if (str2 == null || (i = this.o) == 0 || (i2 = this.p) == 0 || (i3 = this.q) == 0 || (i4 = this.r) == 0 || (l = this.a) == null || (l2 = this.b) == null || (aolzVar = this.k) == null || (list = this.l) == null || (l3 = this.c) == null || (str = this.m) == null || (l4 = this.g) == null || (l5 = this.h) == null || (i5 = this.s) == 0 || (list2 = this.n) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.j == null) {
                sb.append(" id");
            }
            if (this.o == 0) {
                sb.append(" readState");
            }
            if (this.p == 0) {
                sb.append(" deletionStatus");
            }
            if (this.q == 0) {
                sb.append(" countBehavior");
            }
            if (this.r == 0) {
                sb.append(" systemTrayBehavior");
            }
            if (this.a == null) {
                sb.append(" lastUpdatedVersion");
            }
            if (this.b == null) {
                sb.append(" lastNotificationVersion");
            }
            if (this.k == null) {
                sb.append(" androidSdkMessage");
            }
            if (this.l == null) {
                sb.append(" notificationMetadataList");
            }
            if (this.c == null) {
                sb.append(" creationId");
            }
            if (this.m == null) {
                sb.append(" groupId");
            }
            if (this.g == null) {
                sb.append(" expirationTimestampUsec");
            }
            if (this.h == null) {
                sb.append(" insertionTimeMs");
            }
            if (this.s == 0) {
                sb.append(" storageMode");
            }
            if (this.n == null) {
                sb.append(" actionList");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new ucw(str2, i, i2, i3, i4, l, l2, aolzVar, list, l3, this.d, this.e, this.f, str, l4, l5, i5, this.i, list2);
    }
}
