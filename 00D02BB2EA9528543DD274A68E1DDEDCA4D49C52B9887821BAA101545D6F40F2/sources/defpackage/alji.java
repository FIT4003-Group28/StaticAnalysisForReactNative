package defpackage;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
/* compiled from: PG */
/* renamed from: alji  reason: default package */
/* loaded from: classes.dex */
public final class alji extends alip {
    private static final float e = (float) Math.toRadians(10.0d);

    public alji(aliy aliyVar, float f, float f2) {
        super(aliyVar, f, f2);
    }

    @Override // defpackage.alip
    public final boolean b() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.alip
    public final boolean d(aljd aljdVar) {
        return this.a.l(aljdVar, false);
    }

    @Override // defpackage.alip
    protected final void f(aljd aljdVar) {
        this.a.m(aljdVar, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.alip
    public final boolean g(aljd aljdVar) {
        return this.a.k(aljdVar, false);
    }

    /* JADX WARN: Incorrect return type in method signature: (JLjava/util/LinkedList<Laliv;>;Ljava/util/List<Lalip;>;)Ljava/lang/Object; */
    @Override // defpackage.alip
    public final int i(long j, LinkedList linkedList, List list) {
        if (linkedList.size() < 3) {
            return 2;
        }
        aliv alivVar = (aliv) linkedList.getLast();
        float f = alivVar.a;
        ListIterator listIterator = linkedList.listIterator(linkedList.size());
        aliv alivVar2 = alivVar;
        while (listIterator.hasPrevious()) {
            aliv alivVar3 = (aliv) listIterator.previous();
            if (alivVar3.d != alivVar.d) {
                break;
            } else if (Math.abs(h(f, alivVar3.a)) > e) {
                return 1;
            } else {
                alivVar2 = alivVar3;
            }
        }
        if (e < 0.0f) {
            return 1;
        }
        return Math.abs(alivVar2.b - alivVar.b) / ((this.c + this.d) * 0.5f) < (true != list.isEmpty() ? 0.2f : 0.1f) ? 2 : 3;
    }
}
