package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.AsyncTask;
import android.os.ParcelFileDescriptor;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cove  reason: default package */
/* loaded from: classes5.dex */
public class cove {
    public static volatile Executor a = AsyncTask.THREAD_POOL_EXECUTOR;
    private static boolean j;
    public final Context b;
    public final GoogleApiClient c;
    public final float f;
    public final float g;
    private covc h;
    public final ConcurrentHashMap<String, Bitmap> d = new ConcurrentHashMap<>();
    private final LinkedList<covc> i = new LinkedList<>();
    public final boolean e = false;

    public cove(Context context, GoogleApiClient googleApiClient, boolean z) {
        this.b = context;
        this.c = googleApiClient;
        Resources resources = context.getResources();
        this.g = resources.getInteger(R.integer.cover_photo_ratio_width);
        this.f = resources.getInteger(R.integer.cover_photo_ratio_height);
        j = ((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
    }

    private final void b() {
        if (this.i.isEmpty()) {
            return;
        }
        covc covcVar = this.h;
        if (covcVar != null && !covcVar.d) {
            return;
        }
        covc remove = this.i.remove();
        this.h = remove;
        remove.a();
    }

    private static void c(InputStream inputStream) {
        try {
            inputStream.close();
        } catch (IOException unused) {
        }
    }

    public static Bitmap g(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, int i3, int i4) {
        FileInputStream fileInputStream = null;
        if (parcelFileDescriptor == null) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i5 = 1;
        if (j) {
            i5 = 2;
        } else if (i > i4 || i2 > i3) {
            int i6 = i / 2;
            int i7 = i2 / 2;
            while (i6 / i5 >= i4 && i7 / i5 >= i3) {
                i5 += i5;
            }
        }
        options.inSampleSize = i5;
        options.inJustDecodeBounds = false;
        options.outWidth = i;
        options.outHeight = i2;
        if (j) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        try {
            FileInputStream fileInputStream2 = new FileInputStream(parcelFileDescriptor.getFileDescriptor());
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream2, null, options);
                c(fileInputStream2);
                return decodeStream;
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    c(fileInputStream);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static Bitmap h(Bitmap bitmap, int i, float f) {
        float f2 = i;
        int i2 = (int) (f * f2);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (i == width && i2 == height) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f3 = width;
        float f4 = i2;
        float f5 = height;
        float max = Math.max(f2 / f3, f4 / f5);
        matrix.setScale(max, max);
        int round = Math.round(f2 / max);
        int round2 = Math.round(f4 / max);
        return Bitmap.createBitmap(bitmap, Math.max(Math.min((int) ((f3 * 0.5f) - (round / 2)), width - round), 0), Math.max(Math.min((int) ((f5 * 0.5f) - (round2 / 2)), height - round2), 0), round, round2, matrix, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(covc covcVar, Bitmap bitmap) {
        if (bitmap != null) {
            covcVar.e.setImageBitmap(bitmap);
        }
    }

    public final void d(covc covcVar) {
        if (this.d.containsKey(covcVar.f)) {
            covcVar.e.setImageBitmap(this.d.get(covcVar.f));
            e(covcVar.e);
            return;
        }
        ImageView imageView = covcVar.e;
        e(imageView);
        if (!this.c.isConnected()) {
            return;
        }
        imageView.setTag(covcVar);
        this.i.add(covcVar);
        b();
    }

    public final void e(ImageView imageView) {
        imageView.setTag(null);
        int i = 0;
        while (i < this.i.size()) {
            if (this.i.get(i).e == imageView) {
                this.i.remove(i);
            } else {
                i++;
            }
        }
        covc covcVar = this.h;
        if (covcVar == null || covcVar.e != imageView) {
            return;
        }
        covcVar.d = true;
        b();
    }

    public final void f(Status status, ParcelFileDescriptor parcelFileDescriptor, int i, int i2, int i3, covc covcVar) {
        try {
            if (this.h != covcVar) {
                if (parcelFileDescriptor == null) {
                    return;
                }
                try {
                    parcelFileDescriptor.close();
                    return;
                } catch (IOException unused) {
                    return;
                }
            }
            ParcelFileDescriptor parcelFileDescriptor2 = null;
            this.h = null;
            if (covcVar.e.getTag() == covcVar && !covcVar.d) {
                if (!status.d() || parcelFileDescriptor == null) {
                    String valueOf = String.valueOf(status);
                    String valueOf2 = String.valueOf(parcelFileDescriptor);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28 + String.valueOf(valueOf2).length());
                    sb.append("Avatar loaded: status=");
                    sb.append(valueOf);
                    sb.append("  pfd=");
                    sb.append(valueOf2);
                    sb.toString();
                }
                if (parcelFileDescriptor != null) {
                    new covd(this, covcVar, parcelFileDescriptor, i, i2, i3).executeOnExecutor(a, new Void[0]);
                } else {
                    a(covcVar, null);
                    parcelFileDescriptor2 = parcelFileDescriptor;
                }
                b();
                if (parcelFileDescriptor2 == null) {
                    return;
                }
                try {
                    parcelFileDescriptor2.close();
                    return;
                } catch (IOException unused2) {
                    return;
                }
            }
            b();
            if (parcelFileDescriptor == null) {
                return;
            }
            try {
                parcelFileDescriptor.close();
            } catch (IOException unused3) {
            }
        } finally {
            b();
            if (parcelFileDescriptor != null) {
                try {
                    parcelFileDescriptor.close();
                } catch (IOException unused4) {
                }
            }
        }
    }
}
