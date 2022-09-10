package defpackage;

import android.widget.CompoundButton;
import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cyq  reason: default package */
/* loaded from: classes5.dex */
public class cyq implements cyf {
    public final gen a;
    public final cjqy b;
    final cyp c;
    private final dqmr e;
    private final cyd f;
    private final akfa h;
    private final dxio<afha> i;
    public boolean d = true;
    private final List<cyh> g = new ArrayList();

    public cyq(gen genVar, dqmr dqmrVar, cyd cydVar, btrm btrmVar, gga ggaVar, cztz cztzVar, cyi cyiVar, cjqy cjqyVar, akfa akfaVar, dxio<afha> dxioVar) {
        this.a = genVar;
        this.e = dqmrVar;
        this.f = cydVar;
        this.c = new cyp(dqmrVar, ggaVar, cztzVar, btrmVar);
        this.b = cjqyVar;
        this.h = akfaVar;
        this.i = dxioVar;
        for (dqmq dqmqVar : dqmrVar.d) {
            this.g.add(new cyu(dqmqVar.a));
        }
        if (this.g.isEmpty()) {
            this.g.add(new cyu(dqmrVar.c));
        }
    }

    @Override // defpackage.cyf
    public cqkl a() {
        this.a.aT();
        if (!this.d) {
            cyd cydVar = this.f;
            cyp cypVar = this.c;
            String str = cypVar.a.b;
            dhke bZ = dhkf.d.bZ();
            dnqg bZ2 = dnqh.p.bZ();
            dnmu dnmuVar = dnmu.PROPERTY_GMM;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dnqh dnqhVar = (dnqh) bZ2.b;
            dnqhVar.l = dnmuVar.ap;
            dnqhVar.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhkf dhkfVar = (dhkf) bZ.b;
            dnqh bK = bZ2.bK();
            bK.getClass();
            dhkfVar.b = bK;
            dhkfVar.a |= 1;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhkf dhkfVar2 = (dhkf) bZ.b;
            str.getClass();
            dhkfVar2.a |= 2;
            dhkfVar2.c = str;
            cydVar.a.a(bZ.bK(), cypVar, bvrj.UI_THREAD);
        }
        return cqkl.a;
    }

    @Override // defpackage.cyf
    public cqkl b() {
        this.a.aT();
        return cqkl.a;
    }

    @Override // defpackage.cyf
    public cqkl c() {
        dehn<Boolean> k = this.i.a().k(this.a.J(), cjxr.w(this.e.f), 4);
        dbsk.s(k);
        deha.q(k, new cyn(this), dege.a);
        return cqkl.a;
    }

    @Override // defpackage.cyf
    public CompoundButton.OnCheckedChangeListener d() {
        return new CompoundButton.OnCheckedChangeListener(this) { // from class: cym
            private final cyq a;

            {
                this.a = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                cyq cyqVar = this.a;
                cyqVar.d = z;
                cyqVar.b.i(cjqg.a(z, cjtd.a(dtyi.cP)));
            }
        };
    }

    @Override // defpackage.cyf
    public Boolean e() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.cyf
    public String f() {
        return this.e.g;
    }

    @Override // defpackage.cyf
    public List<cyh> g() {
        return this.g;
    }

    @Override // defpackage.cyf
    public String h() {
        return String.format(this.a.J().getString(R.string.AD_BLOCKING_SETTING_DESCRIPTION), f());
    }

    @Override // defpackage.cyf
    public Boolean i() {
        boolean z = true;
        if (!this.e.e && this.h.c()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
