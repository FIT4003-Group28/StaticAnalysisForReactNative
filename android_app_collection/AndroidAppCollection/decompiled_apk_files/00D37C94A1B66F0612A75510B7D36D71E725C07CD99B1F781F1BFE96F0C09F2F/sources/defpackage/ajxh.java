package defpackage;

import android.content.Intent;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Timer;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ajxh  reason: default package */
/* loaded from: classes.dex */
public abstract class ajxh implements zdx, ajzh {
    public ajfz A;
    public ajfz B;
    public final HashMap C;
    public ajxb D;
    public ajxc E;
    private ajxo a;
    private final aari b;
    private final yzj c;
    private final yni d;
    private final aarh e;
    public final Executor t;
    public final Object u;
    public final HashMap v;
    public final acti w;
    public final List x;
    public final Queue y;
    public ajfz z;

    public ajxh(aari aariVar, yni yniVar, yzj yzjVar, acti actiVar) {
        this(aariVar, yniVar, null, yzjVar, actiVar);
    }

    private final void k(Object obj) {
        Object obj2 = this.u;
        if (obj2 != null) {
            this.d.e(obj2, obj);
        } else {
            this.d.d(obj);
        }
    }

    private final void l(ajfz ajfzVar, boolean z, apzg apzgVar, zdt zdtVar, ajxo ajxoVar, ajxa ajxaVar, asjj asjjVar) {
        k(new ajxe(ajfzVar));
        if (lo() && ajfzVar.d() != null && ajfzVar.d().length > 0) {
            this.w.H(3, new acte(ajfzVar.d()), asjjVar);
        }
        this.z = ajfzVar;
        aaqs a = this.b.a(ajfzVar);
        if (zdtVar != null) {
            zdtVar.a(a);
        }
        if ((ajfy.INVALIDATION.a(ajfzVar) || z) && a.o()) {
            a.q(2);
        }
        lq(a, ajxaVar);
        this.b.b(a, this.e, new ajwy(this, ajfzVar, z, apzgVar, ajxoVar));
    }

    public void A() {
        this.v.clear();
        this.z = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ajvw S() {
        return null;
    }

    public ajfz U(ajfy ajfyVar) {
        return (ajfz) this.v.get(ajfyVar);
    }

    public final ajxo V() {
        if (this.a == null) {
            this.a = new ajwx(this);
        }
        return this.a;
    }

    public Object W() {
        return this.u;
    }

    public final void X(Object obj) {
        if (this.C.containsKey(obj)) {
            ((Timer) this.C.remove(obj)).cancel();
        }
    }

    public final void Y() {
        for (Timer timer : this.C.values()) {
            timer.cancel();
        }
        this.C.clear();
    }

    public final void Z(ajfz ajfzVar, ajxo ajxoVar) {
        ab(ajfzVar, null, aclb.o, ajxoVar, ajxa.a());
    }

    public final void aa(ajfz ajfzVar, apzg apzgVar) {
        ab(ajfzVar, apzgVar, aclb.q, V(), ajxa.a());
    }

    public final void ab(ajfz ajfzVar, apzg apzgVar, zdt zdtVar, ajxo ajxoVar, ajxa ajxaVar) {
        ac(ajfzVar, apzgVar, zdtVar, ajxoVar, ajxaVar, asjj.a);
    }

    public final void ac(ajfz ajfzVar, apzg apzgVar, zdt zdtVar, ajxo ajxoVar, ajxa ajxaVar, asjj asjjVar) {
        ajxoVar.getClass();
        if (ajfzVar == null || ajfzVar == this.z) {
            return;
        }
        l(ajfzVar, false, apzgVar, zdtVar, ajxoVar, ajxaVar, asjjVar);
    }

    public final void ad() {
        ajfz ajfzVar = this.B;
        if (ajfzVar == null || ajfzVar == this.z) {
            return;
        }
        l(ajfzVar, true, null, aclb.r, V(), ajxa.a(), asjj.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ae(java.lang.Object r6, defpackage.ajfz r7, java.util.Timer r8) {
        /*
            r5 = this;
            defpackage.ylr.c()
            if (r7 != 0) goto L6
            return
        L6:
            java.lang.Class<avia> r0 = defpackage.avia.class
            java.lang.Object r0 = defpackage.ajna.h(r7, r0)
            avia r0 = (defpackage.avia) r0
            r1 = 0
            if (r0 == 0) goto L16
            int r0 = r0.c
        L14:
            long r3 = (long) r0
            goto L24
        L16:
            java.lang.Class<askw> r0 = defpackage.askw.class
            java.lang.Object r0 = defpackage.ajna.h(r7, r0)
            askw r0 = (defpackage.askw) r0
            if (r0 == 0) goto L23
            int r0 = r0.d
            goto L14
        L23:
            r3 = r1
        L24:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L2c
            r5.lr(r7)
            return
        L2c:
            java.util.HashMap r0 = r5.C
            boolean r0 = r0.containsKey(r6)
            if (r0 == 0) goto L3f
            java.util.HashMap r0 = r5.C
            java.lang.Object r0 = r0.get(r6)
            java.util.Timer r0 = (java.util.Timer) r0
            r0.cancel()
        L3f:
            java.util.HashMap r0 = r5.C
            r0.put(r6, r8)
            ajwv r0 = new ajwv
            r0.<init>(r5, r6, r7)
            r8.schedule(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajxh.ae(java.lang.Object, ajfz, java.util.Timer):void");
    }

    public boolean af(ajfy ajfyVar) {
        return (ajfyVar == ajfy.RELOAD && this.B != null) || this.v.containsKey(ajfyVar);
    }

    @Override // defpackage.zdx
    public void j() {
        this.D = null;
        this.E = null;
        Y();
        A();
    }

    public void lD(ajfy ajfyVar) {
        ajfz ajfzVar = (ajfz) this.v.get(ajfyVar);
        if (ajfzVar != null) {
            lr(ajfzVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void lj(cff cffVar, ajfz ajfzVar) {
        Intent intent;
        zdy a = this.c.a(cffVar);
        Throwable th = cffVar;
        while (true) {
            if (th == null) {
                intent = null;
                break;
            } else if (!(th instanceof ceq)) {
                th = th.getCause();
            } else {
                intent = ((ceq) th).a;
                break;
            }
        }
        k(new ajxd(a, true, intent, ajfzVar));
        ajxb ajxbVar = this.D;
        if (ajxbVar != null) {
            ajxbVar.a(cffVar, ajfzVar);
        }
    }

    protected boolean lo() {
        return true;
    }

    protected void lq(aapd aapdVar, ajxa ajxaVar) {
    }

    public void lr(ajfz ajfzVar) {
        Z(ajfzVar, V());
    }

    public void ls(List list) {
        A();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ajfz ajfzVar = (ajfz) it.next();
            this.v.put(ajfzVar.a(), ajfzVar);
            if (ajfzVar.a() == ajfy.RELOAD) {
                this.B = ajfzVar;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void lz(Object obj, ajfy ajfyVar) {
        if (obj == null && ajfyVar == ajfy.NEXT) {
            A();
        }
        k(new ajwz(ajfyVar, obj != null));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object np(auna aunaVar);

    public akam pn() {
        return new ajxg(new HashMap(this.v), this.B, this.z, this.x);
    }

    public ajxh(aari aariVar, yni yniVar, Object obj, yzj yzjVar, acti actiVar) {
        this(null, aariVar, yniVar, obj, yzjVar, actiVar, new qrj(4));
    }

    public ajxh(akam akamVar, aari aariVar, yni yniVar, Object obj, yzj yzjVar, acti actiVar, Executor executor) {
        this(akamVar, aariVar, yniVar, obj, yzjVar, actiVar, executor, new ArrayDeque());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ajxh(akam akamVar, aari aariVar, yni yniVar, Object obj, yzj yzjVar, acti actiVar, Executor executor, Queue queue) {
        aariVar.getClass();
        this.b = aariVar;
        yniVar.getClass();
        this.d = yniVar;
        yzjVar.getClass();
        this.c = yzjVar;
        actiVar.getClass();
        this.w = actiVar;
        this.u = obj;
        this.C = new HashMap();
        this.t = executor;
        this.y = queue;
        this.e = new ajwt(this);
        if (akamVar instanceof ajxg) {
            ajxg ajxgVar = (ajxg) akamVar;
            this.v = ajxgVar.a;
            this.B = ajxgVar.b;
            this.x = ajxgVar.c;
            this.A = ajxgVar.d;
        } else {
            this.v = new HashMap();
            this.x = new ArrayList();
            this.A = null;
        }
        for (byte[] bArr : this.x) {
            if (bArr != null) {
                actiVar.D(new acte(bArr));
            }
        }
    }
}
