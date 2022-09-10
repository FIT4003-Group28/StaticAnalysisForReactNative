package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: yoh  reason: default package */
/* loaded from: classes7.dex */
public class yoh extends yob implements ynh {
    public final yog d;
    private final Activity e;
    private final vwv f;
    private final yom g;
    private final yor h;
    private final yiv i;
    private final douz j;
    private final yiw k;

    public yoh(Activity activity, cqhn cqhnVar, cqhu cqhuVar, vwv vwvVar, yon yonVar, yos yosVar, yiv yivVar, douz douzVar, yiw yiwVar) {
        this.e = activity;
        this.f = vwvVar;
        this.i = yivVar;
        this.j = douzVar;
        this.k = yiwVar;
        String string = activity.getString(R.string.DIRECTIONS_TRANSIT_OPTIONS_SHOW_IC_FARES_OPTION_TEXT);
        yio yioVar = yivVar.d;
        boolean z = (yioVar == null ? yio.c : yioVar).b;
        boolean z2 = false;
        if (vwvVar.m && ynf.k(douzVar)) {
            z2 = true;
        }
        yog yogVar = new yog(string, z, z2);
        this.d = yogVar;
        yogVar.j(new yod(this));
        yis yisVar = yivVar.b;
        this.g = yonVar.a(yisVar == null ? yis.b : yisVar, douzVar, yoe.a);
        yiu yiuVar = yivVar.c;
        this.h = yosVar.a(douzVar, yiuVar == null ? yiu.c : yiuVar, yof.a);
    }

    @Override // defpackage.ynh
    public jbk a() {
        Activity activity = this.e;
        jhz e = jib.g(activity, activity.getResources().getString(R.string.DIRECTIONS_TRANSIT_OPTIONS_TITLE)).e();
        e.i = cqrt.g(2131232205, ibm.c());
        return new iyl(e.b());
    }

    @Override // defpackage.ynh
    public ynk b() {
        return this.g;
    }

    @Override // defpackage.ynh
    public zeh c() {
        return this.h.a();
    }

    @Override // defpackage.yni
    public cqkl e() {
        this.k.a(null);
        return cqkl.a;
    }

    @Override // defpackage.yni
    public cqkl f() {
        this.k.a(j());
        return cqkl.a;
    }

    @Override // defpackage.ynh
    /* renamed from: i */
    public yog d() {
        return this.d;
    }

    public yiv j() {
        yim bZ = yiv.e.bZ();
        yis b = this.g.b();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        yiv yivVar = (yiv) bZ.b;
        b.getClass();
        yivVar.b = b;
        yivVar.a |= 1;
        yiu c = this.h.c();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        yiv yivVar2 = (yiv) bZ.b;
        c.getClass();
        yivVar2.c = c;
        yivVar2.a |= 2;
        yin bZ2 = yio.c.bZ();
        boolean booleanValue = this.d.b().booleanValue();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        yio yioVar = (yio) bZ2.b;
        yioVar.a |= 1;
        yioVar.b = booleanValue;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        yiv yivVar3 = (yiv) bZ.b;
        yio bK = bZ2.bK();
        bK.getClass();
        yivVar3.d = bK;
        yivVar3.a |= 4;
        return bZ.bK();
    }
}
