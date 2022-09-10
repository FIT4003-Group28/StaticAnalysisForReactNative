package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: cvdf  reason: default package */
/* loaded from: classes5.dex */
public final class cvdf extends TextView implements cvdc {
    public cuvx a;
    public cugu b;
    public boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private float[] g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private dbsg<cvdd> q;

    public cvdf(Context context) {
        this(context, null);
    }

    private final void c() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(this.j);
        gradientDrawable.setCornerRadii(this.g);
        setBackground(gradientDrawable);
    }

    @Override // defpackage.cvdc
    public final void a(cugu cuguVar) {
        int i;
        int i2;
        this.b = cuguVar;
        int o = cuguVar.o();
        if (o != 0) {
            boolean z = true;
            if (o == 1) {
                if (this.q.a()) {
                    cuwf a = this.q.b().a();
                    a.b();
                    i = a.a().getDefaultColor();
                } else {
                    qf.a(this, this.k);
                    i = this.m;
                }
                this.j = this.h;
                i2 = this.o;
            } else {
                if (this.q.a()) {
                    cuwf b = this.q.b().b();
                    b.b();
                    i = b.a().getDefaultColor();
                } else {
                    qf.a(this, this.l);
                    i = this.n;
                }
                this.j = this.i;
                i2 = this.p;
            }
            c();
            if (this.f) {
                setTextIsSelectable(true);
                cuwe.a(this, i2);
            }
            if (dxzy.a.a().b()) {
                setLinksClickable(false);
                if (this.e) {
                    setMovementMethod(new cvdh(new cvde(this)));
                } else {
                    setMovementMethod(new cvdg());
                }
            }
            int a2 = cuguVar.f().a();
            int i3 = a2 - 1;
            if (a2 == 0) {
                throw null;
            }
            if (i3 == 1) {
                setAutoLinkMask(15);
                setText(cuguVar.f().d());
            } else if (i3 == 3 && this.d) {
                setContentDescription(cuwd.a(cuguVar.f().c()));
                SpannableStringBuilder b2 = cuwd.b(getContext(), cuguVar.f().c(), dbsg.i(Integer.valueOf(i)));
                if (((URLSpan[]) b2.getSpans(0, b2.length(), URLSpan.class)).length <= 0) {
                    z = false;
                }
                this.c = z;
                if (z) {
                    this.a.c(cuguVar);
                } else {
                    setAutoLinkMask(15);
                }
                setText(b2, TextView.BufferType.SPANNABLE);
            } else {
                setText(cuguVar.e().c(""));
            }
            CharSequence text = getText();
            URLSpan[] uRLSpanArr = (URLSpan[]) new SpannableStringBuilder(text).getSpans(0, text.length(), URLSpan.class);
            HashSet<String> hashSet = new HashSet();
            for (URLSpan uRLSpan : uRLSpanArr) {
                hashSet.add(Uri.parse(uRLSpan.getURL()).getScheme());
            }
            for (String str : hashSet) {
                this.a.b(cuguVar, str);
            }
            return;
        }
        throw null;
    }

    @Override // defpackage.cuww
    public final void b() {
        this.q = dbpy.a;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Layout layout = getLayout();
        int lineCount = layout.getLineCount();
        float f = 0.0f;
        for (int i3 = 0; i3 < lineCount; i3++) {
            float lineMax = layout.getLineMax(i3);
            if (lineMax > f) {
                f = lineMax;
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(((int) Math.ceil(f)) + getPaddingLeft() + getPaddingRight(), Integer.MIN_VALUE), i2);
    }

    public void setConversationVisualElementEventListener(cuvx cuvxVar) {
        this.a = cuvxVar;
    }

    public void setCopyEnabled(boolean z) {
        this.f = z;
    }

    public void setIncomingBackgroundColor(int i) {
        this.h = i;
    }

    public void setLinkClickLoggingEnabled(boolean z) {
        this.e = z;
    }

    public void setOutgoingBackgroundColor(int i) {
        this.i = i;
    }

    @Override // defpackage.cuvv
    public /* bridge */ /* synthetic */ void setPresenter(Object obj) {
        Void r1 = (Void) obj;
    }

    public void setPresenter(Void r1) {
    }

    @Override // defpackage.cvdc
    public void setRadii(float f, float f2, float f3, float f4) {
        boolean a = cste.a(getContext());
        float f5 = true != a ? f : f2;
        if (true != a) {
            f = f2;
        }
        float f6 = true != a ? f4 : f3;
        if (true == a) {
            f3 = f4;
        }
        this.g = new float[]{cuwg.a(getContext(), f5), cuwg.a(getContext(), f5), cuwg.a(getContext(), f), cuwg.a(getContext(), f), cuwg.a(getContext(), f3), cuwg.a(getContext(), f3), cuwg.a(getContext(), f6), cuwg.a(getContext(), f6)};
        c();
    }

    public void setRichTextEnabled(boolean z) {
        this.d = z;
    }

    public void setStyleProvider(cvdd cvddVar) {
        this.q = dbsg.i(cvddVar);
    }

    public cvdf(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bubbleCellTextContentStyle);
    }

    public cvdf(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = false;
        this.e = false;
        this.f = false;
        this.q = dbpy.a;
        this.c = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cvcz.a, i, R.style.LighterBubbleCellTextMessage);
        this.g = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        setPadding(getResources().getDimensionPixelSize(R.dimen.bubble_cell_content_start_end_padding), getResources().getDimensionPixelSize(R.dimen.bubble_cell_content_top_bottom_padding), getResources().getDimensionPixelSize(R.dimen.bubble_cell_content_start_end_padding), getResources().getDimensionPixelSize(R.dimen.bubble_cell_content_top_bottom_padding));
        setMaxWidth(cuwg.a(getContext(), 300.0f));
        this.h = obtainStyledAttributes.getColor(0, context.getResources().getColor(R.color.incoming_background_color));
        this.i = obtainStyledAttributes.getColor(2, context.getResources().getColor(R.color.outgoing_background_color));
        this.o = context.getResources().getColor(R.color.incoming_select_handle_color);
        this.p = context.getResources().getColor(R.color.outgoing_select_handle_color);
        this.k = obtainStyledAttributes.getResourceId(1, R.style.IncomingBubbleCellTextMessage);
        this.l = obtainStyledAttributes.getResourceId(3, R.style.OutgoingBubbleCellTextMessage);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(this.k, new int[]{16842904});
        this.m = obtainStyledAttributes2.getColor(0, context.getResources().getColor(R.color.incoming_text_font_color));
        obtainStyledAttributes2.recycle();
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(this.l, new int[]{16842904});
        this.n = obtainStyledAttributes3.getColor(0, context.getResources().getColor(R.color.outgoing_text_font_color));
        obtainStyledAttributes3.recycle();
        obtainStyledAttributes.recycle();
    }
}
