package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import com.google.android.libraries.material.productlockup.ProductLockupView$SavedState;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: csmp  reason: default package */
/* loaded from: classes5.dex */
public final class csmp extends ViewGroup {
    private static final Pattern d = Pattern.compile(String.format(" %1$s|%1$s ", "Google"));
    private static final int[] e = {1};
    private static final int[] f = {2};
    private static final int[] g = {1, 2};
    private static Typeface h;
    final ImageView a;
    final TextView b;
    csmo c;
    private final csmo i;
    private final csmo j;
    private int k;
    private Drawable l;
    private int m;
    private csmo n;
    private int[] o;
    private String p;
    private boolean q;
    private boolean r;
    private boolean s;

    public csmp(Context context) {
        this(context, null);
    }

    private final void a(int i) {
        csmo csmoVar;
        if (i == -1) {
            csmoVar = this.n;
        } else if (i == 0 || i == 1) {
            csmoVar = this.i;
        } else if (i == 2) {
            csmoVar = this.j;
        } else {
            StringBuilder sb = new StringBuilder(36);
            sb.append("Unrecognized sizingMode: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        this.c = csmoVar;
    }

    private final void b() {
        int i;
        int i2 = this.k;
        if (i2 == 0) {
            this.a.setImageDrawable(this.l);
            return;
        }
        ImageView imageView = this.a;
        if (i2 == 1) {
            i = R.color.google_black;
        } else if (i2 == 2) {
            i = R.color.google_white;
        } else if (i2 != 3) {
            StringBuilder sb = new StringBuilder(35);
            sb.append("Unrecognized logoColor: ");
            sb.append(i2);
            throw new IllegalStateException(sb.toString());
        } else {
            i = R.color.google_grey700;
        }
        Drawable mutate = ks.b(this.l).mutate();
        mutate.setTint(akm.c(getContext(), i));
        imageView.setImageDrawable(mutate);
    }

    private final boolean c(int i, boolean z) {
        int i2;
        if (z) {
            csmo csmoVar = this.c;
            i2 = csmoVar.c + f(csmoVar);
        } else {
            i2 = 0;
        }
        e();
        return i2 + this.b.getMeasuredWidth() <= i;
    }

    private final void d() {
        this.a.measure(View.MeasureSpec.makeMeasureSpec(this.c.c, 1073741824), View.MeasureSpec.makeMeasureSpec(this.c.d, 1073741824));
    }

    private final void e() {
        this.b.setTextSize(0, this.c.a);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.b.measure(makeMeasureSpec, makeMeasureSpec);
    }

    private final int f(csmo csmoVar) {
        return Math.round(csmoVar.e * (true != this.r ? 0.15f : 1.0f));
    }

    private final void g(View view, int i, int i2, int i3, int i4) {
        boolean z = false;
        if (od.s(this) == 1 && !this.q) {
            z = true;
        }
        int measuredWidth = z ? getMeasuredWidth() - i3 : i;
        if (z) {
            i3 = getMeasuredWidth() - i;
        }
        view.layout(measuredWidth, i2, i3, i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.a.getVisibility() != 8) {
            int measuredWidth = (this.b.getVisibility() == 8 || this.s) ? 0 : this.b.getMeasuredWidth() + f(this.c);
            int i5 = this.c.b;
            g(this.a, measuredWidth, i5, measuredWidth + this.a.getMeasuredWidth(), i5 + this.a.getMeasuredHeight());
        }
        if (this.b.getVisibility() != 8) {
            int f2 = (this.a.getVisibility() == 8 || !this.s) ? 0 : f(this.c) + this.a.getMeasuredWidth();
            g(this.b, f2, 0, f2 + this.b.getMeasuredWidth(), this.b.getMeasuredHeight());
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int[] iArr;
        int size = View.MeasureSpec.getSize(i);
        int i3 = 0;
        this.a.setVisibility(0);
        this.b.setVisibility(0);
        this.s = this.p.startsWith("Google");
        boolean endsWith = this.p.endsWith("Google");
        int i4 = this.m;
        if (i4 == -1) {
            iArr = this.o;
        } else if (i4 == 0) {
            iArr = g;
        } else if (i4 == 1) {
            iArr = e;
        } else if (i4 == 2) {
            iArr = f;
        } else {
            StringBuilder sb = new StringBuilder(36);
            sb.append("Unrecognized sizingMode: ");
            sb.append(i4);
            throw new IllegalStateException(sb.toString());
        }
        if (this.s || endsWith) {
            for (int i5 : iArr) {
                a(i5);
                if (c(size, true)) {
                    d();
                    e();
                    break;
                }
            }
        }
        int length = iArr.length;
        int i6 = 0;
        while (true) {
            if (i6 < length) {
                a(iArr[i6]);
                if (c(size, false)) {
                    e();
                    this.a.setVisibility(8);
                    break;
                }
                i6++;
            } else {
                a(1);
                this.s = true;
                d();
                this.b.setVisibility(8);
                break;
            }
        }
        int visibility = this.a.getVisibility();
        int visibility2 = this.b.getVisibility();
        if (visibility == 0) {
            i3 = this.a.getMeasuredWidth();
        }
        if (visibility2 == 0) {
            i3 += this.b.getMeasuredWidth();
        }
        if (visibility == 0 && visibility2 == 0) {
            i3 += f(this.c);
        }
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(this.a.getMeasuredHeight() + this.c.b, this.b.getMeasuredHeight()), 1073741824));
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        ProductLockupView$SavedState productLockupView$SavedState = (ProductLockupView$SavedState) parcelable;
        super.onRestoreInstanceState(productLockupView$SavedState.getSuperState());
        this.p = productLockupView$SavedState.a;
        this.r = productLockupView$SavedState.b;
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        ProductLockupView$SavedState productLockupView$SavedState = new ProductLockupView$SavedState(super.onSaveInstanceState());
        productLockupView$SavedState.a = this.p;
        productLockupView$SavedState.b = this.r;
        return productLockupView$SavedState;
    }

    public void setCustomSize(csmo csmoVar) {
        setCustomSize(csmoVar, new int[]{-1});
    }

    public void setLogoColor(int i) {
        this.k = i;
        b();
    }

    public void setLogoDrawable(int i) {
        setLogoDrawable(sl.b(getContext(), i));
    }

    public void setProductName(int i) {
        setProductName(getContext().getString(i));
    }

    public void setProductNameTextColor(int i) {
        this.b.setTextColor(i);
    }

    public void setProductNameTextColorResource(int i) {
        this.b.setTextColor(akm.c(getContext(), i));
    }

    public void setSizingMode(int i) {
        this.m = i;
        requestLayout();
    }

    public csmp(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.productLockupViewStyle);
    }

    public void setCustomSize(csmo csmoVar, int[] iArr) {
        this.n = csmoVar;
        this.o = iArr;
        setSizingMode(-1);
    }

    public void setLogoDrawable(Drawable drawable) {
        this.l = drawable;
        b();
    }

    public void setProductName(String str) {
        String str2;
        String trim = (str == null ? "" : str).trim();
        this.p = trim;
        this.r = d.matcher(trim).find();
        boolean z = true;
        if (!TextUtils.isEmpty(str) && !Charset.forName("ISO-8859-1").newEncoder().canEncode(str)) {
            z = false;
        }
        this.q = z;
        TextView textView = this.b;
        String str3 = "Google";
        if (this.p.startsWith(str3)) {
            str2 = this.p.substring(6).trim();
        } else if (this.p.endsWith(str3)) {
            String str4 = this.p;
            str2 = str4.substring(0, str4.length() - 6).trim();
        } else {
            str2 = this.p;
        }
        textView.setText(str2);
        if (!this.p.isEmpty()) {
            str3 = this.p;
        }
        setContentDescription(str3);
        requestLayout();
    }

    public csmp(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (h == null) {
            h = Typeface.createFromAsset(context.getAssets(), "ProductSans-Regular.ttf");
        }
        this.i = new csmo(getResources(), R.dimen.product_name_text_size, R.dimen.logo_margin_top, R.dimen.logo_width, R.dimen.logo_height, R.dimen.separation_margin);
        this.j = new csmo(getResources(), R.dimen.product_name_text_size_small, R.dimen.logo_margin_top_small, R.dimen.logo_width_small, R.dimen.logo_height_small, R.dimen.separation_margin_small);
        LayoutInflater.from(context).inflate(R.layout.product_lockup_view, (ViewGroup) this, true);
        ImageView imageView = (ImageView) findViewById(R.id.logo);
        czhx.d(imageView);
        this.a = imageView;
        TextView textView = (TextView) findViewById(R.id.product_name);
        czhx.d(textView);
        this.b = textView;
        textView.setTypeface(h);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, csmq.a, i, 2132018657);
        if (obtainStyledAttributes.hasValue(2)) {
            this.l = obtainStyledAttributes.getDrawable(2);
        } else {
            this.l = sl.b(context, 2131231223);
        }
        int i2 = obtainStyledAttributes.getInt(1, 0);
        this.m = i2;
        a(i2);
        setProductNameTextColor(obtainStyledAttributes.getColor(4, 0));
        setProductName(obtainStyledAttributes.getString(0));
        setLogoColor(obtainStyledAttributes.getInt(3, 0));
        obtainStyledAttributes.recycle();
    }
}
