package defpackage;

import android.view.View;
import com.facebook.yoga.YogaEdge;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: syt  reason: default package */
/* loaded from: classes4.dex */
public final class syt implements tek {
    public static final WeakHashMap a = new WeakHashMap();
    public final tcu b;
    private final tfy c;
    private final boolean d;

    public syt(tcu tcuVar, tfy tfyVar, ampq ampqVar) {
        this.b = tcuVar;
        this.c = tfyVar;
        this.d = ((Boolean) ampqVar.e(false)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final tcs f(View view, View view2, tfi tfiVar, tdq tdqVar, tcr tcrVar, tda tdaVar) {
        tcq a2 = tcs.a();
        if (view != null) {
            a2.a = view;
        }
        if (view2 != null) {
            a2.b = view2;
        }
        if (tfiVar != null) {
            a2.c = tfiVar;
        }
        a2.b(tdaVar);
        a2.h = tdaVar.u;
        if (tcrVar != null) {
            a2 = tcrVar.a(a2);
        }
        a2.f = tdqVar;
        return a2.a();
    }

    public static final tcs g(View view, tfi tfiVar, tdq tdqVar, tcr tcrVar, tda tdaVar) {
        return f(view, null, tfiVar, tdqVar, tcrVar, tdaVar);
    }

    @Override // defpackage.tek
    public final int a() {
        return 168774585;
    }

    @Override // defpackage.tek
    public final /* bridge */ /* synthetic */ aodt b(ByteBuffer byteBuffer) {
        axmt axmtVar = new axmt();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        axmtVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return axmtVar;
    }

    @Override // defpackage.tel
    public final /* bridge */ /* synthetic */ void c(cyv cyvVar, tda tdaVar, String str, Object obj, final tdq tdqVar, tcr tcrVar) {
        axmt axmtVar = (axmt) obj;
        tfy tfyVar = this.c;
        aodt aodtVar = new aodt();
        int b = axmtVar.b(4);
        aodt aodtVar2 = null;
        if (b != 0) {
            aodtVar.f(axmtVar.a(b + axmtVar.a), axmtVar.b);
        } else {
            aodtVar = null;
        }
        tfw g = tfyVar.g(aodtVar);
        if (g != null) {
            tdqVar.l(new syk(this, g, tdqVar, tcrVar, tdaVar));
            tdqVar.a().u(true);
        }
        tfy tfyVar2 = this.c;
        aodt aodtVar3 = new aodt();
        int b2 = axmtVar.b(22);
        if (b2 != 0) {
            aodtVar3.f(axmtVar.a(b2 + axmtVar.a), axmtVar.b);
        } else {
            aodtVar3 = null;
        }
        tfw g2 = tfyVar2.g(aodtVar3);
        if (g2 != null) {
            tdqVar.h(new syl(this, g2, tdqVar, tcrVar, tdaVar));
            tdqVar.a().u(true);
        }
        tfy tfyVar3 = this.c;
        aodt aodtVar4 = new aodt();
        int b3 = axmtVar.b(10);
        if (b3 != 0) {
            aodtVar4.f(axmtVar.a(b3 + axmtVar.a), axmtVar.b);
        } else {
            aodtVar4 = null;
        }
        tfw g3 = tfyVar3.g(aodtVar4);
        if (g3 != null) {
            tdqVar.k(new sym(this, g3, tdqVar, tcrVar, tdaVar));
            tdqVar.a().u(true);
        }
        tfy tfyVar4 = this.c;
        aodt aodtVar5 = new aodt();
        int b4 = axmtVar.b(14);
        if (b4 != 0) {
            aodtVar5.f(axmtVar.a(b4 + axmtVar.a), axmtVar.b);
        } else {
            aodtVar5 = null;
        }
        tfw g4 = tfyVar4.g(aodtVar5);
        if (g4 != null) {
            tdqVar.i(new syn(this, axmtVar, g4, tdqVar, tcrVar, tdaVar));
        }
        tfy tfyVar5 = this.c;
        aodt aodtVar6 = new aodt();
        int b5 = axmtVar.b(12);
        if (b5 != 0) {
            aodtVar6.f(axmtVar.a(b5 + axmtVar.a), axmtVar.b);
        } else {
            aodtVar6 = null;
        }
        tfw g5 = tfyVar5.g(aodtVar6);
        if (g5 != null) {
            tdqVar.p(new syo(this, g5, tdqVar, tcrVar, tdaVar));
        }
        tfy tfyVar6 = this.c;
        aodt aodtVar7 = new aodt();
        int b6 = axmtVar.b(16);
        if (b6 != 0) {
            aodtVar7.f(axmtVar.a(b6 + axmtVar.a), axmtVar.b);
        } else {
            aodtVar7 = null;
        }
        tfw g6 = tfyVar6.g(aodtVar7);
        if (g6 != null) {
            tdqVar.j(new syp(this, g6, tdqVar, tcrVar, tdaVar));
        }
        if (axmtVar.aG() != null) {
            tfo.j(axmtVar.aG(), new tfn() { // from class: syj
                @Override // defpackage.tfn
                public final void a(YogaEdge yogaEdge, aodr aodrVar) {
                    tdq tdqVar2 = tdq.this;
                    WeakHashMap weakHashMap = syt.a;
                    tdqVar2.a().P(yogaEdge, aodrVar.b());
                }
            });
        }
        tfy tfyVar7 = this.c;
        aodt aodtVar8 = new aodt();
        int b7 = axmtVar.b(8);
        if (b7 != 0) {
            aodtVar8.f(axmtVar.a(b7 + axmtVar.a), axmtVar.b);
        } else {
            aodtVar8 = null;
        }
        tfw g7 = tfyVar7.g(aodtVar8);
        if (g7 != null) {
            tdqVar.n(new syq(this, g7, tdqVar, tcrVar, tdaVar));
        }
        tfy tfyVar8 = this.c;
        aodt aodtVar9 = new aodt();
        int b8 = axmtVar.b(6);
        if (b8 != 0) {
            aodtVar9.f(axmtVar.a(b8 + axmtVar.a), axmtVar.b);
        } else {
            aodtVar9 = null;
        }
        tfw g8 = tfyVar8.g(aodtVar9);
        if (g8 != null) {
            tdqVar.o(new syr(this, g8, tdqVar, tcrVar, tdaVar));
        }
        tfy tfyVar9 = this.c;
        aodt aodtVar10 = new aodt();
        int b9 = axmtVar.b(20);
        if (b9 != 0) {
            aodtVar10.f(axmtVar.a(b9 + axmtVar.a), axmtVar.b);
            aodtVar2 = aodtVar10;
        }
        tfw g9 = tfyVar9.g(aodtVar2);
        if (g9 != null) {
            tdqVar.m(new sys(this, g9, tdqVar, tcrVar, tdaVar));
        }
    }

    public final void d(aypg aypgVar, tda tdaVar) {
        ayqh ayqhVar;
        if (!this.d || (ayqhVar = tdaVar.f) == null) {
            return;
        }
        ayqhVar.d(aypgVar);
    }

    @Override // defpackage.tel
    public final /* synthetic */ void e(tdq tdqVar) {
    }
}
