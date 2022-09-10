package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cgyw  reason: default package */
/* loaded from: classes4.dex */
public class cgyw implements cgwa {
    private final dwqt a;
    private final String b;
    private final Activity c;
    private final cgyv d;
    private final boolean e;
    @dzsi
    private final jic f;
    @dzsi
    private final jic g;
    private boolean h;

    public cgyw(dwqt dwqtVar, cgyv cgyvVar, boolean z, boolean z2, Activity activity) {
        jic jicVar;
        this.a = dwqtVar;
        dwqs dwqsVar = dwqtVar.b;
        this.b = (dwqsVar == null ? dwqs.f : dwqsVar).b;
        this.d = cgyvVar;
        this.e = z;
        this.h = z2;
        this.c = activity;
        jic jicVar2 = null;
        if (z) {
            dwqs dwqsVar2 = dwqtVar.b;
            jicVar = new jic((dwqsVar2 == null ? dwqs.f : dwqsVar2).e, ckqc.FULLY_QUALIFIED, 0);
        } else {
            jicVar = null;
        }
        this.f = jicVar;
        if (z) {
            dwqs dwqsVar3 = dwqtVar.b;
            jicVar2 = new jic((dwqsVar3 == null ? dwqs.f : dwqsVar3).d, ckqc.FULLY_QUALIFIED, 0);
        }
        this.g = jicVar2;
    }

    @Override // defpackage.cgwa
    public Boolean a() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.cgwa
    public Boolean b() {
        return Boolean.valueOf(this.h);
    }

    @Override // defpackage.cgwa
    public String c() {
        return this.b;
    }

    @Override // defpackage.cgwa
    @dzsi
    public jic d() {
        return this.h ? this.f : this.g;
    }

    @Override // defpackage.cgwa
    public CharSequence e() {
        if (this.h) {
            return this.c.getString(R.string.UGC_TASKS_ACCESSIBILITY_FILTER_SELECTED, new Object[]{this.b});
        }
        return this.c.getString(R.string.UGC_TASKS_ACCESSIBILITY_FILTER_NOT_SELECTED, new Object[]{this.b});
    }

    @Override // defpackage.cgwa
    public dspd f() {
        return this.a.a;
    }

    @Override // defpackage.cgwa
    public dwqt g() {
        return this.a;
    }

    @Override // defpackage.cgwa
    public cqkl h() {
        if (this.d.e().booleanValue()) {
            if (this.d.h().booleanValue()) {
                this.d.i();
            }
        } else {
            this.h = !this.h;
            cqkx.p(this);
            this.d.g(this);
        }
        return cqkl.a;
    }

    @Override // defpackage.cgwa
    public cjtd i() {
        cjta b = cjtd.b();
        b.d = this.e ? dtyd.S : dtyd.R;
        b.g(this.a.c);
        ddzy bZ = deab.c.bZ();
        deaa deaaVar = this.h ? deaa.TOGGLE_ON : deaa.TOGGLE_OFF;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        deab deabVar = (deab) bZ.b;
        deabVar.b = deaaVar.d;
        deabVar.a |= 1;
        b.a = bZ.bK();
        return b.a();
    }
}
