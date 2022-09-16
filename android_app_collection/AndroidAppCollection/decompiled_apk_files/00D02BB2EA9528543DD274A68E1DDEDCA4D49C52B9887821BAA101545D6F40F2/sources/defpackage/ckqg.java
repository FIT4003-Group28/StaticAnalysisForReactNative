package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewDebug;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: ckqg  reason: default package */
/* loaded from: classes.dex */
public class ckqg extends ImageView {
    public static final ckqf b = new ckqb();
    public static eapd d = new eapd(0);
    public static final int e = R.id.image_placeholder_tag;
    public static final Pattern f = Pattern.compile("\\$(.)");
    private String a;
    public eapd c;
    public ckqd g;
    ckqe h;
    private boolean i;
    private eaow j;
    private boolean k;
    private boolean l;
    private final ckqm m;
    private String n;
    @ViewDebug.ExportedProperty
    private String o;
    private ckqe p;
    private ckqf q;
    private ckql r;
    private Drawable s;

    /* JADX INFO: Access modifiers changed from: protected */
    public ckqg(Context context, AttributeSet attributeSet, ckqm ckqmVar) {
        super(context, attributeSet);
        this.a = "";
        this.c = new eapd(0L);
        this.i = false;
        this.j = eaow.a;
        this.k = false;
        this.l = false;
        this.n = "";
        this.o = "";
        this.g = ckqc.FULLY_QUALIFIED;
        this.q = b;
        this.r = new ckql();
        this.m = ckqmVar;
    }

    private final String a(String str) {
        String e2 = dbsj.e(Uri.parse(str).getHost());
        String str2 = this.a;
        String str3 = true != this.r.g ? "" : " hardware bitmap enabled";
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 16 + e2.length() + str3.length());
        sb.append(str2);
        sb.append(" / ImageHost: {");
        sb.append(e2);
        sb.append("}");
        sb.append(str3);
        return sb.toString();
    }

    private static boolean b(int i) {
        return View.MeasureSpec.getMode(i) == 0 || View.MeasureSpec.getSize(i) > 0;
    }

    private final void c() {
        int i;
        if (!od.ak(this) || !this.k) {
            this.l = true;
            return;
        }
        this.l = false;
        ckqe ckqeVar = this.h;
        if (ckqeVar != null) {
            ckqeVar.c();
            this.h = null;
        }
        int width = getWidth();
        int height = getHeight();
        ImageView.ScaleType scaleType = getScaleType();
        ckql ckqlVar = this.r;
        int i2 = ckqlVar.b;
        int i3 = ckqlVar.c;
        if (i3 > 0 && (i = ckqlVar.d) > 0) {
            height = i;
            width = i3;
        }
        String a = this.g.a(this.n, width, height, scaleType);
        this.o = a;
        if (a.length() == 0) {
            return;
        }
        ckqe ckqeVar2 = new ckqe(this, this.q);
        this.h = ckqeVar2;
        if (e()) {
            this.r.g = true;
            this.p = this.h;
        }
        ckqm ckqmVar = this.m;
        String str = this.o;
        ckqmVar.c(str, ckqeVar2, this.r, a(str), this, this.s, (int) this.j.b, this.i);
    }

    private final void d() {
        this.l = false;
        ckqe ckqeVar = this.h;
        if (ckqeVar != null) {
            ckqeVar.c();
            this.h = null;
        }
        this.q = b;
    }

    private static final boolean e() {
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        return ((btvq) btsr.a(btvq.class)).rp().getMemoryManagementParameters().g;
    }

    public static String u(int i, int i2, String str, boolean z) {
        if (str == null) {
            return null;
        }
        if (!str.matches(".*photos/[0-9a-z_]+/\\d+\\.jpg$")) {
            return str;
        }
        String str2 = (i > 32 || i2 > 32) ? (i > 60 || i2 > 60) ? (i > 100 || i2 > 100) ? (i > 240 || i2 > 240) ? (i > 500 || i2 > 500) ? (z || (i <= 1024 && i2 <= 1024)) ? "large" : (i > 1920 || i2 > 1280) ? "original" : "1920x1280" : "medium" : "small" : "thumbnail" : "square" : "mini_square";
        StringBuilder sb = new StringBuilder(str2.length() + 6);
        sb.append("$1/");
        sb.append(str2);
        sb.append("/$2");
        return str.replaceFirst("(.*photos)/[0-9a-z_]+/(\\d+\\.jpg)$", sb.toString());
    }

    public static String v(int i, int i2, String str, boolean z) {
        Uri parse = Uri.parse(str);
        String encodedPath = parse.getEncodedPath();
        if (encodedPath == null || !encodedPath.endsWith("cbk") || !parse.isHierarchical() || parse.getQueryParameter("photoid") == null || parse.getQueryParameter("output") == null || parse.getQueryParameter("cb_client") == null || parse.getQueryParameter("minw") == null || parse.getQueryParameter("minh") == null) {
            return str;
        }
        if (z) {
            i = Math.min(i, 1024);
            i2 = Math.min(i2, 1024);
        }
        return new Uri.Builder().scheme(parse.getScheme()).encodedAuthority(parse.getEncodedAuthority()).encodedPath(parse.getEncodedPath()).appendQueryParameter("photoid", parse.getQueryParameter("photoid")).appendQueryParameter("output", parse.getQueryParameter("output")).appendQueryParameter("cb_client", parse.getQueryParameter("cb_client")).appendQueryParameter("minw", Integer.toString(i)).appendQueryParameter("minh", Integer.toString(i2)).build().toString();
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.l) {
            c();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDraw(Canvas canvas) {
        Bitmap w = w();
        ckqe ckqeVar = this.p;
        if (!e() || canvas.isHardwareAccelerated() || w == null || w.getConfig() != Bitmap.Config.HARDWARE || ckqeVar == null) {
            super.onDraw(canvas);
            return;
        }
        this.m.e(this);
        ckql ckqlVar = this.r;
        ckqlVar.g = false;
        ckqm ckqmVar = this.m;
        String str = this.o;
        ckqmVar.c(str, ckqeVar, ckqlVar, a(str), this, this.s, (int) this.j.b, this.i);
        dcqe.b.v(dcqz.FULL);
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.l) {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean z = false;
        if (b(i) && b(i2)) {
            z = true;
        }
        this.k = z;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        c();
    }

    public final void s(String str, ckqd ckqdVar, Drawable drawable, ckqf ckqfVar, int i, boolean z, String str2) {
        d();
        if (str == null) {
            str = "";
        } else if (ckqj.e(str)) {
            btvo rp = ((btvq) btsr.a(btvq.class)).rp();
            boolean z2 = rp.getZeroRatingParameters().a;
            String str3 = rp.getZeroRatingParameters().b;
            if (z2 && !dbsj.d(str3)) {
                str = Uri.parse(str).buildUpon().authority(str3).toString();
            }
        }
        this.n = str;
        this.o = "";
        this.g = ckqdVar;
        this.a = str2;
        if (ckqfVar == null) {
            ckqfVar = b;
        }
        this.q = ckqfVar;
        this.j = eaow.e(i);
        this.i = z;
        this.s = drawable;
        if (this.n.length() == 0) {
            super.setImageDrawable(drawable);
            this.q.a(this);
            return;
        }
        c();
    }

    public void setBitmapLoadingOptions(ckql ckqlVar) {
        if (ckqlVar == null) {
            ckqlVar = new ckql();
        }
        this.r = ckqlVar;
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        ckqf ckqfVar = this.q;
        d();
        super.setImageBitmap(bitmap);
        ckqfVar.b(this);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        ckqf ckqfVar = this.q;
        d();
        super.setImageDrawable(drawable);
        ckqfVar.b(this);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        ckqf ckqfVar = this.q;
        d();
        super.setImageResource(i);
        ckqfVar.b(this);
    }

    public void setWebImageViewListener(ckqf ckqfVar) {
        this.q = ckqfVar;
    }

    public final void t() {
        d();
        if (w() != null) {
            this.m.e(this);
        }
        this.p = null;
    }

    public final Bitmap w() {
        Drawable drawable = getDrawable();
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        if (!(drawable instanceof TransitionDrawable)) {
            return null;
        }
        Drawable drawable2 = ((TransitionDrawable) drawable).getDrawable(1);
        if (!(drawable2 instanceof BitmapDrawable)) {
            return null;
        }
        return ((BitmapDrawable) drawable2).getBitmap();
    }
}
