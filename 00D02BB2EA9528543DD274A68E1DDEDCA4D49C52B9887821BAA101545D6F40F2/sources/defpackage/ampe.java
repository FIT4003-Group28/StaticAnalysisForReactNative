package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: ampe  reason: default package */
/* loaded from: classes.dex */
public class ampe {
    public final akrk[] a;
    public final ArrayList<ampf> b = new ArrayList<>(2);
    public final ArrayList<ampf> c = new ArrayList<>(2);
    private final bnvo d;

    public ampe(alwo alwoVar) {
        this.a = alwoVar.d;
        this.d = new bnvo(0, alwoVar.b, alwoVar.c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(alxo alxoVar) {
        alxl[] alxlVarArr = alxoVar.o;
        int length = alxlVarArr.length;
        float f = length > 0 ? alxlVarArr[0].g : 0.0f;
        if (length == 1) {
            this.c.add(new ampf(f, alxoVar, alxoVar, 0));
        } else if (length <= 1) {
        } else {
            this.b.add(new ampf(f, alxoVar, alxoVar, 0));
            this.c.add(new ampf(alxlVarArr[1].g, alxoVar, alxoVar, 1));
        }
    }

    public final float b() {
        ArrayList<ampf> arrayList = this.b;
        int size = arrayList.size();
        float f = 0.0f;
        for (int i = 0; i < size; i++) {
            ampf ampfVar = arrayList.get(i);
            float abs = Math.abs(ampfVar.a) + (ampfVar.b / 2.0f);
            if (abs > f) {
                f = abs;
            }
        }
        ArrayList<ampf> arrayList2 = this.c;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ampf ampfVar2 = arrayList2.get(i2);
            float abs2 = Math.abs(ampfVar2.a) + (ampfVar2.b / 2.0f);
            if (abs2 > f) {
                f = abs2;
            }
        }
        return f + f;
    }

    public final int c() {
        ampf ampfVar;
        int i;
        int size = this.b.size() + this.c.size();
        if (size == 0) {
            return 1;
        }
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 < this.b.size()) {
                ampfVar = this.b.get(i2);
            } else {
                ampfVar = this.c.get(i2 - this.b.size());
            }
            int[] iArr2 = ampfVar.f;
            if (iArr2 == null) {
                i = 1;
            } else {
                i = 0;
                for (int i3 : iArr2) {
                    i += i3;
                }
                if ((ampfVar.f.length & 1) == 1) {
                    i += i;
                }
            }
            iArr[i2] = i;
        }
        int i4 = iArr[0];
        for (int i5 = 1; i5 < size; i5++) {
            int i6 = iArr[i5];
            i4 = (i4 * i6) / bvop.e(i4, i6);
        }
        return i4;
    }

    public bnvo d() {
        return this.d;
    }

    public ampe(alwo alwoVar, alxo alxoVar, bnvo bnvoVar) {
        this.a = alwoVar.d;
        this.d = bnvoVar;
        a(alxoVar);
    }
}
