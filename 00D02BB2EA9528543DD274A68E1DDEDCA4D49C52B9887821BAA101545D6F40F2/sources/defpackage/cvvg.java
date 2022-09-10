package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.filament.R;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: cvvg  reason: default package */
/* loaded from: classes5.dex */
public final class cvvg<AccountT> implements cvuu<AccountT> {
    public static final aim<String, Bitmap> a = new aim<>();
    public static final aim<String, Bitmap> b = new aim<>();
    private static final AtomicBoolean c = new AtomicBoolean(false);
    private static final ComponentCallbacks2 d = new cvux();
    private final Executor e;
    private final cwjq<AccountT> f;
    private final cwfn g;

    public cvvg(Context context, ExecutorService executorService, cwfn cwfnVar, cwjs cwjsVar) {
        final cwju cwjuVar = new cwju(context);
        cwjl cwjlVar = new cwjl();
        cwjlVar.b(new cwjp[0]);
        if (cwjsVar != null) {
            cwjlVar.a = cwjsVar;
            cwjlVar.d = new cwjn();
            cwjlVar.b = new cwjs(cwjuVar) { // from class: cvuv
                private final cwju a;

                {
                    this.a = cwjuVar;
                }

                @Override // defpackage.cwjs
                public final void a(Object obj, int i, cwjr cwjrVar) {
                    String b2;
                    CharSequence a2;
                    CharSequence b3;
                    cwju cwjuVar2 = this.a;
                    aim<String, Bitmap> aimVar = cvvg.a;
                    b2 = ((cwfm) obj).b();
                    a2 = ((cwfm) obj).a();
                    b3 = ((cwfm) obj).b();
                    dbsk.a(true);
                    if (i == 0) {
                        i = R.styleable.AppCompatTheme_windowFixedHeightMajor;
                    }
                    ArrayList arrayList = new ArrayList();
                    if (a2 != null) {
                        arrayList.add(a2.toString());
                    }
                    if (b3 != null) {
                        arrayList.add(b3.toString());
                    }
                    final String[] strArr = new String[arrayList.size()];
                    arrayList.toArray(strArr);
                    Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
                    cztc a3 = cztd.a(cwjuVar2.a.getApplicationContext(), dehx.a());
                    a3.b(b2);
                    a3.c(new cztb(strArr) { // from class: cwjt
                        private final String[] a;

                        {
                            this.a = strArr;
                        }

                        @Override // defpackage.cztb
                        public final String[] a() {
                            return this.a;
                        }
                    });
                    a3.a(createBitmap);
                    cwjrVar.a(createBitmap);
                }
            };
            cwjlVar.b(cwjp.a);
            String str = cwjlVar.a == null ? " imageRetriever" : "";
            str = cwjlVar.b == null ? str.concat(" secondaryImageRetriever") : str;
            str = cwjlVar.d == null ? String.valueOf(str).concat(" defaultImageRetriever") : str;
            if (!str.isEmpty()) {
                String valueOf = String.valueOf(str);
                throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
            }
            cwjm cwjmVar = new cwjm(cwjlVar.a, cwjlVar.b, cwjlVar.d, cwjlVar.c);
            this.e = executorService;
            this.f = cwjmVar;
            this.g = cwfnVar;
            return;
        }
        throw new NullPointerException("Null imageRetriever");
    }

    public static void b(ImageView imageView, cvvf<?> cvvfVar) {
        czhz.b();
        cvvf cvvfVar2 = (cvvf) imageView.getTag(com.google.android.apps.maps.R.id.tag_account_image_request);
        if (cvvfVar2 != null) {
            cvvfVar2.d = true;
        }
        imageView.setTag(com.google.android.apps.maps.R.id.tag_account_image_request, cvvfVar);
    }

    @Override // defpackage.cvuu
    public final void a(AccountT accountt, ImageView imageView) {
        czhz.b();
        Context context = imageView.getContext();
        if (!c.getAndSet(true)) {
            context.getApplicationContext().registerComponentCallbacks(d);
        }
        final cvvf cvvfVar = new cvvf(accountt, this.f, imageView, this.e, this.g);
        b(imageView, cvvfVar);
        this.e.execute(new Runnable(cvvfVar) { // from class: cvuw
            private final cvvf a;

            {
                this.a = cvvfVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int width;
                String b2;
                String h;
                String sb;
                Bitmap bitmap;
                final Bitmap bitmap2;
                final boolean z;
                final cvvf cvvfVar2 = this.a;
                aim<String, Bitmap> aimVar = cvvg.a;
                final ImageView imageView2 = cvvfVar2.a.get();
                if (cvvfVar2.d || imageView2 == null) {
                    return;
                }
                boolean z2 = false;
                if (cvvfVar2.b != 0) {
                    ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
                    if (layoutParams == null || layoutParams.width <= 0) {
                        width = imageView2.getWidth();
                    } else {
                        width = layoutParams.width;
                    }
                    int paddingLeft = width - (imageView2.getPaddingLeft() + imageView2.getPaddingRight());
                    int i = paddingLeft < 0 ? 0 : paddingLeft;
                    AccountT accountt2 = cvvfVar2.b;
                    Locale locale = Locale.ROOT;
                    Object[] objArr = new Object[2];
                    if (accountt2 == 0) {
                        sb = "null";
                    } else {
                        b2 = ((cwfm) accountt2).b();
                        StringBuilder sb2 = new StringBuilder(b2);
                        h = ((cwfm) accountt2).h();
                        if (h != null) {
                            sb2.append(" ");
                            sb2.append(h);
                        }
                        sb = sb2.toString();
                    }
                    objArr[0] = sb;
                    objArr[1] = Integer.valueOf(i);
                    final String format = String.format(locale, "%s %s", objArr);
                    synchronized (cvvg.a) {
                        bitmap = cvvg.a.get(format);
                    }
                    if (bitmap != null) {
                        cvvfVar2.b(bitmap, true);
                        return;
                    }
                    cwjs a2 = cvvfVar2.c.a();
                    final cwjs b3 = cvvfVar2.c.b();
                    synchronized (cvvg.b) {
                        bitmap2 = cvvg.b.get(format);
                    }
                    if (bitmap2 != null) {
                        cvvfVar2.b(bitmap2, false);
                        z = true;
                    } else {
                        z = false;
                    }
                    final int i2 = i;
                    a2.a(cvvfVar2.b, i, new cwjr(cvvfVar2, format, bitmap2, b3, i2, z, imageView2) { // from class: cvuy
                        private final cvvf a;
                        private final String b;
                        private final Bitmap c;
                        private final cwjs d;
                        private final int e;
                        private final boolean f;
                        private final ImageView g;

                        {
                            this.a = cvvfVar2;
                            this.b = format;
                            this.c = bitmap2;
                            this.d = b3;
                            this.e = i2;
                            this.f = z;
                            this.g = imageView2;
                        }

                        @Override // defpackage.cwjr
                        public final void a(final Bitmap bitmap3) {
                            final cvvf cvvfVar3 = this.a;
                            final String str = this.b;
                            Bitmap bitmap4 = this.c;
                            final cwjs cwjsVar = this.d;
                            final int i3 = this.e;
                            boolean z3 = this.f;
                            ImageView imageView3 = this.g;
                            if (cvvfVar3.d) {
                                return;
                            }
                            if (bitmap3 != null) {
                                cvvfVar3.a(new Runnable(cvvfVar3, str, bitmap3) { // from class: cvva
                                    private final cvvf a;
                                    private final String b;
                                    private final Bitmap c;

                                    {
                                        this.a = cvvfVar3;
                                        this.b = str;
                                        this.c = bitmap3;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        cvvf cvvfVar4 = this.a;
                                        String str2 = this.b;
                                        Bitmap bitmap5 = this.c;
                                        synchronized (cvvg.a) {
                                            cvvg.a.put(str2, bitmap5);
                                        }
                                        synchronized (cvvg.b) {
                                            cvvg.b.remove(str2);
                                        }
                                        cvvfVar4.b(bitmap5, true);
                                    }
                                });
                            } else if (bitmap4 == null) {
                                cvvfVar3.a(new Runnable(cvvfVar3, cwjsVar, i3, str) { // from class: cvvb
                                    private final cvvf a;
                                    private final cwjs b;
                                    private final int c;
                                    private final String d;

                                    {
                                        this.a = cvvfVar3;
                                        this.b = cwjsVar;
                                        this.c = i3;
                                        this.d = str;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        final cvvf cvvfVar4 = this.a;
                                        cwjs cwjsVar2 = this.b;
                                        int i4 = this.c;
                                        final String str2 = this.d;
                                        cwjsVar2.a(cvvfVar4.b, i4, new cwjr(cvvfVar4, str2) { // from class: cvvd
                                            private final cvvf a;
                                            private final String b;

                                            {
                                                this.a = cvvfVar4;
                                                this.b = str2;
                                            }

                                            @Override // defpackage.cwjr
                                            public final void a(Bitmap bitmap5) {
                                                cvvf cvvfVar5 = this.a;
                                                String str3 = this.b;
                                                synchronized (cvvg.b) {
                                                    cvvg.b.put(str3, bitmap5);
                                                }
                                                cvvfVar5.b(bitmap5, true);
                                            }
                                        });
                                    }
                                });
                            }
                            if (!z3) {
                                return;
                            }
                            imageView3.post(new Runnable(cvvfVar3) { // from class: cvvc
                                private final cvvf a;

                                {
                                    this.a = cvvfVar3;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.a.d();
                                }
                            });
                        }
                    });
                    return;
                }
                Context context2 = imageView2.getContext();
                if (cwjn.a == null) {
                    cwjn.a = sl.b(context2, com.google.android.apps.maps.R.drawable.quantum_gm_ic_account_circle_vd_theme_24);
                }
                Drawable drawable = cwjn.a;
                TypedArray obtainStyledAttributes = context2.getTheme().obtainStyledAttributes(new int[]{com.google.android.apps.maps.R.attr.isMaterialTheme, com.google.android.apps.maps.R.attr.colorPrimaryGoogle});
                try {
                    if (obtainStyledAttributes.getBoolean(0, false)) {
                        if (obtainStyledAttributes.hasValue(1)) {
                            z2 = true;
                        }
                    }
                    if (!z2) {
                        context2 = new ContextThemeWrapper(context2, 2132018251);
                    }
                    cvvfVar2.c(cwiz.b(drawable, cqfa.a(context2, com.google.android.apps.maps.R.attr.colorPrimaryGoogle)), true);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            }
        });
    }
}
