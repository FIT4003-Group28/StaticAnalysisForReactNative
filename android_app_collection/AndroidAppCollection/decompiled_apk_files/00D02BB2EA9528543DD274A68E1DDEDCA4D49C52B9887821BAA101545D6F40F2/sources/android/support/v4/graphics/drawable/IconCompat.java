package android.support.v4.graphics.drawable;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    public int a;
    public Object b;
    public byte[] c;
    public Parcelable d;
    public int e;
    public int f;
    public ColorStateList g;
    public PorterDuff.Mode i;
    public String j;
    public String k;

    public IconCompat() {
        this.a = -1;
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = 0;
        this.g = null;
        this.i = h;
        this.j = null;
    }

    public IconCompat(int i) {
        this.a = -1;
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = 0;
        this.g = null;
        this.i = h;
        this.j = null;
        this.a = i;
    }

    public static IconCompat c(Bitmap bitmap) {
        if (bitmap == null) {
            throw new IllegalArgumentException("Bitmap must not be null.");
        }
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.b = bitmap;
        return iconCompat;
    }

    public static IconCompat d(Bitmap bitmap) {
        IconCompat iconCompat = new IconCompat(5);
        iconCompat.b = bitmap;
        return iconCompat;
    }

    public static Resources l(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    public static int m(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getType();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException unused) {
            String str = "Unable to get icon type " + icon;
            return -1;
        } catch (NoSuchMethodException unused2) {
            String str2 = "Unable to get icon type " + icon;
            return -1;
        } catch (InvocationTargetException unused3) {
            String str3 = "Unable to get icon type " + icon;
            return -1;
        }
    }

    public static String n(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public static int o(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return 0;
        }
    }

    public static Uri p(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getUri();
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public static Bitmap q(Bitmap bitmap, boolean z) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = min;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        BitmapShader bitmapShader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2, (-(bitmap.getHeight() - min)) / 2);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public final int f() {
        if (this.a != -1 || Build.VERSION.SDK_INT < 23) {
            if (this.a == 2) {
                return this.e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        return o((Icon) this.b);
    }

    public final Uri g() {
        if (this.a != -1 || Build.VERSION.SDK_INT < 23) {
            int i = this.a;
            if (i == 4 || i == 6) {
                return Uri.parse((String) this.b);
            }
            throw new IllegalStateException("called getUri() on " + this);
        }
        return p((Icon) this.b);
    }

    @Deprecated
    public final Icon h() {
        return i(null);
    }

    public final void j(Context context) {
        Object obj;
        if (this.a != 2 || (obj = this.b) == null) {
            return;
        }
        String str = (String) obj;
        if (!str.contains(":")) {
            return;
        }
        String str2 = str.split(":", -1)[1];
        String str3 = str2.split("/", -1)[0];
        String str4 = str2.split("/", -1)[1];
        String str5 = str.split(":", -1)[0];
        if ("0_resource_name_obfuscated".equals(str4)) {
            return;
        }
        String e = e();
        int identifier = l(context, e).getIdentifier(str4, str3, str5);
        if (this.e == identifier) {
            return;
        }
        String str6 = "Id has changed for " + e + " " + str;
        this.e = identifier;
    }

    public final InputStream k(Context context) {
        Uri g = g();
        String scheme = g.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(g);
            } catch (Exception unused) {
                String str = "Unable to load image from URI: " + g;
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.b));
        } catch (FileNotFoundException unused2) {
            String str2 = "Unable to load image from path: " + g;
            return null;
        }
    }

    public final String toString() {
        String str;
        if (this.a == -1) {
            return String.valueOf(this.b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.k);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(f())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.e);
                if (this.f != 0) {
                    sb.append(" off=");
                    sb.append(this.f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.b);
                break;
        }
        if (this.g != null) {
            sb.append(" tint=");
            sb.append(this.g);
        }
        if (this.i != h) {
            sb.append(" mode=");
            sb.append(this.i);
        }
        sb.append(")");
        return sb.toString();
    }

    public static IconCompat a(Context context, int i) {
        if (context == null) {
            throw new IllegalArgumentException("Context must not be null.");
        }
        return b(context.getResources(), context.getPackageName(), i);
    }

    public static IconCompat b(Resources resources, String str, int i) {
        if (str != null) {
            if (i == 0) {
                throw new IllegalArgumentException("Drawable resource ID must not be 0");
            }
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.e = i;
            if (resources != null) {
                try {
                    iconCompat.b = resources.getResourceName(i);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.b = str;
            }
            iconCompat.k = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Package must not be null.");
    }

    public final String e() {
        if (this.a != -1 || Build.VERSION.SDK_INT < 23) {
            if (this.a == 2) {
                return TextUtils.isEmpty(this.k) ? ((String) this.b).split(":", -1)[0] : this.k;
            }
            throw new IllegalStateException("called getResPackage() on " + this);
        }
        return n((Icon) this.b);
    }

    public final Icon i(Context context) {
        Icon createWithBitmap;
        switch (this.a) {
            case -1:
                return (Icon) this.b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                createWithBitmap = Icon.createWithBitmap((Bitmap) this.b);
                break;
            case 2:
                createWithBitmap = Icon.createWithResource(e(), this.e);
                break;
            case 3:
                createWithBitmap = Icon.createWithData((byte[]) this.b, this.e, this.f);
                break;
            case 4:
                createWithBitmap = Icon.createWithContentUri((String) this.b);
                break;
            case 5:
                if (Build.VERSION.SDK_INT >= 26) {
                    createWithBitmap = Icon.createWithAdaptiveBitmap((Bitmap) this.b);
                    break;
                } else {
                    createWithBitmap = Icon.createWithBitmap(q((Bitmap) this.b, false));
                    break;
                }
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    createWithBitmap = Icon.createWithAdaptiveBitmapContentUri(g());
                    break;
                } else if (context == null) {
                    throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + g());
                } else {
                    InputStream k = k(context);
                    if (k == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + g());
                    } else if (Build.VERSION.SDK_INT >= 26) {
                        createWithBitmap = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(k));
                        break;
                    } else {
                        createWithBitmap = Icon.createWithBitmap(q(BitmapFactory.decodeStream(k), false));
                        break;
                    }
                }
        }
        ColorStateList colorStateList = this.g;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.i;
        if (mode != h) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }
}
