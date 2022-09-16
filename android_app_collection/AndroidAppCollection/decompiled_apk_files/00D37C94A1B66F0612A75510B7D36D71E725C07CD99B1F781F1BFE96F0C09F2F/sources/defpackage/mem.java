package defpackage;

import android.content.pm.ResolveInfo;
import com.google.android.libraries.accountlinking.activity.AccountLinkingActivity;
/* compiled from: PG */
/* renamed from: mem  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class mem implements ampt {
    private final /* synthetic */ int v;
    public static final /* synthetic */ mem u = new mem(20);
    public static final /* synthetic */ mem t = new mem(19);
    public static final /* synthetic */ mem s = new mem(18);
    public static final /* synthetic */ mem r = new mem(17);
    public static final /* synthetic */ mem q = new mem(16);
    public static final /* synthetic */ mem p = new mem(15);
    public static final /* synthetic */ mem o = new mem(14);
    public static final /* synthetic */ mem n = new mem(13);
    public static final /* synthetic */ mem m = new mem(12);
    public static final /* synthetic */ mem l = new mem(11);
    public static final /* synthetic */ mem k = new mem(10);
    public static final /* synthetic */ mem j = new mem(9);
    public static final /* synthetic */ mem i = new mem(8);
    public static final /* synthetic */ mem h = new mem(7);
    public static final /* synthetic */ mem g = new mem(6);
    public static final /* synthetic */ mem f = new mem(5);
    public static final /* synthetic */ mem e = new mem(4);
    public static final /* synthetic */ mem d = new mem(3);
    public static final /* synthetic */ mem c = new mem(2);
    public static final /* synthetic */ mem b = new mem(1);
    public static final /* synthetic */ mem a = new mem();

    private /* synthetic */ mem() {
    }

    private /* synthetic */ mem(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ampt
    public final boolean a(Object obj) {
        switch (this.v) {
            case 0:
                return (((atxh) obj).b & 2) != 0;
            case 1:
                return (((atxh) obj).b & 1) != 0;
            case 2:
                return (((atxk) obj).b & 4) != 0;
            case 3:
                return (((atxk) obj).b & 2048) != 0;
            case 4:
                return (((atxk) obj).b & 1) != 0;
            case 5:
                return (((atxk) obj).b & 2) != 0;
            case 6:
                return (((atxk) obj).b & 1024) != 0;
            case 7:
                atxi atxiVar = ((atxk) obj).i;
                if (atxiVar == null) {
                    atxiVar = atxi.a;
                }
                return atxiVar.b == 102716411;
            case 8:
                return (obj instanceof akba) && ((akba) obj).h();
            case 9:
                String str = (String) obj;
                return true;
            case 10:
                aslt asltVar = (aslt) obj;
                if (asltVar != null) {
                    aqef aqefVar = asltVar.ac;
                    if (aqefVar == null) {
                        aqefVar = aqef.a;
                    }
                    if (aqefVar.h) {
                        return true;
                    }
                }
                return false;
            case 11:
                return !(obj instanceof aumr);
            case 12:
                aslt asltVar2 = (aslt) obj;
                return asltVar2 != null && odk.d(aakx.b(asltVar2));
            case 13:
                return !odk.d(obj);
            case 14:
                anay anayVar = AccountLinkingActivity.a;
                aoeu a2 = aoeu.a(((aofm) obj).b);
                if (a2 == null) {
                    a2 = aoeu.UNRECOGNIZED;
                }
                return a2.equals(aoeu.DATA_USAGE_NOTICE_TYPE_LINKING_INFO);
            case 15:
                anay anayVar2 = AccountLinkingActivity.a;
                aoeu a3 = aoeu.a(((aofm) obj).b);
                if (a3 == null) {
                    a3 = aoeu.UNRECOGNIZED;
                }
                return a3.equals(aoeu.DATA_USAGE_NOTICE_TYPE_CAPABILITY_CONSENT);
            case 16:
                String str2 = (String) obj;
                amtf d2 = amtf.d(ryu.ae);
                str2.getClass();
                return arey.v(d2.h(), new eqa(str2, 3));
            case 17:
                ResolveInfo resolveInfo = (ResolveInfo) obj;
                int i2 = ryy.a;
                return resolveInfo.filter.hasAction("android.intent.action.VIEW") && resolveInfo.filter.hasCategory("android.intent.category.BROWSABLE") && resolveInfo.filter.schemesIterator() != null && resolveInfo.filter.authoritiesIterator() == null && resolveInfo.filter.hasDataScheme("http") && resolveInfo.filter.hasDataScheme("https");
            case 18:
                return !szb.a.contains(((tek) obj).getClass());
            case 19:
                return szb.a.contains(((tek) obj).getClass());
            default:
                return ((String) obj).startsWith("incognito_promotion_already_shown");
        }
    }
}
