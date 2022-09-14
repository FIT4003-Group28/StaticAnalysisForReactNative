package defpackage;

import java.util.Collections;
/* compiled from: PG */
/* renamed from: bzlv  reason: default package */
/* loaded from: classes4.dex */
public final class bzlv {
    public static boolean a(bzjj bzjjVar) {
        return bzjjVar.d.size() == 0;
    }

    public static bzjj b(bzjj bzjjVar, final int i) {
        dsqp dsqpVar = (dsqp) bzjjVar.cu(5);
        dsqpVar.bC(bzjjVar);
        bzji bzjiVar = (bzji) dsqpVar;
        dcbg o = dcbg.b(Collections.unmodifiableList(((bzjj) bzjiVar.b).d)).o(new dbsl(i) { // from class: bzlu
            private final int a;

            {
                this.a = i;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return ((bzia) obj).i == this.a;
            }
        });
        if (bzjiVar.c) {
            bzjiVar.bF();
            bzjiVar.c = false;
        }
        ((bzjj) bzjiVar.b).d = bzjj.ck();
        bzjiVar.a(o);
        return bzjiVar.bK();
    }
}
