package com.facebook.react.views.text;

import android.content.Context;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.LruCache;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.c0;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class a0 {

    /* renamed from: a  reason: collision with root package name */
    private static final TextPaint f6255a = new TextPaint(1);

    /* renamed from: b  reason: collision with root package name */
    private static final Object f6256b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static LruCache<String, Spannable> f6257c = new LruCache<>(100);

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        protected int f6258a;

        /* renamed from: b  reason: collision with root package name */
        protected int f6259b;

        /* renamed from: c  reason: collision with root package name */
        protected l f6260c;

        a(int i, int i2, l lVar) {
            this.f6258a = i;
            this.f6259b = i2;
            this.f6260c = lVar;
        }

        public void a(SpannableStringBuilder spannableStringBuilder, int i) {
            spannableStringBuilder.setSpan(this.f6260c, this.f6258a, this.f6259b, ((i << 16) & 16711680) | ((this.f6258a == 0 ? 18 : 34) & (-16711681)));
        }
    }

    public static long a(Context context, ReadableMap readableMap, ReadableMap readableMap2, float f2, com.facebook.yoga.n nVar, float f3, com.facebook.yoga.n nVar2) {
        StaticLayout.Builder obtain;
        Layout staticLayout;
        TextPaint textPaint = f6255a;
        Spannable b2 = b(context, readableMap);
        if (b2 != null) {
            BoringLayout.Metrics isBoring = BoringLayout.isBoring(b2, textPaint);
            float desiredWidth = isBoring == null ? Layout.getDesiredWidth(b2, textPaint) : Float.NaN;
            boolean z = nVar == com.facebook.yoga.n.UNDEFINED || f2 < 0.0f;
            if (isBoring == null && (z || (!com.facebook.yoga.g.a(desiredWidth) && desiredWidth <= f2))) {
                int ceil = (int) Math.ceil(desiredWidth);
                if (Build.VERSION.SDK_INT < 23) {
                    staticLayout = new StaticLayout(b2, textPaint, ceil, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
                } else {
                    obtain = StaticLayout.Builder.obtain(b2, 0, b2.length(), textPaint, ceil);
                    staticLayout = obtain.setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setIncludePad(true).setBreakStrategy(1).setHyphenationFrequency(1).build();
                }
            } else if (isBoring != null && (z || isBoring.width <= f2)) {
                staticLayout = BoringLayout.make(b2, textPaint, isBoring.width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, isBoring, true);
            } else if (Build.VERSION.SDK_INT < 23) {
                staticLayout = new StaticLayout(b2, textPaint, (int) f2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            } else {
                obtain = StaticLayout.Builder.obtain(b2, 0, b2.length(), textPaint, (int) f2);
                staticLayout = obtain.setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setIncludePad(true).setBreakStrategy(1).setHyphenationFrequency(1).build();
            }
            int i = readableMap2.hasKey("maximumNumberOfLines") ? readableMap2.getInt("maximumNumberOfLines") : -1;
            return com.facebook.yoga.o.a(com.facebook.react.uimanager.q.d(staticLayout.getWidth()), com.facebook.react.uimanager.q.d((i == -1 || i == 0 || i >= staticLayout.getLineCount()) ? staticLayout.getHeight() : staticLayout.getLineBottom(i - 1)));
        }
        throw new IllegalStateException("Spannable element has not been prepared in onBeforeLayout");
    }

    private static Spannable a(Context context, ReadableMap readableMap) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList<a> arrayList = new ArrayList();
        a(context, readableMap.getArray("fragments"), spannableStringBuilder, arrayList);
        int i = 0;
        for (a aVar : arrayList) {
            aVar.a(spannableStringBuilder, i);
            i++;
        }
        return spannableStringBuilder;
    }

    private static void a(Context context, ReadableArray readableArray, SpannableStringBuilder spannableStringBuilder, List<a> list) {
        int i;
        int i2 = 0;
        for (int size = readableArray.size(); i2 < size; size = i) {
            ReadableMap mo209getMap = readableArray.mo209getMap(i2);
            int length = spannableStringBuilder.length();
            w wVar = new w(new c0(mo209getMap.mo210getMap("textAttributes")));
            spannableStringBuilder.append((CharSequence) b0.a(mo209getMap.getString("string"), wVar.l));
            int length2 = spannableStringBuilder.length();
            if (length2 >= length) {
                if (wVar.f6308b) {
                    list.add(new a(length, length2, new j(wVar.f6310d)));
                }
                if (wVar.f6311e) {
                    list.add(new a(length, length2, new g(wVar.f6312f)));
                }
                if (Build.VERSION.SDK_INT >= 21 && !Float.isNaN(wVar.b())) {
                    list.add(new a(length, length2, new com.facebook.react.views.text.a(wVar.b())));
                }
                list.add(new a(length, length2, new f(wVar.f6313g)));
                if (wVar.s == -1 && wVar.t == -1 && wVar.u == null) {
                    i = size;
                } else {
                    i = size;
                    list.add(new a(length, length2, new c(wVar.s, wVar.t, wVar.v, wVar.u, context.getAssets())));
                }
                if (wVar.q) {
                    list.add(new a(length, length2, new t()));
                }
                if (wVar.r) {
                    list.add(new a(length, length2, new m()));
                }
                if (wVar.m != 0.0f || wVar.n != 0.0f) {
                    list.add(new a(length, length2, new v(wVar.m, wVar.n, wVar.o, wVar.p)));
                }
                if (!Float.isNaN(wVar.a())) {
                    list.add(new a(length, length2, new b(wVar.a())));
                }
                list.add(new a(length, length2, new n(mo209getMap.getInt("reactTag"))));
            } else {
                i = size;
            }
            i2++;
        }
    }

    public static Spannable b(Context context, ReadableMap readableMap) {
        String obj = readableMap.toString();
        synchronized (f6256b) {
            Spannable spannable = f6257c.get(obj);
            if (spannable != null) {
                return spannable;
            }
            Spannable a2 = a(context, readableMap);
            synchronized (f6256b) {
                f6257c.put(obj, a2);
            }
            return a2;
        }
    }
}
