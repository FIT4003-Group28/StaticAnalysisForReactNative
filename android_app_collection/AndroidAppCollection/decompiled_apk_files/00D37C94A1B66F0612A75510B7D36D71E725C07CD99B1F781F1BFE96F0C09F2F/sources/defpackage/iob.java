package defpackage;

import android.os.Bundle;
import android.view.Window;
import com.google.android.apps.youtube.app.common.loading.SpecificNetworkErrorViewLoadingFrameLayout;
import com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import j$.util.Optional;
import j$.util.function.Function;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: iob  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class iob implements Function {
    private final /* synthetic */ int v;
    public static final /* synthetic */ iob u = new iob(20);
    public static final /* synthetic */ iob t = new iob(19);
    public static final /* synthetic */ iob s = new iob(18);
    public static final /* synthetic */ iob r = new iob(17);
    public static final /* synthetic */ iob q = new iob(16);
    public static final /* synthetic */ iob p = new iob(15);
    public static final /* synthetic */ iob o = new iob(14);
    public static final /* synthetic */ iob n = new iob(13);
    public static final /* synthetic */ iob m = new iob(12);
    public static final /* synthetic */ iob l = new iob(11);
    public static final /* synthetic */ iob k = new iob(10);
    public static final /* synthetic */ iob j = new iob(9);
    public static final /* synthetic */ iob i = new iob(8);
    public static final /* synthetic */ iob h = new iob(7);
    public static final /* synthetic */ iob g = new iob(6);
    public static final /* synthetic */ iob f = new iob(5);
    public static final /* synthetic */ iob e = new iob(4);
    public static final /* synthetic */ iob d = new iob(3);
    public static final /* synthetic */ iob c = new iob(2);
    public static final /* synthetic */ iob b = new iob(1);
    public static final /* synthetic */ iob a = new iob();

    private /* synthetic */ iob() {
    }

    private /* synthetic */ iob(int i2) {
        this.v = i2;
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function andThen(Function function) {
        switch (this.v) {
            case 0:
                return function.getClass();
            case 1:
                return function.getClass();
            case 2:
                return function.getClass();
            case 3:
                return function.getClass();
            case 4:
                return function.getClass();
            case 5:
                return function.getClass();
            case 6:
                return function.getClass();
            case 7:
                return function.getClass();
            case 8:
                return function.getClass();
            case 9:
                return function.getClass();
            case 10:
                return function.getClass();
            case 11:
                return function.getClass();
            case 12:
                return function.getClass();
            case 13:
                return function.getClass();
            case 14:
                return function.getClass();
            case 15:
                return function.getClass();
            case 16:
                return function.getClass();
            case 17:
                return function.getClass();
            case 18:
                return function.getClass();
            case 19:
                return function.getClass();
            default:
                return function.getClass();
        }
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function compose(Function function) {
        switch (this.v) {
            case 0:
                return function.getClass();
            case 1:
                return function.getClass();
            case 2:
                return function.getClass();
            case 3:
                return function.getClass();
            case 4:
                return function.getClass();
            case 5:
                return function.getClass();
            case 6:
                return function.getClass();
            case 7:
                return function.getClass();
            case 8:
                return function.getClass();
            case 9:
                return function.getClass();
            case 10:
                return function.getClass();
            case 11:
                return function.getClass();
            case 12:
                return function.getClass();
            case 13:
                return function.getClass();
            case 14:
                return function.getClass();
            case 15:
                return function.getClass();
            case 16:
                return function.getClass();
            case 17:
                return function.getClass();
            case 18:
                return function.getClass();
            case 19:
                return function.getClass();
            default:
                return function.getClass();
        }
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        boolean z = true;
        switch (this.v) {
            case 0:
                int i2 = iou.cp;
                return (ActionBarColor) obj;
            case 1:
                if (((ibn) obj).p() != aulb.REEL_LOOP_BEHAVIOR_REPEAT) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                int i3 = iou.cp;
                return ((Bundle) obj).getByteArray("navigation_endpoint");
            case 3:
                int i4 = iou.cp;
                return ((Bundle) obj).getByteArray("navigation_endpoint_interaction_logging_extension");
            case 4:
                int i5 = iou.cp;
                return Boolean.valueOf(((Bundle) obj).getBoolean("split_pane_library_opened_in_offline_mode"));
            case 5:
                return ((dt) obj).getWindow();
            case 6:
                return ((Window) obj).getDecorView();
            case 7:
                return Integer.valueOf(((SpecificNetworkErrorViewLoadingFrameLayout) obj).g);
            case 8:
                return ((ior) obj).s;
            case 9:
                low lowVar = (low) obj;
                return new lov(lowVar.d, lowVar.b);
            case 10:
                return ((lwm) obj).b();
            case 11:
                return amuk.o(new ArrayList(((mas) obj).a.values()));
            case 12:
                int i6 = iou.cp;
                return (nhr) ((ngj) obj);
            case 13:
                int i7 = iou.cp;
                return ((ngj) obj).a(amyg.a);
            case 14:
                int i8 = iou.cp;
                if (((ngj) obj).d() == null) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 15:
                return ((ngj) obj).a;
            case 16:
                ngj ngjVar = (ngj) obj;
                return false;
            case 17:
                nhr nhrVar = (nhr) obj;
                Object obj2 = nhrVar.a;
                arfu arfuVar = null;
                if (obj2 != null) {
                    aucq aucqVar = ((aucu) obj2).K;
                    if (aucqVar == null) {
                        aucqVar = aucq.a;
                    }
                    if ((1 & aucqVar.b) != 0) {
                        aucq aucqVar2 = ((aucu) nhrVar.a).K;
                        if (aucqVar2 == null) {
                            aucqVar2 = aucq.a;
                        }
                        arfuVar = aucqVar2.c;
                        if (arfuVar == null) {
                            arfuVar = arfu.a;
                        }
                    }
                }
                return new fxy(arfuVar);
            case 18:
                nii niiVar = (nii) obj;
                return ampr.a(new aaky(niiVar.a), Optional.ofNullable(niiVar.c.pn()));
            case 19:
                return ((nij) obj).i();
            default:
                return ((BrowseResponseModel) obj).a;
        }
    }
}
