package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: zqc  reason: default package */
/* loaded from: classes7.dex */
public class zqc implements zfg {
    @dzsi
    public final ztm a;
    @dzsi
    public final zto b;
    private final int c;
    private final Boolean d;
    @dzsi
    private final CharSequence e;
    @dzsi
    private final CharSequence f;
    @dzsi
    private final CharSequence g;
    @dzsi
    private final CharSequence h;
    @dzsi
    private final CharSequence i;
    private Integer k;
    private final boolean m;
    private Integer j = 0;
    private Float l = Float.valueOf(1.0f);

    private zqc(@dzsi ztm ztmVar, int i, int i2, boolean z, @dzsi CharSequence charSequence, @dzsi CharSequence charSequence2, @dzsi CharSequence charSequence3, @dzsi CharSequence charSequence4, @dzsi CharSequence charSequence5, @dzsi zto ztoVar, boolean z2) {
        this.k = 0;
        this.a = ztmVar;
        this.c = i;
        this.k = Integer.valueOf(i2);
        this.d = Boolean.valueOf(z);
        this.e = charSequence;
        this.f = charSequence2;
        this.g = charSequence4;
        this.h = charSequence3;
        this.i = charSequence5;
        this.b = ztoVar;
        this.m = z2;
    }

    public static zqc p() {
        return new zqc(null, 0, 0, true, null, null, null, null, null, null, true);
    }

    public static zqc q(Resources resources, bvsl bvslVar, doxf doxfVar, @dzsi amtf amtfVar, dcdc<Integer> dcdcVar) {
        return s(resources, resources.getDimensionPixelSize(R.dimen.directions_elevation_view_height), resources.getDimensionPixelSize(R.dimen.directions_elevation_chart_top_margin), bvslVar, doxfVar, amtfVar, dcdcVar, null);
    }

    public static zqc r(Resources resources, bvsl bvslVar, doxf doxfVar, @dzsi amtf amtfVar, dcdc<Integer> dcdcVar, zto ztoVar) {
        return s(resources, resources.getDimensionPixelSize(R.dimen.directions_elevation_view_height), resources.getDimensionPixelSize(R.dimen.directions_elevation_chart_top_margin), bvslVar, doxfVar, amtfVar, dcdcVar, ztoVar);
    }

    public static zqc s(Resources resources, int i, int i2, bvsl bvslVar, doxf doxfVar, @dzsi amtf amtfVar, dcdc<Integer> dcdcVar, @dzsi zto ztoVar) {
        boolean z = doxfVar.j;
        dowb dowbVar = doxfVar.f;
        if (dowbVar == null) {
            dowbVar = dowb.d;
        }
        dowa b = dowa.b(dowbVar.c);
        if (b == null) {
            b = dowa.REGIONAL;
        }
        int i3 = bvslVar.b(b) == dowa.KILOMETERS ? 100 : bvsl.a;
        dowb dowbVar2 = doxfVar.d;
        if (dowbVar2 == null) {
            dowbVar2 = dowb.d;
        }
        CharSequence e = bvslVar.e(dowbVar2);
        dowb dowbVar3 = doxfVar.e;
        if (dowbVar3 == null) {
            dowbVar3 = dowb.d;
        }
        ztm ztmVar = amtfVar != null ? new ztm(doxfVar, amtfVar, dcdcVar, i3, e, bvslVar.e(dowbVar3)) : null;
        String string = resources.getString(R.string.MOSTLY_FLAT_ROUTE);
        dowb dowbVar4 = doxfVar.f;
        if (dowbVar4 == null) {
            dowbVar4 = dowb.d;
        }
        CharSequence e2 = bvslVar.e(dowbVar4);
        dowb dowbVar5 = doxfVar.g;
        if (dowbVar5 == null) {
            dowbVar5 = dowb.d;
        }
        CharSequence e3 = bvslVar.e(dowbVar5);
        return new zqc(ztmVar, i, i2, z, string, true != z ? e2 : null, true == z ? null : resources.getString(R.string.ELEVATION_ASCENT_TEXT, e2), true == z ? null : e3, true != z ? resources.getString(R.string.ELEVATION_DESCENT_TEXT, e3) : null, ztoVar, false);
    }

    @Override // defpackage.zfg
    public Boolean a() {
        return this.d;
    }

    @Override // defpackage.zfg
    public Boolean b() {
        return Boolean.valueOf(!this.d.booleanValue());
    }

    @Override // defpackage.zfg
    @dzsi
    public cqtd c() {
        return this.a;
    }

    @Override // defpackage.zfg
    @dzsi
    public CharSequence d() {
        return this.f;
    }

    @Override // defpackage.zfg
    public CharSequence e() {
        if (o().booleanValue()) {
            return "";
        }
        if (!a().booleanValue()) {
            return String.format("%s, %s", f(), h());
        }
        CharSequence charSequence = this.e;
        return charSequence == null ? "" : charSequence;
    }

    @Override // defpackage.zfg
    @dzsi
    public CharSequence f() {
        return this.h;
    }

    @Override // defpackage.zfg
    @dzsi
    public CharSequence g() {
        return this.g;
    }

    @Override // defpackage.zfg
    @dzsi
    public CharSequence h() {
        return this.i;
    }

    @Override // defpackage.zfg
    public Integer i() {
        return Integer.valueOf(this.c);
    }

    @Override // defpackage.zfg
    public Integer j() {
        return this.j;
    }

    @Override // defpackage.zfg
    public Integer k() {
        return this.k;
    }

    @Override // defpackage.zfg
    public Float l() {
        return this.l;
    }

    @Override // defpackage.zfg
    public void m(int i) {
        ztm ztmVar = this.a;
        if (ztmVar == null) {
            return;
        }
        ztmVar.c(i);
        cqkx.p(this);
    }

    @Override // defpackage.zfg
    public zto n() {
        return new zto(this) { // from class: zqb
            private final zqc a;

            {
                this.a = this;
            }

            @Override // defpackage.zto
            public final void OL(int i) {
                zqc zqcVar = this.a;
                ztm ztmVar = zqcVar.a;
                if (ztmVar == null) {
                    return;
                }
                ztmVar.c(i);
                zto ztoVar = zqcVar.b;
                if (ztoVar != null) {
                    ztoVar.OL(i);
                }
                cqkx.p(zqcVar);
            }
        };
    }

    @Override // defpackage.zfg
    public Boolean o() {
        return Boolean.valueOf(this.m);
    }
}
