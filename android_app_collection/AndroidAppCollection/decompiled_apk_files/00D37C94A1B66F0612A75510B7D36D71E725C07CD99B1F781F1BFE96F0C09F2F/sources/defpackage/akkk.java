package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
/* compiled from: PG */
/* renamed from: akkk  reason: default package */
/* loaded from: classes.dex */
public final class akkk {
    public final Activity a;

    public akkk(Activity activity) {
        this.a = activity;
    }

    public final File a(Bitmap bitmap, String str) {
        File file = new File(this.a.getCacheDir(), "story_share");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, str);
        FileOutputStream fileOutputStream = new FileOutputStream(file2, false);
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
        fileOutputStream.close();
        return file2;
    }

    public final String b() {
        String packageName = this.a.getPackageName();
        return ((packageName.hashCode() == 1713433253 && packageName.equals("com.google.android.apps.youtube.music")) ? (char) 0 : (char) 65535) != 0 ? "com.google.android.youtube.fileprovider" : "com.google.android.apps.youtube.music.fileprovider";
    }
}
