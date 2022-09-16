package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.car.display.CarDisplayId;
/* compiled from: PG */
/* renamed from: cmvs  reason: default package */
/* loaded from: classes.dex */
public class cmvs extends ContextWrapper implements LayoutInflater.Factory, cmvt {
    private boolean a;
    public cmvu w;

    public cmvs() {
        super(null);
    }

    @Override // defpackage.cmvt
    public final void A(cmvu cmvuVar) {
        this.w = cmvuVar;
    }

    @Override // defpackage.cmvt
    public void B(Context context) {
        attachBaseContext(context);
    }

    public final View C(int i) {
        return ((cnht) this.w).l.findViewById(i);
    }

    public final cnfs D() {
        cnht cnhtVar = (cnht) this.w;
        if (cnhtVar.v == null) {
            cnhtVar.v = new cnin(new cngv(cnhtVar));
        }
        return cnhtVar.v;
    }

    @Override // defpackage.cmvt
    public void E() {
    }

    public final boolean F() {
        cmvu cmvuVar = this.w;
        if (cmvuVar != null) {
            return ((cnht) cmvuVar).s;
        }
        return true;
    }

    public final boolean G() {
        cmvu cmvuVar = this.w;
        if (cmvuVar != null) {
            try {
                return ((cnht) cmvuVar).q;
            } catch (AbstractMethodError | NoSuchMethodError unused) {
                if (!F()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.cmvt
    public void H() {
    }

    @Override // defpackage.cmvt
    public Object I() {
        return null;
    }

    public final Object J() {
        return ((cnht) this.w).C;
    }

    public final int K() {
        try {
            return this.w.b();
        } catch (AbstractMethodError | NoSuchMethodError unused) {
            return 0;
        }
    }

    public final int L() {
        try {
            cmvu cmvuVar = this.w;
            dbsk.t(((cnht) cmvuVar).j, "Can't provide regionId before activity is started");
            return ((cnht) cmvuVar).j.a;
        } catch (AbstractMethodError | NoSuchMethodError unused) {
            return 0;
        }
    }

    public final cnhy M() {
        try {
            cmvu cmvuVar = this.w;
            if (!((cnht) cmvuVar).f()) {
                return null;
            }
            cnhu cnhuVar = ((cnht) cmvuVar).I;
            int b = ((cnht) cmvuVar).b();
            cmwc cmwcVar = cnhuVar.a;
            final CarDisplayId carDisplayId = new CarDisplayId(b);
            final cneo cneoVar = ((cngt) cmwcVar).a;
            return (cnhy) cneoVar.f.h(new cnjk(cneoVar, carDisplayId) { // from class: cnba
                private final cncb a;
                private final CarDisplayId b;

                {
                    this.a = cneoVar;
                    this.b = carDisplayId;
                }

                @Override // defpackage.cnjk, java.util.concurrent.Callable
                public final Object call() {
                    final cncb cncbVar = this.a;
                    final CarDisplayId carDisplayId2 = this.b;
                    return (cnhy) cncbVar.d.c(cnhy.class, carDisplayId2.a(), new cnck(cncbVar, carDisplayId2) { // from class: cnbw
                        private final cncb a;
                        private final CarDisplayId b;

                        {
                            this.a = cncbVar;
                            this.b = carDisplayId2;
                        }

                        @Override // defpackage.cnck
                        public final Object a() {
                            return new cnhy(this.a.m(this.b));
                        }
                    });
                }
            });
        } catch (AbstractMethodError | NoSuchMethodError unused) {
            return null;
        }
    }

    public final Object N() {
        cnht cnhtVar = (cnht) this.w;
        if (!cnhtVar.f()) {
            return null;
        }
        final cneo cneoVar = ((cngt) cnhtVar.I.a).a;
        cnic cnicVar = (cnic) cneoVar.d.b(cnic.class, new dbty(cneoVar) { // from class: cnaw
            private final cncb a;

            {
                this.a = cneoVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return new cnic(this.a);
            }
        });
        if (cnicVar == null) {
            throw new cmwn("could not find a manager for the given serviceName:  serviceName = info");
        }
        return cnicVar;
    }

    public final Intent No() {
        return ((cnht) this.w).n;
    }

    public final void Np(Intent intent) {
        cmvu cmvuVar = this.w;
        try {
            ((cnht) cmvuVar).n = intent;
            ((cnht) cmvuVar).J.r(intent);
        } catch (RemoteException unused) {
            cmyz.a(((cnht) cmvuVar).d);
        }
    }

    public final int Nq() {
        cnht cnhtVar;
        cmxz cmxzVar;
        cmvu cmvuVar = this.w;
        if (cmvuVar == null || (cmxzVar = (cnhtVar = (cnht) cmvuVar).J) == null) {
            return 0;
        }
        try {
            return cmxzVar.s();
        } catch (RemoteException unused) {
            cmyz.a(cnhtVar.d);
            return 0;
        }
    }

    public final Window Nr() {
        return ((cnht) this.w).l.getWindow();
    }

    @Override // defpackage.cmvt
    public final boolean O() {
        return false;
    }

    public void Oe(Bundle bundle) {
        bundle.putBundle("android:viewHierarchyState", ((cnht) this.w).l.getWindow().saveHierarchyState());
    }

    public void Of(Bundle bundle) {
        Bundle bundle2;
        cnht cnhtVar = (cnht) this.w;
        cmyy cmyyVar = cnhtVar.l;
        if (cmyyVar == null || cmyyVar.getWindow() == null || (bundle2 = bundle.getBundle("android:viewHierarchyState")) == null) {
            return;
        }
        cnhtVar.l.getWindow().restoreHierarchyState(bundle2);
    }

    public void Og(WindowManager.LayoutParams layoutParams) {
    }

    public void Oh(IBinder iBinder) {
    }

    public final LayoutInflater Ok() {
        return ((cnht) this.w).l.getLayoutInflater();
    }

    @Deprecated
    public Context Ol() {
        return getBaseContext();
    }

    @Override // defpackage.cmvt
    public final boolean P() {
        return false;
    }

    @Override // defpackage.cmvt
    public final boolean Q(int i) {
        if (i == 4) {
            this.a = true;
            u();
            return this.a;
        }
        return false;
    }

    public void e(Bundle bundle) {
    }

    public void f() {
    }

    public void g() {
    }

    public void j(boolean z, boolean z2) {
    }

    public void l(Configuration configuration) {
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return null;
    }

    @Override // defpackage.cmvt
    public void r() {
    }

    @Override // defpackage.cmvt
    public void s() {
    }

    @Override // defpackage.cmvt
    public void t() {
    }

    public void u() {
        this.a = false;
    }

    @Override // defpackage.cmvt
    public void v(Intent intent) {
    }

    @Override // defpackage.cmvt
    public void w(int i) {
    }
}
