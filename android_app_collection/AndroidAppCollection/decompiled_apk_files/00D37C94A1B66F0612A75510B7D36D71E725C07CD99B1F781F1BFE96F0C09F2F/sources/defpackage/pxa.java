package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/* compiled from: PG */
/* renamed from: pxa  reason: default package */
/* loaded from: classes4.dex */
public class pxa {
    private static final Comparator e = fay.m;
    private static final Comparator f = fay.n;
    public int c;
    public int d;
    private final int g;
    private int i;
    private final pwz[] h = new pwz[5];
    public final ArrayList a = new ArrayList();
    public int b = -1;

    public pxa(int i) {
        this.g = i;
    }

    public final float a(float f2) {
        if (this.b != 0) {
            Collections.sort(this.a, f);
            this.b = 0;
        }
        float f3 = f2 * this.d;
        int i = 0;
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            pwz pwzVar = (pwz) this.a.get(i2);
            i += pwzVar.b;
            if (i >= f3) {
                return pwzVar.c;
            }
        }
        if (this.a.isEmpty()) {
            return Float.NaN;
        }
        ArrayList arrayList = this.a;
        return ((pwz) arrayList.get(arrayList.size() - 1)).c;
    }

    public final void m(int i, float f2) {
        pwz pwzVar;
        if (this.b != 1) {
            Collections.sort(this.a, e);
            this.b = 1;
        }
        int i2 = this.i;
        if (i2 > 0) {
            pwz[] pwzVarArr = this.h;
            int i3 = i2 - 1;
            this.i = i3;
            pwzVar = pwzVarArr[i3];
        } else {
            pwzVar = new pwz();
        }
        int i4 = this.c;
        this.c = i4 + 1;
        pwzVar.a = i4;
        pwzVar.b = i;
        pwzVar.c = f2;
        this.a.add(pwzVar);
        this.d += i;
        while (true) {
            int i5 = this.d;
            int i6 = this.g;
            if (i5 > i6) {
                int i7 = i5 - i6;
                pwz pwzVar2 = (pwz) this.a.get(0);
                int i8 = pwzVar2.b;
                if (i8 <= i7) {
                    this.d -= i8;
                    this.a.remove(0);
                    int i9 = this.i;
                    if (i9 < 5) {
                        pwz[] pwzVarArr2 = this.h;
                        this.i = i9 + 1;
                        pwzVarArr2[i9] = pwzVar2;
                    }
                } else {
                    pwzVar2.b = i8 - i7;
                    this.d -= i7;
                }
            } else {
                return;
            }
        }
    }
}
