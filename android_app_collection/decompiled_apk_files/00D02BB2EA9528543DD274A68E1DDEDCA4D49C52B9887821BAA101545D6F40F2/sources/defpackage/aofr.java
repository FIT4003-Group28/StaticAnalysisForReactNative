package defpackage;

import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: aofr  reason: default package */
/* loaded from: classes2.dex */
final class aofr extends aogm {
    private final dbsg<akqq> c;
    private final dbsg<Float> d;
    private final dbsg<akqq> e;
    private final dbsg<aogl> f;
    private final dcdc<akqq> g;
    private final dbsg<Rect> h;
    private final dcdc<aogj> i;
    private final boolean j;

    public aofr(dbsg<akqq> dbsgVar, dbsg<Float> dbsgVar2, dbsg<akqq> dbsgVar3, dbsg<aogl> dbsgVar4, dcdc<akqq> dcdcVar, dbsg<Rect> dbsgVar5, dcdc<aogj> dcdcVar2, boolean z) {
        this.c = dbsgVar;
        this.d = dbsgVar2;
        this.e = dbsgVar3;
        this.f = dbsgVar4;
        this.g = dcdcVar;
        this.h = dbsgVar5;
        this.i = dcdcVar2;
        this.j = z;
    }

    @Override // defpackage.aogm
    public final dbsg<akqq> a() {
        return this.c;
    }

    @Override // defpackage.aogm
    public final dbsg<Float> b() {
        return this.d;
    }

    @Override // defpackage.aogm
    public final dbsg<akqq> c() {
        return this.e;
    }

    @Override // defpackage.aogm
    public final dbsg<aogl> d() {
        return this.f;
    }

    @Override // defpackage.aogm
    public final dcdc<akqq> e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aogm) {
            aogm aogmVar = (aogm) obj;
            if (this.c.equals(aogmVar.a()) && this.d.equals(aogmVar.b()) && this.e.equals(aogmVar.c()) && this.f.equals(aogmVar.d()) && dchl.m(this.g, aogmVar.e()) && this.h.equals(aogmVar.f()) && dchl.m(this.i, aogmVar.g()) && this.j == aogmVar.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aogm
    public final dbsg<Rect> f() {
        return this.h;
    }

    @Override // defpackage.aogm
    public final dcdc<aogj> g() {
        return this.i;
    }

    @Override // defpackage.aogm
    public final boolean h() {
        return this.j;
    }

    public final int hashCode() {
        return ((((((((((((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ this.i.hashCode()) * 1000003) ^ (true != this.j ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.g);
        String valueOf6 = String.valueOf(this.h);
        String valueOf7 = String.valueOf(this.i);
        boolean z = this.j;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        StringBuilder sb = new StringBuilder(length + 185 + length2 + length3 + length4 + length5 + String.valueOf(valueOf6).length() + String.valueOf(valueOf7).length());
        sb.append("MapState{optionalCenter=");
        sb.append(valueOf);
        sb.append(", optionalZoomLevel=");
        sb.append(valueOf2);
        sb.append(", optionalPlacemarkEntityLatLng=");
        sb.append(valueOf3);
        sb.append(", optionalPolylineData=");
        sb.append(valueOf4);
        sb.append(", fitViewportToLatLngs=");
        sb.append(valueOf5);
        sb.append(", optionalFocusViewport=");
        sb.append(valueOf6);
        sb.append(", placeLabels=");
        sb.append(valueOf7);
        sb.append(", restrictLabeling=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
