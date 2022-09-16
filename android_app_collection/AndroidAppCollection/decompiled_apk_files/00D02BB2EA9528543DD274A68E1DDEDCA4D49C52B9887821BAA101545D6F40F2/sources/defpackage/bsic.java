package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bsic  reason: default package */
/* loaded from: classes4.dex */
public class bsic implements jao {
    private final djkt a;
    private final Resources b;
    private final View.AccessibilityDelegate c = new bsib(this);
    private List<bsic> d = dcdc.e();
    private boolean e;
    private boolean f;
    @dzsi
    private Runnable g;

    public bsic(Resources resources, djkt djktVar, boolean z) {
        this.a = djktVar;
        this.e = z;
        this.b = resources;
    }

    @Override // defpackage.jao
    public Boolean a() {
        return Boolean.valueOf(this.f);
    }

    @Override // defpackage.jao
    public Integer b() {
        int i = 2;
        int i2 = 1;
        if (this.d.isEmpty()) {
            if (true != this.e) {
                i = 0;
            }
            return Integer.valueOf(i);
        }
        int i3 = 0;
        for (bsic bsicVar : this.d) {
            if (bsicVar.b().intValue() == 2) {
                i3++;
            }
        }
        if (i3 == this.d.size()) {
            this.e = true;
            return 2;
        }
        this.e = false;
        if (i3 <= 0) {
            i2 = 0;
        }
        return Integer.valueOf(i2);
    }

    @Override // defpackage.jao
    public CharSequence c() {
        return this.a.b;
    }

    @Override // defpackage.jao
    @dzsi
    public List<? extends jao> d() {
        return this.d;
    }

    @Override // defpackage.jao
    @dzsi
    public cjtd e() {
        return cjtd.a(dtxp.p);
    }

    @Override // defpackage.jao
    public cqkl f() {
        for (bsic bsicVar : this.d) {
            bsicVar.m(!this.e);
        }
        m(!this.e);
        Runnable runnable = this.g;
        if (runnable != null) {
            runnable.run();
        }
        return cqkl.a;
    }

    @Override // defpackage.jao
    public String g() {
        String string;
        bvsi bvsiVar = new bvsi(this.b);
        int intValue = b().intValue();
        if (intValue == 0) {
            bvsiVar.c(this.b.getString(R.string.ACCESSIBILITY_UNCHECKED_CHECK_BOX_DESCRIPTION));
        } else if (intValue == 1) {
            bvsiVar.c(this.b.getString(R.string.ACCESSIBILITY_INDETERMINATE_CHECK_BOX_DESCRIPTION));
        } else if (intValue == 2) {
            bvsiVar.c(this.b.getString(R.string.ACCESSIBILITY_CHECKED_CHECK_BOX_DESCRIPTION));
        }
        bvsiVar.c(c());
        bvsiVar.e();
        if (b().intValue() != 2) {
            string = this.b.getString(R.string.ACCESSIBILITY_CHECK_ACTION_DESCRIPTION);
        } else {
            string = this.b.getString(R.string.ACCESSIBILITY_UNCHECK_ACTION_DESCRIPTION);
        }
        bvsiVar.d(string);
        return bvsiVar.toString();
    }

    @Override // defpackage.jao
    public View.AccessibilityDelegate h() {
        return this.c;
    }

    @Override // defpackage.jao
    public cqkl i() {
        if (!this.d.isEmpty()) {
            this.f = !this.f;
        }
        cqkx.p(this);
        return cqkl.a;
    }

    public void j(List<bsic> list) {
        this.d = dcbg.b(list).s(new dbrn(this) { // from class: bshz
            private final bsic a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                final bsic bsicVar = this.a;
                bsic bsicVar2 = (bsic) obj;
                bsicVar2.k(new Runnable(bsicVar) { // from class: bsia
                    private final bsic a;

                    {
                        this.a = bsicVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        cqkx.p(this.a);
                    }
                });
                return bsicVar2;
            }
        }).z();
    }

    public void k(Runnable runnable) {
        this.g = runnable;
    }

    public Set<djkt> l() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (this.e) {
            linkedHashSet.add(this.a);
        }
        for (bsic bsicVar : this.d) {
            linkedHashSet.addAll(bsicVar.l());
        }
        return dcep.K(linkedHashSet);
    }

    public void m(boolean z) {
        this.e = z;
        cqkx.p(this);
    }
}
