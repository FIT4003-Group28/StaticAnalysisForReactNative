package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.app.common.loading.SpecificNetworkErrorViewLoadingFrameLayout;
import j$.util.Optional;
import j$.util.function.Consumer;
/* compiled from: PG */
/* renamed from: ins  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ins implements Consumer {
    public final /* synthetic */ iou a;
    private final /* synthetic */ int b;

    public /* synthetic */ ins(iou iouVar, int i) {
        this.b = i;
        this.a = iouVar;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.b) {
            case 0:
                return consumer.getClass();
            case 1:
                return consumer.getClass();
            case 2:
                return consumer.getClass();
            case 3:
                return consumer.getClass();
            case 4:
                return consumer.getClass();
            case 5:
                return consumer.getClass();
            case 6:
                return consumer.getClass();
            case 7:
                return consumer.getClass();
            default:
                return consumer.getClass();
        }
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                this.a.bf((cff) obj);
                return;
            case 1:
                ((View) obj).setAccessibilityPaneTitle(this.a.af);
                return;
            case 2:
                iou iouVar = this.a;
                SpecificNetworkErrorViewLoadingFrameLayout specificNetworkErrorViewLoadingFrameLayout = (SpecificNetworkErrorViewLoadingFrameLayout) obj;
                acti actiVar = iouVar.ck;
                FrameLayout frameLayout = specificNetworkErrorViewLoadingFrameLayout.d;
                if (frameLayout != null) {
                    specificNetworkErrorViewLoadingFrameLayout.removeView(frameLayout);
                    specificNetworkErrorViewLoadingFrameLayout.c();
                    specificNetworkErrorViewLoadingFrameLayout.e.a(actiVar);
                    specificNetworkErrorViewLoadingFrameLayout.d.setVisibility(0);
                }
                specificNetworkErrorViewLoadingFrameLayout.i(new ios(iouVar));
                return;
            case 3:
                ((fxh) obj).b = zew.j(this.a.rg()) * 5;
                return;
            case 4:
                iou iouVar2 = this.a;
                ((fxh) obj).a((apzg) iouVar2.cg.get(), iouVar2.q(), iouVar2.bd, iouVar2.bE, iouVar2.rb(), zew.j(iouVar2.rg()));
                return;
            case 5:
                this.a.aE((iol) obj);
                return;
            case 6:
                iou iouVar3 = this.a;
                ngj ngjVar = (ngj) obj;
                ngjVar.b = iouVar3;
                ngjVar.c = iouVar3;
                ngjVar.d = iouVar3;
                if (!iouVar3.X.b.a(apt.STARTED)) {
                    return;
                }
                ngjVar.e();
                return;
            case 7:
                this.a.oi().u((acte) obj, null);
                return;
            default:
                iou iouVar4 = this.a;
                iouVar4.aA = new fsl((CharSequence) Optional.ofNullable(iouVar4.af).orElse(""), (amvn) obj);
                iouVar4.aW(iouVar4.aB);
                return;
        }
    }
}
