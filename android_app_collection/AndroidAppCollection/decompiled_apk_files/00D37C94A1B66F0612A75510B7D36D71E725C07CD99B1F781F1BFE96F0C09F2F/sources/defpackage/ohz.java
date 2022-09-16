package defpackage;

import android.view.ViewGroup;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ohz  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ohz implements Runnable {
    public final /* synthetic */ oie a;
    private final /* synthetic */ int b;

    public /* synthetic */ ohz(oie oieVar) {
        this.a = oieVar;
    }

    public /* synthetic */ ohz(oie oieVar, int i) {
        this.b = i;
        this.a = oieVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.a.s();
                return;
            case 1:
                this.a.A();
                return;
            case 2:
                ((abcc) this.a.ak.get()).a.c();
                return;
            case 3:
                this.a.m();
                return;
            case 4:
                oie oieVar = this.a;
                oieVar.C = (ViewGroup) oieVar.a.findViewById(R.id.pane_fragment_container);
                return;
            case 5:
                this.a.r();
                return;
            case 6:
                this.a.B();
                return;
            case 7:
                this.a.C();
                return;
            case 8:
                this.a.o();
                return;
            case 9:
                this.a.p();
                return;
            case 10:
                this.a.at.a();
                return;
            case 11:
                this.a.n();
                return;
            case 12:
                oie oieVar2 = this.a;
                final ajmy ajmyVar = (ajmy) oieVar2.ag.get();
                ajmyVar.f();
                final efz efzVar = oieVar2.aS;
                if (efzVar.f.get() != 2 || !efzVar.e.compareAndSet(false, true)) {
                    return;
                }
                final efk efkVar = new efk(efzVar.c, efzVar.b, new Runnable() { // from class: efy
                    @Override // java.lang.Runnable
                    public final void run() {
                        efz.this.e();
                    }
                });
                ajmyVar.d(efkVar);
                ((akcq) efzVar.d.get()).a(efkVar);
                efzVar.b().B(azpj.b(efzVar.b.c())).R(new aypv() { // from class: efw
                    @Override // defpackage.aypv
                    public final void a() {
                        efz efzVar2 = efz.this;
                        ajmx ajmxVar = efkVar;
                        ajmyVar.o(ajmxVar);
                        ((akcq) efzVar2.d.get()).b(ajmxVar);
                    }
                });
                return;
            case 13:
                oie oieVar3 = this.a;
                oieVar3.am = new nio(oieVar3.a.getApplicationContext());
                return;
            case 14:
                ((loq) this.a.X.get()).a();
                return;
            case 15:
                oie oieVar4 = this.a;
                oieVar4.c.g(oieVar4.ah);
                return;
            case 16:
                this.a.c.a();
                return;
            case 17:
                this.a.V.a();
                return;
            case 18:
                this.a.az.a();
                return;
            default:
                oie oieVar5 = this.a;
                oieVar5.az.c(oieVar5.a, oieVar5.u);
                return;
        }
    }
}
