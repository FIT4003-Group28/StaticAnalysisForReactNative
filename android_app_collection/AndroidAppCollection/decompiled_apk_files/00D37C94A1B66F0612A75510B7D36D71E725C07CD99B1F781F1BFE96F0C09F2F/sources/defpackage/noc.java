package defpackage;

import com.google.android.apps.youtube.app.webviewfallback.WebViewFallbackActivity;
import j$.util.Optional;
import java.util.List;
/* compiled from: PG */
/* renamed from: noc  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class noc implements ayqf {
    private final /* synthetic */ int v;
    public static final /* synthetic */ noc u = new noc(20);
    public static final /* synthetic */ noc t = new noc(19);
    public static final /* synthetic */ noc s = new noc(18);
    public static final /* synthetic */ noc r = new noc(17);
    public static final /* synthetic */ noc q = new noc(16);
    public static final /* synthetic */ noc p = new noc(15);
    public static final /* synthetic */ noc o = new noc(14);
    public static final /* synthetic */ noc n = new noc(13);
    public static final /* synthetic */ noc m = new noc(12);
    public static final /* synthetic */ noc l = new noc(11);
    public static final /* synthetic */ noc k = new noc(10);
    public static final /* synthetic */ noc j = new noc(9);
    public static final /* synthetic */ noc i = new noc(8);
    public static final /* synthetic */ noc h = new noc(7);
    public static final /* synthetic */ noc g = new noc(6);
    public static final /* synthetic */ noc f = new noc(5);
    public static final /* synthetic */ noc e = new noc(4);
    public static final /* synthetic */ noc d = new noc(3);
    public static final /* synthetic */ noc c = new noc(2);
    public static final /* synthetic */ noc b = new noc(1);
    public static final /* synthetic */ noc a = new noc();

    private /* synthetic */ noc() {
    }

    private /* synthetic */ noc(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ayqf
    public final boolean a(Object obj) {
        switch (this.v) {
            case 0:
                return ((Boolean) obj).booleanValue();
            case 1:
                return ((Boolean) obj).booleanValue();
            case 2:
                return ((aajp) obj).c != null;
            case 3:
                return !((ampq) obj).h();
            case 4:
                return ((ampq) obj).h();
            case 5:
                int i2 = nsn.e;
                return ((Boolean) obj).booleanValue();
            case 6:
                return ((ampq) obj).h();
            case 7:
                return ((ampq) obj).h();
            case 8:
                return ((ampq) obj).h();
            case 9:
                return ((aajp) obj).c != null;
            case 10:
                return ((Optional) obj).isPresent();
            case 11:
                return !((okw) obj).a.isEmpty();
            case 12:
                return ((Optional) obj).isPresent();
            case 13:
                String str = WebViewFallbackActivity.b;
                return !((Boolean) obj).booleanValue();
            case 14:
                int i3 = omh.b;
                return ((List) obj).size() == 2;
            case 15:
                return ((ampq) obj).h();
            case 16:
                return ((ampq) obj).h();
            case 17:
                return ((ampq) obj).h();
            case 18:
                return ((aajp) obj).c != null;
            case 19:
                return ((aajp) obj).c != null;
            default:
                return ((ampq) obj).h();
        }
    }
}
