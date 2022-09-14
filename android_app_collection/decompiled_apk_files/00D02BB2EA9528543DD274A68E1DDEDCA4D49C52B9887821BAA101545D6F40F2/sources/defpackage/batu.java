package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: batu  reason: default package */
/* loaded from: classes3.dex */
public class batu implements batw {
    public final gga a;
    public final dxio<boxa> b;
    public final azxa c;
    public ilo d;
    private jad e;
    private jad f;
    private jbk g;

    public batu(dxio<boxa> dxioVar, gga ggaVar, azxa azxaVar, ilo iloVar) {
        this.c = azxaVar;
        this.d = iloVar;
        this.b = dxioVar;
        this.a = ggaVar;
    }

    private static jad j(CharSequence charSequence, Runnable runnable, ddho ddhoVar) {
        return new batr(charSequence, runnable, ddhoVar);
    }

    public Boolean a() {
        return Boolean.valueOf(this.c.d().b().equals(this.c.c()));
    }

    public CharSequence b() {
        if (this.c.g() == dndr.HOME) {
            return this.a.getString(R.string.HOME_SET_CONFIRMATION);
        }
        if (this.c.g() == dndr.WORK) {
            return this.a.getString(R.string.WORK_SET_CONFIRMATION);
        }
        return this.a.getString(R.string.PLACE_SET_CONFIRMATION);
    }

    @Override // defpackage.batw
    public akqq c() {
        return this.c.d();
    }

    @Override // defpackage.batw
    public CharSequence d() {
        if (a().booleanValue()) {
            return this.a.getString(R.string.DROPPED_PIN_TEXT);
        }
        return this.c.c();
    }

    @Override // defpackage.batw
    public Boolean e() {
        return Boolean.valueOf(this.c.g() == dndr.HOME);
    }

    @Override // defpackage.batw
    public CharSequence f() {
        if (a().booleanValue()) {
            return this.a.getString(R.string.DROPPED_PIN_ADDRESS_AND_DESCRIPTION, new Object[]{this.c.j()});
        }
        return this.a.getString(R.string.PIN_IN_WRONG_LOCATION_DESCRIPTION);
    }

    @Override // defpackage.batw
    public jad g() {
        if (this.e == null) {
            this.e = j(this.a.getString(R.string.DONE), new Runnable(this) { // from class: batp
                private final batu a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.g().f();
                }
            }, dtxl.cs);
        }
        return this.e;
    }

    @Override // defpackage.batw
    public jad h() {
        if (this.f == null) {
            this.f = j(this.a.getString(R.string.PLACE_SUGGEST_AN_EDIT), new Runnable(this) { // from class: batq
                private final batu a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    batu batuVar = this.a;
                    dnps bZ = dnqe.i.bZ();
                    dnqb dnqbVar = dnqb.UNKNOWN_ENTRY_POINT;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dnqe dnqeVar = (dnqe) bZ.b;
                    dnqeVar.b = dnqbVar.ah;
                    dnqeVar.a |= 1;
                    dnqe bK = bZ.bK();
                    batuVar.a.g().e();
                    if (batuVar.d == null) {
                        ilo a = batz.a(batuVar.c.c(), batuVar.c.b(), batuVar.c.d());
                        dbsk.s(a);
                        batuVar.d = a;
                    }
                    batuVar.b.a().t(bwrs.a(batuVar.d), bK);
                }
            }, dtxl.cr);
        }
        return this.f;
    }

    @Override // defpackage.batw
    public jbk i() {
        if (this.g == null) {
            this.g = new batt(this, b());
        }
        return this.g;
    }
}
