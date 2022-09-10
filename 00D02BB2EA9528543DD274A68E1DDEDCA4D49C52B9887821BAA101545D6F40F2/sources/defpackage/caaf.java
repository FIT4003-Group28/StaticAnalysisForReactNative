package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: caaf  reason: default package */
/* loaded from: classes4.dex */
public final class caaf implements crzp<btlu> {
    final /* synthetic */ caaw a;

    public caaf(caaw caawVar) {
        this.a = caawVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<btlu> crzmVar) {
        btlu l = crzmVar.l();
        if (l != null) {
            final caaw caawVar = this.a;
            String string = caawVar.o.getString("arg_key_user_account_id");
            final String h = btlu.h(l);
            if (string == null || h == null || h.equals(string)) {
                return;
            }
            dwtm dwtmVar = caawVar.aR;
            String str = dwtmVar != null ? dwtmVar.b : "";
            boolean z = true;
            if (!str.isEmpty() && !str.equals(string)) {
                z = false;
            }
            boolean equals = h.equals(str);
            if (!caawVar.aD) {
                return;
            }
            if (!z && !equals) {
                return;
            }
            caawVar.ao.b(new Runnable(caawVar, h) { // from class: bzzj
                private final caaw a;
                private final String b;

                {
                    this.a = caawVar;
                    this.b = h;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    dkcp dkcpVar;
                    caaw caawVar2 = this.a;
                    String str2 = this.b;
                    gga ggaVar = caawVar2.aE;
                    dbsk.s(ggaVar);
                    gn g = ggaVar.g();
                    if (g.J()) {
                        return;
                    }
                    g.f();
                    cabk D = caawVar2.ad.D();
                    cafi cafiVar = caawVar2.ai;
                    if (D != null) {
                        dkcpVar = D.e();
                    } else {
                        dkcpVar = caawVar2.aT;
                    }
                    cafiVar.k(str2, dkcpVar);
                }
            }, bvrj.UI_THREAD);
        }
    }
}
