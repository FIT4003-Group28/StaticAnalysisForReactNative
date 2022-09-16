package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
/* compiled from: PG */
/* renamed from: mug  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class mug implements View.OnClickListener {
    public final /* synthetic */ muh a;
    private final /* synthetic */ int b;

    public /* synthetic */ mug(muh muhVar, int i) {
        this.b = i;
        this.a = muhVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i == 0) {
            muh muhVar = this.a;
            aunb aunbVar = muhVar.e.s;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            if (!aunbVar.qn(ButtonRendererOuterClass.buttonRenderer)) {
                return;
            }
            aunb aunbVar2 = muhVar.e.s;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            apoj apojVar = (apoj) aunbVar2.qm(ButtonRendererOuterClass.buttonRenderer);
            View view2 = (View) muhVar.f.getParent();
            while (view2 != null && view2.getId() != R.id.results) {
                view2 = (View) view2.getParent();
            }
            if (!muhVar.j((RecyclerView) view2, apojVar)) {
                return;
            }
            muhVar.g(apojVar, true);
            muhVar.h(apojVar);
        } else if (i != 1) {
            muh muhVar2 = this.a;
            aunb aunbVar3 = muhVar2.e.n;
            if (aunbVar3 == null) {
                aunbVar3 = aunb.a;
            }
            if (!aunbVar3.qn(ButtonRendererOuterClass.buttonRenderer)) {
                return;
            }
            aunb aunbVar4 = muhVar2.e.n;
            if (aunbVar4 == null) {
                aunbVar4 = aunb.a;
            }
            apoj apojVar2 = (apoj) aunbVar4.qm(ButtonRendererOuterClass.buttonRenderer);
            if (!muhVar2.j(muhVar2.f(), apojVar2)) {
                return;
            }
            ((DefaultWatchPanelViewController) muhVar2.b.a).e.m();
            muhVar2.g(apojVar2, true);
            muhVar2.h(apojVar2);
        } else {
            muh muhVar3 = this.a;
            arbb arbbVar = muhVar3.e;
            if (arbbVar == null) {
                return;
            }
            aunb aunbVar5 = arbbVar.m;
            if (aunbVar5 == null) {
                aunbVar5 = aunb.a;
            }
            if (!aunbVar5.qn(ButtonRendererOuterClass.buttonRenderer)) {
                return;
            }
            aunb aunbVar6 = muhVar3.e.m;
            if (aunbVar6 == null) {
                aunbVar6 = aunb.a;
            }
            apoj apojVar3 = (apoj) aunbVar6.qm(ButtonRendererOuterClass.buttonRenderer);
            if ((apojVar3.b & 32768) == 0) {
                return;
            }
            aafo aafoVar = muhVar3.a;
            apzg apzgVar = apojVar3.p;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, null);
        }
    }
}
