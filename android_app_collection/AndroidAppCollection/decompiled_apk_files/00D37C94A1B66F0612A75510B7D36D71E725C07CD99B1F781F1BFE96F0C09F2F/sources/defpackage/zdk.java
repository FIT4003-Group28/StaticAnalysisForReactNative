package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: zdk  reason: default package */
/* loaded from: classes4.dex */
public final class zdk {
    public static ViewGroup b(Activity activity) {
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().findViewById(R.id.interstitials_container);
        return viewGroup == null ? (ViewGroup) activity.getWindow().getDecorView() : viewGroup;
    }

    public static void c(ImageView imageView, int i) {
        boolean z = false;
        if (i >= 0 && i <= 255) {
            z = true;
        }
        aqxo.p(z);
        imageView.getClass();
        imageView.setImageAlpha(i);
    }

    public static final yzo d(View view) {
        view.getClass();
        return new yzo(view);
    }

    public static void a(int i, int i2) {
        String format;
        if (i < 0 || i > i2) {
            if (i < 0) {
                format = String.format("index (%s) must not be negative", Integer.valueOf(i));
            } else if (i2 < 0) {
                StringBuilder sb = new StringBuilder(26);
                sb.append("negative size: ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            } else {
                format = String.format("index (%s) must not be greater than size (%s)", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(format);
        }
    }
}
