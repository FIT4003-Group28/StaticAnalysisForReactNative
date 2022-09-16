package defpackage;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: amcj  reason: default package */
/* loaded from: classes.dex */
public final class amcj {
    public final azqb a;
    public final ambz b;
    public final snc c;
    public final azqb d;
    public final int e;
    public final Executor f;
    public final vne g;
    private final anju h = anju.a();

    public amcj(azqb azqbVar, ambz ambzVar, vne vneVar, snc sncVar, azqb azqbVar2, int i, Executor executor) {
        this.a = azqbVar;
        this.b = ambzVar;
        this.g = vneVar;
        this.c = sncVar;
        this.d = azqbVar2;
        this.e = i;
        this.f = executor;
    }

    public final ankt a() {
        ankt d = d();
        c(d);
        return d;
    }

    public final ankt b() {
        return this.g.b(new ampg() { // from class: amce
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                amcj amcjVar = amcj.this;
                aopa mo52toBuilder = ((amcm) obj).mo52toBuilder();
                long c = amcjVar.c.c();
                mo52toBuilder.copyOnWrite();
                amcm amcmVar = (amcm) mo52toBuilder.instance;
                amcmVar.b |= 1;
                amcmVar.c = c;
                int i = amcjVar.e;
                mo52toBuilder.copyOnWrite();
                amcm amcmVar2 = (amcm) mo52toBuilder.instance;
                amcmVar2.b |= 2;
                amcmVar2.d = i;
                return (amcm) mo52toBuilder.mo39build();
            }
        }, anjk.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(ankt anktVar) {
        anlz.A(anktVar, ammo.e(new amci(this)), this.f);
    }

    public final ankt d() {
        return this.h.b(ammo.b(new aniq() { // from class: amcg
            @Override // defpackage.aniq
            public final ankt a() {
                amcj amcjVar = amcj.this;
                amcl amclVar = (amcl) amcjVar.a.get();
                boolean z = amclVar.a;
                if (amvn.p(amclVar.a().values()).isEmpty()) {
                    return amcjVar.b();
                }
                amcl amclVar2 = (amcl) amcjVar.a.get();
                boolean z2 = amclVar2.a;
                amup a = amclVar2.a();
                ArrayList arrayList = new ArrayList();
                amzs it = a.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    final String str = (String) entry.getKey();
                    final amca amcaVar = (amca) entry.getValue();
                    arrayList.add(anii.h(amcaVar.a(), ammo.a(new ampg() { // from class: amck
                        @Override // defpackage.ampg
                        public final Object apply(Object obj) {
                            String str2 = str;
                            amca amcaVar2 = amcaVar;
                            amuk amukVar = (amuk) obj;
                            int size = amukVar.size();
                            for (int i = 0; i < size; i++) {
                                ambp ambpVar = (ambp) amukVar.get(i);
                                aqxo.F(str2.equals(ambpVar.i), "AccountProvider %s provides account(s) of different type from the declared one. Declared type: %s provided type: %s", amcaVar2, str2, ambpVar.i);
                            }
                            return amukVar;
                        }
                    }), amclVar2.b));
                }
                return anii.i(anii.i(anko.q(anlz.l(arrayList).a(ammo.g(new adgg(arrayList, 2)), amclVar2.b)), ammo.c(new amch(amcjVar, 1)), amcjVar.f), ammo.c(new amch(amcjVar)), amcjVar.f);
            }
        }), this.f);
    }
}
