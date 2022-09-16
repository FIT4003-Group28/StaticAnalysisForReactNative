package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.c1;
import com.facebook.react.uimanager.n;
import com.facebook.react.uimanager.q;
import java.util.EnumSet;
/* loaded from: classes.dex */
public class k extends com.facebook.react.uimanager.i {
    private i A;
    private float[] B;
    private float[] C;
    private boolean D = false;

    public k() {
        int[] iArr = c1.f5887b;
        this.B = new float[iArr.length];
        this.C = new float[iArr.length];
        for (int i = 0; i < c1.f5887b.length; i++) {
            this.B[i] = Float.NaN;
            this.C[i] = Float.NaN;
        }
    }

    private void R() {
        float f2;
        float f3;
        float f4;
        i iVar = this.A;
        if (iVar == null) {
            return;
        }
        float[] fArr = iVar.c() == j.PADDING ? this.B : this.C;
        float f5 = fArr[8];
        float f6 = 0.0f;
        if (!Float.isNaN(f5)) {
            f2 = f5;
            f3 = f2;
            f4 = f3;
        } else {
            f5 = 0.0f;
            f2 = 0.0f;
            f3 = 0.0f;
            f4 = 0.0f;
        }
        float f7 = fArr[7];
        if (!Float.isNaN(f7)) {
            f5 = f7;
            f3 = f5;
        }
        float f8 = fArr[6];
        if (!Float.isNaN(f8)) {
            f2 = f8;
            f4 = f2;
        }
        float f9 = fArr[1];
        if (!Float.isNaN(f9)) {
            f5 = f9;
        }
        float f10 = fArr[2];
        if (!Float.isNaN(f10)) {
            f2 = f10;
        }
        float f11 = fArr[3];
        if (!Float.isNaN(f11)) {
            f3 = f11;
        }
        float f12 = fArr[0];
        if (Float.isNaN(f12)) {
            f12 = f4;
        }
        float b2 = q.b(f5);
        float b3 = q.b(f2);
        float b4 = q.b(f3);
        float b5 = q.b(f12);
        EnumSet<h> a2 = this.A.a();
        a b6 = this.A.b();
        float f13 = a2.contains(h.TOP) ? b6.f10086a : 0.0f;
        float f14 = a2.contains(h.RIGHT) ? b6.f10087b : 0.0f;
        float f15 = a2.contains(h.BOTTOM) ? b6.f10088c : 0.0f;
        if (a2.contains(h.LEFT)) {
            f6 = b6.f10089d;
        }
        float f16 = f13 + b2;
        if (this.A.c() == j.PADDING) {
            super.e(1, f16);
            super.e(2, f14 + b3);
            super.e(3, f15 + b4);
            super.e(0, f6 + b5);
            return;
        }
        super.c(1, f16);
        super.c(2, f14 + b3);
        super.c(3, f15 + b4);
        super.c(0, f6 + b5);
    }

    private void a(j jVar) {
        if (jVar == j.PADDING) {
            super.e(1, this.B[1]);
            super.e(2, this.B[1]);
            super.e(3, this.B[3]);
            super.e(0, this.B[0]);
            return;
        }
        super.c(1, this.C[1]);
        super.c(2, this.C[1]);
        super.c(3, this.C[3]);
        super.c(0, this.C[0]);
    }

    @Override // com.facebook.react.uimanager.b0, com.facebook.react.uimanager.a0
    public void a(n nVar) {
        if (this.D) {
            this.D = false;
            R();
        }
    }

    @Override // com.facebook.react.uimanager.b0, com.facebook.react.uimanager.a0
    public void a(Object obj) {
        if (!(obj instanceof i)) {
            return;
        }
        i iVar = (i) obj;
        i iVar2 = this.A;
        if (iVar2 != null && iVar2.c() != iVar.c()) {
            a(this.A.c());
        }
        this.A = iVar;
        this.D = false;
        R();
    }

    @Override // com.facebook.react.uimanager.i
    @com.facebook.react.uimanager.e1.b(names = {"margin", "marginVertical", "marginHorizontal", "marginStart", "marginEnd", "marginTop", "marginBottom", "marginLeft", "marginRight"})
    public void setMargins(int i, Dynamic dynamic) {
        this.C[c1.f5887b[i]] = dynamic.getType() == ReadableType.Number ? (float) dynamic.asDouble() : Float.NaN;
        super.setMargins(i, dynamic);
        this.D = true;
    }

    @Override // com.facebook.react.uimanager.i
    @com.facebook.react.uimanager.e1.b(names = {"padding", "paddingVertical", "paddingHorizontal", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "paddingLeft", "paddingRight"})
    public void setPaddings(int i, Dynamic dynamic) {
        this.B[c1.f5887b[i]] = dynamic.getType() == ReadableType.Number ? (float) dynamic.asDouble() : Float.NaN;
        super.setPaddings(i, dynamic);
        this.D = true;
    }
}
