package defpackage;

import android.accounts.Account;
import android.net.Uri;
import com.google.protos.youtube.api.innertube.WebviewEndpointOuterClass$WebviewEndpoint;
import java.util.List;
/* compiled from: PG */
/* renamed from: dzy  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class dzy implements ayqe {
    private final /* synthetic */ int u;
    public static final /* synthetic */ dzy t = new dzy(20);
    public static final /* synthetic */ dzy s = new dzy(19);
    public static final /* synthetic */ dzy r = new dzy(18);
    public static final /* synthetic */ dzy q = new dzy(17);
    public static final /* synthetic */ dzy p = new dzy(16);
    public static final /* synthetic */ dzy o = new dzy(15);
    public static final /* synthetic */ dzy n = new dzy(14);
    public static final /* synthetic */ dzy m = new dzy(13);
    public static final /* synthetic */ dzy l = new dzy(11);
    public static final /* synthetic */ dzy k = new dzy(10);
    public static final /* synthetic */ dzy j = new dzy(9);
    public static final /* synthetic */ dzy i = new dzy(8);
    public static final /* synthetic */ dzy h = new dzy(7);
    public static final /* synthetic */ dzy g = new dzy(6);
    public static final /* synthetic */ dzy f = new dzy(5);
    public static final /* synthetic */ dzy e = new dzy(4);
    public static final /* synthetic */ dzy d = new dzy(3);
    public static final /* synthetic */ dzy c = new dzy(2);
    public static final /* synthetic */ dzy b = new dzy(1);
    public static final /* synthetic */ dzy a = new dzy();

    private /* synthetic */ dzy() {
    }

    public /* synthetic */ dzy(int i2) {
        this.u = i2;
    }

    @Override // defpackage.ayqe
    public final Object a(Object obj) {
        boolean z = true;
        switch (this.u) {
            case 0:
                aupg aupgVar = ((arhd) obj).n;
                return aupgVar == null ? aupg.a : aupgVar;
            case 1:
                aupg aupgVar2 = ((arhd) obj).n;
                return aupgVar2 == null ? aupg.a : aupgVar2;
            case 2:
                if (((Integer) obj).intValue() != 4) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                return (ezx) ((List) obj).get(1);
            case 4:
                return Boolean.valueOf(((egw) obj).j);
            case 5:
                asxp asxpVar = ((arhd) obj).e;
                if (asxpVar == null) {
                    asxpVar = asxp.a;
                }
                return Boolean.valueOf(asxpVar.ab);
            case 6:
                return Boolean.valueOf(((egw) obj).j);
            case 7:
                return (Account) ((ampq) obj).c();
            case 8:
                int i2 = esl.g;
                return (WebviewEndpointOuterClass$WebviewEndpoint) ((apzg) obj).qm(WebviewEndpointOuterClass$WebviewEndpoint.webviewEndpoint);
            case 9:
                return Uri.parse((String) obj);
            case 10:
                return amuk.o((List) obj);
            case 11:
                return ayoi.Q((List) obj);
            case 12:
                awkb awkbVar = (awkb) obj;
                int i3 = awkbVar.b;
                if (i3 == 1) {
                    return (String) awkbVar.c;
                }
                if (i3 == 3) {
                    return (String) awkbVar.c;
                }
                return i3 == 2 ? (String) awkbVar.c : "";
            case 13:
                return ((fbc) obj).a;
            case 14:
                return (fbc) ((ampr) obj).a;
            case 15:
                return ((awka) obj).getDownloads();
            case 16:
                String str = (String) obj;
                return new fbc(str, aakj.a(str), aakj.g(str));
            case 17:
                return Integer.valueOf(((fav) obj).a);
            case 18:
                return ((aajp) obj).c;
            case 19:
                return Boolean.valueOf(((fda) obj).k);
            default:
                return ((aajp) obj).c;
        }
    }
}
