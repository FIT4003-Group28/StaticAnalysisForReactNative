package defpackage;

import androidx.window.layout.DisplayFeature;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowLayoutInfo;
import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;
import java.io.File;
import java.util.List;
/* compiled from: PG */
/* renamed from: yps  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class yps implements ayqe {
    private final /* synthetic */ int u;
    public static final /* synthetic */ yps t = new yps(20);
    public static final /* synthetic */ yps s = new yps(19);
    public static final /* synthetic */ yps r = new yps(18);
    public static final /* synthetic */ yps q = new yps(17);
    public static final /* synthetic */ yps p = new yps(16);
    public static final /* synthetic */ yps o = new yps(15);
    public static final /* synthetic */ yps n = new yps(13);
    public static final /* synthetic */ yps m = new yps(12);
    public static final /* synthetic */ yps l = new yps(11);
    public static final /* synthetic */ yps k = new yps(10);
    public static final /* synthetic */ yps j = new yps(9);
    public static final /* synthetic */ yps i = new yps(8);
    public static final /* synthetic */ yps h = new yps(7);
    public static final /* synthetic */ yps g = new yps(6);
    public static final /* synthetic */ yps f = new yps(5);
    public static final /* synthetic */ yps e = new yps(4);
    public static final /* synthetic */ yps d = new yps(3);
    public static final /* synthetic */ yps c = new yps(2);
    public static final /* synthetic */ yps b = new yps(1);
    public static final /* synthetic */ yps a = new yps();

    private /* synthetic */ yps() {
    }

    public /* synthetic */ yps(int i2) {
        this.u = i2;
    }

    @Override // defpackage.ayqe
    public final Object a(Object obj) {
        switch (this.u) {
            case 0:
                return Boolean.valueOf(((ypw) obj).a);
            case 1:
                return ((aajp) obj).c;
            case 2:
                return Boolean.valueOf(((ypw) obj).b);
            case 3:
                return Integer.valueOf(((ypw) obj).c);
            case 4:
                return ((vmu) obj).a();
            case 5:
                WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
                amuf f2 = amuk.f();
                for (int i2 = 0; i2 < windowLayoutInfo.getDisplayFeatures().size(); i2++) {
                    DisplayFeature displayFeature = (DisplayFeature) windowLayoutInfo.getDisplayFeatures().get(i2);
                    if (displayFeature instanceof FoldingFeature) {
                        f2.h((FoldingFeature) displayFeature);
                    }
                }
                return f2.g();
            case 6:
                amuk amukVar = (amuk) obj;
                if (amukVar.size() == 1 && ((FoldingFeature) amukVar.get(0)).getState() == FoldingFeature.State.HALF_OPENED) {
                    FoldingFeature foldingFeature = (FoldingFeature) amukVar.get(0);
                    if (foldingFeature.getBounds().height() == 0) {
                        return new zbe(foldingFeature.getBounds().top);
                    }
                    if (foldingFeature.getBounds().width() == 0) {
                        return new zbd(foldingFeature.getBounds().left);
                    }
                }
                return zdb.b();
            case 7:
                return ((ampq) obj).c();
            case 8:
                return ((ayoi) obj).am(gbb.q, zhq.c).E(l);
            case 9:
                return ((ampq) obj).c();
            case 10:
                return ((amuf) obj).g();
            case 11:
                return ((amvl) obj).g();
            case 12:
                return ((ayoi) obj).am(gbb.p, zhq.a).E(k);
            case 13:
                return ampq.j(obj);
            case 14:
                final azou azouVar = (azou) obj;
                return azouVar.aq().E(new ayqe() { // from class: zvz
                    @Override // defpackage.ayqe
                    public final Object a(Object obj2) {
                        azou azouVar2 = azou.this;
                        List list = (List) obj2;
                        zvt a2 = zvu.a();
                        a2.b(zvs.FOLDER);
                        a2.a = ampq.j((DeviceLocalFile) list.get(0));
                        a2.b = ampq.j(azouVar2.a);
                        a2.d(new File((String) azouVar2.a).getName());
                        a2.c(list.size());
                        return a2.a();
                    }
                });
            case 15:
                return ((DeviceLocalFile) obj).g();
            case 16:
                return ((amup) obj).values();
            case 17:
                aajj aajjVar = (aajj) ((ampq) obj).f();
                return aajjVar != null ? ampq.j(aajjVar.c()) : amon.a;
            case 18:
                return ampq.i(((aajp) obj).c);
            case 19:
                return ampq.j((aajj) obj);
            default:
                return ampq.i(((aajp) obj).c);
        }
    }
}
