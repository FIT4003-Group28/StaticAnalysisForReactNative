package defpackage;

import com.google.android.libraries.social.populous.core.Email;
import com.google.android.libraries.social.populous.core.GroupOrigin;
import com.google.android.libraries.social.populous.core.InAppNotificationTarget;
import com.google.android.libraries.social.populous.core.PeopleApiAffinity;
import com.google.android.libraries.social.populous.core.PersonExtendedData;
import com.google.android.libraries.social.populous.core.Photo;
import com.google.android.libraries.social.populous.core.SourceIdentity;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cyvs  reason: default package */
/* loaded from: classes5.dex */
public final class cyvs {
    public static final Comparator<Photo> a = new cyvj();
    public static final dbrn<Photo, String> b = new cyvk();
    public static final Comparator<cyvv> c = new cyvl();
    public static final dbrn<cyvv, String> d = new cyvm();
    public final boolean A;
    private Set<String> B;
    public final cyxk f;
    public PeopleApiAffinity g;
    public double h;
    public final EnumSet<cygl> i;
    public dcdc<cyvv> j;
    public dcdc<Photo> k;
    public dcdc<InAppNotificationTarget> l;
    public final dcdc<String> m;
    @dzsi
    public String n;
    public dcdc<cyvi> o;
    public dcdc<SourceIdentity> p;
    public boolean q;
    public Set<String> s;
    public Set<String> t;
    public int u;
    @dzsi
    public final PersonExtendedData v;
    public int w;
    public dcdc<GroupOrigin> x;
    public dcdc<cyvs> y;
    public final String z;
    public final Object e = new Object();
    public String r = null;

    public cyvs(cyxk cyxkVar, PeopleApiAffinity peopleApiAffinity, double d2, dcdc<cyvv> dcdcVar, dcdc<Photo> dcdcVar2, dcdc<InAppNotificationTarget> dcdcVar3, EnumSet<cygl> enumSet, String str, dcdc<cyvi> dcdcVar4, boolean z, dcdc<String> dcdcVar5, @dzsi PersonExtendedData personExtendedData, dcdc<SourceIdentity> dcdcVar6, int i, dcdc<GroupOrigin> dcdcVar7, dcdc<cyvs> dcdcVar8, String str2, int i2, boolean z2) {
        this.f = cyxkVar;
        this.g = peopleApiAffinity;
        this.h = d2;
        this.j = dcdcVar;
        this.k = dcdcVar2;
        this.l = dcdcVar3;
        this.i = enumSet;
        this.n = str;
        this.o = dcdcVar4;
        this.m = dcdcVar5;
        this.q = z;
        this.v = personExtendedData;
        this.p = dcdcVar6;
        this.w = i;
        this.x = dcdcVar7;
        this.y = dcdcVar8;
        this.z = str2;
        this.u = i2;
        this.A = z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dcdc<Email.Certificate> l(cyvi... cyviVarArr) {
        dcfa U = dcfc.U();
        for (int i = 0; i < 2; i++) {
            U.m(cyviVarArr[i].f());
        }
        return ((dcms) U.f()).d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends cyft> dcdc<T> m(Iterable<T> iterable, Iterable<T> iterable2, dbrn<T, String> dbrnVar, Comparator<T> comparator) {
        dcdc A = dcbg.d(iterable, iterable2).A(comparator);
        HashMap hashMap = new HashMap();
        dccx F = dcdc.F();
        int size = A.size();
        for (int i = 0; i < size; i++) {
            cyft cyftVar = (cyft) A.get(i);
            String str = (String) dbrnVar.a(cyftVar);
            cyft cyftVar2 = (cyft) hashMap.get(str);
            if (cyftVar2 == null) {
                hashMap.put(str, cyftVar);
                F.g(cyftVar);
            } else {
                cyftVar2.b().k(cyftVar.b());
            }
        }
        return F.f();
    }

    public final dcdc<cyvi> a() {
        dcdc<cyvi> dcdcVar;
        synchronized (this.e) {
            dcdcVar = this.o;
        }
        return dcdcVar;
    }

    public final dcdc<SourceIdentity> b() {
        dcdc<SourceIdentity> dcdcVar;
        synchronized (this.e) {
            dcdcVar = this.p;
        }
        return dcdcVar;
    }

    public final int c() {
        int i;
        synchronized (this.e) {
            i = this.u;
        }
        return i;
    }

    public final dcdc<cyvv> d() {
        dcdc<cyvv> dcdcVar;
        synchronized (this.e) {
            dcdcVar = this.j;
        }
        return dcdcVar;
    }

    public final EnumSet<cygl> e() {
        EnumSet<cygl> enumSet;
        synchronized (this.e) {
            enumSet = this.i;
        }
        return enumSet;
    }

    public final void f(dcdc<InAppNotificationTarget> dcdcVar) {
        synchronized (this.e) {
            this.B = null;
            this.r = null;
            this.l = dcdcVar;
        }
    }

    public final dcdc<InAppNotificationTarget> g() {
        dcdc<InAppNotificationTarget> dcdcVar;
        synchronized (this.e) {
            dcdcVar = this.l;
        }
        return dcdcVar;
    }

    public final String h() {
        String str;
        synchronized (this.e) {
            if (this.r == null) {
                if (this.f == cyxk.GROUP) {
                    this.r = String.valueOf(this.z).concat("|GROUP");
                } else {
                    String a2 = cyxz.a(i());
                    String a3 = cyxz.a(k());
                    String str2 = (a2.length() <= 0 || a3.length() <= 0) ? "" : ";";
                    StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + str2.length() + String.valueOf(a3).length());
                    sb.append(a2);
                    sb.append(str2);
                    sb.append(a3);
                    this.r = sb.toString();
                }
            }
            str = this.r;
        }
        return str;
    }

    public final Set<String> i() {
        Set<String> set;
        synchronized (this.e) {
            if (this.s == null) {
                this.s = dcbg.b(this.o).s(new cyvn()).B();
            }
            set = this.s;
        }
        return set;
    }

    public final Set<String> j() {
        Set<String> set;
        synchronized (this.e) {
            if (this.t == null) {
                this.t = dcbg.b(this.j).s(new cyvo()).o(dbss.NOT_NULL).B();
            }
            set = this.t;
        }
        return set;
    }

    public final Set<String> k() {
        Set<String> set;
        synchronized (this.e) {
            if (this.B == null) {
                this.B = dcbg.b(this.l).s(new cyvp()).B();
            }
            set = this.B;
        }
        return set;
    }

    public final int n(cyvs cyvsVar) {
        int a2;
        int a3;
        if (this.f == cyxk.GROUP || this.f != cyvsVar.f) {
            return 1;
        }
        int a4 = cyxv.a(i(), cyvsVar.i());
        Set<String> k = k();
        Set<String> k2 = cyvsVar.k();
        if (a4 != 1 && (a2 = cyxv.a(k, k2)) - 1 != 0) {
            if (a3 != 2) {
                if (a4 == 3 || a4 == a2) {
                    a4 = a2;
                }
            }
            if (a4 == 1 && a4 != 3 && !j().isEmpty() && !cyvsVar.j().isEmpty() && dcnm.o(j(), cyvsVar.j()).isEmpty()) {
                return 1;
            }
            return a4;
        }
        a4 = 1;
        if (a4 == 1) {
        }
        return a4;
    }

    public final void o() {
        this.q = true;
    }
}
