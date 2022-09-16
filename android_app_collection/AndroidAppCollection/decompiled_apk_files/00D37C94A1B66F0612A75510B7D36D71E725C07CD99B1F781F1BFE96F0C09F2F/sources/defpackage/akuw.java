package defpackage;

import android.os.Parcel;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: akuw  reason: default package */
/* loaded from: classes.dex */
public final class akuw implements ynj {
    public final azqb a;
    private final azqb b;
    private final azqb c;
    private final azqb d;

    public akuw(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
    }

    private final boolean c() {
        aveq aveqVar = ((aacz) this.b.get()).b().u;
        if (aveqVar == null) {
            aveqVar = aveq.a;
        }
        return aveqVar.o;
    }

    @Override // defpackage.ynj
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        final aaoj aaojVar = (aaoj) obj;
        if (!c()) {
            return;
        }
        ((Executor) this.c.get()).execute(new Runnable() { // from class: akuv
            @Override // java.lang.Runnable
            public final void run() {
                akuw akuwVar = akuw.this;
                amuk a = aaojVar.a();
                if (!a.isEmpty()) {
                    final int[] y = almu.y(a);
                    qvx b = qvy.b();
                    b.a = new qvo() { // from class: rtg
                        @Override // defpackage.qvo
                        public final void a(Object obj2, Object obj3) {
                            int[] iArr = y;
                            rtj rtjVar = new rtj((rvh) obj3);
                            rtk rtkVar = (rtk) ((rtl) obj2).D();
                            Parcel pv = rtkVar.pv();
                            dve.i(pv, rtjVar);
                            pv.writeString("__internal.external_ids#__internal.youtube_phenotype");
                            pv.writeInt(0);
                            pv.writeStringArray(new String[]{"DROP_BOX"});
                            pv.writeIntArray(iArr);
                            pv.writeByteArray(null);
                            rtkVar.px(2, pv);
                        }
                    };
                    ((qst) akuwVar.a.get()).s(b.a());
                }
            }
        });
    }

    public final void b() {
        if (c()) {
            ((yni) this.d.get()).a(this, aaoj.class, this);
        }
    }
}
