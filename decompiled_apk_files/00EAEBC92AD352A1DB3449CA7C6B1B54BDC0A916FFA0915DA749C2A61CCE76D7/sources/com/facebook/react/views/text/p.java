package com.facebook.react.views.text;

import android.annotation.TargetApi;
import android.text.Layout;
import android.text.Spannable;
import android.text.TextPaint;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftException;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.v0;
import java.util.ArrayList;
import java.util.Map;
@TargetApi(23)
/* loaded from: classes.dex */
public class p extends h {
    private static final TextPaint c0 = new TextPaint(1);
    private Spannable Z;
    private boolean a0;
    private final com.facebook.yoga.m b0 = new a();

    /* loaded from: classes.dex */
    class a implements com.facebook.yoga.m {
        a() {
        }

        @Override // com.facebook.yoga.m
        public long a(com.facebook.yoga.p pVar, float f2, com.facebook.yoga.n nVar, float f3, com.facebook.yoga.n nVar2) {
            int width;
            int height;
            Spannable spannable = p.this.Z;
            c.d.k.a.a.a(spannable, "Spannable element has not been prepared in onBeforeLayout");
            Spannable spannable2 = spannable;
            Layout a2 = p.this.a(spannable2, f2, nVar);
            p pVar2 = p.this;
            if (pVar2.R) {
                int b2 = pVar2.A.b();
                int b3 = p.this.A.b();
                float f4 = b2;
                int max = (int) Math.max(p.this.S * f4, com.facebook.react.uimanager.q.b(4.0f));
                for (int i = -1; b3 > max && ((p.this.F != i && a2.getLineCount() > p.this.F) || (nVar2 != com.facebook.yoga.n.UNDEFINED && a2.getHeight() > f3)); i = -1) {
                    b3 -= (int) com.facebook.react.uimanager.q.b(1.0f);
                    float f5 = b3 / f4;
                    int i2 = 0;
                    f[] fVarArr = (f[]) spannable2.getSpans(0, spannable2.length(), f.class);
                    int length = fVarArr.length;
                    while (i2 < length) {
                        f fVar = fVarArr[i2];
                        spannable2.setSpan(new f((int) Math.max(fVar.getSize() * f5, max)), spannable2.getSpanStart(fVar), spannable2.getSpanEnd(fVar), spannable2.getSpanFlags(fVar));
                        spannable2.removeSpan(fVar);
                        i2++;
                        f5 = f5;
                    }
                    a2 = p.this.a(spannable2, f2, nVar);
                }
            }
            if (p.this.a0) {
                k0 i3 = p.this.i();
                WritableArray a3 = e.a(spannable2, a2, p.c0, i3);
                WritableMap createMap = Arguments.createMap();
                createMap.putArray("lines", a3);
                if (i3.hasActiveCatalystInstance()) {
                    ((RCTEventEmitter) i3.getJSModule(RCTEventEmitter.class)).receiveEvent(p.this.t(), "topTextLayout", createMap);
                } else {
                    ReactSoftException.logSoftException("ReactTextShadowNode", new ReactNoCrashSoftException("Cannot get RCTEventEmitter, no CatalystInstance"));
                }
            }
            int i4 = p.this.F;
            if (i4 == -1 || i4 >= a2.getLineCount()) {
                width = a2.getWidth();
                height = a2.getHeight();
            } else {
                width = a2.getWidth();
                height = a2.getLineBottom(p.this.F - 1);
            }
            return com.facebook.yoga.o.a(width, height);
        }
    }

    public p() {
        T();
    }

    private int S() {
        int i = this.G;
        if (C() == com.facebook.yoga.h.RTL) {
            if (i == 5) {
                return 3;
            }
            if (i != 3) {
                return i;
            }
            return 5;
        }
        return i;
    }

    private void T() {
        if (!y()) {
            a(this.b0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009f, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 28) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f7, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 28) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f9, code lost:
        r12.setUseLineSpacingFromFallbacks(true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.text.Layout a(android.text.Spannable r12, float r13, com.facebook.yoga.n r14) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.p.a(android.text.Spannable, float, com.facebook.yoga.n):android.text.Layout");
    }

    @Override // com.facebook.react.uimanager.b0
    public boolean G() {
        return true;
    }

    @Override // com.facebook.react.uimanager.b0
    public boolean J() {
        return false;
    }

    @Override // com.facebook.react.uimanager.b0
    public void M() {
        super.M();
        super.g();
    }

    @Override // com.facebook.react.uimanager.b0, com.facebook.react.uimanager.a0
    public void a(com.facebook.react.uimanager.n nVar) {
        this.Z = a((h) this, (String) null, true, nVar);
        M();
    }

    @Override // com.facebook.react.uimanager.b0
    public void a(v0 v0Var) {
        super.a(v0Var);
        Spannable spannable = this.Z;
        if (spannable != null) {
            v0Var.a(t(), new q(spannable, -1, this.X, f(4), f(1), f(5), f(3), S(), this.H, this.J));
        }
    }

    @Override // com.facebook.react.uimanager.b0, com.facebook.react.uimanager.a0
    public Iterable<? extends com.facebook.react.uimanager.a0> r() {
        Map<Integer, com.facebook.react.uimanager.a0> map = this.Y;
        if (map == null || map.isEmpty()) {
            return null;
        }
        Spannable spannable = this.Z;
        c.d.k.a.a.a(spannable, "Spannable element has not been prepared in onBeforeLayout");
        Spannable spannable2 = spannable;
        z[] zVarArr = (z[]) spannable2.getSpans(0, spannable2.length(), z.class);
        ArrayList arrayList = new ArrayList(zVarArr.length);
        for (z zVar : zVarArr) {
            com.facebook.react.uimanager.a0 a0Var = this.Y.get(Integer.valueOf(zVar.b()));
            a0Var.w();
            arrayList.add(a0Var);
        }
        return arrayList;
    }

    @com.facebook.react.uimanager.e1.a(name = "onTextLayout")
    public void setShouldNotifyOnTextLayout(boolean z) {
        this.a0 = z;
    }
}
