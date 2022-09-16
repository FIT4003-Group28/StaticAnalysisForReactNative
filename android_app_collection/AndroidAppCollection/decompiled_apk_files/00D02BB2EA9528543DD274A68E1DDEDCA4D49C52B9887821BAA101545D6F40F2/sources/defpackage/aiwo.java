package defpackage;

import android.content.Context;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aiwo  reason: default package */
/* loaded from: classes2.dex */
public final class aiwo implements jkh {
    final /* synthetic */ aiws a;

    public aiwo(aiws aiwsVar) {
        this.a = aiwsVar;
    }

    @Override // defpackage.jkh
    public final void L(jkj jkjVar, jjn jjnVar, jjn jjnVar2, jkg jkgVar) {
        if (!this.a.S()) {
            return;
        }
        aiws aiwsVar = this.a;
        if (aiwsVar.ay == null) {
            return;
        }
        boolean z = false;
        aiwsVar.aw = jjnVar2 == jjn.FULLY_EXPANDED;
        aiwr aiwrVar = this.a.ay;
        if (jjnVar2 == jjn.FULLY_EXPANDED) {
            z = true;
        }
        aiwrVar.a(z);
        aiws aiwsVar2 = this.a;
        aiwsVar2.az.e(!aiwsVar2.aw);
        if (jjnVar2 == jjn.COLLAPSED) {
            aiws aiwsVar3 = this.a;
            ExtendedFloatingActionButton extendedFloatingActionButton = aiwsVar3.aA;
            Context H = aiwsVar3.H();
            if (!aivk.a(extendedFloatingActionButton)) {
                int a = jmj.a(H, 16);
                int a2 = jmj.a(H, 20);
                dbsk.s(extendedFloatingActionButton);
                extendedFloatingActionButton.setPaddingRelative(a2, a, a2, a);
                dbsk.s(extendedFloatingActionButton);
                extendedFloatingActionButton.e();
            }
        } else if (jjnVar2 == jjn.FULLY_EXPANDED) {
            aiws aiwsVar4 = this.a;
            ExtendedFloatingActionButton extendedFloatingActionButton2 = aiwsVar4.aA;
            Context H2 = aiwsVar4.H();
            if (!aivk.a(extendedFloatingActionButton2)) {
                int a3 = jmj.a(H2, 16);
                dbsk.s(extendedFloatingActionButton2);
                extendedFloatingActionButton2.setPaddingRelative(a3, a3, a3, a3);
                dbsk.s(extendedFloatingActionButton2);
                extendedFloatingActionButton2.f();
            }
        }
        ExtendedFloatingActionButton extendedFloatingActionButton3 = this.a.aA;
        if (aivk.a(extendedFloatingActionButton3)) {
            return;
        }
        dbsk.s(extendedFloatingActionButton3);
        cqkp i = cqkx.i(extendedFloatingActionButton3);
        if (i == null) {
            return;
        }
        cqkx.p(i);
    }

    @Override // defpackage.jkh
    public final void M(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public final void N(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public final void O() {
    }

    @Override // defpackage.jkh
    public final void P(jkj jkjVar, jjn jjnVar, float f) {
        aiws aiwsVar;
        float f2;
        if (!this.a.S()) {
            return;
        }
        aiws aiwsVar2 = this.a;
        aiwr aiwrVar = aiwsVar2.ay;
        if (aiwrVar != null) {
            float intValue = aiwsVar2.aS().intValue();
            Integer valueOf = Integer.valueOf(Math.max((int) (intValue - (aiwsVar2.aT(jkjVar) * intValue)), 0));
            if (!aiwrVar.e.equals(valueOf)) {
                aiwrVar.e = valueOf;
                cqkx.p(aiwrVar);
            }
        }
        ExtendedFloatingActionButton extendedFloatingActionButton = this.a.aA;
        dbsk.s(extendedFloatingActionButton);
        float aT = this.a.aT(jkjVar);
        double d = aT;
        if (d >= 0.6d) {
            Double.isNaN(d);
            f2 = -(((float) ((d - 0.6d) * 2.5d)) * aiwsVar.aS().intValue());
        } else {
            f2 = 0.0f;
        }
        extendedFloatingActionButton.setTranslationY(f2 + (aT * jkjVar.M()));
    }
}
