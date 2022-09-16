package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aywd  reason: default package */
/* loaded from: classes3.dex */
public class aywd implements ayve {
    public final azxk a;
    private final gga b;
    private final ahjq c;
    private final bvsl d;
    private final aywl e;
    @dzsi
    private final bnju f;

    public aywd(gga ggaVar, ahjq ahjqVar, bvsl bvslVar, azxk azxkVar, @dzsi bnju bnjuVar, aywl aywlVar) {
        this.b = ggaVar;
        this.c = ahjqVar;
        this.d = bvslVar;
        this.a = azxkVar;
        this.f = bnjuVar;
        this.e = aywlVar;
    }

    @Override // defpackage.ayve
    @dzsi
    public ayvh a() {
        return null;
    }

    @Override // defpackage.ayve
    public String b() {
        if (akqi.d(this.a.b())) {
            return this.a.e(null);
        }
        return this.b.getString(R.string.DROPPED_PIN);
    }

    @Override // defpackage.ayve
    public String c() {
        if (akqi.d(this.a.b())) {
            return this.a.c();
        }
        return this.a.d().b();
    }

    @Override // defpackage.ayve
    public String d() {
        return batx.b(batx.a(this.c.a(), this.a.d()), this.d);
    }

    @Override // defpackage.ayve
    public cqkl e() {
        this.e.c(this);
        return cqkl.a;
    }

    @Override // defpackage.ayve
    public cjtd f() {
        return cjtd.a(dtxo.O);
    }

    @Override // defpackage.ayve
    public String g() {
        return this.b.getString(R.string.ACCESSIBILITY_REMOVE_DESCRIPTION, new Object[]{b()});
    }

    @Override // defpackage.ayve
    public String h() {
        return "";
    }

    @Override // defpackage.ayve
    @dzsi
    public jba i() {
        if (this.f != null) {
            begh beghVar = new begh();
            beghVar.c = true;
            bnjs aK = this.f.aK();
            aK.o = beghVar;
            aK.a = null;
            return aK.a();
        }
        return null;
    }

    @Override // defpackage.ayve
    @dzsi
    public ayde j() {
        return null;
    }

    @Override // defpackage.ayve
    public Boolean k() {
        return false;
    }

    @Override // defpackage.ayve
    @dzsi
    public bfkm l() {
        bnju bnjuVar = this.f;
        if (bnjuVar != null) {
            return bnjuVar.ah();
        }
        return null;
    }

    @Override // defpackage.ayve
    public Boolean m() {
        bfkm l = l();
        boolean z = true;
        if (l == null || l.s().size() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ayve
    public Boolean n() {
        boolean z = false;
        if (this.f != null && !this.a.u()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ayve
    public Boolean o() {
        return false;
    }

    @Override // defpackage.ayve
    @dzsi
    public izx p() {
        return null;
    }

    @Override // defpackage.ayve
    public CharSequence q() {
        return "";
    }
}
