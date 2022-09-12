package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: aldp  reason: default package */
/* loaded from: classes2.dex */
public final class aldp {
    public final List<akra> a;
    public final List<aldo> b;
    public final boolean c;
    public final dqvj d;
    public final boolean e;
    public final boolean f;
    public final List<dozr> g;
    public final List<dpeo> h;
    public final int i;
    public final float j;
    private float k = 0.0f;

    public aldp(List<akra> list, List<aldo> list2, boolean z, dqvj dqvjVar, boolean z2, boolean z3, List<dozr> list3, List<dpeo> list4, int i, float f) {
        this.a = dcdc.r(list);
        this.b = list2;
        this.c = z;
        this.d = dqvjVar;
        this.e = z2;
        this.f = z3;
        this.g = list3;
        this.h = list4;
        this.i = i;
        this.j = f;
    }

    public final float a() {
        int i = 1;
        if (this.a.size() > 1 && this.k == 0.0f) {
            akra akraVar = this.a.get(0);
            while (i < this.a.size()) {
                akra akraVar2 = this.a.get(i);
                this.k += akraVar.y(akraVar2);
                i++;
                akraVar = akraVar2;
            }
        }
        return this.k;
    }
}
