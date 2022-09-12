package defpackage;

import android.app.Activity;
import java.util.List;
/* compiled from: PG */
/* renamed from: nuv  reason: default package */
/* loaded from: classes7.dex */
public class nuv implements cjyw {
    private final Activity a;
    private final cjzo b;
    private final cjqy c;
    private final dtid d;
    private final cjyi e;
    private final List<cjyv<?>> f;
    private boolean g;

    public nuv(Activity activity, cjzo cjzoVar, cjqy cjqyVar, dtid dtidVar, List<cjys> list, cjyi cjyiVar) {
        this.a = activity;
        this.b = cjzoVar;
        this.c = cjqyVar;
        this.d = dtidVar;
        this.e = cjyiVar;
        this.f = dchl.f(list.size());
        a(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0004 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.util.List<defpackage.cjys> r11) {
        /*
            r10 = this;
            java.util.Iterator r11 = r11.iterator()
        L4:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L80
            java.lang.Object r0 = r11.next()
            cjys r0 = (defpackage.cjys) r0
            java.util.List<cjyv<?>> r1 = r10.f
            int r6 = r1.size()
            cjzt r1 = new cjzt
            dtid r3 = r10.d
            java.lang.String r4 = r0.d
            cjyi r5 = r10.e
            dvnp r7 = r0.e
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            java.util.List<dtkx> r2 = r0.a
            int r3 = r2.size()
            r4 = 1
            r5 = 0
            if (r3 <= r4) goto L44
            cjzq r3 = new cjzq
            nva r4 = new nva
            r4.<init>()
            cjzk r6 = defpackage.cjzk.a
            nvb r7 = new nvb
            cjzo r8 = r10.b
            android.app.Activity r9 = r10.a
            r7.<init>(r8, r9, r1, r0)
            r3.<init>(r4, r6, r7)
            goto L56
        L44:
            cjzo r0 = r10.b
            android.app.Activity r3 = r10.a
            java.lang.Object r4 = r2.get(r5)
            dtkx r4 = (defpackage.dtkx) r4
            cjzq r3 = defpackage.cjzp.b(r0, r3, r1, r4)
            if (r3 != 0) goto L56
            r0 = 0
            goto L78
        L56:
            cjzo r0 = r10.b
            java.lang.Object r1 = r2.get(r5)
            dtkx r1 = (defpackage.dtkx) r1
            boolean r0 = defpackage.cjzp.c(r0, r1)
            cjzo r1 = r10.b
            int r4 = r2.size()
            int r4 = r4 + (-1)
            java.lang.Object r2 = r2.get(r4)
            dtkx r2 = (defpackage.dtkx) r2
            boolean r1 = defpackage.cjzp.d(r1, r2)
            cjyv r0 = defpackage.cjyv.a(r3, r0, r1)
        L78:
            if (r0 == 0) goto L4
            java.util.List<cjyv<?>> r1 = r10.f
            r1.add(r0)
            goto L4
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nuv.a(java.util.List):void");
    }

    @Override // defpackage.cjyw
    public List<cjyv<?>> b() {
        return this.f;
    }

    @Override // defpackage.cjyw
    public dtic c() {
        dtic b = dtic.b(this.d.c);
        return b == null ? dtic.INVALID_STYLE : b;
    }

    @Override // defpackage.cjyw
    public Integer d() {
        dtid dtidVar = this.d;
        int i = dtidVar.bC;
        if (i == 0) {
            i = dsst.a.b(dtidVar).c(dtidVar);
            dtidVar.bC = i;
        }
        return Integer.valueOf(i);
    }

    @Override // defpackage.cjyw
    public cqqw e() {
        return new nuu(this);
    }

    public void f(int i) {
        if (i == 0 || this.g || this.f.isEmpty() || !(this.f.get(0).c instanceof jba)) {
            return;
        }
        this.c.m(new cjte(deaf.DRAG, i > 0 ? dead.LEFT : dead.RIGHT), ((jba) this.f.get(0).c).b());
        this.g = true;
    }
}
