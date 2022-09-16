package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: rdz  reason: default package */
/* loaded from: classes7.dex */
public final class rdz extends cqiw<rej> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [rdy] */
    /* JADX WARN: Type inference failed for: r5v14, types: [qqu] */
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, rej rejVar, Context context, cqiv cqivVar) {
        qqw qqwVar;
        rdm rdmVar;
        rej rejVar2 = rejVar;
        boolean z = true;
        if (rejVar2.e().booleanValue()) {
            rjz q = rejVar2.q();
            cqivVar.a(new rdr(), rejVar2);
            if (q != null && !q.a().booleanValue()) {
                cqivVar.a(new rjk(), q);
            }
            reg o = rejVar2.o();
            if (o != null && o.a().booleanValue()) {
                cqivVar.a(new rcy(), o);
                cqivVar.a(new rdg(), rejVar2);
            }
            int size = rejVar2.j().size();
            if (size != 1) {
                z = false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                cqivVar.a(new reb(z), rejVar2.j().get(i2));
                if (i2 < size - 1) {
                    cqivVar.a(new rds(), rejVar2);
                }
            }
            qqw p = rejVar2.p();
            if (p == null || !p.a().booleanValue()) {
                return;
            }
            if (q != null && !q.a().booleanValue()) {
                return;
            }
            rdmVar = new qqu();
            qqwVar = p;
        } else {
            rcq rcqVar = rcq.LOADING;
            int ordinal = rejVar2.d().ordinal();
            if (ordinal == 0) {
                cqivVar.a(new rdr(), rejVar2);
                cqivVar.a(new rdw(), rejVar2);
                for (int i3 = 1; i3 < 2; i3++) {
                    cqivVar.a(new rdt(), rejVar2);
                }
                return;
            }
            if (ordinal != 1) {
                if (ordinal == 2) {
                    rdmVar = new rdy();
                    qqwVar = rejVar2;
                } else if (ordinal != 3 && ordinal != 4) {
                    if (ordinal != 5) {
                        return;
                    }
                    rdmVar = new rdm();
                    qqwVar = rejVar2;
                }
            }
            rdmVar = new rdm();
            qqwVar = rejVar2;
        }
        cqivVar.a(rdmVar, qqwVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<rej> a() {
        return cqgr.gd(cqgr.aR(Integer.valueOf(rej.IW)), cqgr.bp(-2), cqgr.cd(-1), cqgr.dr(1), cqgr.ck(C()));
    }
}
