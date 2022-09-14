package defpackage;

import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: azve  reason: default package */
/* loaded from: classes3.dex */
public final class azve extends azwq {
    public akqi a;
    public akra b;
    public akqq c;
    public String d;
    public String e;
    public dndr f;
    public Long g;
    public List<azvo> h;
    public Integer i;
    public String j;
    public decq k;
    public azws l;
    private Boolean m;
    private dcen<azwu> n;
    private dcep<azwu> o;

    public azve() {
    }

    public azve(azwv azwvVar) {
        azvf azvfVar = (azvf) azwvVar;
        this.a = azvfVar.a;
        this.b = azvfVar.b;
        this.c = azvfVar.c;
        this.d = azvfVar.d;
        this.e = azvfVar.e;
        this.m = Boolean.valueOf(azvfVar.f);
        this.f = azvfVar.g;
        this.g = azvfVar.h;
        this.h = azvfVar.i;
        this.i = Integer.valueOf(azvfVar.j);
        this.j = azvfVar.k;
        this.k = azvfVar.l;
        this.l = azvfVar.m;
        this.o = azvfVar.n;
    }

    @Override // defpackage.azwq
    @dzsi
    public final dndr a() {
        return this.f;
    }

    @Override // defpackage.azwq
    public final dcen<azwu> b() {
        if (this.n == null) {
            if (this.o == null) {
                this.n = dcep.N();
            } else {
                dcen<azwu> N = dcep.N();
                this.n = N;
                N.i(this.o);
                this.o = null;
            }
        }
        return this.n;
    }

    @Override // defpackage.azwq
    public final azwv c() {
        dcen<azwu> dcenVar = this.n;
        if (dcenVar != null) {
            this.o = dcenVar.f();
        } else if (this.o == null) {
            this.o = dcmr.a;
        }
        String str = this.a == null ? " featureId" : "";
        if (this.b == null) {
            str = str.concat(" location");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" latLng");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" name");
        }
        if (this.m == null) {
            str = String.valueOf(str).concat(" star");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" minZoomLevel");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new azvf(this.a, this.b, this.c, this.d, this.e, this.m.booleanValue(), this.f, this.g, this.h, this.i.intValue(), this.j, this.k, this.l, this.o);
    }

    @Override // defpackage.azwq
    public final void d(@dzsi Long l) {
        this.g = l;
    }

    @Override // defpackage.azwq
    public final void e(@dzsi dndr dndrVar) {
        this.f = dndrVar;
    }

    @Override // defpackage.azwq
    public final void f(@dzsi List<azvo> list) {
        this.h = list;
    }

    @Override // defpackage.azwq
    public final void h(boolean z) {
        this.m = Boolean.valueOf(z);
    }

    @Override // defpackage.azwq
    public final void g(Set<azwu> set) {
        if (this.n != null) {
            throw new IllegalStateException("Cannot set placeListMetadataSet after calling placeListMetadataSetBuilder()");
        }
        this.o = dcep.K(set);
    }
}
