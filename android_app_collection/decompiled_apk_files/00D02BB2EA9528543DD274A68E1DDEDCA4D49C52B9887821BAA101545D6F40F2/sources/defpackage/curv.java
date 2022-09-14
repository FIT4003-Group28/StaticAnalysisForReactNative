package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: curv  reason: default package */
/* loaded from: classes5.dex */
public final class curv extends LinearLayout {
    private static final String b = "curv";
    boolean a;
    private final LinearLayout c;
    private final LinearLayout d;
    private boolean e;
    private final Path f;
    private final RectF g;
    private final float h;
    private final float i;
    private final Paint j;
    private int k;
    private int l;

    public curv(Context context) {
        this(context, null);
    }

    private static int b(int i, int i2) {
        if (i2 > 0) {
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(Math.min(size, i2), Integer.MIN_VALUE);
            }
            if (mode == 0) {
                return View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
            }
            if (mode == 1073741824) {
                return View.MeasureSpec.makeMeasureSpec(Math.min(size, i2), 1073741824);
            }
            String str = b;
            StringBuilder sb = new StringBuilder(36);
            sb.append("Invalid MeasureSpecMode: ");
            sb.append(mode);
            sb.toString();
            cstl.a(str);
            return i;
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [curw] */
    /* JADX WARN: Type inference failed for: r1v7, types: [cuqw] */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.support.v7.widget.AppCompatImageView, curc] */
    /* JADX WARN: Type inference failed for: r6v13, types: [cuqv] */
    /* JADX WARN: Type inference failed for: r6v8, types: [android.support.v7.widget.RecyclerView, curk] */
    /* JADX WARN: Type inference failed for: r6v9 */
    private final void c(cuqq cuqqVar, final cuuc cuucVar, cuwi cuwiVar, cuiv cuivVar, ctyy ctyyVar, cugu cuguVar) {
        TextView textView;
        ?? curkVar;
        if (cuqqVar.f().equals(cuqp.FLEXIBLE_SPACE)) {
            this.e = true;
            return;
        }
        LinearLayout linearLayout = this.e ? this.d : this.c;
        Context context = getContext();
        int ordinal = cuqqVar.f().ordinal();
        if (ordinal == 0) {
            TextView textView2 = new TextView(context);
            textView2.setTextColor(ka.b(context.getResources(), R.color.default_rich_text_font_color));
            textView2.setAutoLinkMask(1);
            textView2.setText(cuwd.b(context, cuqqVar.a().f(), dbpy.a), TextView.BufferType.SPANNABLE);
            textView2.setFocusable(true);
            textView = textView2;
        } else if (ordinal != 2) {
            if (ordinal == 3) {
                curkVar = new curk(context);
                int b2 = cuqqVar.a().e().b();
                int i = b2 == 1 ? 0 : 1;
                boolean z = b2 == 1;
                dbsg<Integer> c = cuqqVar.a().e().c();
                boolean z2 = c.a() && c.b().intValue() == 1;
                curj curjVar = new curj(cuucVar, cuwiVar, z2);
                curx curxVar = new curx(i, cste.b(context) && z);
                curxVar.F(z);
                dcdc<cuqa> a = cuqqVar.a().e().a();
                curjVar.a.clear();
                for (cuqa cuqaVar : a) {
                    ctzd ctzdVar = ctzd.UNKNOWN;
                    if (cuqaVar.c().f().ordinal() == 3) {
                        int c2 = curjVar.e.c(cuqaVar.c());
                        if (c2 == 0) {
                            curjVar.a.add(cuqaVar);
                        } else if (c2 == 3) {
                            List<cuqa> list = curjVar.a;
                            cupz h = cuqaVar.h();
                            h.e(false);
                            list.add(h.a());
                        }
                    } else {
                        curjVar.a.add(cuqaVar);
                    }
                }
                curjVar.s();
                if (curjVar.a.isEmpty() || b2 == 0) {
                    curkVar.setVisibility(8);
                } else {
                    curkVar.setVisibility(0);
                }
                if (z2) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) curkVar.getLayoutParams();
                    layoutParams.width = -1;
                    curkVar.setLayoutParams(layoutParams);
                }
                curkVar.setAdapter(curjVar);
                curkVar.setLayoutManager(curxVar);
                curkVar.g(new curu(context.getResources().getDimensionPixelSize(b2 == 1 ? R.dimen.rich_card_button_horizontal_spacing : R.dimen.rich_card_button_vertical_spacing)));
            } else if (ordinal == 4) {
                ?? cuqwVar = new cuqw(context);
                cups c3 = cuqqVar.a().c();
                View view = new View(cuqwVar.getContext());
                view.setBackgroundColor(c3.a());
                view.setLayoutParams(new LinearLayout.LayoutParams(-1, cuwg.a(cuqwVar.getContext(), c3.b())));
                cuqwVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                cuqwVar.addView(view);
                textView = cuqwVar;
            } else if (ordinal == 5) {
                curkVar = new cuqv(context);
                dcdc<cupp> a2 = cuqqVar.a().b().a();
                curkVar.setClickable(true);
                int size = a2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    final cupp cuppVar = a2.get(i2);
                    cusa cusaVar = new cusa(curkVar.getContext());
                    cusaVar.a.setText(cuppVar.c());
                    if (cuppVar.b().a().length != 0) {
                        ViewGroup.LayoutParams layoutParams2 = cusaVar.b.getLayoutParams();
                        layoutParams2.height = cuwg.a(cusaVar.getContext(), cuppVar.b().c());
                        layoutParams2.width = cuwg.a(cusaVar.getContext(), cuppVar.b().b());
                        cusaVar.b.setLayoutParams(layoutParams2);
                        cusaVar.b.setImageBitmap(BitmapFactory.decodeByteArray(cuppVar.b().a(), 0, cuppVar.b().a().length));
                    } else {
                        cusaVar.b.setImageBitmap(BitmapFactory.decodeByteArray(cuppVar.a(), 0, cuppVar.a().length));
                    }
                    cusaVar.setBackground((RippleDrawable) cusaVar.getContext().getDrawable(R.drawable.vertical_button_ripple));
                    cusaVar.a.setTextColor(akm.b(cusaVar.getContext(), R.color.text_color));
                    cusaVar.b.setImageTintList(akm.b(cusaVar.getContext(), R.color.text_color));
                    cusaVar.setOnClickListener(new View.OnClickListener(cuucVar, cuppVar) { // from class: curz
                        private final cuuc a;
                        private final cupp b;

                        {
                            this.a = cuucVar;
                            this.b = cuppVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            this.a.a(this.b.d());
                        }
                    });
                    cuwiVar.a(String.valueOf(cuppVar.d().e()), cubx.a);
                    cusaVar.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
                    curkVar.addView(cusaVar);
                }
            } else if (ordinal == 6) {
                ?? curcVar = new curc(context);
                curcVar.setPresenter(new curb(curcVar, cuivVar, ctyyVar));
                cupu d = cuqqVar.a().d();
                curcVar.b = cuwg.a(curcVar.getContext(), d.e() <= 0 ? 112.0f : d.e());
                curcVar.setContentDescription(d.f());
                curcVar.setLayoutParams(new ViewGroup.LayoutParams(-1, curcVar.b));
                if (!d.c().u()) {
                    byte[] G = d.c().G();
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(G, 0, G.length);
                    if (decodeByteArray != null) {
                        curcVar.setImageBitmap(decodeByteArray);
                        curcVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        curcVar.c = true;
                    }
                }
                cuqx cuqxVar = curcVar.a;
                textView = curcVar;
                if (cuqxVar != null) {
                    cuqxVar.a(d, cuguVar);
                    textView = curcVar;
                }
            } else {
                String valueOf = String.valueOf(cuqqVar.f());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb.append("Got unknown UiElement type: ");
                sb.append(valueOf);
                sb.toString();
                cstl.a("UIElemCreator");
                textView = new View(context);
            }
            textView = curkVar;
        } else {
            ?? curwVar = new curw(context);
            curwVar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            curwVar.setText(cuqqVar.a().g().a());
            curwVar.setBadgeBackgroundColor(cuqqVar.a().g().b());
            curwVar.setTextColor(cuqqVar.a().g().c());
            textView = curwVar;
        }
        od.y(textView, cuwg.a(context, cuqqVar.b()), cuwg.a(context, cuqqVar.c()), cuwg.a(context, cuqqVar.d()), cuwg.a(context, cuqqVar.e()));
        linearLayout.addView(textView);
    }

    public final void a(cuqd cuqdVar, cuuc cuucVar, cuwi cuwiVar, cuiv cuivVar, ctyy ctyyVar, cugu cuguVar) {
        this.e = false;
        dcdc<cuql> a = cuqdVar.a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            cuql cuqlVar = a.get(i);
            cuqi cuqiVar = cuqi.STACK_COMPONENT;
            int ordinal = cuqlVar.b().ordinal();
            if (ordinal == 0) {
                dcdc<cuqq> a2 = cuqlVar.a().a();
                int size2 = a2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    c(a2.get(i2), cuucVar, cuwiVar, cuivVar, ctyyVar, cuguVar);
                }
            } else if (ordinal == 1) {
                c(cuqlVar.c(), cuucVar, cuwiVar, cuivVar, ctyyVar, cuguVar);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.a) {
            canvas.save();
            canvas.clipPath(this.f);
            super.draw(canvas);
            canvas.restore();
            RectF rectF = this.g;
            float f = this.h;
            canvas.drawRoundRect(rectF, f, f, this.j);
            return;
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(b(i, this.k), b(i2, this.l));
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        RectF rectF = this.g;
        float f = this.i / 2.0f;
        rectF.set(f, f, i - f, i2 - f);
        this.f.reset();
        Path path = this.f;
        RectF rectF2 = this.g;
        float f2 = this.h;
        path.addRoundRect(rectF2, f2, f2, Path.Direction.CW);
    }

    public void setDrawBorder(boolean z) {
        this.a = z;
    }

    public void setMaxHeight(int i) {
        this.l = i;
    }

    public void setMaxWidth(int i) {
        this.k = i;
    }

    public curv(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public curv(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = new Path();
        this.g = new RectF();
        this.a = true;
        inflate(getContext(), R.layout.stack_card_view, this);
        this.c = (LinearLayout) findViewById(R.id.top);
        this.d = (LinearLayout) findViewById(R.id.bottom);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.rich_card_radius);
        float dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.rich_card_stroke_width);
        this.i = dimensionPixelSize;
        Paint paint = new Paint();
        this.j = paint;
        paint.setColor(akm.c(getContext(), R.color.google_grey300));
        paint.setStrokeWidth(dimensionPixelSize);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        setOrientation(1);
        setBackgroundColor(0);
    }
}
