package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ybw  reason: default package */
/* loaded from: classes4.dex */
public final class ybw implements afzf {
    final /* synthetic */ arrh a;
    final /* synthetic */ arrh b;
    final /* synthetic */ ybx c;

    public ybw(ybx ybxVar, arrh arrhVar, arrh arrhVar2) {
        this.c = ybxVar;
        this.a = arrhVar;
        this.b = arrhVar2;
    }

    private final void d() {
        arrh arrhVar = this.b;
        if (arrhVar != null) {
            this.c.i.c(arrhVar);
        }
    }

    private final void e() {
        arrh arrhVar = this.a;
        if (arrhVar != null) {
            this.c.i.c(arrhVar);
        }
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        this.c.g.dismiss();
        for (ycr ycrVar : this.c.h.a) {
            ycrVar.a();
        }
        this.c.d.e(cffVar);
        d();
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        awja awjaVar;
        aqft aqftVar;
        ated atedVar;
        arag aragVar;
        arag aragVar2;
        ashl ashlVar = (ashl) obj;
        this.c.g.dismiss();
        ycs ycsVar = this.c.h;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(ycsVar.a);
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            ((ycr) arrayList.get(i2)).b();
        }
        this.c.f.b();
        if (ashlVar.e.size() != 0) {
            this.c.e.e(ashlVar.e, null);
        }
        if ((ashlVar.b & 2) == 0) {
            e();
            return;
        }
        ashj ashjVar = ashlVar.d;
        if (ashjVar == null) {
            ashjVar = ashj.a;
        }
        if (ashjVar.b == 96619486) {
            ashj ashjVar2 = ashlVar.d;
            if (ashjVar2 == null) {
                ashjVar2 = ashj.a;
            }
            if (ashjVar2.b == 96619486) {
                atedVar = (ated) ashjVar2.c;
            } else {
                atedVar = ated.a;
            }
            if ((atedVar.b & 2) != 0) {
                ajxz ajxzVar = this.c.b;
                arhs arhsVar = atedVar.d;
                if (arhsVar == null) {
                    arhsVar = arhs.a;
                }
                arhr b = arhr.b(arhsVar.c);
                if (b == null) {
                    b = arhr.UNKNOWN;
                }
                i = ajxzVar.a(b);
            }
            apok apokVar = atedVar.f;
            if (apokVar == null) {
                apokVar = apok.a;
            }
            final apoj apojVar = apokVar.c;
            if (apojVar == null) {
                apojVar = apoj.a;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this.c.a);
            if ((atedVar.b & 1) != 0) {
                aragVar = atedVar.c;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            AlertDialog.Builder message = builder.setTitle(ajgl.b(aragVar)).setIcon(i).setMessage(ajgl.j(System.getProperty("line.separator"), ajgl.l(atedVar.e)));
            if ((apojVar.b & 256) != 0) {
                aragVar2 = apojVar.i;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
            } else {
                aragVar2 = null;
            }
            AlertDialog create = message.setPositiveButton(ajgl.b(aragVar2), new DialogInterface.OnClickListener() { // from class: ybv
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    ybw.this.c.c.H(3, new acte(apojVar.t), null);
                }
            }).create();
            this.c.c.u(new acte(atedVar.g), null);
            this.c.c.u(new acte(apojVar.t), null);
            create.show();
            e();
            return;
        }
        ashj ashjVar3 = ashlVar.d;
        if (ashjVar3 == null) {
            ashjVar3 = ashj.a;
        }
        if (ashjVar3.b == 64099105) {
            ashj ashjVar4 = ashlVar.d;
            if (ashjVar4 == null) {
                ashjVar4 = ashj.a;
            }
            if (ashjVar4.b == 64099105) {
                aqftVar = (aqft) ashjVar4.c;
            } else {
                aqftVar = aqft.a;
            }
            ybx ybxVar = this.c;
            ajgx.n(ybxVar.a, aqftVar, ybxVar.e, ybxVar.c, null);
            e();
            return;
        }
        ashj ashjVar5 = ashlVar.d;
        if (ashjVar5 == null) {
            ashjVar5 = ashj.a;
        }
        if (ashjVar5.b != 65500215) {
            return;
        }
        yzj yzjVar = this.c.d;
        ashj ashjVar6 = ashlVar.d;
        if (ashjVar6 == null) {
            ashjVar6 = ashj.a;
        }
        if (ashjVar6.b == 65500215) {
            awjaVar = (awja) ashjVar6.c;
        } else {
            awjaVar = awja.a;
        }
        yzjVar.d(yic.i(awjaVar).toString());
        d();
    }
}
