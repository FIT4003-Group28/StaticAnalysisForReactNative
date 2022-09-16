package defpackage;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import com.google.android.libraries.quantum.fab.FloatingActionButton;
import j$.util.function.Function;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: eoo  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class eoo implements Function {
    private final /* synthetic */ int v;
    public static final /* synthetic */ eoo u = new eoo(20);
    public static final /* synthetic */ eoo t = new eoo(19);
    public static final /* synthetic */ eoo s = new eoo(18);
    public static final /* synthetic */ eoo r = new eoo(17);
    public static final /* synthetic */ eoo q = new eoo(16);
    public static final /* synthetic */ eoo p = new eoo(15);
    public static final /* synthetic */ eoo o = new eoo(14);
    public static final /* synthetic */ eoo n = new eoo(13);
    public static final /* synthetic */ eoo m = new eoo(12);
    public static final /* synthetic */ eoo l = new eoo(11);
    public static final /* synthetic */ eoo k = new eoo(10);
    public static final /* synthetic */ eoo j = new eoo(9);
    public static final /* synthetic */ eoo i = new eoo(8);
    public static final /* synthetic */ eoo h = new eoo(7);
    public static final /* synthetic */ eoo g = new eoo(6);
    public static final /* synthetic */ eoo f = new eoo(5);
    public static final /* synthetic */ eoo e = new eoo(4);
    public static final /* synthetic */ eoo d = new eoo(3);
    public static final /* synthetic */ eoo c = new eoo(2);
    public static final /* synthetic */ eoo b = new eoo(1);
    public static final /* synthetic */ eoo a = new eoo();

    private /* synthetic */ eoo() {
    }

    private /* synthetic */ eoo(int i2) {
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
        boolean z = false;
        switch (this.v) {
            case 0:
                return aabk.a(obj);
            case 1:
                return ((ampq) obj).c();
            case 2:
                return ((ibn) obj).o();
            case 3:
                return ((aqqm) obj).getSmartDownloadsOptInBannerVisibility();
            case 4:
                return (aiqc) ((azqb) obj).get();
            case 5:
                return ((ViewStub) obj).inflate();
            case 6:
                return (apmg[]) ((List) obj).toArray(new apmg[0]);
            case 7:
                if (((FloatingActionButton) obj).getVisibility() != 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 8:
                arhr b2 = arhr.b(((arhs) obj).c);
                return b2 == null ? arhr.UNKNOWN : b2;
            case 9:
                return Boolean.valueOf(((ObjectAnimator) obj).isRunning());
            case 10:
                return ((fxz) obj).e();
            case 11:
                return ((fxz) obj).c();
            case 12:
                View view = ((gfo) obj).a;
                return null;
            case 13:
                return ((fxz) obj).d();
            case 14:
                return (String) ((Map.Entry) obj).getKey();
            case 15:
                return ((Map.Entry) obj).getValue();
            case 16:
                int i2 = gkj.a;
                return Boolean.valueOf(((Bundle) obj).getBoolean("menu_as_bottom_sheet", false));
            case 17:
                return Boolean.valueOf(((aull) obj).s);
            case 18:
                return Boolean.valueOf(((aull) obj).j);
            case 19:
                return Boolean.valueOf(((aull) obj).f118J);
            default:
                return Boolean.valueOf(((aull) obj).p);
        }
    }
}
