package defpackage;

import com.google.android.libraries.social.populous.core.GroupOrigin;
import com.google.android.libraries.social.populous.core.InAppNotificationTarget;
import com.google.android.libraries.social.populous.core.PeopleApiAffinity;
import com.google.android.libraries.social.populous.core.PersonExtendedData;
import com.google.android.libraries.social.populous.core.Photo;
import com.google.android.libraries.social.populous.core.SourceIdentity;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: cyvt  reason: default package */
/* loaded from: classes5.dex */
public final class cyvt {
    public cyxk a;
    public PeopleApiAffinity b;
    public double c;
    public List<cyvv> d;
    public List<Photo> e;
    public List<String> f;
    public List<InAppNotificationTarget> g;
    public EnumSet<cygl> h;
    public String i;
    public List<cyvi> j;
    @dzsi
    public PersonExtendedData k;
    public List<SourceIdentity> l;
    public int m;
    public dcdc<GroupOrigin> n;
    public final List<cyvs> o;
    public String p;
    public boolean q;
    private boolean r;
    private int s;

    private cyvt() {
        PeopleApiAffinity peopleApiAffinity = PeopleApiAffinity.e;
        this.b = peopleApiAffinity;
        this.c = peopleApiAffinity.a();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = EnumSet.noneOf(cygl.class);
        this.i = "";
        this.j = new ArrayList();
        this.l = new ArrayList();
        this.o = new ArrayList();
    }

    public static cyvt a() {
        return new cyvt();
    }

    public final cyvs b() {
        dbsk.s(this.a);
        return new cyvs(this.a, this.b, this.c, dcdc.r(this.d), dcdc.r(this.e), dcdc.r(this.g), this.h, this.i, dcdc.r(this.j), this.r, dcdc.r(this.f), this.k, dcdc.r(this.l), this.m, this.n, dcdc.r(this.o), this.p, this.s, this.q);
    }

    public final void c(cyvv cyvvVar) {
        this.d.add(cyvvVar);
    }

    public final void d(cyvi cyviVar) {
        this.j.add(cyviVar);
    }

    public final void e(InAppNotificationTarget inAppNotificationTarget) {
        this.g.add(inAppNotificationTarget);
    }

    public final void f(Photo photo) {
        this.e.add(photo);
    }

    public final void g(cygl cyglVar) {
        this.h.add(cyglVar);
    }

    public final void h(cyvs cyvsVar) {
        if (this.a == null) {
            this.a = cyvsVar.f;
        }
        dbsk.l(this.a == cyvsVar.f);
        this.h = cyvsVar.e();
        this.i = cyvsVar.n;
        this.b = cyvsVar.g;
        this.c = cyvsVar.h;
        this.k = cyvsVar.v;
        this.l = cyvsVar.b();
        this.s = cyvsVar.c();
        this.q = cyvsVar.A;
        dcdc<String> dcdcVar = cyvsVar.m;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            this.f.add(dcdcVar.get(i));
        }
        dcdc<cyvv> d = cyvsVar.d();
        int size2 = d.size();
        for (int i2 = 0; i2 < size2; i2++) {
            c(d.get(i2));
        }
        dcdc<cyvi> a = cyvsVar.a();
        int size3 = a.size();
        for (int i3 = 0; i3 < size3; i3++) {
            d(a.get(i3));
        }
        dcdc<InAppNotificationTarget> g = cyvsVar.g();
        int size4 = g.size();
        for (int i4 = 0; i4 < size4; i4++) {
            e(g.get(i4));
        }
        this.r = cyvsVar.q;
        dcdc<Photo> dcdcVar2 = cyvsVar.k;
        int size5 = dcdcVar2.size();
        for (int i5 = 0; i5 < size5; i5++) {
            f(dcdcVar2.get(i5));
        }
        this.p = cyvsVar.z;
        if (this.a != cyxk.GROUP || !this.o.isEmpty()) {
            return;
        }
        this.m = cyvsVar.w;
        if (this.n == null) {
            this.n = cyvsVar.x;
        } else if (cyvsVar.x != null) {
            dccx F = dcdc.F();
            F.i(this.n);
            F.i(cyvsVar.x);
            this.n = F.f();
        }
        this.o.addAll(cyvsVar.y);
    }
}
