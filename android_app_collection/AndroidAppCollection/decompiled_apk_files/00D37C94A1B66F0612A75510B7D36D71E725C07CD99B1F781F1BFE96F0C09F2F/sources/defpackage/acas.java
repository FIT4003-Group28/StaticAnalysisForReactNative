package defpackage;

import android.os.Handler;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acas  reason: default package */
/* loaded from: classes.dex */
public final class acas implements afzf {
    public final abzh a;
    private final Handler b;
    private final acti c;

    public acas(Handler handler, acti actiVar, abzh abzhVar) {
        this.b = handler;
        this.c = actiVar;
        this.a = abzhVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        this.b.post(new acaq(this.a));
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        final arsj arsjVar = (arsj) obj;
        if (arsjVar != null) {
            this.c.D(new acte(arsjVar.d));
        }
        if (arsjVar != null) {
            arsh arshVar = arsjVar.c;
            if (arshVar == null) {
                arshVar = arsh.a;
            }
            if (arshVar.b == 146983145) {
                this.b.post(new Runnable() { // from class: acar
                    @Override // java.lang.Runnable
                    public final void run() {
                        atgr atgrVar;
                        acas acasVar = acas.this;
                        arsj arsjVar2 = arsjVar;
                        abzh abzhVar = acasVar.a;
                        arsh arshVar2 = arsjVar2.c;
                        if (arshVar2 == null) {
                            arshVar2 = arsh.a;
                        }
                        if (arshVar2.b == 146983145) {
                            atgrVar = (atgr) arshVar2.c;
                        } else {
                            atgrVar = atgr.a;
                        }
                        abzhVar.d(atgrVar);
                    }
                });
                return;
            }
        }
        this.b.post(new acaq(this.a));
    }
}
