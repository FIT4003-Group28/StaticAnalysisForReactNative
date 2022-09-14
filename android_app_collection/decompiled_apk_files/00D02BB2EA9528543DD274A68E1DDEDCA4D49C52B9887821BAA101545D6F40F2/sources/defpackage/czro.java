package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import com.google.android.material.card.MaterialCardView;
import java.text.NumberFormat;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: czro  reason: default package */
/* loaded from: classes5.dex */
public final class czro extends LinearLayout {
    public static final /* synthetic */ int b = 0;
    private static final dcdc<Integer> d = dcdc.j(2131232903, 2131232900, 2131232901, 2131232902, 2131232904);
    public czrn a;
    private dubt c;

    public czro(Context context) {
        super(context);
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.survey_question_rating_container, (ViewGroup) this, true);
    }

    public static boolean a(MotionEvent motionEvent, View view) {
        return motionEvent.getX() >= 0.0f && motionEvent.getX() < ((float) view.getWidth()) && motionEvent.getY() >= 0.0f && motionEvent.getY() < ((float) view.getHeight());
    }

    public static void c(ViewGroup viewGroup, int i, Drawable drawable, Drawable drawable2) {
        int i2 = 0;
        while (i2 < viewGroup.getChildCount()) {
            ((ImageView) viewGroup.getChildAt(i2).findViewById(R.id.survey_rating_image_icon)).setImageDrawable(i2 >= i ? drawable : drawable2);
            i2++;
        }
    }

    public static void d(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            viewGroup.getChildAt(i).setOnClickListener(null);
            viewGroup.getChildAt(i).setClickable(false);
        }
    }

    private final Drawable e(int i, int i2) {
        return czph.j(getContext().getDrawable(i), getContext(), i2);
    }

    private static void f(TextView textView, String str) {
        textView.setText(str);
        textView.setContentDescription(str);
    }

    private final void g(View view, int i, int i2, int i3) {
        Locale locale;
        String string;
        Context context = getContext();
        if (Build.VERSION.SDK_INT >= 24) {
            locale = context.getResources().getConfiguration().getLocales().get(0);
        } else {
            locale = context.getResources().getConfiguration().locale;
        }
        NumberFormat numberFormat = NumberFormat.getInstance(locale);
        String format = numberFormat.format(i);
        String format2 = numberFormat.format(i2);
        String string2 = getContext().getString(R.string.survey_num_rating, format, format2);
        if (i3 == 4) {
            string2 = getResources().getQuantityString(R.plurals.survey_star_rating, i, Integer.valueOf(i), Integer.valueOf(i2));
        }
        if (i == 1) {
            String valueOf = String.valueOf(string2);
            String str = this.c.d;
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length());
            sb.append(valueOf);
            sb.append(" ");
            sb.append(str);
            string2 = sb.toString();
        } else if (i == i2) {
            String valueOf2 = String.valueOf(string2);
            String str2 = this.c.e;
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 1 + String.valueOf(str2).length());
            sb2.append(valueOf2);
            sb2.append(" ");
            sb2.append(str2);
            string2 = sb2.toString();
        }
        if (i3 == 3) {
            Context context2 = getContext();
            Object[] objArr = new Object[3];
            objArr[0] = format;
            objArr[1] = format2;
            if (i == 1) {
                string = getContext().getString(R.string.survey_very_dissatisfied);
            } else if (i == 2) {
                string = getContext().getString(R.string.survey_somewhat_dissatisfied);
            } else if (i == 3) {
                string = getContext().getString(R.string.survey_neutral);
            } else if (i != 4) {
                string = i != 5 ? "" : getContext().getString(R.string.survey_very_satisfied);
            } else {
                string = getContext().getString(R.string.survey_somewhat_satisfied);
            }
            objArr[2] = string;
            string2 = context2.getString(R.string.survey_smiley_rating, objArr);
        }
        view.setContentDescription(string2);
    }

    public final int b(int i) {
        return akm.c(getContext(), i);
    }

    public void setOnRatingClickListener(czrn czrnVar) {
        this.a = czrnVar;
    }

    public void setUpRatingView(dubt dubtVar) {
        this.c = dubtVar;
        int i = dubtVar.b;
        if (i < 5 || i > 7) {
            throw new IllegalArgumentException("Number of ratings must be between 5 and 7.");
        }
        f((TextView) findViewById(R.id.survey_rating_low_value_text), dubtVar.d);
        f((TextView) findViewById(R.id.survey_rating_high_value_text), dubtVar.e);
        int a = dubs.a(dubtVar.a);
        int i2 = R.id.survey_rating_image_icon;
        int i3 = R.id.survey_rating_image_layout;
        int i4 = R.layout.survey_question_rating_image_item;
        if (a == 0 || a != 3) {
            int a2 = dubs.a(dubtVar.a);
            if (a2 == 0 || a2 != 5) {
                int a3 = dubs.a(dubtVar.a);
                if (a3 == 0 || a3 != 4) {
                    return;
                }
                int b2 = b(R.color.survey_accent_color);
                final Drawable e = e(2131232923, b(R.color.survey_grey_icon_color));
                final Drawable e2 = e(2131232924, b2);
                final ViewGroup viewGroup = (ViewGroup) findViewById(R.id.survey_rating_images_container);
                LayoutInflater from = LayoutInflater.from(getContext());
                int i5 = this.c.b;
                final int i6 = 0;
                while (i6 < i5) {
                    View inflate = from.inflate(i4, viewGroup, false);
                    if (i6 == 0) {
                        inflate.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                        i6 = 0;
                    }
                    final FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.survey_rating_image_layout);
                    int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.survey_rating_image_large_button_horizontal_padding);
                    viewGroup.setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
                    ImageView imageView = (ImageView) frameLayout.findViewById(R.id.survey_rating_image_icon);
                    imageView.setImageDrawable(e);
                    i6++;
                    imageView.setTag(Integer.valueOf(i6));
                    g(imageView, i6, i5, 4);
                    frameLayout.setOnTouchListener(new View.OnTouchListener(frameLayout, viewGroup, e, e2, i6) { // from class: czri
                        private final FrameLayout a;
                        private final ViewGroup b;
                        private final Drawable c;
                        private final Drawable d;
                        private final int e;

                        {
                            this.a = frameLayout;
                            this.b = viewGroup;
                            this.c = e;
                            this.d = e2;
                            this.e = i6;
                        }

                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            FrameLayout frameLayout2 = this.a;
                            ViewGroup viewGroup2 = this.b;
                            Drawable drawable = this.c;
                            Drawable drawable2 = this.d;
                            int i7 = this.e;
                            int i8 = czro.b;
                            int action = motionEvent.getAction();
                            if (action != 0) {
                                if (action != 1) {
                                    if (action != 2) {
                                        return false;
                                    }
                                    if (!czro.a(motionEvent, view)) {
                                        frameLayout2.setPressed(false);
                                        czro.c(viewGroup2, 0, drawable, drawable2);
                                        return true;
                                    }
                                } else if (frameLayout2.isPressed()) {
                                    frameLayout2.performClick();
                                    czro.c(viewGroup2, i7, drawable, drawable2);
                                    return true;
                                }
                            } else if (czro.a(motionEvent, view)) {
                                frameLayout2.setPressed(true);
                                czro.c(viewGroup2, i7, drawable, drawable2);
                                return true;
                            }
                            return true;
                        }
                    });
                    frameLayout.setOnClickListener(new View.OnClickListener(this, viewGroup, i6) { // from class: czrj
                        private final czro a;
                        private final ViewGroup b;
                        private final int c;

                        {
                            this.a = this;
                            this.b = viewGroup;
                            this.c = i6;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            final czro czroVar = this.a;
                            ViewGroup viewGroup2 = this.b;
                            final int i7 = this.c;
                            czro.d(viewGroup2);
                            new Handler().postDelayed(new Runnable(czroVar, i7) { // from class: czrk
                                private final czro a;
                                private final int b;

                                {
                                    this.a = czroVar;
                                    this.b = i7;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    czro czroVar2 = this.a;
                                    int i8 = this.b;
                                    czrn czrnVar = czroVar2.a;
                                    if (czrnVar != null) {
                                        czrnVar.a(i8);
                                        czroVar2.a = null;
                                    }
                                }
                            }, 250L);
                        }
                    });
                    viewGroup.addView(inflate);
                    i4 = R.layout.survey_question_rating_image_item;
                }
                return;
            }
            final ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.survey_rating_images_container);
            LayoutInflater from2 = LayoutInflater.from(getContext());
            int i7 = this.c.b;
            final int i8 = 0;
            while (i8 < i7) {
                View inflate2 = from2.inflate(R.layout.survey_question_rating_number_item, viewGroup2, false);
                if (i8 == 0) {
                    inflate2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                    i8 = 0;
                }
                final FrameLayout frameLayout2 = (FrameLayout) inflate2.findViewById(R.id.survey_rating_number_layout);
                int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.survey_rating_number_large_button_horizontal_padding);
                viewGroup2.setPadding(dimensionPixelOffset2, 0, dimensionPixelOffset2, 0);
                final MaterialCardView materialCardView = (MaterialCardView) frameLayout2.findViewById(R.id.survey_rating_number_card);
                int dimension = (int) getResources().getDimension(R.dimen.survey_rating_number_large_side_length);
                ViewGroup.LayoutParams layoutParams = materialCardView.getLayoutParams();
                layoutParams.width = dimension;
                layoutParams.height = dimension;
                materialCardView.setLayoutParams(layoutParams);
                final TextView textView = (TextView) materialCardView.findViewById(R.id.survey_rating_number_text);
                i8++;
                textView.setTag(Integer.valueOf(i8));
                textView.setText(String.valueOf(i8));
                g(textView, i8, i7, 5);
                frameLayout2.setOnTouchListener(new View.OnTouchListener(this, frameLayout2, materialCardView, textView) { // from class: czrg
                    private final czro a;
                    private final FrameLayout b;
                    private final MaterialCardView c;
                    private final TextView d;

                    {
                        this.a = this;
                        this.b = frameLayout2;
                        this.c = materialCardView;
                        this.d = textView;
                    }

                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        czro czroVar = this.a;
                        FrameLayout frameLayout3 = this.b;
                        MaterialCardView materialCardView2 = this.c;
                        TextView textView2 = this.d;
                        int action = motionEvent.getAction();
                        if (action != 0) {
                            if (action != 1) {
                                if (action != 2) {
                                    return false;
                                }
                                if (!czro.a(motionEvent, view)) {
                                    frameLayout3.setPressed(false);
                                    materialCardView2.setCardBackgroundColor(czroVar.b(R.color.google_transparent));
                                    textView2.setTextColor(czroVar.b(R.color.survey_primary_text_color));
                                    return true;
                                }
                            } else if (frameLayout3.isPressed()) {
                                frameLayout3.performClick();
                                return true;
                            }
                        } else if (czro.a(motionEvent, view)) {
                            frameLayout3.setPressed(true);
                            materialCardView2.setCardBackgroundColor(czroVar.b(R.color.survey_accent_color));
                            textView2.setTextColor(czroVar.b(R.color.survey_surface_color_elevation_2));
                            return true;
                        }
                        return true;
                    }
                });
                frameLayout2.setOnClickListener(new View.OnClickListener(this, viewGroup2, i8) { // from class: czrh
                    private final czro a;
                    private final ViewGroup b;
                    private final int c;

                    {
                        this.a = this;
                        this.b = viewGroup2;
                        this.c = i8;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        final czro czroVar = this.a;
                        ViewGroup viewGroup3 = this.b;
                        final int i9 = this.c;
                        czro.d(viewGroup3);
                        new Handler().postDelayed(new Runnable(czroVar, i9) { // from class: czrl
                            private final czro a;
                            private final int b;

                            {
                                this.a = czroVar;
                                this.b = i9;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                czro czroVar2 = this.a;
                                int i10 = this.b;
                                czrn czrnVar = czroVar2.a;
                                if (czrnVar != null) {
                                    czrnVar.a(i10);
                                    czroVar2.a = null;
                                }
                            }
                        }, 250L);
                    }
                });
                viewGroup2.addView(inflate2);
            }
            return;
        }
        final ViewGroup viewGroup3 = (ViewGroup) findViewById(R.id.survey_rating_images_container);
        LayoutInflater from3 = LayoutInflater.from(getContext());
        int size = d.size();
        final int i9 = 0;
        while (i9 < size) {
            View inflate3 = from3.inflate(R.layout.survey_question_rating_image_item, viewGroup3, false);
            if (i9 == 0) {
                inflate3.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                i9 = 0;
            }
            final FrameLayout frameLayout3 = (FrameLayout) inflate3.findViewById(i3);
            final ImageView imageView2 = (ImageView) frameLayout3.findViewById(i2);
            imageView2.setImageDrawable(czph.j(getContext().getDrawable(d.get(i9).intValue()), getContext(), b(R.color.survey_grey_icon_color)));
            i9++;
            imageView2.setTag(Integer.valueOf(i9));
            g(imageView2, i9, size, 3);
            frameLayout3.setOnTouchListener(new View.OnTouchListener(this, frameLayout3, imageView2) { // from class: czre
                private final czro a;
                private final FrameLayout b;
                private final ImageView c;

                {
                    this.a = this;
                    this.b = frameLayout3;
                    this.c = imageView2;
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    czro czroVar = this.a;
                    FrameLayout frameLayout4 = this.b;
                    ImageView imageView3 = this.c;
                    int action = motionEvent.getAction();
                    if (action != 0) {
                        if (action != 1) {
                            if (action != 2) {
                                return false;
                            }
                            if (!czro.a(motionEvent, view)) {
                                frameLayout4.setPressed(false);
                                czph.i(imageView3, czroVar.getContext(), czroVar.b(R.color.survey_grey_icon_color));
                                return true;
                            }
                        } else if (frameLayout4.isPressed()) {
                            frameLayout4.performClick();
                            return true;
                        }
                    } else if (czro.a(motionEvent, view)) {
                        frameLayout4.setPressed(true);
                        czph.i(imageView3, czroVar.getContext(), czroVar.b(R.color.survey_accent_color));
                        return true;
                    }
                    return true;
                }
            });
            frameLayout3.setOnClickListener(new View.OnClickListener(this, viewGroup3, i9) { // from class: czrf
                private final czro a;
                private final ViewGroup b;
                private final int c;

                {
                    this.a = this;
                    this.b = viewGroup3;
                    this.c = i9;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final czro czroVar = this.a;
                    ViewGroup viewGroup4 = this.b;
                    final int i10 = this.c;
                    czro.d(viewGroup4);
                    new Handler().postDelayed(new Runnable(czroVar, i10) { // from class: czrm
                        private final czro a;
                        private final int b;

                        {
                            this.a = czroVar;
                            this.b = i10;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            czro czroVar2 = this.a;
                            int i11 = this.b;
                            czrn czrnVar = czroVar2.a;
                            if (czrnVar != null) {
                                czrnVar.a(i11);
                                czroVar2.a = null;
                            }
                        }
                    }, 250L);
                }
            });
            viewGroup3.addView(inflate3);
            i2 = R.id.survey_rating_image_icon;
            i3 = R.id.survey_rating_image_layout;
        }
    }
}
