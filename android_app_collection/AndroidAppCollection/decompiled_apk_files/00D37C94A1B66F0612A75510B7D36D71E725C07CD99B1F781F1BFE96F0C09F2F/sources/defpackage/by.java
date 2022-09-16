package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: by  reason: default package */
/* loaded from: classes2.dex */
public final class by {
    public final ArrayList a = new ArrayList();

    public final void a(bz bzVar) {
        this.a.clear();
        for (int i = 1; i < bzVar.e; i++) {
            cb cbVar = bzVar.g.a[i];
            for (int i2 = 0; i2 < 6; i2++) {
                cbVar.e[i2] = 0.0f;
            }
            cbVar.e[cbVar.c] = 1.0f;
            if (cbVar.h == 4) {
                this.a.add(cbVar);
            }
        }
        int size = this.a.size();
        for (int i3 = 0; i3 < size; i3++) {
            cb cbVar2 = (cb) this.a.get(i3);
            int i4 = cbVar2.b;
            if (i4 != -1) {
                bv bvVar = bzVar.c[i4].d;
                int i5 = bvVar.a;
                for (int i6 = 0; i6 < i5; i6++) {
                    cb d = bvVar.d(i6);
                    if (d != null) {
                        float b = bvVar.b(i6);
                        for (int i7 = 0; i7 < 6; i7++) {
                            float[] fArr = d.e;
                            fArr[i7] = fArr[i7] + (cbVar2.e[i7] * b);
                        }
                        if (!this.a.contains(d)) {
                            this.a.add(d);
                        }
                    }
                }
                for (int i8 = 0; i8 < 6; i8++) {
                    cbVar2.e[i8] = 0.0f;
                }
            }
        }
    }

    public final String toString() {
        int size = this.a.size();
        String str = "Goal: ";
        for (int i = 0; i < size; i++) {
            cb cbVar = (cb) this.a.get(i);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            String str2 = cbVar + "[";
            int i2 = 0;
            while (true) {
                float[] fArr = cbVar.e;
                if (i2 < 6) {
                    String str3 = str2 + cbVar.e[i2];
                    float[] fArr2 = cbVar.e;
                    str2 = i2 < 5 ? str3 + ", " : str3 + "] ";
                    i2++;
                }
            }
            sb.append(str2);
            str = sb.toString();
        }
        return str;
    }
}
