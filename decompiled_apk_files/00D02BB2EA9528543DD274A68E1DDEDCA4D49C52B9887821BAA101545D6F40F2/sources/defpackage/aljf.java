package defpackage;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
/* compiled from: PG */
/* renamed from: aljf  reason: default package */
/* loaded from: classes.dex */
public abstract class aljf extends alip {
    protected final float e;
    protected float f;
    protected float g;
    private final int h;

    public aljf(int i, aliy aliyVar, float f, float f2) {
        super(aliyVar, f, f2);
        this.e = (float) Math.toRadians(45.0d);
        this.f = 0.125f;
        this.g = 1.0f;
        this.h = i;
    }

    @Override // defpackage.alip
    public final boolean a() {
        return true;
    }

    /* JADX WARN: Incorrect return type in method signature: (JLjava/util/LinkedList<Laliv;>;Ljava/util/List<Lalip;>;)Ljava/lang/Object; */
    @Override // defpackage.alip
    public int i(long j, LinkedList linkedList, List list) {
        if (linkedList.size() < 3) {
            return 2;
        }
        aliv alivVar = (aliv) linkedList.getLast();
        if (alivVar.d != this.h) {
            return 1;
        }
        ListIterator listIterator = linkedList.listIterator(linkedList.size());
        aliv alivVar2 = null;
        aliv alivVar3 = alivVar;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        while (listIterator.hasPrevious()) {
            aliv alivVar4 = (aliv) listIterator.previous();
            if (alivVar4.d != alivVar.d) {
                break;
            } else if (l(alivVar4.a) >= this.e || (alivVar4.b * (this.h - 1)) / this.c < 0.25f) {
                return 1;
            } else {
                if (alivVar2 != null) {
                    f += Math.abs(j(alivVar4, 0) - j(alivVar2, 0));
                    f3 += Math.abs(k(alivVar4, 0) - k(alivVar2, 0));
                    f2 += Math.abs(j(alivVar4, alivVar4.d - 1) - j(alivVar2, alivVar2.d - 1));
                    f4 += Math.abs(k(alivVar4, alivVar4.d - 1) - k(alivVar2, alivVar2.d - 1));
                }
                alivVar2 = alivVar4;
                alivVar3 = alivVar2;
            }
        }
        if (f + f2 > (f3 + f4) * this.g) {
            return 1;
        }
        float k = k(alivVar, 0) - k(alivVar3, 0);
        float k2 = k(alivVar, alivVar.d - 1) - k(alivVar3, alivVar3.d - 1);
        if (k * k2 < 0.0f) {
            return 1;
        }
        return Math.min(Math.abs(k) / this.d, Math.abs(k2) / this.d) < this.f ? 2 : 3;
    }

    protected abstract float j(aliv alivVar, int i);

    protected abstract float k(aliv alivVar, int i);

    protected abstract float l(float f);
}
