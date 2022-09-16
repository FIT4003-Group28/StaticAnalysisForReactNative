package defpackage;

import android.os.Binder;
import android.os.Looper;
import com.google.android.libraries.onegoogle.expresssignin.ExpressSignInLayout;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;
/* compiled from: PG */
/* renamed from: qvl  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class qvl implements Runnable {
    private final /* synthetic */ int k;
    public static final /* synthetic */ qvl j = new qvl(20);
    public static final /* synthetic */ qvl i = new qvl(16);
    public static final /* synthetic */ qvl h = new qvl(15);
    public static final /* synthetic */ qvl g = new qvl(6);
    public static final /* synthetic */ qvl f = new qvl(5);
    public static final /* synthetic */ qvl e = new qvl(4);
    public static final /* synthetic */ qvl d = new qvl(3);
    public static final /* synthetic */ qvl c = new qvl(2);
    public static final /* synthetic */ qvl b = new qvl(1);
    public static final /* synthetic */ qvl a = new qvl();

    private /* synthetic */ qvl() {
    }

    public /* synthetic */ qvl(int i2) {
        this.k = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.k) {
            case 0:
                return;
            case 1:
                fyn.a();
                return;
            case 2:
                Binder.flushPendingCommands();
                return;
            case 3:
                throw new RuntimeException("Someone quit the @LightweightExecutor looper");
            case 4:
                smc.b();
                return;
            case 5:
                String str = umx.ae;
                return;
            case 6:
                String str2 = ExpressSignInLayout.a;
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return;
            case 15:
                PermissionDescriptor[] permissionDescriptorArr = LiveCreationActivity.c;
                return;
            case 16:
                long j2 = acll.a;
                return;
            case 17:
            case 18:
                return;
            case 19:
                Looper.myLooper().quit();
                return;
            default:
                int i2 = ajin.a;
                aohk.c("yoga", new String[0]);
                return;
        }
    }
}
