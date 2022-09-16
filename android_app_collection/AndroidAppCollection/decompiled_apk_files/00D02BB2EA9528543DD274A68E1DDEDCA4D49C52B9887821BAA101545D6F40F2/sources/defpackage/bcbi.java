package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bcbi  reason: default package */
/* loaded from: classes3.dex */
final class bcbi implements View.OnClickListener {
    final /* synthetic */ bcbj a;

    public bcbi(bcbj bcbjVar) {
        this.a = bcbjVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ddda dddaVar;
        bcbj bcbjVar = this.a;
        bcba bcbaVar = bcbjVar.a;
        if (!bcbaVar.aD) {
            return;
        }
        String spannableStringBuilder = bcbjVar.b.toString();
        if (!bcbaVar.aD) {
            return;
        }
        String s = dbra.b.s(spannableStringBuilder);
        dbsk.s(bcbaVar.f);
        bcbe bcbeVar = bcbaVar.f;
        if (bcbeVar.c) {
            dwfl dwflVar = bcbeVar.d;
            if (dwflVar == null) {
                dwflVar = dwfl.w;
            }
            String str = dwflVar.g;
            if (!str.equals(s)) {
                if (str.isEmpty()) {
                    dddaVar = ddda.eK;
                } else if (s.isEmpty()) {
                    dddaVar = ddda.eL;
                } else {
                    dddaVar = ddda.eM;
                }
                cjqy cjqyVar = bcbaVar.a;
                cjsx i = cjsy.i();
                i.b(dddaVar);
                cjqyVar.k(i.a());
            }
            dwve bZ = dwvf.e.bZ();
            bcbe bcbeVar2 = bcbaVar.f;
            dbsk.s(bcbeVar2);
            dwfl dwflVar2 = bcbeVar2.d;
            if (dwflVar2 == null) {
                dwflVar2 = dwfl.w;
            }
            dizh dizhVar = dwflVar2.p;
            if (dizhVar == null) {
                dizhVar = dizh.j;
            }
            dggg dgggVar = dizhVar.b;
            if (dgggVar == null) {
                dgggVar = dggg.d;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwvf dwvfVar = (dwvf) bZ.b;
            dgggVar.getClass();
            dwvfVar.c = dgggVar;
            dwvfVar.b = 4;
            s.getClass();
            dwvfVar.a |= 8;
            dwvfVar.d = s;
            bcbaVar.g.a(bZ.bK(), bcbaVar, bvrj.UI_THREAD);
        }
        gn gnVar = bcbaVar.A;
        dbsk.s(gnVar);
        gnVar.f();
        dwfl dwflVar3 = bcbaVar.f.d;
        if (dwflVar3 == null) {
            dwflVar3 = dwfl.w;
        }
        bcbaVar.Nw(new bcao(dwflVar3.d, new bcap(s, dcdc.e())));
    }
}
