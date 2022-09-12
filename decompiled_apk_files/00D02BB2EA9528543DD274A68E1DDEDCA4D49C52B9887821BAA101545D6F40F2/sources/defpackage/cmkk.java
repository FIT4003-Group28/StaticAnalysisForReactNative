package defpackage;

import com.google.ar.core.ImageMetadata;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cmkk  reason: default package */
/* loaded from: classes5.dex */
public final class cmkk {
    private final cmjs[] a;
    private int b;
    private int c;
    private int d;
    private cmjs[] e;

    public cmkk() {
        cmmn.a(true);
        cmmn.a(true);
        this.d = 0;
        this.e = new cmjs[100];
        this.a = new cmjs[1];
    }

    public final synchronized void a() {
        b(0);
    }

    public final synchronized void b(int i) {
        int i2 = this.b;
        this.b = i;
        if (i < i2) {
            f();
        }
    }

    public final synchronized cmjs c() {
        cmjs cmjsVar;
        this.c++;
        int i = this.d;
        if (i > 0) {
            cmjs[] cmjsVarArr = this.e;
            int i2 = i - 1;
            this.d = i2;
            cmjsVar = cmjsVarArr[i2];
            cmmn.f(cmjsVar);
            this.e[this.d] = null;
        } else {
            cmjsVar = new cmjs(new byte[ImageMetadata.CONTROL_AE_ANTIBANDING_MODE]);
        }
        return cmjsVar;
    }

    public final synchronized void d(cmjs cmjsVar) {
        cmjs[] cmjsVarArr = this.a;
        cmjsVarArr[0] = cmjsVar;
        e(cmjsVarArr);
    }

    public final synchronized void e(cmjs[] cmjsVarArr) {
        int length = this.d + cmjsVarArr.length;
        cmjs[] cmjsVarArr2 = this.e;
        int length2 = cmjsVarArr2.length;
        if (length >= length2) {
            this.e = (cmjs[]) Arrays.copyOf(cmjsVarArr2, Math.max(length2 + length2, length));
        }
        for (cmjs cmjsVar : cmjsVarArr) {
            cmjs[] cmjsVarArr3 = this.e;
            int i = this.d;
            this.d = i + 1;
            cmjsVarArr3[i] = cmjsVar;
        }
        this.c -= cmjsVarArr.length;
        notifyAll();
    }

    public final synchronized void f() {
        int max = Math.max(0, cmny.A(this.b, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) - this.c);
        int i = this.d;
        if (max >= i) {
            return;
        }
        Arrays.fill(this.e, max, i, (Object) null);
        this.d = max;
    }

    public final synchronized int g() {
        return this.c * ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
    }
}
