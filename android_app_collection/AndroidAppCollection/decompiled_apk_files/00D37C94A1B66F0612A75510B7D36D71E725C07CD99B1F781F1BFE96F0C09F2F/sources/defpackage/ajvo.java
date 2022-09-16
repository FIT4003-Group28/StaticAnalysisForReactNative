package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ajvo  reason: default package */
/* loaded from: classes.dex */
public class ajvo {
    final Context a;
    protected final boolean b;
    protected final boolean c;
    protected final boolean d;
    final ajvm e;
    private SpannableStringBuilder f;
    private final ajvp g;
    private Object h;
    private int i;

    public ajvo(Context context, ajvm ajvmVar, boolean z, ajvp ajvpVar) {
        this(context, ajvmVar, z, ajvpVar, true);
    }

    public static String c(avhn avhnVar) {
        if (avhnVar == null || (avhnVar.b & 4) == 0) {
            return "";
        }
        aovs aovsVar = avhnVar.d;
        if (aovsVar == null) {
            aovsVar = aovs.a;
        }
        if ((aovsVar.b & 1) == 0) {
            return "";
        }
        aovs aovsVar2 = avhnVar.d;
        if (aovsVar2 == null) {
            aovsVar2 = aovs.a;
        }
        aovr aovrVar = aovsVar2.c;
        if (aovrVar == null) {
            aovrVar = aovr.a;
        }
        if ((aovrVar.b & 2) == 0) {
            return "";
        }
        aovs aovsVar3 = avhnVar.d;
        if (aovsVar3 == null) {
            aovsVar3 = aovs.a;
        }
        aovr aovrVar2 = aovsVar3.c;
        if (aovrVar2 == null) {
            aovrVar2 = aovr.a;
        }
        return aovrVar2.c;
    }

    public final void d(ajvg ajvgVar, Bitmap bitmap) {
        int i;
        ajvn ajvnVar;
        ylr.c();
        if (bitmap == null) {
            return;
        }
        Object obj = ajvgVar.a;
        if ((obj != null && !obj.equals(this.h)) || (i = ajvgVar.b) == 0 || i != this.i) {
            return;
        }
        if (this.b) {
            ajvn ajvnVar2 = new ajvn(this.a, bitmap);
            ajvnVar = ajvnVar2;
            if (this.d) {
                ajvnVar2.a = this.a.getResources().getDimensionPixelOffset(R.dimen.emoji_padding);
                ajvnVar = ajvnVar2;
            }
        } else {
            ajvnVar = new ImageSpan(this.a, bitmap);
        }
        float f = ajvgVar.e;
        Rect bounds = ajvnVar.getDrawable().getBounds();
        bounds.right = bounds.left + ((int) (((bounds.right - bounds.left) * f) / (bounds.bottom - bounds.top)));
        bounds.bottom = bounds.top + ((int) f);
        ajvnVar.getDrawable().setBounds(bounds);
        SpannableStringBuilder spannableStringBuilder = this.f;
        if (spannableStringBuilder != null) {
            int length = spannableStringBuilder.length();
            int i2 = ajvgVar.d;
            if (length >= i2) {
                this.f.setSpan(ajvnVar, ajvgVar.c, i2, 33);
            }
        }
        this.g.a(this.f, ajvgVar.b);
    }

    public final void e() {
        f(null, 0, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f(Object obj, int i, SpannableStringBuilder spannableStringBuilder) {
        this.h = obj;
        this.i = i;
        this.f = spannableStringBuilder;
    }

    public final void g(arag aragVar, CharSequence charSequence, SpannableStringBuilder spannableStringBuilder, StringBuilder sb, Object obj, int i) {
        int i2;
        float dimension = this.a.getResources().getDimension(R.dimen.emoji_height);
        if (aragVar == null || aragVar.c.size() <= 0) {
            return;
        }
        f(obj, i, spannableStringBuilder);
        int max = Math.max(spannableStringBuilder.length() - charSequence.length(), 0);
        int max2 = Math.max(sb.length() - charSequence.length(), 0);
        for (arai araiVar : aragVar.c) {
            if (araiVar.qn(aqup.b)) {
                aqup aqupVar = (aqup) araiVar.qm(aqup.b);
                avhn avhnVar = ((aqup) araiVar.qm(aqup.b)).f;
                if (avhnVar == null) {
                    avhnVar = avhn.a;
                }
                if ((aqupVar.c & 4) != 0 && avhnVar.c.size() > 0) {
                    spannableStringBuilder.delete(max, araiVar.c.length() + max);
                    spannableStringBuilder.insert(max, "□");
                    ajvg ajvgVar = new ajvg();
                    ajvgVar.a = obj;
                    ajvgVar.b = i;
                    ajvgVar.e = dimension;
                    ajvgVar.c = max;
                    max++;
                    ajvgVar.d = max;
                    this.e.a(ajvgVar, avhnVar, Math.round(dimension), this);
                    if (this.c) {
                        String c = c(avhnVar);
                        if (!TextUtils.isEmpty(c)) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(c).length() + 2);
                            sb2.append(" ");
                            sb2.append(c);
                            sb2.append(" ");
                            sb.insert(max2, sb2.toString());
                            i2 = c.length() + 2;
                            max2 += i2;
                        }
                    }
                }
            }
            if (!araiVar.c.isEmpty()) {
                i2 = araiVar.c.length();
                max += i2;
                if (this.c) {
                    max2 += i2;
                }
            }
        }
    }

    public ajvo(Context context, ajvm ajvmVar, boolean z, ajvp ajvpVar, boolean z2) {
        this.h = null;
        context.getClass();
        this.a = context;
        ajvmVar.getClass();
        this.e = ajvmVar;
        this.b = z;
        ajvpVar.getClass();
        this.g = ajvpVar;
        this.d = z2;
        this.c = zdg.e(context);
    }
}
