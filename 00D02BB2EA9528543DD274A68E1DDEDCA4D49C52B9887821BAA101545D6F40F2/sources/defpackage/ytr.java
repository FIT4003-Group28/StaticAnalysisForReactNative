package defpackage;

import android.util.SparseArray;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: ytr  reason: default package */
/* loaded from: classes7.dex */
public final class ytr implements yvl {
    private final busa a;
    private final Executor b;
    private final SparseArray<btzc> c = new SparseArray<>();
    private final AtomicInteger d = new AtomicInteger();

    public ytr(busa busaVar, Executor executor) {
        this.a = busaVar;
        this.b = executor;
    }

    @Override // defpackage.yvl
    public final void a(yvg yvgVar, degu<yvi> deguVar) {
        digw bZ = digz.d.bZ();
        dnqh dnqhVar = dnqh.p;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        digz digzVar = (digz) bZ.b;
        dnqhVar.getClass();
        digzVar.c = dnqhVar;
        digzVar.a |= 1;
        dcdc<String> dcdcVar = ((yuz) yvgVar).a;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            String str = dcdcVar.get(i);
            digx bZ2 = digy.c.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            digy digyVar = (digy) bZ2.b;
            str.getClass();
            digyVar.a |= 1;
            digyVar.b = str;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            digz digzVar2 = (digz) bZ.b;
            digy bK = bZ2.bK();
            bK.getClass();
            dsrj<digy> dsrjVar = digzVar2.b;
            if (!dsrjVar.a()) {
                digzVar2.b = dsqw.cl(dsrjVar);
            }
            digzVar2.b.add(bK);
        }
        int incrementAndGet = this.d.incrementAndGet();
        btzc b = ((busb) this.a).b().b(bZ.bK(), new ytq(this, incrementAndGet, deguVar), this.b);
        synchronized (this) {
            this.c.put(incrementAndGet, b);
        }
    }

    public final synchronized void b(int i) {
        this.c.delete(i);
    }
}
