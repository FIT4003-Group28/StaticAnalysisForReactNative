package defpackage;

import java.util.Comparator;
/* renamed from: cyub  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cyub implements Comparator {
    static final Comparator a = new cyub();

    private cyub() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        double d;
        String str;
        cywm cywmVar = (cywm) obj;
        cywm cywmVar2 = (cywm) obj2;
        dsgk dsgkVar = cywmVar.a;
        if (dsgkVar.a == 1 && cywmVar2.a.a == 1) {
            boolean isEmpty = ((dsia) dsgkVar.b).c.isEmpty();
            double d2 = dcyn.a;
            if (!isEmpty) {
                dsgk dsgkVar2 = cywmVar.a;
                dsgv dsgvVar = (dsgkVar2.a == 1 ? (dsia) dsgkVar2.b : dsia.e).c.get(0).d;
                if (dsgvVar == null) {
                    dsgvVar = dsgv.f;
                }
                dsgd dsgdVar = dsgvVar.d;
                if (dsgdVar == null) {
                    dsgdVar = dsgd.d;
                }
                d = dsgdVar.c;
            } else {
                d = 0.0d;
            }
            dsgk dsgkVar3 = cywmVar2.a;
            if (!(dsgkVar3.a == 1 ? (dsia) dsgkVar3.b : dsia.e).c.isEmpty()) {
                dsgk dsgkVar4 = cywmVar2.a;
                dsgv dsgvVar2 = (dsgkVar4.a == 1 ? (dsia) dsgkVar4.b : dsia.e).c.get(0).d;
                if (dsgvVar2 == null) {
                    dsgvVar2 = dsgv.f;
                }
                dsgd dsgdVar2 = dsgvVar2.d;
                if (dsgdVar2 == null) {
                    dsgdVar2 = dsgd.d;
                }
                d2 = dsgdVar2.c;
            }
            if (d != d2) {
                return d <= d2 ? 1 : -1;
            }
            dsgk dsgkVar5 = cywmVar.a;
            String str2 = "";
            if (!(dsgkVar5.a == 1 ? (dsia) dsgkVar5.b : dsia.e).c.isEmpty()) {
                dsgk dsgkVar6 = cywmVar.a;
                dsgv dsgvVar3 = (dsgkVar6.a == 1 ? (dsia) dsgkVar6.b : dsia.e).c.get(0).d;
                if (dsgvVar3 == null) {
                    dsgvVar3 = dsgv.f;
                }
                dshv dshvVar = dsgvVar3.c;
                if (dshvVar == null) {
                    dshvVar = dshv.e;
                }
                str = dshvVar.b;
            } else {
                str = str2;
            }
            dsgk dsgkVar7 = cywmVar2.a;
            if (!(dsgkVar7.a == 1 ? (dsia) dsgkVar7.b : dsia.e).c.isEmpty()) {
                dsgk dsgkVar8 = cywmVar2.a;
                dsgv dsgvVar4 = (dsgkVar8.a == 1 ? (dsia) dsgkVar8.b : dsia.e).c.get(0).d;
                if (dsgvVar4 == null) {
                    dsgvVar4 = dsgv.f;
                }
                dshv dshvVar2 = dsgvVar4.c;
                if (dshvVar2 == null) {
                    dshvVar2 = dshv.e;
                }
                str2 = dshvVar2.b;
            }
            if (!str.equals(str2)) {
                return str.compareTo(str2);
            }
            return 0;
        }
        return 0;
    }
}
