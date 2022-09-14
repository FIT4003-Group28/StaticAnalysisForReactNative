package com.facebook.react.views.text;

import android.annotation.TargetApi;
import android.graphics.Color;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
@TargetApi(23)
/* loaded from: classes.dex */
public abstract class h extends com.facebook.react.uimanager.i {
    protected x A;
    protected int C;
    protected int E;
    protected int H;
    protected int I;
    protected int J;
    protected float K;
    protected float L;
    protected float M;
    protected int N;
    protected boolean O;
    protected boolean P;
    protected boolean Q;
    protected boolean R;
    protected float S;
    protected int T;
    protected int U;
    protected String V;
    protected String W;
    protected boolean X;
    protected Map<Integer, com.facebook.react.uimanager.a0> Y;
    protected boolean B = false;
    protected boolean D = false;
    protected int F = -1;
    protected int G = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        protected int f6281a;

        /* renamed from: b  reason: collision with root package name */
        protected int f6282b;

        /* renamed from: c  reason: collision with root package name */
        protected l f6283c;

        a(int i, int i2, l lVar) {
            this.f6281a = i;
            this.f6282b = i2;
            this.f6283c = lVar;
        }

        public void a(SpannableStringBuilder spannableStringBuilder, int i) {
            spannableStringBuilder.setSpan(this.f6283c, this.f6281a, this.f6282b, ((i << 16) & 16711680) | ((this.f6281a == 0 ? 18 : 34) & (-16711681)));
        }
    }

    public h() {
        this.H = Build.VERSION.SDK_INT < 23 ? 0 : 1;
        int i = Build.VERSION.SDK_INT;
        this.I = 0;
        int i2 = Build.VERSION.SDK_INT;
        this.J = 0;
        this.K = 0.0f;
        this.L = 0.0f;
        this.M = 0.0f;
        this.N = 1426063360;
        this.O = false;
        this.P = false;
        this.Q = true;
        this.R = false;
        this.S = 0.0f;
        this.T = -1;
        this.U = -1;
        this.V = null;
        this.W = null;
        this.X = false;
        this.A = new x();
    }

    private static void a(h hVar, SpannableStringBuilder spannableStringBuilder, List<a> list, x xVar, boolean z, Map<Integer, com.facebook.react.uimanager.a0> map, int i) {
        x xVar2 = hVar.A;
        if (xVar != null) {
            xVar2 = xVar.a(xVar2);
        }
        x xVar3 = xVar2;
        int a2 = hVar.a();
        for (int i2 = 0; i2 < a2; i2++) {
            com.facebook.react.uimanager.b0 a3 = hVar.a(i2);
            if (a3 instanceof k) {
                spannableStringBuilder.append((CharSequence) b0.a(((k) a3).R(), xVar3.k()));
            } else if (a3 instanceof h) {
                a((h) a3, spannableStringBuilder, list, xVar3, z, map, spannableStringBuilder.length());
            } else if (a3 instanceof o) {
                spannableStringBuilder.append("0");
                list.add(new a(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), ((o) a3).R()));
            } else if (!z) {
                throw new com.facebook.react.uimanager.g("Unexpected view type nested under a <Text> or <TextInput> node: " + a3.getClass());
            } else {
                int t = a3.t();
                com.facebook.yoga.v d2 = a3.d();
                com.facebook.yoga.v o = a3.o();
                com.facebook.yoga.u uVar = d2.f6575b;
                com.facebook.yoga.u uVar2 = com.facebook.yoga.u.POINT;
                if (uVar != uVar2 || o.f6575b != uVar2) {
                    throw new com.facebook.react.uimanager.g("Views nested within a <Text> must have a width and height");
                }
                float f2 = d2.f6574a;
                float f3 = o.f6574a;
                spannableStringBuilder.append("0");
                list.add(new a(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), new z(t, (int) f2, (int) f3)));
                map.put(Integer.valueOf(t), a3);
                a3.e();
            }
            a3.e();
        }
        int length = spannableStringBuilder.length();
        if (length >= i) {
            if (hVar.B) {
                list.add(new a(i, length, new j(hVar.C)));
            }
            if (hVar.D) {
                list.add(new a(i, length, new g(hVar.E)));
            }
            if (Build.VERSION.SDK_INT >= 21) {
                float c2 = xVar3.c();
                if (!Float.isNaN(c2) && (xVar == null || xVar.c() != c2)) {
                    list.add(new a(i, length, new com.facebook.react.views.text.a(c2)));
                }
            }
            int b2 = xVar3.b();
            if (xVar == null || xVar.b() != b2) {
                list.add(new a(i, length, new f(b2)));
            }
            if (hVar.T != -1 || hVar.U != -1 || hVar.V != null) {
                list.add(new a(i, length, new c(hVar.T, hVar.U, hVar.W, hVar.V, hVar.i().getAssets())));
            }
            if (hVar.O) {
                list.add(new a(i, length, new t()));
            }
            if (hVar.P) {
                list.add(new a(i, length, new m()));
            }
            if ((hVar.K != 0.0f || hVar.L != 0.0f || hVar.M != 0.0f) && Color.alpha(hVar.N) != 0) {
                list.add(new a(i, length, new v(hVar.K, hVar.L, hVar.M, hVar.N)));
            }
            float d3 = xVar3.d();
            if (!Float.isNaN(d3) && (xVar == null || xVar.d() != d3)) {
                list.add(new a(i, length, new b(d3)));
            }
            list.add(new a(i, length, new n(hVar.t())));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Spannable a(h hVar, String str, boolean z, com.facebook.react.uimanager.n nVar) {
        int i;
        int i2 = 0;
        c.d.k.a.a.a(!z || nVar != null, "nativeViewHierarchyOptimizer is required when inline views are supported");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList<a> arrayList = new ArrayList();
        HashMap hashMap = z ? new HashMap() : null;
        if (str != null) {
            spannableStringBuilder.append((CharSequence) b0.a(str, hVar.A.k()));
        }
        a(hVar, spannableStringBuilder, arrayList, null, z, hashMap, 0);
        hVar.X = false;
        hVar.Y = hashMap;
        float f2 = Float.NaN;
        for (a aVar : arrayList) {
            l lVar = aVar.f6283c;
            boolean z2 = lVar instanceof y;
            if (z2 || (lVar instanceof z)) {
                l lVar2 = aVar.f6283c;
                if (z2) {
                    i = ((y) lVar2).b();
                    hVar.X = true;
                } else {
                    z zVar = (z) lVar2;
                    int a2 = zVar.a();
                    com.facebook.react.uimanager.a0 a0Var = (com.facebook.react.uimanager.a0) hashMap.get(Integer.valueOf(zVar.b()));
                    nVar.a(a0Var);
                    a0Var.b(hVar);
                    i = a2;
                }
                if (Float.isNaN(f2) || i > f2) {
                    f2 = i;
                }
            }
            aVar.a(spannableStringBuilder, i2);
            i2++;
        }
        hVar.A.b(f2);
        return spannableStringBuilder;
    }

    @com.facebook.react.uimanager.e1.a(name = "adjustsFontSizeToFit")
    public void setAdjustFontSizeToFit(boolean z) {
        if (z != this.R) {
            this.R = z;
            M();
        }
    }

    @com.facebook.react.uimanager.e1.a(defaultBoolean = true, name = "allowFontScaling")
    public void setAllowFontScaling(boolean z) {
        if (z != this.A.a()) {
            this.A.a(z);
            M();
        }
    }

    @com.facebook.react.uimanager.e1.a(customType = "Color", name = "backgroundColor")
    public void setBackgroundColor(Integer num) {
        if (y()) {
            this.D = num != null;
            if (this.D) {
                this.E = num.intValue();
            }
            M();
        }
    }

    @com.facebook.react.uimanager.e1.a(name = "color")
    public void setColor(Integer num) {
        this.B = num != null;
        if (this.B) {
            this.C = num.intValue();
        }
        M();
    }

    @com.facebook.react.uimanager.e1.a(name = "fontFamily")
    public void setFontFamily(String str) {
        this.V = str;
        M();
    }

    @com.facebook.react.uimanager.e1.a(defaultFloat = Float.NaN, name = "fontSize")
    public void setFontSize(float f2) {
        this.A.a(f2);
        M();
    }

    @com.facebook.react.uimanager.e1.a(name = "fontStyle")
    public void setFontStyle(String str) {
        int a2 = s.a(str);
        if (a2 != this.T) {
            this.T = a2;
            M();
        }
    }

    @com.facebook.react.uimanager.e1.a(name = "fontVariant")
    public void setFontVariant(ReadableArray readableArray) {
        String a2 = s.a(readableArray);
        if (!Objects.equals(a2, this.W)) {
            this.W = a2;
            M();
        }
    }

    @com.facebook.react.uimanager.e1.a(name = "fontWeight")
    public void setFontWeight(String str) {
        int b2 = s.b(str);
        if (b2 != this.U) {
            this.U = b2;
            M();
        }
    }

    @com.facebook.react.uimanager.e1.a(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(boolean z) {
        this.Q = z;
    }

    @com.facebook.react.uimanager.e1.a(defaultFloat = Float.NaN, name = "letterSpacing")
    public void setLetterSpacing(float f2) {
        this.A.c(f2);
        M();
    }

    @com.facebook.react.uimanager.e1.a(defaultFloat = Float.NaN, name = "lineHeight")
    public void setLineHeight(float f2) {
        this.A.d(f2);
        M();
    }

    @com.facebook.react.uimanager.e1.a(defaultFloat = Float.NaN, name = "maxFontSizeMultiplier")
    public void setMaxFontSizeMultiplier(float f2) {
        if (f2 != this.A.j()) {
            this.A.e(f2);
            M();
        }
    }

    @com.facebook.react.uimanager.e1.a(name = "minimumFontScale")
    public void setMinimumFontScale(float f2) {
        if (f2 != this.S) {
            this.S = f2;
            M();
        }
    }

    @com.facebook.react.uimanager.e1.a(defaultInt = -1, name = "numberOfLines")
    public void setNumberOfLines(int i) {
        if (i == 0) {
            i = -1;
        }
        this.F = i;
        M();
    }

    @com.facebook.react.uimanager.e1.a(name = "textAlign")
    public void setTextAlign(String str) {
        if (!"justify".equals(str)) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.J = 0;
            }
            if (str == null || "auto".equals(str)) {
                this.G = 0;
            } else if (!"left".equals(str)) {
                if ("right".equals(str)) {
                    this.G = 5;
                } else if (!"center".equals(str)) {
                    throw new JSApplicationIllegalArgumentException("Invalid textAlign: " + str);
                } else {
                    this.G = 1;
                }
            }
            M();
        } else if (Build.VERSION.SDK_INT >= 26) {
            this.J = 1;
        }
        this.G = 3;
        M();
    }

    @com.facebook.react.uimanager.e1.a(name = "textBreakStrategy")
    public void setTextBreakStrategy(String str) {
        int i;
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        if (str == null || "highQuality".equals(str)) {
            i = 1;
        } else if ("simple".equals(str)) {
            i = 0;
        } else if (!"balanced".equals(str)) {
            throw new JSApplicationIllegalArgumentException("Invalid textBreakStrategy: " + str);
        } else {
            i = 2;
        }
        this.H = i;
        M();
    }

    @com.facebook.react.uimanager.e1.a(name = "textDecorationLine")
    public void setTextDecorationLine(String str) {
        String[] split;
        this.O = false;
        this.P = false;
        if (str != null) {
            for (String str2 : str.split(" ")) {
                if ("underline".equals(str2)) {
                    this.O = true;
                } else if ("line-through".equals(str2)) {
                    this.P = true;
                }
            }
        }
        M();
    }

    @com.facebook.react.uimanager.e1.a(customType = "Color", defaultInt = 1426063360, name = "textShadowColor")
    public void setTextShadowColor(int i) {
        if (i != this.N) {
            this.N = i;
            M();
        }
    }

    @com.facebook.react.uimanager.e1.a(name = "textShadowOffset")
    public void setTextShadowOffset(ReadableMap readableMap) {
        this.K = 0.0f;
        this.L = 0.0f;
        if (readableMap != null) {
            if (readableMap.hasKey("width") && !readableMap.isNull("width")) {
                this.K = com.facebook.react.uimanager.q.a(readableMap.getDouble("width"));
            }
            if (readableMap.hasKey("height") && !readableMap.isNull("height")) {
                this.L = com.facebook.react.uimanager.q.a(readableMap.getDouble("height"));
            }
        }
        M();
    }

    @com.facebook.react.uimanager.e1.a(defaultInt = 1, name = "textShadowRadius")
    public void setTextShadowRadius(float f2) {
        if (f2 != this.M) {
            this.M = f2;
            M();
        }
    }

    @com.facebook.react.uimanager.e1.a(name = "textTransform")
    public void setTextTransform(String str) {
        x xVar;
        b0 b0Var;
        if (str == null) {
            xVar = this.A;
            b0Var = b0.UNSET;
        } else if ("none".equals(str)) {
            xVar = this.A;
            b0Var = b0.NONE;
        } else if ("uppercase".equals(str)) {
            xVar = this.A;
            b0Var = b0.UPPERCASE;
        } else if ("lowercase".equals(str)) {
            xVar = this.A;
            b0Var = b0.LOWERCASE;
        } else if (!"capitalize".equals(str)) {
            throw new JSApplicationIllegalArgumentException("Invalid textTransform: " + str);
        } else {
            xVar = this.A;
            b0Var = b0.CAPITALIZE;
        }
        xVar.a(b0Var);
        M();
    }
}
