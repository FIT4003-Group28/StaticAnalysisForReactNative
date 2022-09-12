package defpackage;

import android.graphics.Bitmap;
import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: bnva  reason: default package */
/* loaded from: classes.dex */
public final class bnva extends bnvl {
    public bnva(String str, int i, int i2) {
        super(str, null, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(Bitmap bitmap, int i, int i2) {
        int width;
        int height;
        boolean z = true;
        if (bitmap == null) {
            width = bvop.f(i, 1);
            height = bvop.f(i2, 1);
        } else {
            width = bitmap.getWidth();
            height = bitmap.getHeight();
        }
        int i3 = bnta.a().b;
        if (width > i3 || height > i3) {
            StringBuilder sb = new StringBuilder((int) R.styleable.AppCompatTheme_viewInflaterClass);
            sb.append("Textures with dimensions ");
            sb.append(width);
            sb.append("x");
            sb.append(height);
            sb.append(" are larger than  the maximum supported size ");
            sb.append(i3);
            sb.append("x");
            sb.append(i3);
            throw new IllegalArgumentException(sb.toString());
        }
        if (this.f == 1) {
            z = false;
        }
        if (bitmap == null) {
            return;
        }
        b(new bntv(bitmap, z));
        bitmap.getRowBytes();
        bitmap.getHeight();
    }
}
