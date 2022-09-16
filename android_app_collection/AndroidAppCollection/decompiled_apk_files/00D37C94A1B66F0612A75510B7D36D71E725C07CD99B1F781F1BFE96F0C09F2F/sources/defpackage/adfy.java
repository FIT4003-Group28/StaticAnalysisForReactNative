package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: adfy  reason: default package */
/* loaded from: classes.dex */
public final class adfy implements Runnable {
    final /* synthetic */ adga a;

    public adfy(adga adgaVar) {
        this.a = adgaVar;
    }

    public static /* synthetic */ void a(Throwable th) {
        String str = adga.a;
        String valueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
        sb.append("Failed to get route distribution to log routes: ");
        sb.append(valueOf);
        zep.c(str, sb.toString());
    }

    public final void b(List list) {
        this.a.l += adga.b;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((atbu) it.next()).d > 0) {
                aopa createBuilder = atbv.a.createBuilder();
                long j = this.a.l;
                createBuilder.copyOnWrite();
                atbv atbvVar = (atbv) createBuilder.instance;
                atbvVar.b |= 1;
                atbvVar.c = j;
                createBuilder.copyOnWrite();
                atbv atbvVar2 = (atbv) createBuilder.instance;
                aopu aopuVar = atbvVar2.d;
                if (!aopuVar.c()) {
                    atbvVar2.d = aopi.mutableCopy(aopuVar);
                }
                aonk.addAll((Iterable) list, (List) atbvVar2.d);
                arrf a = arrh.a();
                a.copyOnWrite();
                ((arrh) a.instance).cY((atbv) createBuilder.mo39build());
                this.a.d.c((arrh) a.mo39build());
                return;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c;
        adga adgaVar = this.a;
        if (!adgaVar.h.N) {
            adei adeiVar = (adei) adgaVar.e;
            adeq adeqVar = new adeq(adeiVar.b, adeiVar.e, adeiVar.d, adeiVar.c, (String) null, adeiVar.g, adeiVar.h);
            bhd bhdVar = (bhd) adeiVar.a.get();
            ArrayList arrayList = new ArrayList(bhd.i());
            atbu[] d = adeq.d();
            adeqVar.b(arrayList);
            for (int i = 0; i < arrayList.size(); i++) {
                bhc bhcVar = (bhc) arrayList.get(i);
                if (!adgl.i(bhcVar)) {
                    if (adgj.d(bhcVar) && adeqVar.b) {
                        c = 4;
                    } else if (adeq.e(bhcVar)) {
                        c = 1;
                    } else {
                        c = adgl.g(bhcVar) ? (char) 3 : (char) 6;
                    }
                } else {
                    c = adeqVar.c(bhcVar) ? (char) 5 : (char) 2;
                }
                aopa mo52toBuilder = d[c].mo52toBuilder();
                int i2 = d[c].d;
                mo52toBuilder.copyOnWrite();
                atbu atbuVar = (atbu) mo52toBuilder.instance;
                atbuVar.b = 2 | atbuVar.b;
                atbuVar.d = i2 + 1;
                d[c] = (atbu) mo52toBuilder.mo39build();
            }
            b(amuk.p(d));
            return;
        }
        adgaVar.g.execute(new Runnable() { // from class: adfx
            @Override // java.lang.Runnable
            public final void run() {
                final adfy adfyVar = adfy.this;
                adei adeiVar2 = (adei) adfyVar.a.e;
                adeq adeqVar2 = new adeq(adeiVar2.b, adeiVar2.e, adeiVar2.d, adeiVar2.c, (String) null, adeiVar2.g, adeiVar2.h);
                bhd bhdVar2 = (bhd) adeiVar2.a.get();
                amuk o = amuk.o(bhd.i());
                ylx.k(anii.i(anii.i(adeqVar2.d.a(o), new adep(adeqVar2, o), adeqVar2.c), urc.i, adeiVar2.f), adfyVar.a.i, acsn.n, new ylw() { // from class: adfw
                    @Override // defpackage.ylw, defpackage.zdt
                    public final void a(Object obj) {
                        adfy.this.b((List) obj);
                    }
                });
            }
        });
    }
}
