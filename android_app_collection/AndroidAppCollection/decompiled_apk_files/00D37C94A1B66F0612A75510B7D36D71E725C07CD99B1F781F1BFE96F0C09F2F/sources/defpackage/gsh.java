package defpackage;

import android.os.Build;
import com.google.android.youtube.R;
import java.util.concurrent.Executors;
/* compiled from: PG */
/* renamed from: gsh  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gsh implements amqo {
    private final /* synthetic */ int u;
    public static final /* synthetic */ gsh t = new gsh(20);
    public static final /* synthetic */ gsh s = new gsh(19);
    public static final /* synthetic */ gsh r = new gsh(18);
    public static final /* synthetic */ gsh q = new gsh(17);
    public static final /* synthetic */ gsh p = new gsh(16);
    public static final /* synthetic */ gsh o = new gsh(15);
    public static final /* synthetic */ gsh n = new gsh(14);
    public static final /* synthetic */ gsh m = new gsh(13);
    public static final /* synthetic */ gsh l = new gsh(12);
    public static final /* synthetic */ gsh k = new gsh(11);
    public static final /* synthetic */ gsh j = new gsh(10);
    public static final /* synthetic */ gsh i = new gsh(9);
    public static final /* synthetic */ gsh h = new gsh(8);
    public static final /* synthetic */ gsh g = new gsh(7);
    public static final /* synthetic */ gsh f = new gsh(6);
    public static final /* synthetic */ gsh e = new gsh(5);
    public static final /* synthetic */ gsh d = new gsh(4);
    public static final /* synthetic */ gsh c = new gsh(3);
    public static final /* synthetic */ gsh b = new gsh(2);
    public static final /* synthetic */ gsh a = new gsh();

    private /* synthetic */ gsh() {
    }

    public /* synthetic */ gsh(int i2) {
        this.u = i2;
    }

    @Override // defpackage.amqo
    public final Object get() {
        switch (this.u) {
            case 0:
                return false;
            case 1:
                if (Build.VERSION.SDK_INT >= 26) {
                    return amuk.x(new yuq(Integer.toString(1), R.string.subscriptions_notifications_channel, 4, true, false), new yuq(Integer.toString(2), R.string.livestream_notifications_channel, 4, true, true), new yuq(Integer.toString(3), R.string.comments_notifications_channel, 3, true, false), new yuq(Integer.toString(5), R.string.recommended_notifications_channel, 2, true, false), new yuq(Integer.toString(6), R.string.updates_notifications_channel, 2, true, false), new yuq(Integer.toString(7), R.string.lock_screen_notifications_channel, 2, false, false), new yuq(Integer.toString(90), R.string.feedback_notifications_channel, 2, false, false));
                }
                return amuk.q();
            case 2:
            case 3:
            case 4:
                return false;
            case 5:
                return cgh.b(R.anim.fade_in_elements);
            case 6:
                return udy.c();
            case 7:
                return uxy.a();
            case 8:
                return amon.a;
            case 9:
                return anlz.f(Executors.newSingleThreadScheduledExecutor(pgw.e));
            case 10:
                return false;
            case 11:
                return new cwu();
            case 12:
                return new cxh();
            case 13:
                return qrj.d;
            case 14:
                return amon.a;
            case 15:
                return alj.a();
            case 16:
                return ytz.IMMEDIATE;
            case 17:
                return ytz.NORMAL;
            case 18:
                return new aaox();
            case 19:
                return ytz.NORMAL;
            default:
                return false;
        }
    }
}
