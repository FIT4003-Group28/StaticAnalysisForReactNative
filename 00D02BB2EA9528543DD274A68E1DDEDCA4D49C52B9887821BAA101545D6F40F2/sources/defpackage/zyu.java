package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.filament.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: zyu  reason: default package */
/* loaded from: classes7.dex */
public class zyu implements zyt {
    private final zys a;
    private boolean g;
    private boolean h;
    private boolean i;
    private CharSequence c = "";
    private CharSequence d = "";
    private vve e = vve.OTHER;
    private dqvj f = dqvj.DRIVE;
    private jic b = new jic((String) null, ckqc.FULLY_QUALIFIED, cqrt.g(2131231285, irg.i()), 0);

    public zyu(zys zysVar) {
        this.a = zysVar;
    }

    @Override // defpackage.zyt
    public void a(@dzsi Bundle bundle) {
        dndr dndrVar;
        decq decqVar;
        amfu h;
        if (bundle == null) {
            return;
        }
        this.c = bundle.getCharSequence("widgetName", "");
        this.d = bundle.getCharSequence("widgetDestinationQuery", "");
        this.f = dqvj.c(bundle.getInt("travelMode", dqvj.DRIVE.k));
        this.e = vve.b(bundle.getInt("locationType", vve.OTHER.d));
        this.g = bundle.getBoolean("avoidFerriesOpt");
        this.h = bundle.getBoolean("avoidHighwaysOpt");
        this.i = bundle.getBoolean("avoidTollsOpt");
        zys zysVar = this.a;
        vve vveVar = this.e;
        List<azva> list = (List) deha.s(zysVar.b.m());
        int ordinal = vveVar.ordinal();
        if (ordinal != 0) {
            dndrVar = ordinal != 1 ? null : dndr.WORK;
        } else {
            dndrVar = dndr.HOME;
        }
        if (dndrVar != null) {
            for (azva azvaVar : list) {
                if (azvaVar.a == dndrVar && (decqVar = azvaVar.g) != null) {
                    h = zysVar.a.h(bhzs.a(decqVar), zysVar.getClass().getName(), null);
                    if (h != null) {
                        break;
                    }
                }
            }
        }
        h = null;
        cqtd j = h == null ? null : h.j();
        if (j == null) {
            int ordinal2 = this.e.ordinal();
            j = cqrt.g(ordinal2 != 0 ? ordinal2 != 1 ? 2131231285 : 2131231777 : 2131231654, irg.i());
        }
        this.b = new jic((String) null, ckqc.FULLY_QUALIFIED, j, 0);
    }

    @Override // defpackage.zyt
    public void b(Bundle bundle) {
        bundle.putCharSequence("widgetName", this.c);
        bundle.putCharSequence("widgetDestinationQuery", this.d);
        bundle.putInt("travelMode", this.f.k);
        bundle.putInt("locationType", this.e.d);
        bundle.putBoolean("avoidFerriesOpt", o(102).booleanValue());
        bundle.putBoolean("avoidHighwaysOpt", o(104).booleanValue());
        bundle.putBoolean("avoidTollsOpt", o(R.styleable.AppCompatTheme_viewInflaterClass).booleanValue());
    }

    @Override // defpackage.zyt
    public jic c() {
        return this.b;
    }

    @Override // defpackage.zyt
    public cqkl d() {
        return cqkl.a;
    }

    @Override // defpackage.zyt
    public CharSequence e() {
        return this.c;
    }

    @Override // defpackage.zyt
    public void f(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        this.c = charSequence;
        cqkx.p(this);
    }

    @Override // defpackage.zyt
    public CharSequence g() {
        return this.d;
    }

    @Override // defpackage.zyt
    public void h(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        this.d = charSequence;
        cqkx.p(this);
    }

    @Override // defpackage.zyt
    public Boolean i() {
        boolean z = false;
        if (!TextUtils.isEmpty(this.c) && !TextUtils.isEmpty(this.d)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.zyt
    public Integer j(dqvj dqvjVar) {
        dqvj dqvjVar2 = dqvj.DRIVE;
        vve vveVar = vve.HOME;
        int ordinal = dqvjVar.ordinal();
        return Integer.valueOf(ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? 2131231612 : 2131231764 : 2131231772 : 2131231595);
    }

    @Override // defpackage.zyt
    public Boolean k(dqvj dqvjVar) {
        return Boolean.valueOf(this.f == dqvjVar);
    }

    @Override // defpackage.zyt
    public Boolean l(int i) {
        boolean z = false;
        if (this.f == dqvj.TRANSIT) {
            return false;
        }
        if (i == 102) {
            return true;
        }
        if (this.f == dqvj.DRIVE) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.zyt
    public cqkl m(dqvj dqvjVar) {
        this.f = dqvjVar;
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.zyt
    public Integer n(int i) {
        return Integer.valueOf(i != 102 ? i != 104 ? i != 116 ? -1 : com.google.android.apps.maps.R.string.DIRECTIONS_OPTIONS_AVOID_TOLLS : com.google.android.apps.maps.R.string.DIRECTIONS_OPTIONS_AVOID_HIGHWAYS : com.google.android.apps.maps.R.string.DIRECTIONS_OPTIONS_AVOID_FERRIES);
    }

    @Override // defpackage.zyt
    public cqkl p(int i) {
        if (i == 102) {
            this.g = !this.g;
        } else if (i == 104) {
            this.h = !this.h;
        } else if (i == 116) {
            this.i = !this.i;
        }
        return cqkl.a;
    }

    @Override // defpackage.zyt
    public cqkl q() {
        vvc bZ = vvf.i.bZ();
        String charSequence = this.c.toString();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        vvf vvfVar = (vvf) bZ.b;
        charSequence.getClass();
        int i = vvfVar.a | 1;
        vvfVar.a = i;
        vvfVar.b = charSequence;
        vvfVar.c = this.e.d;
        int i2 = i | 2;
        vvfVar.a = i2;
        vvfVar.d = this.f.k;
        int i3 = i2 | 4;
        vvfVar.a = i3;
        boolean z = this.i;
        int i4 = i3 | 8;
        vvfVar.a = i4;
        vvfVar.e = z;
        boolean z2 = this.h;
        int i5 = i4 | 16;
        vvfVar.a = i5;
        vvfVar.f = z2;
        boolean z3 = this.g;
        vvfVar.a = i5 | 32;
        vvfVar.g = z3;
        amvg amvgVar = new amvg();
        amvgVar.b = this.d.toString();
        dpjx I = amvgVar.a().I();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        vvf vvfVar2 = (vvf) bZ.b;
        I.getClass();
        vvfVar2.h = I;
        vvfVar2.a |= 64;
        return cqkl.a;
    }

    @Override // defpackage.zyt
    public cqkl r() {
        return cqkl.a;
    }

    @Override // defpackage.zyt
    public cjtd s() {
        return cjtd.a(dtxo.ad);
    }

    @Override // defpackage.zyt
    public cjtd t() {
        return cjtd.a(dtxo.ae);
    }

    @Override // defpackage.zyt
    public cjtd u(dqvj dqvjVar) {
        ddho ddhoVar;
        dqvj dqvjVar2 = dqvj.DRIVE;
        vve vveVar = vve.HOME;
        int ordinal = dqvjVar.ordinal();
        if (ordinal == 1) {
            ddhoVar = dtxo.af;
        } else if (ordinal != 2) {
            ddhoVar = ordinal != 3 ? dtxo.ag : dtxo.ah;
        } else {
            ddhoVar = dtxo.ai;
        }
        return cjtd.a(ddhoVar);
    }

    @Override // defpackage.zyt
    public Boolean o(int i) {
        if (i != 102) {
            if (i == 104) {
                return Boolean.valueOf(this.h);
            }
            if (i == 116) {
                return Boolean.valueOf(this.i);
            }
            return false;
        }
        return Boolean.valueOf(this.g);
    }
}
