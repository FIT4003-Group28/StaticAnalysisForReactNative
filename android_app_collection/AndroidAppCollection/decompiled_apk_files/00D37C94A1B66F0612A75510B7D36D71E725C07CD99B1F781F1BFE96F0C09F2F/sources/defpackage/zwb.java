package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;
import java.util.Map;
/* compiled from: PG */
/* renamed from: zwb  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class zwb implements ayqf {
    private final /* synthetic */ int s;
    public static final /* synthetic */ zwb r = new zwb(20);
    public static final /* synthetic */ zwb q = new zwb(19);
    public static final /* synthetic */ zwb p = new zwb(18);
    public static final /* synthetic */ zwb o = new zwb(17);
    public static final /* synthetic */ zwb n = new zwb(16);
    public static final /* synthetic */ zwb m = new zwb(15);
    public static final /* synthetic */ zwb l = new zwb(14);
    public static final /* synthetic */ zwb k = new zwb(11);
    public static final /* synthetic */ zwb j = new zwb(10);
    public static final /* synthetic */ zwb i = new zwb(9);
    public static final /* synthetic */ zwb h = new zwb(8);
    public static final /* synthetic */ zwb g = new zwb(7);
    public static final /* synthetic */ zwb f = new zwb(6);
    public static final /* synthetic */ zwb e = new zwb(5);
    public static final /* synthetic */ zwb d = new zwb(3);
    public static final /* synthetic */ zwb c = new zwb(2);
    public static final /* synthetic */ zwb b = new zwb(1);
    public static final /* synthetic */ zwb a = new zwb();

    private /* synthetic */ zwb() {
    }

    public /* synthetic */ zwb(int i2) {
        this.s = i2;
    }

    @Override // defpackage.ayqf
    public final boolean a(Object obj) {
        switch (this.s) {
            case 0:
                DeviceLocalFile deviceLocalFile = (DeviceLocalFile) obj;
                Map map = zwc.a;
                return true;
            case 1:
                return ((ampq) obj).h();
            case 2:
                Map map2 = zwc.a;
                return ((DeviceLocalFile) obj).a() == 1;
            case 3:
                Map map3 = zwc.a;
                return ((DeviceLocalFile) obj).a() == 0;
            case 4:
                return ((aaev) obj).c().equals("tf-lite-bandwidth-model");
            case 5:
                return ((arlw) obj).b == 58174010;
            case 6:
                return ((aajp) obj).c != null;
            case 7:
                return ((Boolean) obj).booleanValue();
            case 8:
                return ((Integer) obj).intValue() != 2;
            case 9:
                return ((ampq) obj).h();
            case 10:
                return ((ampq) obj).h();
            case 11:
                return !TextUtils.isEmpty((String) obj);
            case 12:
                aajj aajjVar = (aajj) obj;
                if (aajjVar instanceof asxb) {
                    asxb asxbVar = (asxb) aajjVar;
                    if (asxbVar.b() && asxbVar.getMarkersList().d.size() != 0 && (asxbVar.getMarkersListModel().b.b & 1) != 0) {
                        return true;
                    }
                }
                return false;
            case 13:
                ampq ampqVar = (ampq) obj;
                if (ampqVar.h() && (ampqVar.c() instanceof avih)) {
                    avih avihVar = (avih) ampqVar.c();
                    if ((avihVar.b.b & 4) != 0 && avihVar.getTimedListData().b.size() != 0 && ((avim) avihVar.getTimedListData().b.get(0)).b.size() != 0) {
                        return true;
                    }
                }
                return false;
            case 14:
                return ((asdd) obj).b != 0;
            case 15:
                return ((asdd) obj).d != 0;
            case 16:
                return !((ahhm) obj).equals(ahhm.a);
            case 17:
                return !((ahic) obj).equals(ahic.a);
            case 18:
                return !((ahic) obj).equals(ahic.a);
            case 19:
                return ((ahhj) obj).b().equals(aijw.PLAYBACK_INTERRUPTED);
            default:
                return (((alcw) obj).b & 8192) != 0;
        }
    }
}
