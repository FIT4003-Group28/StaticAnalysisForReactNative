package defpackage;

import com.google.android.apps.youtube.app.common.ui.navigation.Pane;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneBackStack;
import j$.util.Optional;
import java.util.List;
/* compiled from: PG */
/* renamed from: fuj  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class fuj implements ampg {
    private final /* synthetic */ int u;
    public static final /* synthetic */ fuj t = new fuj(20);
    public static final /* synthetic */ fuj s = new fuj(19);
    public static final /* synthetic */ fuj r = new fuj(18);
    public static final /* synthetic */ fuj q = new fuj(17);
    public static final /* synthetic */ fuj p = new fuj(16);
    public static final /* synthetic */ fuj o = new fuj(14);
    public static final /* synthetic */ fuj n = new fuj(13);
    public static final /* synthetic */ fuj m = new fuj(12);
    public static final /* synthetic */ fuj l = new fuj(11);
    public static final /* synthetic */ fuj k = new fuj(10);
    public static final /* synthetic */ fuj j = new fuj(9);
    public static final /* synthetic */ fuj i = new fuj(8);
    public static final /* synthetic */ fuj h = new fuj(7);
    public static final /* synthetic */ fuj g = new fuj(6);
    public static final /* synthetic */ fuj f = new fuj(5);
    public static final /* synthetic */ fuj e = new fuj(4);
    public static final /* synthetic */ fuj d = new fuj(3);
    public static final /* synthetic */ fuj c = new fuj(2);
    public static final /* synthetic */ fuj b = new fuj(1);
    public static final /* synthetic */ fuj a = new fuj();

    private /* synthetic */ fuj() {
    }

    public /* synthetic */ fuj(int i2) {
        this.u = i2;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        switch (this.u) {
            case 0:
                return ((ajff) obj).M();
            case 1:
                return ((airw) obj).ab();
            case 2:
                return ((airw) obj).V();
            case 3:
                return ((ajff) obj).J();
            case 4:
                return ampq.i(((Pane) obj).c);
            case 5:
                return ampq.i(((Pane) obj).d);
            case 6:
                return ampq.i(((Pane) obj).d);
            case 7:
                return Boolean.valueOf(((PaneBackStack) obj).d());
            case 8:
                return Boolean.valueOf(!((PaneBackStack) obj).d());
            case 9:
                return Boolean.valueOf(!((PaneBackStack) obj).d());
            case 10:
                return Boolean.valueOf(!((PaneBackStack) obj).d());
            case 11:
                return ((Pane) obj).b;
            case 12:
                return ((Boolean) obj).booleanValue() ? gdg.ENABLED : gdg.APP_DISABLED;
            case 13:
                return ((gft) obj).f;
            case 14:
                return Boolean.valueOf(((gft) obj).e);
            case 15:
                Optional optional = (Optional) obj;
                if (!optional.isPresent()) {
                    return Optional.empty();
                }
                aajj aajjVar = (aajj) optional.get();
                if (aajjVar instanceof awjr) {
                    return Optional.of(jfw.b((awjr) aajjVar));
                }
                if (aajjVar instanceof asze) {
                    return Optional.of(jfw.a((asze) aajjVar));
                }
                return Optional.empty();
            case 16:
                frz frzVar = (frz) obj;
                frzVar.d(amyg.a);
                return frzVar;
            case 17:
                aotg aotgVar = (aotg) obj;
                return aotg.a;
            case 18:
                return ((airw) obj).V();
            case 19:
                return ((ajff) obj).J();
            default:
                return amuk.n(arey.p((List) obj, ejw.t));
        }
    }
}
