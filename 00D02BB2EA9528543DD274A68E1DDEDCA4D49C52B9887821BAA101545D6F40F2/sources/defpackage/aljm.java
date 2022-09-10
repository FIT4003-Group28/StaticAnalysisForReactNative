package defpackage;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
/* compiled from: PG */
/* renamed from: aljm  reason: default package */
/* loaded from: classes.dex */
public final class aljm extends alip {
    private final float e;

    public aljm(aliy aliyVar, float f, float f2, float f3) {
        super(aliyVar, f, f2);
        this.e = f3 * f3;
    }

    @Override // defpackage.alip
    public final boolean a() {
        return true;
    }

    @Override // defpackage.alip
    public final boolean b() {
        return true;
    }

    @Override // defpackage.alip
    public final boolean c() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.alip
    public final boolean d(aljd aljdVar) {
        return this.a.l(aljdVar, true);
    }

    @Override // defpackage.alip
    protected final void f(aljd aljdVar) {
        this.a.m(aljdVar, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.alip
    public final boolean g(aljd aljdVar) {
        return this.a.k(aljdVar, true);
    }

    /* JADX WARN: Incorrect return type in method signature: (JLjava/util/LinkedList<Laliv;>;Ljava/util/List<Lalip;>;)Ljava/lang/Object; */
    @Override // defpackage.alip
    public final int i(long j, LinkedList linkedList, List list) {
        aliv alivVar;
        aliv alivVar2;
        Iterator it = linkedList.iterator();
        while (true) {
            alivVar = null;
            if (!it.hasNext()) {
                alivVar2 = null;
                break;
            }
            alivVar2 = (aliv) it.next();
            if (alivVar2.d == 2) {
                break;
            }
        }
        ListIterator listIterator = linkedList.listIterator(linkedList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            aliv alivVar3 = (aliv) listIterator.previous();
            if (alivVar3.d == 2) {
                alivVar = alivVar3;
                break;
            }
        }
        if (alivVar2 == null || alivVar == null || alivVar.c - j > 300) {
            return 1;
        }
        float b = alivVar.b(0) - alivVar2.b(0);
        float c = alivVar.c(0) - alivVar2.c(0);
        float b2 = alivVar.b(1) - alivVar2.b(1);
        float c2 = alivVar.c(1) - alivVar2.c(1);
        return Math.max((b * b) + (c * c), (b2 * b2) + (c2 * c2)) > this.e ? 1 : 3;
    }
}
