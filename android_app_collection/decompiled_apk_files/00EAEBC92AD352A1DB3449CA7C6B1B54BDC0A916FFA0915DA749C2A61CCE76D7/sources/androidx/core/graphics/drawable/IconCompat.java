package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
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
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    static final PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: collision with root package name */
    public int f1566a;

    /* renamed from: b  reason: collision with root package name */
    Object f1567b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f1568c;

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f1569d;

    /* renamed from: e  reason: collision with root package name */
    public int f1570e;

    /* renamed from: f  reason: collision with root package name */
    public int f1571f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f1572g;

    /* renamed from: h  reason: collision with root package name */
    PorterDuff.Mode f1573h;
    public String i;
    public String j;

    public IconCompat() {
        this.f1566a = -1;
        this.f1568c = null;
        this.f1569d = null;
        this.f1570e = 0;
        this.f1571f = 0;
        this.f1572g = null;
        this.f1573h = k;
        this.i = null;
    }

    private IconCompat(int i) {
        this.f1566a = -1;
        this.f1568c = null;
        this.f1569d = null;
        this.f1570e = 0;
        this.f1571f = 0;
        this.f1572g = null;
        this.f1573h = k;
        this.i = null;
        this.f1566a = i;
    }

    private static int a(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon resource", e4);
            return 0;
        }
    }

    static Bitmap a(Bitmap bitmap, boolean z) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f2 = min;
        float f3 = 0.5f * f2;
        float f4 = 0.9166667f * f3;
        if (z) {
            float f5 = 0.010416667f * f2;
            paint.setColor(0);
            paint.setShadowLayer(f5, 0.0f, f2 * 0.020833334f, 1023410176);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.setShadowLayer(f5, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2, (-(bitmap.getHeight() - min)) / 2);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f3, f3, f4, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat a(Resources resources, String str, int i) {
        if (str != null) {
            if (i == 0) {
                throw new IllegalArgumentException("Drawable resource ID must not be 0");
            }
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f1570e = i;
            if (resources != null) {
                try {
                    iconCompat.f1567b = resources.getResourceName(i);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f1567b = str;
            }
            iconCompat.j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Package must not be null.");
    }

    private static String a(int i) {
        switch (i) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    private static String b(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon package", e3);
            return null;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon package", e4);
            return null;
        }
    }

    private static int c(Icon icon) {
        StringBuilder sb;
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getType();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e2) {
            e = e2;
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            Log.e("IconCompat", sb.toString(), e);
            return -1;
        } catch (NoSuchMethodException e3) {
            e = e3;
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            Log.e("IconCompat", sb.toString(), e);
            return -1;
        } catch (InvocationTargetException e4) {
            e = e4;
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            Log.e("IconCompat", sb.toString(), e);
            return -1;
        }
    }

    private static Uri d(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getUri();
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon uri", e4);
            return null;
        }
    }

    public int a() {
        if (this.f1566a != -1 || Build.VERSION.SDK_INT < 23) {
            if (this.f1566a == 2) {
                return this.f1570e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        return a((Icon) this.f1567b);
    }

    public InputStream a(Context context) {
        StringBuilder sb;
        String str;
        Uri d2 = d();
        String scheme = d2.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(d2);
            } catch (Exception e2) {
                e = e2;
                sb = new StringBuilder();
                str = "Unable to load image from URI: ";
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f1567b));
            } catch (FileNotFoundException e3) {
                e = e3;
                sb = new StringBuilder();
                str = "Unable to load image from path: ";
            }
        }
        sb.append(str);
        sb.append(d2);
        Log.w("IconCompat", sb.toString(), e);
        return null;
    }

    public void a(boolean z) {
        this.i = this.f1573h.name();
        switch (this.f1566a) {
            case -1:
                if (z) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) this.f1567b).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f1568c = byteArrayOutputStream.toByteArray();
                    return;
                }
                break;
            case 2:
                this.f1568c = ((String) this.f1567b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f1568c = (byte[]) this.f1567b;
                return;
            case 4:
            case 6:
                this.f1568c = this.f1567b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
        this.f1569d = (Parcelable) this.f1567b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
        if (r0 >= 26) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.drawable.Icon b(android.content.Context r5) {
        /*
            r4 = this;
            int r0 = r4.f1566a
            r1 = 0
            r2 = 26
            switch(r0) {
                case -1: goto Lb7;
                case 0: goto L8;
                case 1: goto L9e;
                case 2: goto L93;
                case 3: goto L86;
                case 4: goto L7d;
                case 5: goto L67;
                case 6: goto L10;
                default: goto L8;
            }
        L8:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unknown type"
            r5.<init>(r0)
            throw r5
        L10:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 30
            if (r0 < r3) goto L20
            android.net.Uri r5 = r4.d()
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithAdaptiveBitmapContentUri(r5)
            goto La6
        L20:
            if (r5 == 0) goto L4c
            java.io.InputStream r5 = r4.a(r5)
            if (r5 == 0) goto L31
            int r0 = android.os.Build.VERSION.SDK_INT
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r5)
            if (r0 < r2) goto L78
            goto L6f
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot load adaptive icon from uri: "
            r0.append(r1)
            android.net.Uri r1 = r4.d()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L4c:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Context is required to resolve the file uri of the icon: "
            r0.append(r1)
            android.net.Uri r1 = r4.d()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L67:
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 < r2) goto L74
            java.lang.Object r5 = r4.f1567b
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
        L6f:
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithAdaptiveBitmap(r5)
            goto La6
        L74:
            java.lang.Object r5 = r4.f1567b
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
        L78:
            android.graphics.Bitmap r5 = a(r5, r1)
            goto La2
        L7d:
            java.lang.Object r5 = r4.f1567b
            java.lang.String r5 = (java.lang.String) r5
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithContentUri(r5)
            goto La6
        L86:
            java.lang.Object r5 = r4.f1567b
            byte[] r5 = (byte[]) r5
            int r0 = r4.f1570e
            int r1 = r4.f1571f
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithData(r5, r0, r1)
            goto La6
        L93:
            java.lang.String r5 = r4.b()
            int r0 = r4.f1570e
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithResource(r5, r0)
            goto La6
        L9e:
            java.lang.Object r5 = r4.f1567b
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
        La2:
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithBitmap(r5)
        La6:
            android.content.res.ColorStateList r0 = r4.f1572g
            if (r0 == 0) goto Lad
            r5.setTintList(r0)
        Lad:
            android.graphics.PorterDuff$Mode r0 = r4.f1573h
            android.graphics.PorterDuff$Mode r1 = androidx.core.graphics.drawable.IconCompat.k
            if (r0 == r1) goto Lb6
            r5.setTintMode(r0)
        Lb6:
            return r5
        Lb7:
            java.lang.Object r5 = r4.f1567b
            android.graphics.drawable.Icon r5 = (android.graphics.drawable.Icon) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.b(android.content.Context):android.graphics.drawable.Icon");
    }

    public String b() {
        if (this.f1566a != -1 || Build.VERSION.SDK_INT < 23) {
            if (this.f1566a == 2) {
                return this.j;
            }
            throw new IllegalStateException("called getResPackage() on " + this);
        }
        return b((Icon) this.f1567b);
    }

    public int c() {
        return (this.f1566a != -1 || Build.VERSION.SDK_INT < 23) ? this.f1566a : c((Icon) this.f1567b);
    }

    public Uri d() {
        if (this.f1566a != -1 || Build.VERSION.SDK_INT < 23) {
            int i = this.f1566a;
            if (i == 4 || i == 6) {
                return Uri.parse((String) this.f1567b);
            }
            throw new IllegalStateException("called getUri() on " + this);
        }
        return d((Icon) this.f1567b);
    }

    public void e() {
        Parcelable parcelable;
        this.f1573h = PorterDuff.Mode.valueOf(this.i);
        switch (this.f1566a) {
            case -1:
                parcelable = this.f1569d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                parcelable = this.f1569d;
                if (parcelable == null) {
                    byte[] bArr = this.f1568c;
                    this.f1567b = bArr;
                    this.f1566a = 3;
                    this.f1570e = 0;
                    this.f1571f = bArr.length;
                    return;
                }
                break;
            case 2:
            case 4:
            case 6:
                this.f1567b = new String(this.f1568c, Charset.forName("UTF-16"));
                if (this.f1566a != 2 || this.j != null) {
                    return;
                }
                this.j = ((String) this.f1567b).split(":", -1)[0];
                return;
            case 3:
                this.f1567b = this.f1568c;
                return;
        }
        this.f1567b = parcelable;
    }

    @Deprecated
    public Icon f() {
        return b((Context) null);
    }

    public String toString() {
        int height;
        if (this.f1566a == -1) {
            return String.valueOf(this.f1567b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(a(this.f1566a));
        switch (this.f1566a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f1567b).getWidth());
                sb.append("x");
                height = ((Bitmap) this.f1567b).getHeight();
                sb.append(height);
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(a())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f1570e);
                if (this.f1571f != 0) {
                    sb.append(" off=");
                    height = this.f1571f;
                    sb.append(height);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f1567b);
                break;
        }
        if (this.f1572g != null) {
            sb.append(" tint=");
            sb.append(this.f1572g);
        }
        if (this.f1573h != k) {
            sb.append(" mode=");
            sb.append(this.f1573h);
        }
        sb.append(")");
        return sb.toString();
    }
}
