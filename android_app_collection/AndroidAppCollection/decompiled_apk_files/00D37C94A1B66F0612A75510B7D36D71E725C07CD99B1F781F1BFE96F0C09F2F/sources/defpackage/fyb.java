package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.common.loading.SpecificNetworkErrorViewLoadingFrameLayout;
import com.google.android.libraries.quantum.fab.FloatingActionButton;
import com.google.android.youtube.R;
import j$.util.function.Consumer;
import java.util.concurrent.ScheduledFuture;
/* compiled from: PG */
/* renamed from: fyb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class fyb implements Consumer {
    private final /* synthetic */ int u;
    public static final /* synthetic */ fyb t = new fyb(20);
    public static final /* synthetic */ fyb s = new fyb(18);
    public static final /* synthetic */ fyb r = new fyb(17);
    public static final /* synthetic */ fyb q = new fyb(16);
    public static final /* synthetic */ fyb p = new fyb(15);
    public static final /* synthetic */ fyb o = new fyb(14);
    public static final /* synthetic */ fyb n = new fyb(13);
    public static final /* synthetic */ fyb m = new fyb(12);
    public static final /* synthetic */ fyb l = new fyb(11);
    public static final /* synthetic */ fyb k = new fyb(10);
    public static final /* synthetic */ fyb j = new fyb(9);
    public static final /* synthetic */ fyb i = new fyb(8);
    public static final /* synthetic */ fyb h = new fyb(7);
    public static final /* synthetic */ fyb g = new fyb(6);
    public static final /* synthetic */ fyb f = new fyb(5);
    public static final /* synthetic */ fyb e = new fyb(4);
    public static final /* synthetic */ fyb d = new fyb(3);
    public static final /* synthetic */ fyb c = new fyb(2);
    public static final /* synthetic */ fyb b = new fyb(1);
    public static final /* synthetic */ fyb a = new fyb();

    private /* synthetic */ fyb() {
    }

    public /* synthetic */ fyb(int i2) {
        this.u = i2;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.u) {
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
            case 8:
                return consumer.getClass();
            case 9:
                return consumer.getClass();
            case 10:
                return consumer.getClass();
            case 11:
                return consumer.getClass();
            case 12:
                return consumer.getClass();
            case 13:
                return consumer.getClass();
            case 14:
                return consumer.getClass();
            case 15:
                return consumer.getClass();
            case 16:
                return consumer.getClass();
            case 17:
                return consumer.getClass();
            case 18:
                return consumer.getClass();
            case 19:
                return consumer.getClass();
            default:
                return consumer.getClass();
        }
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.u) {
            case 0:
                ((fyj) obj).b();
                return;
            case 1:
                ((fyi) obj).b();
                return;
            case 2:
                ((fyj) obj).f(null);
                return;
            case 3:
                ((FloatingActionButton) obj).setVisibility(0);
                return;
            case 4:
                ((FloatingActionButton) obj).setVisibility(8);
                return;
            case 5:
                ((gto) obj).d();
                return;
            case 6:
                ((ibn) obj).s();
                return;
            case 7:
                int i2 = ico.bD;
                ((fdu) obj).e(fdq.REEL);
                return;
            case 8:
                ((hzx) obj).a();
                return;
            case 9:
                ((hzx) obj).a();
                return;
            case 10:
                int i3 = iou.cp;
                ((View) obj).sendAccessibilityEvent(32);
                return;
            case 11:
                SpecificNetworkErrorViewLoadingFrameLayout specificNetworkErrorViewLoadingFrameLayout = (SpecificNetworkErrorViewLoadingFrameLayout) obj;
                int i4 = iou.cp;
                CharSequence text = specificNetworkErrorViewLoadingFrameLayout.a.getResources().getText(R.string.no_results_found);
                ezo ezoVar = specificNetworkErrorViewLoadingFrameLayout.b;
                ezoVar.getClass();
                ezoVar.e(text);
                specificNetworkErrorViewLoadingFrameLayout.h(4);
                return;
            case 12:
                int i5 = iou.cp;
                ((SpecificNetworkErrorViewLoadingFrameLayout) obj).f();
                return;
            case 13:
                fhg fhgVar = (fhg) obj;
                if (!fhgVar.a.isEnabled() || fhgVar.a.b) {
                    return;
                }
                fhgVar.c(2);
                fhgVar.a();
                return;
            case 14:
                ((ngj) obj).e();
                return;
            case 15:
                ((ngj) obj).g();
                return;
            case 16:
                ((ajpm) obj).f();
                return;
            case 17:
                int i6 = iou.cp;
                ((ScheduledFuture) obj).cancel(true);
                return;
            case 18:
                zag.i(((View) obj).findFocus());
                return;
            case 19:
                ((ffo) obj).kN();
                return;
            default:
                ((ffo) obj).h();
                return;
        }
    }
}
