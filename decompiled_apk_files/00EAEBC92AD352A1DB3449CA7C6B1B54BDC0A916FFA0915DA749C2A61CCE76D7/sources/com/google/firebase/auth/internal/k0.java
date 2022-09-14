package com.google.firebase.auth.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import c.e.a.b.d.e.y2;
import com.google.firebase.auth.a1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class k0 extends com.google.firebase.auth.z {
    public static final Parcelable.Creator<k0> CREATOR = new n0();

    /* renamed from: b  reason: collision with root package name */
    private y2 f8367b;

    /* renamed from: c  reason: collision with root package name */
    private g0 f8368c;

    /* renamed from: d  reason: collision with root package name */
    private String f8369d;

    /* renamed from: e  reason: collision with root package name */
    private String f8370e;

    /* renamed from: f  reason: collision with root package name */
    private List<g0> f8371f;

    /* renamed from: g  reason: collision with root package name */
    private List<String> f8372g;

    /* renamed from: h  reason: collision with root package name */
    private String f8373h;
    private Boolean i;
    private m0 j;
    private boolean k;
    private a1 l;
    private o m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k0(y2 y2Var, g0 g0Var, String str, String str2, List<g0> list, List<String> list2, String str3, Boolean bool, m0 m0Var, boolean z, a1 a1Var, o oVar) {
        this.f8367b = y2Var;
        this.f8368c = g0Var;
        this.f8369d = str;
        this.f8370e = str2;
        this.f8371f = list;
        this.f8372g = list2;
        this.f8373h = str3;
        this.i = bool;
        this.j = m0Var;
        this.k = z;
        this.l = a1Var;
        this.m = oVar;
    }

    public k0(c.e.b.d dVar, List<? extends com.google.firebase.auth.t0> list) {
        com.google.android.gms.common.internal.s.a(dVar);
        this.f8369d = dVar.c();
        this.f8370e = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.f8373h = "2";
        a(list);
    }

    @Override // com.google.firebase.auth.z
    public final String A() {
        return g().k();
    }

    public final List<g0> B() {
        return this.f8371f;
    }

    public final boolean C() {
        return this.k;
    }

    public final a1 D() {
        return this.l;
    }

    public final List<com.google.firebase.auth.h0> E() {
        o oVar = this.m;
        return oVar != null ? oVar.f() : c.e.a.b.d.e.w.f();
    }

    @Override // com.google.firebase.auth.z
    public final com.google.firebase.auth.z a(List<? extends com.google.firebase.auth.t0> list) {
        com.google.android.gms.common.internal.s.a(list);
        this.f8371f = new ArrayList(list.size());
        this.f8372g = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            com.google.firebase.auth.t0 t0Var = list.get(i);
            if (t0Var.a().equals("firebase")) {
                this.f8368c = (g0) t0Var;
            } else {
                this.f8372g.add(t0Var.a());
            }
            this.f8371f.add((g0) t0Var);
        }
        if (this.f8368c == null) {
            this.f8368c = this.f8371f.get(0);
        }
        return this;
    }

    @Override // com.google.firebase.auth.z, com.google.firebase.auth.t0
    public String a() {
        return this.f8368c.a();
    }

    @Override // com.google.firebase.auth.z
    public final void a(y2 y2Var) {
        com.google.android.gms.common.internal.s.a(y2Var);
        this.f8367b = y2Var;
    }

    public final void a(a1 a1Var) {
        this.l = a1Var;
    }

    public final void a(m0 m0Var) {
        this.j = m0Var;
    }

    @Override // com.google.firebase.auth.z
    public final void b(List<com.google.firebase.auth.h0> list) {
        this.m = o.a(list);
    }

    public final void b(boolean z) {
        this.k = z;
    }

    public final k0 e(String str) {
        this.f8373h = str;
        return this;
    }

    @Override // com.google.firebase.auth.z
    public final List<String> f() {
        return this.f8372g;
    }

    @Override // com.google.firebase.auth.z
    public final y2 g() {
        return this.f8367b;
    }

    @Override // com.google.firebase.auth.z, com.google.firebase.auth.t0
    public Uri h() {
        return this.f8368c.h();
    }

    @Override // com.google.firebase.auth.z, com.google.firebase.auth.t0
    public String i() {
        return this.f8368c.i();
    }

    @Override // com.google.firebase.auth.z
    public final /* synthetic */ com.google.firebase.auth.z j() {
        this.i = false;
        return this;
    }

    @Override // com.google.firebase.auth.z
    public final String k() {
        Map map;
        y2 y2Var = this.f8367b;
        if (y2Var == null || y2Var.k() == null || (map = (Map) n.a(this.f8367b.k()).b().get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    @Override // com.google.firebase.auth.t0
    public boolean l() {
        return this.f8368c.l();
    }

    @Override // com.google.firebase.auth.z, com.google.firebase.auth.t0
    public String m() {
        return this.f8368c.m();
    }

    @Override // com.google.firebase.auth.z, com.google.firebase.auth.t0
    public String o() {
        return this.f8368c.o();
    }

    @Override // com.google.firebase.auth.z, com.google.firebase.auth.t0
    public String p() {
        return this.f8368c.p();
    }

    @Override // com.google.firebase.auth.z
    public com.google.firebase.auth.a0 r() {
        return this.j;
    }

    @Override // com.google.firebase.auth.z
    public /* synthetic */ com.google.firebase.auth.g0 s() {
        return new o0(this);
    }

    @Override // com.google.firebase.auth.z
    public List<? extends com.google.firebase.auth.t0> t() {
        return this.f8371f;
    }

    @Override // com.google.firebase.auth.z
    public boolean u() {
        com.google.firebase.auth.b0 a2;
        Boolean bool = this.i;
        if (bool == null || bool.booleanValue()) {
            y2 y2Var = this.f8367b;
            String str = "";
            if (y2Var != null && (a2 = n.a(y2Var.k())) != null) {
                str = a2.e();
            }
            boolean z = true;
            if (t().size() > 1 || (str != null && str.equals("custom"))) {
                z = false;
            }
            this.i = Boolean.valueOf(z);
        }
        return this.i.booleanValue();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, (Parcelable) g(), i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, (Parcelable) this.f8368c, i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 3, this.f8369d, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 4, this.f8370e, false);
        com.google.android.gms.common.internal.x.c.b(parcel, 5, this.f8371f, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 6, f(), false);
        com.google.android.gms.common.internal.x.c.a(parcel, 7, this.f8373h, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 8, Boolean.valueOf(u()), false);
        com.google.android.gms.common.internal.x.c.a(parcel, 9, (Parcelable) r(), i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 10, this.k);
        com.google.android.gms.common.internal.x.c.a(parcel, 11, (Parcelable) this.l, i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 12, (Parcelable) this.m, i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }

    @Override // com.google.firebase.auth.z
    public final c.e.b.d y() {
        return c.e.b.d.a(this.f8369d);
    }

    @Override // com.google.firebase.auth.z
    public final String z() {
        return this.f8367b.s();
    }
}
