package defpackage;

import java.util.Comparator;
/* renamed from: cyzr  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cyzr implements Comparator {
    static final Comparator a = new cyzr();

    private cyzr() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        dsia dsiaVar;
        cywm cywmVar = (cywm) obj;
        dsgk dsgkVar = ((cywm) obj2).a;
        if (dsgkVar.a == 1) {
            dsiaVar = (dsia) dsgkVar.b;
        } else {
            dsiaVar = dsia.e;
        }
        dsgd dsgdVar = dsiaVar.b;
        if (dsgdVar == null) {
            dsgdVar = dsgd.d;
        }
        double d = dsgdVar.c;
        dsgk dsgkVar2 = cywmVar.a;
        dsgd dsgdVar2 = (dsgkVar2.a == 1 ? (dsia) dsgkVar2.b : dsia.e).b;
        if (dsgdVar2 == null) {
            dsgdVar2 = dsgd.d;
        }
        return Double.compare(d, dsgdVar2.c);
    }
}
