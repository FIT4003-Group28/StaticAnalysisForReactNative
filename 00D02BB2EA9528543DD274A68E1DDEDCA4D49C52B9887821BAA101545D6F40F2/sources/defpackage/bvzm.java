package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONException;
/* compiled from: PG */
/* renamed from: bvzm  reason: default package */
/* loaded from: classes4.dex */
public final class bvzm extends bvwl<dmeb, dmee> {
    private static final dcqe d = dcqe.c("bvzm");
    public final dxio<ckcw> c;
    private final Map<String, bvwz> e;
    private final Executor f;

    public bvzm(Executor executor, dxio<ckcw> dxioVar, bvze bvzeVar, @dzsi dcdc<bvwz> dcdcVar) {
        super(dmeb.d, dmee.e);
        this.e = new HashMap();
        this.f = executor;
        this.c = dxioVar;
        if (dcdcVar != null) {
            int size = dcdcVar.size();
            for (int i = 0; i < size; i++) {
                bvwz bvwzVar = dcdcVar.get(i);
                if (!this.e.containsKey(bvwzVar.c())) {
                    this.e.put(bvwzVar.c(), bvwzVar);
                    if (bvzeVar.b.containsKey(bvwzVar.c())) {
                        bvoo.h("FunctionId %s is already registered", bvwzVar.c());
                    } else {
                        bvzeVar.b.put(bvwzVar.c(), bvwzVar);
                    }
                } else {
                    bvoo.h("FunctionId %s is already registered", bvwzVar.c());
                    return;
                }
            }
        }
    }

    private final void h(final ckgz ckgzVar, final String str) {
        String str2 = ckgzVar.b;
        this.f.execute(new Runnable(this, ckgzVar, str) { // from class: bvzl
            private final bvzm a;
            private final ckgz b;
            private final String c;

            {
                this.a = this;
                this.b = ckgzVar;
                this.c = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bvzm bvzmVar = this.a;
                bvzmVar.c.a().s(this.b, bwdb.a(this.c) - 1);
            }
        });
    }

    @Override // defpackage.bvwl
    public final /* bridge */ /* synthetic */ dmee g(dmeb dmebVar) {
        dmee bK;
        dmeb dmebVar2 = dmebVar;
        dmec bZ = dmee.d.bZ();
        String str = dmebVar2.a;
        h(ckku.j, str);
        if (!this.e.containsKey(str)) {
            h(ckku.l, str);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dmee dmeeVar = (dmee) bZ.b;
            dmeeVar.b = 1;
            dmeeVar.a |= 1;
            return bZ.bK();
        }
        try {
            Map<String, Object> b = bvtu.b(dmebVar2.b);
            bvwz bvwzVar = this.e.get(str);
            dbsk.s(bvwzVar);
            try {
                Map<String, Object> a = bvwzVar.a().a(b);
                if (a != null) {
                    h(ckku.k, str);
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dmee dmeeVar2 = (dmee) bZ.b;
                    dmeeVar2.b = 0;
                    dmeeVar2.a = 1 | dmeeVar2.a;
                    String a2 = bvtu.a(a);
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dmee dmeeVar3 = (dmee) bZ.b;
                    a2.getClass();
                    dmeeVar3.a |= 2;
                    dmeeVar3.c = a2;
                    bK = bZ.bK();
                } else {
                    h(ckku.k, str);
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dmee dmeeVar4 = (dmee) bZ.b;
                    dmeeVar4.b = 0;
                    dmeeVar4.a |= 1;
                    bK = bZ.bK();
                }
                return bK;
            } catch (Exception e) {
                bvoo.j(e);
                h(ckku.m, str);
                bvwi c = bvwj.c();
                c.b(drtc.INTERNAL);
                c.c(dbsj.e(e.getMessage()));
                bvwj a3 = c.a();
                a3.initCause(e);
                throw a3;
            }
        } catch (JSONException e2) {
            bvoo.j(e2);
            h(ckku.n, str);
            bvwi c2 = bvwj.c();
            c2.b(drtc.INVALID_ARGUMENT);
            c2.c(dbsj.e(e2.getMessage()));
            bvwj a4 = c2.a();
            a4.initCause(e2);
            throw a4;
        }
    }
}
