package defpackage;

import android.net.Uri;
import com.google.android.libraries.youtube.edit.gallery.GalleryActivity;
import com.google.android.libraries.youtube.livecreation.controller.StreamConfig;
import com.google.android.libraries.youtube.livecreation.screencast.ScreencastHostService;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;
/* compiled from: PG */
/* renamed from: zbx  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class zbx implements zdt {
    private final /* synthetic */ int t;
    public static final /* synthetic */ zbx s = new zbx(20);
    public static final /* synthetic */ zbx r = new zbx(19);
    public static final /* synthetic */ zbx q = new zbx(18);
    public static final /* synthetic */ zbx p = new zbx(17);
    public static final /* synthetic */ zbx o = new zbx(16);
    public static final /* synthetic */ zbx n = new zbx(15);
    public static final /* synthetic */ zbx m = new zbx(14);
    public static final /* synthetic */ zbx l = new zbx(13);
    public static final /* synthetic */ zbx k = new zbx(12);
    public static final /* synthetic */ zbx j = new zbx(11);
    public static final /* synthetic */ zbx i = new zbx(10);
    public static final /* synthetic */ zbx h = new zbx(9);
    public static final /* synthetic */ zbx g = new zbx(8);
    public static final /* synthetic */ zbx f = new zbx(7);
    public static final /* synthetic */ zbx e = new zbx(6);
    public static final /* synthetic */ zbx d = new zbx(5);
    public static final /* synthetic */ zbx c = new zbx(4);
    public static final /* synthetic */ zbx b = new zbx(3);
    public static final /* synthetic */ zbx a = new zbx(1);

    public /* synthetic */ zbx() {
    }

    public /* synthetic */ zbx(int i2) {
        this.t = i2;
    }

    @Override // defpackage.zdt
    public final void a(Object obj) {
        switch (this.t) {
            case 0:
                Void r4 = (Void) obj;
                return;
            case 1:
                String str = ybo.a;
                zep.d("Failed to read fake buy flag.", (Throwable) obj);
                return;
            case 2:
                Void r42 = (Void) obj;
                return;
            case 3:
                Throwable th = (Throwable) obj;
                zep.b("Failure updating choose filter unvisited effect state.");
                return;
            case 4:
                zdt zdtVar = GalleryActivity.a;
                zep.d("Failed to clear cache.", (Throwable) obj);
                return;
            case 5:
                Throwable th2 = (Throwable) obj;
                zep.b("Updating choose filter unvisited effect state failed.");
                return;
            case 6:
                int i2 = aath.b;
                ((Uri.Builder) obj).appendQueryParameter("retry", "1");
                return;
            case 7:
                ((Uri.Builder) obj).appendQueryParameter("retry", "1");
                return;
            case 8:
                int i3 = ScreencastHostService.s;
                ((StreamConfig) obj).q = true;
                return;
            case 9:
                Throwable th3 = (Throwable) obj;
                PermissionDescriptor[] permissionDescriptorArr = LiveCreationActivity.c;
                zep.b("Failed to save the portrait stream count.");
                return;
            case 10:
                Throwable th4 = (Throwable) obj;
                PermissionDescriptor[] permissionDescriptorArr2 = LiveCreationActivity.c;
                zep.b("Failed to save the live stream state in PDS.");
                return;
            case 11:
                Throwable th5 = (Throwable) obj;
                PermissionDescriptor[] permissionDescriptorArr3 = LiveCreationActivity.c;
                zep.b("Failed to save the current timestamp in PDS.");
                return;
            case 12:
                Throwable th6 = (Throwable) obj;
                PermissionDescriptor[] permissionDescriptorArr4 = LiveCreationActivity.c;
                zep.b("Can't write to ProtoDataStore");
                return;
            case 13:
                Void r43 = (Void) obj;
                PermissionDescriptor[] permissionDescriptorArr5 = LiveCreationActivity.c;
                return;
            case 14:
                Void r44 = (Void) obj;
                PermissionDescriptor[] permissionDescriptorArr6 = LiveCreationActivity.c;
                return;
            case 15:
                Void r45 = (Void) obj;
                PermissionDescriptor[] permissionDescriptorArr7 = LiveCreationActivity.c;
                return;
            case 16:
                Void r46 = (Void) obj;
                PermissionDescriptor[] permissionDescriptorArr8 = LiveCreationActivity.c;
                return;
            case 17:
                zep.d("Failed update hasSeenScreencastTooltip.", (Throwable) obj);
                return;
            case 18:
                Void r47 = (Void) obj;
                return;
            case 19:
                Void r48 = (Void) obj;
                long j2 = acll.a;
                return;
            default:
                Void r49 = (Void) obj;
                long j3 = acll.a;
                return;
        }
    }
}
