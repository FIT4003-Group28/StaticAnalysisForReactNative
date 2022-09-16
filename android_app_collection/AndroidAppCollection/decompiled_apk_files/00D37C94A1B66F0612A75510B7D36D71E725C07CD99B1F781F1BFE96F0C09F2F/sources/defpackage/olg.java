package defpackage;

import android.net.Uri;
import com.google.android.apps.youtube.app.webviewfallback.WebViewFallbackActivity;
import j$.util.Optional;
import java.util.List;
/* compiled from: PG */
/* renamed from: olg  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class olg implements ayqe {
    private final /* synthetic */ int v;
    public static final /* synthetic */ olg u = new olg(20);
    public static final /* synthetic */ olg t = new olg(19);
    public static final /* synthetic */ olg s = new olg(18);
    public static final /* synthetic */ olg r = new olg(17);
    public static final /* synthetic */ olg q = new olg(16);
    public static final /* synthetic */ olg p = new olg(15);
    public static final /* synthetic */ olg o = new olg(14);
    public static final /* synthetic */ olg n = new olg(13);
    public static final /* synthetic */ olg m = new olg(12);
    public static final /* synthetic */ olg l = new olg(11);
    public static final /* synthetic */ olg k = new olg(10);
    public static final /* synthetic */ olg j = new olg(9);
    public static final /* synthetic */ olg i = new olg(8);
    public static final /* synthetic */ olg h = new olg(7);
    public static final /* synthetic */ olg g = new olg(6);
    public static final /* synthetic */ olg f = new olg(5);
    public static final /* synthetic */ olg e = new olg(4);
    public static final /* synthetic */ olg d = new olg(3);
    public static final /* synthetic */ olg c = new olg(2);
    public static final /* synthetic */ olg b = new olg(1);
    public static final /* synthetic */ olg a = new olg();

    private /* synthetic */ olg() {
    }

    private /* synthetic */ olg(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ayqe
    public final Object a(Object obj) {
        int i2 = 0;
        switch (this.v) {
            case 0:
                return ((ampr) obj).a;
            case 1:
                return ((okw) obj).a;
            case 2:
                ampr amprVar = (ampr) obj;
                okv a2 = okw.a();
                a2.c((String) amprVar.a);
                a2.d(((Integer) amprVar.b).intValue());
                a2.b(((Integer) amprVar.b).intValue());
                return a2.a();
            case 3:
                return ((amum) obj).b();
            case 4:
                return (String) ((Optional) obj).get();
            case 5:
                gbd gbdVar = (gbd) obj;
                return ayoi.T(gfn.DISABLE_FULLSCREEN);
            case 6:
                String str = WebViewFallbackActivity.b;
                omg omgVar = omg.BROWSER;
                int ordinal = ((omg) obj).ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        throw new AssertionError();
                    }
                    i2 = 5638;
                }
                return Integer.valueOf(i2);
            case 7:
                return Uri.parse((String) obj);
            case 8:
                return ((ampq) obj).b(meo.p);
            case 9:
                int i3 = omh.b;
                return (List) ((ampq) obj).e(amuk.q());
            case 10:
                int i4 = omh.b;
                return ((List) obj).isEmpty() ? omg.BROWSER : omg.FULLSCREEN_MEDIA;
            case 11:
                int i5 = omh.b;
                return (ampq) ((List) obj).get(0);
            case 12:
                return aynx.y((List) obj);
            case 13:
                return ((omf) obj).b;
            case 14:
                omg omgVar2 = (omg) obj;
                int i6 = omh.b;
                if (omgVar2 != omg.FULLSCREEN_MEDIA) {
                    i2 = 8;
                }
                return Integer.valueOf(i2);
            case 15:
                return ((ampq) obj).g();
            case 16:
                return ((ampq) obj).b(meo.q);
            case 17:
                return new vff((List) obj);
            case 18:
                asxp asxpVar = ((arhd) obj).e;
                return asxpVar == null ? asxp.a : asxpVar;
            case 19:
                return Boolean.valueOf(((asxp) obj).ak);
            default:
                return ((asxp) obj).am;
        }
    }
}
