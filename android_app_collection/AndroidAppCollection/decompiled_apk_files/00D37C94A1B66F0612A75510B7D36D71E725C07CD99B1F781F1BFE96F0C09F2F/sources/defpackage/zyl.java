package defpackage;

import java.util.Arrays;
import java.util.PriorityQueue;
/* compiled from: PG */
/* renamed from: zyl  reason: default package */
/* loaded from: classes4.dex */
public final class zyl {
    public int b;
    private zyk[] c = new zyk[1];
    public final PriorityQueue a = new PriorityQueue(1);

    public final ampq a(int i) {
        return (i < 0 || i >= this.b) ? amon.a : ampq.j(this.c[i]);
    }

    public final void b(float f, float f2) {
        int i = this.b;
        zyk[] zykVarArr = this.c;
        int length = zykVarArr.length;
        if (i >= length) {
            this.c = (zyk[]) Arrays.copyOf(zykVarArr, length + length);
        }
        zyk[] zykVarArr2 = this.c;
        zyk zykVar = zykVarArr2[i];
        if (zykVar == null) {
            zykVarArr2[i] = new zyk(i, f, f2);
        } else {
            zykVar.a = i;
            zykVar.b = f;
            zykVar.c = f2;
        }
        this.b++;
        this.a.add(this.c[i]);
    }
}
