package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bayx  reason: default package */
/* loaded from: classes3.dex */
public class bayx extends bazi {
    private final dndr a;
    private final dzsj<axwy> c;
    private final axxi d;
    private final ahjq e;
    private final batd f;

    public bayx(gga ggaVar, bwqv bwqvVar, btrm btrmVar, ania aniaVar, dzsj<axwy> dzsjVar, axxi axxiVar, ahjq ahjqVar, batd batdVar, batz batzVar, wdw wdwVar, dxio<wdy> dxioVar, dxio<wdx> dxioVar2, dndr dndrVar) {
        super(ggaVar, bwqvVar, btrmVar, aniaVar, batzVar, wdwVar, dxioVar, dxioVar2);
        this.c = dzsjVar;
        this.d = axxiVar;
        this.e = ahjqVar;
        this.f = batdVar;
        boolean z = true;
        if (dndrVar != dndr.HOME && dndrVar != dndr.WORK) {
            z = false;
        }
        dbsk.a(z);
        this.a = dndrVar;
        if (dndrVar == dndr.WORK) {
            bayh bayhVar = bayh.NONE;
        } else {
            bayh bayhVar2 = bayh.NONE;
        }
    }

    private static cjtd w(ddho ddhoVar, boolean z) {
        if (!z) {
            return cjtd.a(ddhoVar);
        }
        cjta b = cjtd.b();
        b.d = ddhoVar;
        b.g(cjrx.a(ddcu.y.a));
        return b.a();
    }

    @Override // defpackage.bayj
    public String a() {
        dndr dndrVar = dndr.UNKNOWN_ALIAS_TYPE;
        int ordinal = this.a.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return this.t.getString(R.string.WORK_LOCATION);
            }
            throw new IllegalStateException("Alias placeholder item was not HOME or WORK");
        }
        return this.t.getString(R.string.HOME_LOCATION);
    }

    @Override // defpackage.bayj
    public jic c() {
        int i;
        dndr dndrVar = dndr.UNKNOWN_ALIAS_TYPE;
        int ordinal = this.a.ordinal();
        if (ordinal == 1) {
            i = 2131231654;
        } else if (ordinal != 2) {
            throw new IllegalStateException("Alias placeholder item was not HOME or WORK");
        } else {
            i = 2131231777;
        }
        return new jic((String) null, ckqc.FULLY_QUALIFIED, cqrt.g(i, ibm.x()), 0);
    }

    @Override // defpackage.bayj
    public String d() {
        return this.t.getString(R.string.YOUR_PLACES_NICKNAMED_PLACES);
    }

    @Override // defpackage.bbal, defpackage.bayj
    public cqkl e() {
        GmmLocation a;
        axwv n = axww.n();
        n.b(this.a);
        if (this.f.a(this.a) && (a = this.e.a()) != null) {
            n.f(true);
            ((axvv) n).e = a.B();
        }
        this.c.a().L(n.h());
        return cqkl.a;
    }

    @Override // defpackage.bayj
    public ilo f() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.bayj
    public cjtd g() {
        dndr dndrVar = dndr.UNKNOWN_ALIAS_TYPE;
        int ordinal = this.a.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return w(dtyd.cI, this.d.i());
            }
            throw new IllegalStateException("Alias placeholder item was not HOME or WORK");
        }
        return w(dtyd.cH, this.d.i());
    }

    @Override // defpackage.bayj
    public jht h() {
        jhu h = jhv.h();
        jhi jhiVar = (jhi) h;
        jhiVar.e = this.t.getString(R.string.YOUR_PLACES_PLACE_ITEM_OVERFLOW_MENU_CONTENT_DESCRIPTION_FORMAT, new Object[]{a()});
        y(h);
        return jhiVar.b();
    }

    @Override // defpackage.bayj
    /* renamed from: i */
    public String b() {
        dndr dndrVar = dndr.UNKNOWN_ALIAS_TYPE;
        int ordinal = this.a.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return this.t.getString(R.string.YOUR_PLACES_ADD_WORK_ADDRESS);
            }
            throw new IllegalStateException("Alias placeholder item was not HOME or WORK");
        }
        return this.t.getString(R.string.YOUR_PLACES_ADD_HOME_ADDRESS);
    }

    @Override // defpackage.bbal, defpackage.bayj
    public cqss l() {
        return ibm.x();
    }

    @Override // defpackage.bbal, defpackage.bayj
    public Boolean r() {
        dndr dndrVar = dndr.UNKNOWN_ALIAS_TYPE;
        int ordinal = this.a.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return Boolean.valueOf(this.d.i());
        }
        return false;
    }

    public dndr u() {
        return this.a;
    }

    @Override // defpackage.bazi
    @dzsi
    protected final wdv v() {
        dndr dndrVar = dndr.UNKNOWN_ALIAS_TYPE;
        int ordinal = this.a.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return wdv.f();
            }
            return null;
        }
        return wdv.e();
    }
}
