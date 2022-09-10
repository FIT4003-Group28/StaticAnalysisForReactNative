package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: dx  reason: default package */
/* loaded from: classes6.dex */
public final class dx {
    public final ArrayList<ea> a = new ArrayList<>();

    public final void a(dy dyVar) {
        this.a.clear();
        for (int i = 1; i < dyVar.e; i++) {
            ea eaVar = dyVar.g.a[i];
            for (int i2 = 0; i2 < 6; i2++) {
                eaVar.e[i2] = 0.0f;
            }
            eaVar.e[eaVar.c] = 1.0f;
            if (eaVar.h == 4) {
                this.a.add(eaVar);
            }
        }
        int size = this.a.size();
        for (int i3 = 0; i3 < size; i3++) {
            ea eaVar2 = this.a.get(i3);
            int i4 = eaVar2.b;
            if (i4 != -1) {
                du duVar = dyVar.c[i4].d;
                int i5 = duVar.a;
                for (int i6 = 0; i6 < i5; i6++) {
                    ea e = duVar.e(i6);
                    if (e != null) {
                        float f = duVar.f(i6);
                        for (int i7 = 0; i7 < 6; i7++) {
                            float[] fArr = e.e;
                            fArr[i7] = fArr[i7] + (eaVar2.e[i7] * f);
                        }
                        if (!this.a.contains(e)) {
                            this.a.add(e);
                        }
                    }
                }
                for (int i8 = 0; i8 < 6; i8++) {
                    eaVar2.e[i8] = 0.0f;
                }
            }
        }
    }

    public final String toString() {
        int size = this.a.size();
        String str = "Goal: ";
        for (int i = 0; i < size; i++) {
            ea eaVar = this.a.get(i);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            String str2 = eaVar + "[";
            int i2 = 0;
            while (true) {
                float[] fArr = eaVar.e;
                if (i2 < 6) {
                    String str3 = str2 + eaVar.e[i2];
                    float[] fArr2 = eaVar.e;
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
