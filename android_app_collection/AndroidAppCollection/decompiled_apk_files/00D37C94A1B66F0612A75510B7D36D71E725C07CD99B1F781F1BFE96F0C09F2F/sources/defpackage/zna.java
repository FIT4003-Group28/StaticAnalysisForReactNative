package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.media.CamcorderProfile;
import android.net.Uri;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Deque;
import java.util.HashMap;
import java.util.Locale;
import org.xml.sax.Attributes;
/* compiled from: PG */
/* renamed from: zna  reason: default package */
/* loaded from: classes4.dex */
public class zna {
    public static Uri a(Uri uri, Context context) {
        return akg.b() ? gf.a(context, "com.google.android.youtube.fileprovider", new File(uri.getPath())) : uri;
    }

    public static Uri b(Context context) {
        String format = new SimpleDateFormat(context.getString(R.string.video_file_name_format), Locale.US).format(new Date());
        try {
            if (!akg.b()) {
                File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), "Camera");
                if (!file.exists()) {
                    file.mkdirs();
                }
                if (!file.isDirectory() || !file.canWrite()) {
                    throw new RuntimeException("Camera roll directory not accessible.");
                }
                return Uri.fromFile(new File(file, String.valueOf(format).concat(".mp4")));
            }
            return Uri.fromFile(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), String.valueOf(format).concat(".mp4")));
        } catch (IOException e) {
            throw new RuntimeException("Failed to create temp photo file.", e);
        }
    }

    public static int c(Activity activity) {
        activity.getClass();
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        if (rotation == 0) {
            return 0;
        }
        if (rotation == 1) {
            return 90;
        }
        if (rotation == 2) {
            return 180;
        }
        return rotation == 3 ? 270 : 0;
    }

    public static long d() {
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        return statFs.getAvailableBlocks() * statFs.getBlockSize();
    }

    public static File e(File file, long j) {
        file.mkdirs();
        if (!file.isDirectory() || !file.canWrite()) {
            throw new RuntimeException("Output directory not accessible.");
        }
        return new File(file, String.valueOf(f(j)).concat(".mp4"));
    }

    public static String f(long j) {
        return new SimpleDateFormat("'VID'_yyyyMMdd_HHmmssSSS", Locale.US).format(new Date(j));
    }

    public static void g(FrameLayout frameLayout) {
        frameLayout.getClass();
        if (!zdg.e(frameLayout.getContext())) {
            return;
        }
        zdg.c(frameLayout.getContext(), frameLayout, frameLayout.getContext().getString(R.string.accessibility_stories_camera_page));
    }

    public static void h(View view, int i) {
        view.getClass();
        if (!zdg.e(view.getContext())) {
            return;
        }
        zdg.c(view.getContext(), view, view.getContext().getString(i));
    }

    public static void i(Context context, int i) {
        context.getClass();
        AlertDialog.Builder builder = new AlertDialog.Builder(context, R.style.WhiteAlertDialogStyle);
        builder.setTitle(R.string.camera_can_not_record).setMessage(i).setCancelable(false).setPositiveButton(R.string.ok, (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        create.show();
        create.getButton(-2).setTextColor(context.getResources().getColor(R.color.camera_dialog_button_text_color));
        create.getButton(-1).setTextColor(context.getResources().getColor(R.color.camera_dialog_button_text_color));
    }

    public static boolean j() {
        return TextUtils.equals(Environment.getExternalStorageState(), "mounted");
    }

    public static boolean k(Resources resources) {
        resources.getClass();
        return resources.getConfiguration().getLayoutDirection() == 1;
    }

    public static void l(View view) {
        h(view, R.string.accessibility_recording_end);
    }

    public static CamcorderProfile m(int i, int i2, int i3) {
        CamcorderProfile camcorderProfile;
        int[] iArr = {6, 5, 4, 0};
        int i4 = 0;
        while (i4 < 4 && iArr[i4] != i3) {
            i4++;
        }
        if (i4 != 4) {
            while (i4 < 4) {
                if (CamcorderProfile.hasProfile(i, iArr[i4]) && (camcorderProfile = CamcorderProfile.get(i, iArr[i4])) != null && camcorderProfile.videoFrameRate >= i2) {
                    return camcorderProfile;
                }
                i4++;
            }
            if (i2 <= 0) {
                return null;
            }
            return m(i, 0, i3);
        }
        throw new IllegalStateException("Unexpected targetQuality specified.");
    }

    public static zib p(HashMap hashMap) {
        return new zib(hashMap);
    }

    public static void q(Throwable th) {
        throw new zhw(th);
    }

    public static ankt r(ayos ayosVar) {
        zhv zhvVar = new zhv();
        ayosVar.W(new zhu(zhvVar));
        return zhvVar;
    }

    public static ayos s(final ankt anktVar) {
        return ayos.n(new ayou() { // from class: zhs
            @Override // defpackage.ayou
            public final void a(azkm azkmVar) {
                ankt anktVar2 = ankt.this;
                anlz.A(anktVar2, new zht(azkmVar), anjk.a);
                ayqi.f(azkmVar, new ayqg(new zhl(anktVar2, 2)));
            }
        });
    }

    public static ayol t(final aynr aynrVar) {
        return new ayol() { // from class: zho
            @Override // defpackage.ayol
            public final ayok a(ayoi ayoiVar) {
                aziw aziwVar = new aziw(ayoiVar, aynr.this.P(new Object()).k());
                azqc.i();
                return aziwVar;
            }
        };
    }

    public void n(Deque deque, Attributes attributes, String str) {
    }

    public void o(Deque deque, Attributes attributes) {
    }
}
