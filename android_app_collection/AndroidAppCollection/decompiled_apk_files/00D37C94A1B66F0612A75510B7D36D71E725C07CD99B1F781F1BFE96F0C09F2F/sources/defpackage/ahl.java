package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: ahl  reason: default package */
/* loaded from: classes.dex */
public class ahl extends ahh {
    public ahh[] aq = new ahh[4];
    public int ar = 0;

    public final void T(ArrayList arrayList, int i, aic aicVar) {
        for (int i2 = 0; i2 < this.ar; i2++) {
            aicVar.d(this.aq[i2]);
        }
        for (int i3 = 0; i3 < this.ar; i3++) {
            aej.b(this.aq[i3], i, arrayList, aicVar);
        }
    }
}
