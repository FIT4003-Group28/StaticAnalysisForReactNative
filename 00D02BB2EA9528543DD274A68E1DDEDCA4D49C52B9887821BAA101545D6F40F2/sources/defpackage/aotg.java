package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aotg  reason: default package */
/* loaded from: classes2.dex */
class aotg implements baee {
    private final anhg a;
    private final digq b;

    public aotg(anhg anhgVar, digq digqVar) {
        this.a = anhgVar;
        this.b = digqVar;
    }

    @Override // defpackage.igw
    public Boolean a() {
        return igv.a();
    }

    @Override // defpackage.baee
    public jhp b() {
        digq digqVar = this.b;
        int i = digqVar.a;
        String str = (i & 8) != 0 ? digqVar.e : null;
        return new jhp(new jic(str, ckqc.FULLY_QUALIFIED, iup.e(R.raw.ic_qu_default_hero), 250), new jic((i & 16) != 0 ? digqVar.f : str, ckqc.FULLY_QUALIFIED, iup.e(R.raw.ic_qu_default_hero), 250));
    }

    @Override // defpackage.baee
    public CharSequence c() {
        return this.b.c;
    }

    @Override // defpackage.baee
    public CharSequence d() {
        return this.b.d;
    }

    @Override // defpackage.baee
    public cqkl e() {
        anhg anhgVar = this.a;
        drqz drqzVar = this.b.g;
        if (drqzVar == null) {
            drqzVar = drqz.e;
        }
        anhgVar.G(drqzVar, dbpy.a);
        return cqkl.a;
    }

    @Override // defpackage.baee
    public cjtd f() {
        return cjtd.a(new dtxi(this.b.b));
    }
}
