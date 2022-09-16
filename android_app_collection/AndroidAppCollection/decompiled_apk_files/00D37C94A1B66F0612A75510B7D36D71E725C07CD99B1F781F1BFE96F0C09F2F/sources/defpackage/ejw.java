package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ejw  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ejw implements ampt {
    private final /* synthetic */ int v;
    public static final /* synthetic */ ejw u = new ejw(20);
    public static final /* synthetic */ ejw t = new ejw(19);
    public static final /* synthetic */ ejw s = new ejw(18);
    public static final /* synthetic */ ejw r = new ejw(17);
    public static final /* synthetic */ ejw q = new ejw(16);
    public static final /* synthetic */ ejw p = new ejw(15);
    public static final /* synthetic */ ejw o = new ejw(14);
    public static final /* synthetic */ ejw n = new ejw(13);
    public static final /* synthetic */ ejw m = new ejw(12);
    public static final /* synthetic */ ejw l = new ejw(11);
    public static final /* synthetic */ ejw k = new ejw(10);
    public static final /* synthetic */ ejw j = new ejw(9);
    public static final /* synthetic */ ejw i = new ejw(8);
    public static final /* synthetic */ ejw h = new ejw(7);
    public static final /* synthetic */ ejw g = new ejw(6);
    public static final /* synthetic */ ejw f = new ejw(5);
    public static final /* synthetic */ ejw e = new ejw(4);
    public static final /* synthetic */ ejw d = new ejw(3);
    public static final /* synthetic */ ejw c = new ejw(2);
    public static final /* synthetic */ ejw b = new ejw(1);
    public static final /* synthetic */ ejw a = new ejw();

    private /* synthetic */ ejw() {
    }

    private /* synthetic */ ejw(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ampt
    public final boolean a(Object obj) {
        switch (this.v) {
            case 0:
                if ((((aptk) obj).b & 64) != 0) {
                    return true;
                }
                break;
            case 1:
                String str = (String) obj;
                if (str != null) {
                    String g2 = akzj.g(str);
                    if (!TextUtils.isEmpty(g2) && ((!g2.contains("text") || g2.contains("text/vtt")) && !g2.contains("html") && !g2.contains("xml"))) {
                        return true;
                    }
                }
                return false;
            case 2:
                return (((aptk) obj).b & 32) != 0;
            case 3:
                apto aptoVar = ((aptk) obj).g;
                if (aptoVar == null) {
                    aptoVar = apto.a;
                }
                return aptoVar.b == 105917786;
            case 4:
                apto aptoVar2 = ((aptk) obj).f;
                if (aptoVar2 == null) {
                    aptoVar2 = apto.a;
                }
                return aptoVar2.b == 105917786;
            case 5:
                apto aptoVar3 = ((aptk) obj).e;
                if (aptoVar3 == null) {
                    aptoVar3 = apto.a;
                }
                return aptoVar3.b == 105917786;
            case 6:
                aptm aptmVar = ((aptk) obj).c;
                if (aptmVar == null) {
                    aptmVar = aptm.a;
                }
                return aptmVar.b == 109219466;
            case 7:
                aptm aptmVar2 = ((aptk) obj).d;
                if (aptmVar2 == null) {
                    aptmVar2 = aptm.a;
                }
                return aptmVar2.b == 109219466;
            case 8:
                return (((aptl) obj).b & 2) != 0;
            case 9:
                return (((aptl) obj).b & 1) != 0;
            case 10:
                avjf avjfVar = (avjf) obj;
                int i2 = erw.a;
                return true;
            case 11:
                amvn amvnVar = fdl.a;
                return ((String) obj).startsWith(fcw.OFFLINE_LAST_SCHEDULED_AD_HOC_REFRESH_TIME_MILLIS);
            case 12:
                String str2 = (String) obj;
                amvn amvnVar2 = fdl.a;
                return str2.startsWith("offline_access_enabled") || str2.startsWith("offline_access_updated_at");
            case 13:
                View view = (View) obj;
                return (view == null || view.getTag(R.id.player_overlay_tap_listener) == null || !(view.getTag(R.id.player_overlay_tap_listener) instanceof zbo)) ? false : true;
            case 14:
                View view2 = (View) obj;
                return (view2 == null || view2.getTag(R.id.player_overlay_tap_listener) == null || !(view2.getTag(R.id.player_overlay_tap_listener) instanceof zbo)) ? false : true;
            case 15:
                View view3 = (View) obj;
                if (view3 == null) {
                    return false;
                }
                if (view3.getTag(R.id.player_overlay_tap_listener) != null) {
                    return true;
                }
                return view3.isClickable() && view3.getTag(R.id.disallow_player_overlay_tap_listener) == null;
            case 16:
                String str3 = (String) obj;
                if (ezv.d(str3)) {
                    return true;
                }
                return !TextUtils.isEmpty(str3) && str3.endsWith("bollard_frequency_mins");
            case 17:
                return "donation_amount_picker".equals((String) obj);
            case 18:
                return "donation_shelf".equals((String) obj);
            case 19:
                alcu a2 = alcu.a(((alcw) obj).l);
                if (a2 == null) {
                    a2 = alcu.UNKNOWN_UPLOAD;
                }
                return a2 == alcu.REELS_UPLOAD;
            default:
                String str4 = (String) obj;
                if (!TextUtils.isEmpty(str4) && str4.endsWith("_ReelsCreatorWatchLaterStickerLastUsedTime")) {
                    return true;
                }
                break;
        }
        return false;
    }
}
