package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.view.MenuItem;
import android.widget.ImageView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: xpl  reason: default package */
/* loaded from: classes4.dex */
public final class xpl implements aaj {
    final /* synthetic */ xpm a;

    public xpl(xpm xpmVar) {
        this.a = xpmVar;
    }

    @Override // defpackage.aaj
    public final boolean a(MenuItem menuItem) {
        this.a.mJ().onBackPressed();
        xpm xpmVar = this.a;
        if (xpmVar.b != null) {
            ImageView imageView = xpmVar.af;
            if (imageView == null || imageView.getDrawable() == null) {
                zep.b("Preview image does not exist.");
                return true;
            }
            final Bitmap bitmap = ((BitmapDrawable) this.a.af.getDrawable()).getBitmap();
            this.a.a.execute(new Runnable() { // from class: xpk
                @Override // java.lang.Runnable
                public final void run() {
                    Uri uri;
                    xpl xplVar = xpl.this;
                    Bitmap bitmap2 = bitmap;
                    try {
                        File file = new File(xplVar.a.rb().getCacheDir(), "comment");
                        if (!file.exists()) {
                            file.mkdir();
                        }
                        File createTempFile = File.createTempFile("attached_image_data", ".png", file);
                        bitmap2.compress(Bitmap.CompressFormat.PNG, 100, new FileOutputStream(createTempFile));
                        uri = Uri.fromFile(createTempFile);
                    } catch (IOException e) {
                        zep.d("Exception reading from cropped image file", e);
                        uri = null;
                    }
                    xpm xpmVar2 = xplVar.a;
                    xpmVar2.b.d(xpmVar2.e, xpmVar2.ae, uri);
                }
            });
            return true;
        }
        return true;
    }
}
