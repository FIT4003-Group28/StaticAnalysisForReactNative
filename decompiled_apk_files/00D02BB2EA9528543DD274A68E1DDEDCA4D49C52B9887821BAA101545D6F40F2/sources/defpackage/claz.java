package defpackage;

import android.graphics.Bitmap;
import com.google.android.apps.viewer.client.Dimensions;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: claz  reason: default package */
/* loaded from: classes5.dex */
public final class claz {
    private final List<WeakReference<Bitmap>> a = new ArrayList();

    public static int c(Bitmap bitmap) {
        return bitmap.getByteCount() / 1024;
    }

    @dzsi
    private final Bitmap d(Dimensions dimensions) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(dimensions.a, dimensions.b, Bitmap.Config.ARGB_8888);
            c(createBitmap);
            e();
            return createBitmap;
        } catch (OutOfMemoryError unused) {
            String valueOf = String.valueOf(dimensions);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
            sb.append("Can't allocate bitmap dim=");
            sb.append(valueOf);
            sb.toString();
            e();
            return null;
        }
    }

    private final void e() {
        int size = this.a.size();
        StringBuilder sb = new StringBuilder(28);
        sb.append("BitmapRecycler ");
        sb.append(size);
        sb.append(" (");
        StringBuilder sb2 = new StringBuilder(sb.toString());
        int i = 0;
        for (WeakReference<Bitmap> weakReference : this.a) {
            Bitmap bitmap = weakReference.get();
            if (bitmap != null) {
                i += c(bitmap);
                sb2.append(String.format("%s : %s x %s", bitmap, Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight())));
                sb2.append(",");
            } else {
                sb2.append("(null ref)");
            }
        }
        StringBuilder sb3 = new StringBuilder(20);
        sb3.append(") /mem = ");
        sb3.append(i);
        sb2.append(sb3.toString());
        if (i != 0) {
            sb2.toString();
        }
    }

    @dzsi
    public final synchronized Bitmap a(Dimensions dimensions) {
        Iterator<WeakReference<Bitmap>> it = this.a.iterator();
        while (it.hasNext()) {
            Bitmap bitmap = it.next().get();
            if (bitmap == null) {
                it.remove();
            } else if (bitmap.getWidth() == dimensions.a && bitmap.getHeight() == dimensions.b) {
                it.remove();
                c(bitmap);
                return bitmap;
            }
        }
        return d(dimensions);
    }

    public final synchronized void b(@dzsi Bitmap bitmap) {
        if (bitmap != null) {
            this.a.add(new WeakReference<>(bitmap));
        }
    }
}
