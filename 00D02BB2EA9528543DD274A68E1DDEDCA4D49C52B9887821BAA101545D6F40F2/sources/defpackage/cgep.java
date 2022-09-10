package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cgep  reason: default package */
/* loaded from: classes4.dex */
public class cgep {
    public final btvo a;
    public List<cgeo> b = new LinkedList();

    public cgep(btvo btvoVar) {
        this.a = btvoVar;
    }

    public final void a(dwsr dwsrVar, akqs akqsVar) {
        this.b.add(0, new cgeo(dwsrVar, akqsVar));
        int i = this.a.getUgcTasksParameters().d;
        if (this.b.size() > i) {
            this.b = this.b.subList(0, i);
        }
    }

    public final void b(dwrz dwrzVar, akqs akqsVar) {
        dwso bZ = dwsr.g.bZ();
        dspd dspdVar = dwrzVar.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwsr dwsrVar = (dwsr) bZ.b;
        dspdVar.getClass();
        dwsrVar.a |= 1;
        dwsrVar.c = dspdVar;
        bZ.b(dwrzVar.a);
        bZ.a(dwrzVar.c);
        a(bZ.bK(), akqsVar);
    }

    public final void c(akqs akqsVar) {
        if (this.b.isEmpty()) {
            return;
        }
        this.b.get(0).b = akqsVar;
    }

    @dzsi
    public final dwsr d() {
        if (this.b.isEmpty()) {
            return null;
        }
        dwsr dwsrVar = this.b.get(0).a;
        dsqp dsqpVar = (dsqp) dwsrVar.cu(5);
        dsqpVar.bC(dwsrVar);
        dwso dwsoVar = (dwso) dsqpVar;
        if (dwsoVar.c) {
            dwsoVar.bF();
            dwsoVar.c = false;
        }
        dwsr dwsrVar2 = dwsr.g;
        ((dwsr) dwsoVar.b).e = dwsr.ck();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (cgeo cgeoVar : this.b) {
            for (dwqg dwqgVar : cgeoVar.a.e) {
                dwpc dwpcVar = dwqgVar.b;
                if (dwpcVar == null) {
                    dwpcVar = dwpc.e;
                }
                if (!hashSet.contains(dwpcVar)) {
                    arrayList.add(dwqgVar);
                    hashSet.add(dwpcVar);
                }
            }
        }
        dwsoVar.a(arrayList);
        return (dwsr) dwsoVar.bK();
    }

    @dzsi
    public final dspd e() {
        if (this.b.isEmpty()) {
            return null;
        }
        dwsr dwsrVar = this.b.get(0).a;
        if ((dwsrVar.a & 1) == 0) {
            return null;
        }
        return dwsrVar.c;
    }
}
