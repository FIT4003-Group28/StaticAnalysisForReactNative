package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: affc  reason: default package */
/* loaded from: classes.dex */
public final class affc extends afev {
    private int[] c;
    private int d;

    public affc(afjz afjzVar, aeub aeubVar) {
        super(afjzVar, aeubVar);
    }

    @Override // defpackage.afev
    public final void a(List list, long j, long j2, afes[] afesVarArr, afer aferVar) {
        afes afesVar;
        int length;
        aferVar.b = 3;
        int length2 = afesVarArr.length;
        int i = 0;
        if (length2 == 1) {
            afesVar = afesVarArr[0];
        } else {
            int[] iArr = this.c;
            if (iArr == null || (length = iArr.length) != (length2 - 1) * length2) {
                this.c = new int[(length2 - 1) * length2];
                int i2 = 0;
                int i3 = 0;
                while (i2 < length2) {
                    int i4 = i2 + 1;
                    for (int i5 = i4; i5 < length2; i5++) {
                        int[] iArr2 = this.c;
                        int i6 = i3 + 1;
                        iArr2[i3] = i2;
                        i3 = i6 + 1;
                        iArr2[i6] = i5;
                    }
                    i2 = i4;
                }
                this.d = 0;
            } else {
                i = (this.d + 1) % length;
                this.d = i;
            }
            afesVar = afesVarArr[this.c[i]];
        }
        aferVar.c = afesVar;
        aferVar.d = aepk.a;
    }
}
