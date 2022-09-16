package defpackage;

import com.google.android.libraries.social.populous.core.ClientVersion;
import com.google.android.libraries.social.populous.core.Experiments;
import com.google.android.libraries.social.populous.core.SessionContext;
/* compiled from: PG */
/* renamed from: cyol  reason: default package */
/* loaded from: classes5.dex */
public final class cyol extends cyow {
    public final String a;
    public final cyfk b;
    public final cyfk c;
    public final ClientVersion d;
    public final Experiments e;
    public final cygp f;
    public final cygp g;
    public final SessionContext h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;

    public cyol(String str, int i, cyfk cyfkVar, cyfk cyfkVar2, int i2, int i3, int i4, int i5, int i6, int i7, ClientVersion clientVersion, Experiments experiments, cygp cygpVar, cygp cygpVar2, SessionContext sessionContext) {
        this.a = str;
        this.i = i;
        this.b = cyfkVar;
        this.c = cyfkVar2;
        this.j = i2;
        this.k = i3;
        this.l = i4;
        this.m = i5;
        this.n = i6;
        this.o = i7;
        this.d = clientVersion;
        this.e = experiments;
        this.f = cygpVar;
        this.g = cygpVar2;
        this.h = sessionContext;
    }

    @Override // defpackage.cyow
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cyow
    public final cyfk b() {
        return this.b;
    }

    @Override // defpackage.cyow
    public final cyfk c() {
        return this.c;
    }

    @Override // defpackage.cyow
    public final ClientVersion d() {
        return this.d;
    }

    @Override // defpackage.cyow
    public final Experiments e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cyow) {
            cyow cyowVar = (cyow) obj;
            if (this.a.equals(cyowVar.a())) {
                int i = this.i;
                int i2 = cyowVar.i();
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.b.equals(cyowVar.b()) && this.c.equals(cyowVar.c())) {
                    int i3 = this.j;
                    int j = cyowVar.j();
                    if (i3 == 0) {
                        throw null;
                    }
                    if (i3 == j) {
                        int i4 = this.k;
                        int k = cyowVar.k();
                        if (i4 == 0) {
                            throw null;
                        }
                        if (i4 == k) {
                            int i5 = this.l;
                            int l = cyowVar.l();
                            if (i5 == 0) {
                                throw null;
                            }
                            if (i5 == l) {
                                int i6 = this.m;
                                int m = cyowVar.m();
                                if (i6 == 0) {
                                    throw null;
                                }
                                if (i6 == m) {
                                    int i7 = this.n;
                                    int n = cyowVar.n();
                                    if (i7 == 0) {
                                        throw null;
                                    }
                                    if (i7 == n) {
                                        int i8 = this.o;
                                        int o = cyowVar.o();
                                        if (i8 == 0) {
                                            throw null;
                                        }
                                        if (i8 == o && this.d.equals(cyowVar.d()) && this.e.equals(cyowVar.e()) && this.f.equals(cyowVar.f()) && this.g.equals(cyowVar.g()) && this.h.equals(cyowVar.h())) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.cyow
    public final cygp f() {
        return this.f;
    }

    @Override // defpackage.cyow
    public final cygp g() {
        return this.g;
    }

    @Override // defpackage.cyow
    public final SessionContext h() {
        return this.h;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ dudf.a(this.i)) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ eawb.a(this.j)) * 1000003) ^ eawb.a(this.k)) * 1000003) ^ eawb.a(this.l)) * 1000003) ^ eawb.a(this.m)) * 1000003) ^ eawb.a(this.n)) * 1000003) ^ eawb.a(this.o)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    @Override // defpackage.cyow
    public final int i() {
        return this.i;
    }

    @Override // defpackage.cyow
    public final int j() {
        return this.j;
    }

    @Override // defpackage.cyow
    public final int k() {
        return this.k;
    }

    @Override // defpackage.cyow
    public final int l() {
        return this.l;
    }

    @Override // defpackage.cyow
    public final int m() {
        return this.m;
    }

    @Override // defpackage.cyow
    public final int n() {
        return this.n;
    }

    @Override // defpackage.cyow
    public final int o() {
        return this.o;
    }

    public final String toString() {
        String str = this.a;
        int i = this.i;
        String str2 = "null";
        String valueOf = String.valueOf(i != 0 ? Integer.toString(i - 1) : str2);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int i2 = this.j;
        String valueOf4 = String.valueOf(i2 != 0 ? eawb.c(i2) : str2);
        int i3 = this.k;
        String valueOf5 = String.valueOf(i3 != 0 ? eawb.c(i3) : str2);
        int i4 = this.l;
        String valueOf6 = String.valueOf(i4 != 0 ? eawb.c(i4) : str2);
        int i5 = this.m;
        String valueOf7 = String.valueOf(i5 != 0 ? eawb.c(i5) : str2);
        int i6 = this.n;
        String valueOf8 = String.valueOf(i6 != 0 ? eawb.c(i6) : str2);
        int i7 = this.o;
        if (i7 != 0) {
            str2 = eawb.c(i7);
        }
        String valueOf9 = String.valueOf(str2);
        String valueOf10 = String.valueOf(this.d);
        String valueOf11 = String.valueOf(this.e);
        String valueOf12 = String.valueOf(this.f);
        String valueOf13 = String.valueOf(this.g);
        String valueOf14 = String.valueOf(this.h);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        int length5 = String.valueOf(valueOf4).length();
        int length6 = String.valueOf(valueOf5).length();
        int length7 = String.valueOf(valueOf6).length();
        int length8 = String.valueOf(valueOf7).length();
        int length9 = String.valueOf(valueOf8).length();
        int length10 = String.valueOf(valueOf9).length();
        int length11 = String.valueOf(valueOf10).length();
        int length12 = String.valueOf(valueOf11).length();
        StringBuilder sb = new StringBuilder(length + 369 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + length12 + String.valueOf(valueOf12).length() + String.valueOf(valueOf13).length() + String.valueOf(valueOf14).length());
        sb.append("LogContext{accountName=");
        sb.append(str);
        sb.append(", application=");
        sb.append(valueOf);
        sb.append(", clearcutLogSource=");
        sb.append(valueOf2);
        sb.append(", metricLogSource=");
        sb.append(valueOf3);
        sb.append(", suggestionPersonEventSource=");
        sb.append(valueOf4);
        sb.append(", suggestionFieldEventSource=");
        sb.append(valueOf5);
        sb.append(", autocompletePersonEventSource=");
        sb.append(valueOf6);
        sb.append(", autocompleteFieldEventSource=");
        sb.append(valueOf7);
        sb.append(", externalPersonEventSource=");
        sb.append(valueOf8);
        sb.append(", externalFieldEventSource=");
        sb.append(valueOf9);
        sb.append(", clientVersion=");
        sb.append(valueOf10);
        sb.append(", experiments=");
        sb.append(valueOf11);
        sb.append(", emptyQueryResultGroupingOption=");
        sb.append(valueOf12);
        sb.append(", nonEmptyQueryResultGroupingOption=");
        sb.append(valueOf13);
        sb.append(", sessionContext=");
        sb.append(valueOf14);
        sb.append("}");
        return sb.toString();
    }
}
