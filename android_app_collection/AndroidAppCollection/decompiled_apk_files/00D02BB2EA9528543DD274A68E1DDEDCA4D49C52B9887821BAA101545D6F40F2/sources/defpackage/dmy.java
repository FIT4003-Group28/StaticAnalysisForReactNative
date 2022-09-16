package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: dmy  reason: default package */
/* loaded from: classes6.dex */
final class dmy extends dmv {
    public final dmr a;
    public final dbsg<String> b;
    public final dbsg<ilo> c;
    public final dbsg<dsza> d;
    public final dbsg<dfmg> e;
    public final dbsg f;

    public dmy(dmr dmrVar, dbsg<String> dbsgVar, dbsg<ilo> dbsgVar2, dbsg<dsza> dbsgVar3, dbsg<dfmg> dbsgVar4, dbsg dbsgVar5) {
        this.a = dmrVar;
        this.b = dbsgVar;
        this.c = dbsgVar2;
        this.d = dbsgVar3;
        this.e = dbsgVar4;
        this.f = dbsgVar5;
    }

    @Override // defpackage.dmv
    public final dmr a() {
        return this.a;
    }

    @Override // defpackage.dmv
    public final dbsg<String> b() {
        return this.b;
    }

    @Override // defpackage.dmv
    public final dbsg<ilo> c() {
        return this.c;
    }

    @Override // defpackage.dmv
    public final dbsg<dsza> d() {
        return this.d;
    }

    @Override // defpackage.dmv
    public final dbsg<dfmg> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dmv) {
            dmv dmvVar = (dmv) obj;
            if (this.a.equals(dmvVar.a()) && this.b.equals(dmvVar.b()) && this.c.equals(dmvVar.c()) && this.d.equals(dmvVar.d()) && this.e.equals(dmvVar.e()) && this.f.equals(dmvVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dmv
    public final dbsg f() {
        return this.f;
    }

    @Override // defpackage.dmv
    public final dmu h() {
        return new dmx(this);
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle + length2 + length3 + length4 + length5 + String.valueOf(valueOf6).length());
        sb.append("ArPoiModel{identifier=");
        sb.append(valueOf);
        sb.append(", heroImageUrl=");
        sb.append(valueOf2);
        sb.append(", placemark=");
        sb.append(valueOf3);
        sb.append(", latLngAltOverride=");
        sb.append(valueOf4);
        sb.append(", levelChangePoint=");
        sb.append(valueOf5);
        sb.append(", recognizedPlace=");
        sb.append(valueOf6);
        sb.append("}");
        return sb.toString();
    }
}
