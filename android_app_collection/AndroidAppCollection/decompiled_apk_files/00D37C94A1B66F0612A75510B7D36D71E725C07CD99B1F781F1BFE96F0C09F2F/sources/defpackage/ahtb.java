package defpackage;

import android.text.TextUtils;
import java.util.List;
/* compiled from: PG */
/* renamed from: ahtb  reason: default package */
/* loaded from: classes.dex */
public final class ahtb implements ahua {
    private final List a;
    private final List b;

    public ahtb(List list, List list2) {
        amzt listIterator = ((amuk) list).listIterator();
        while (listIterator.hasNext()) {
            ((acup) listIterator.next()).getClass();
        }
        amzt listIterator2 = ((amuk) list2).listIterator();
        while (listIterator2.hasNext()) {
            ((acup) listIterator2.next()).getClass();
        }
        this.a = list;
        this.b = list2;
    }

    private static atnp b(apzg apzgVar) {
        if (apzgVar != null) {
            return (atnp) apzgVar.qm(atno.b);
        }
        return null;
    }

    @Override // defpackage.ahua
    public final void a(acti actiVar, apzg apzgVar, ahuc ahucVar) {
        aopa mo52toBuilder;
        apzg apzgVar2 = null;
        aopc aopcVar = apzgVar == null ? null : (aopc) apzgVar.mo52toBuilder();
        if (aopcVar != null) {
            if (ahucVar == null) {
                apzgVar2 = (apzg) aopcVar.mo39build();
            } else {
                boolean z = !TextUtils.isEmpty(ahucVar.a);
                if (b((apzg) aopcVar.mo39build()) == null) {
                    mo52toBuilder = atnp.a.createBuilder();
                } else {
                    mo52toBuilder = b((apzg) aopcVar.mo39build()).mo52toBuilder();
                }
                if (z) {
                    String str = ahucVar.a;
                    if (str == null) {
                        mo52toBuilder.copyOnWrite();
                        atnp atnpVar = (atnp) mo52toBuilder.instance;
                        atnpVar.b &= -2;
                        atnpVar.c = atnp.a.c;
                    } else {
                        mo52toBuilder.copyOnWrite();
                        atnp atnpVar2 = (atnp) mo52toBuilder.instance;
                        atnpVar2.b |= 1;
                        atnpVar2.c = str;
                    }
                }
                int i = ahucVar.b.a;
                mo52toBuilder.copyOnWrite();
                atnp atnpVar3 = (atnp) mo52toBuilder.instance;
                atnpVar3.b |= 2;
                atnpVar3.d = i;
                aopcVar.e(atno.b, (atnp) mo52toBuilder.mo39build());
                apzgVar2 = (apzg) aopcVar.mo39build();
            }
        }
        apzg apzgVar3 = apzgVar2;
        actiVar.e(acuo.a(3832), acuc.DEFAULT, apzgVar3, acty.a(apzgVar3, askh.b), acty.a(apzgVar3, askh.a));
        amzt listIterator = ((amuk) this.a).listIterator();
        while (listIterator.hasNext()) {
            acup acupVar = (acup) listIterator.next();
            if (acupVar != null) {
                actiVar.n(new acte(acupVar));
            }
        }
        amzt listIterator2 = ((amuk) this.b).listIterator();
        while (listIterator2.hasNext()) {
            actiVar.D(new acte((acup) listIterator2.next()));
        }
    }
}
