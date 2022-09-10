package defpackage;

import java.util.LinkedList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aljh  reason: default package */
/* loaded from: classes.dex */
public final class aljh extends alip {
    private static final float f;
    private static final float g;
    public boolean e;

    static {
        float radians = (float) Math.toRadians(5.0d);
        f = radians;
        g = radians + radians;
    }

    public aljh(aliy aliyVar, float f2, float f3) {
        super(aliyVar, f2, f3);
        this.e = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.alip
    public final boolean d(aljd aljdVar) {
        return this.a.r(aljdVar);
    }

    @Override // defpackage.alip
    protected final void f(aljd aljdVar) {
        this.a.s(aljdVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.alip
    public final boolean g(aljd aljdVar) {
        return this.a.q(aljdVar);
    }

    /* JADX WARN: Incorrect return type in method signature: (JLjava/util/LinkedList<Laliv;>;Ljava/util/List<Lalip;>;)Ljava/lang/Object; */
    @Override // defpackage.alip
    public final int i(long j, LinkedList linkedList, List list) {
        aliv alivVar;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (((alip) list.get(i2)).b()) {
                return 1;
            }
        }
        if (linkedList.size() < 3) {
            return 2;
        }
        int size2 = linkedList.size();
        while (true) {
            if (i >= size2) {
                alivVar = null;
                break;
            }
            alivVar = (aliv) linkedList.get(i);
            if (alivVar.d > 1) {
                break;
            }
            i++;
        }
        aliv alivVar2 = (aliv) linkedList.getLast();
        if (alivVar == null || alivVar2.d <= 1) {
            return 1;
        }
        if (!this.e) {
            return 3;
        }
        float f2 = list.isEmpty() ? f : g;
        float abs = Math.abs(h(alivVar.a, alivVar2.a));
        if (abs < f2) {
            return 1;
        }
        float f3 = (this.c + this.d) * 0.5f;
        float f4 = alivVar2.b / f3;
        if (f4 < 0.75f) {
            return 1;
        }
        float abs2 = Math.abs(f4 - (alivVar.b / f3));
        if (abs2 != 0.0f) {
            float f5 = abs / abs2;
            if (f5 < 0.5f) {
                return 1;
            }
            if (f5 < 0.9f) {
                return 2;
            }
        }
        return 3;
    }
}
