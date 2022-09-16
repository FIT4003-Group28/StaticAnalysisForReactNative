package defpackage;

import android.content.Context;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: jis  reason: default package */
/* loaded from: classes3.dex */
public final class jis implements jic {
    private final Context a;
    private final aagi b;
    private final jie c;
    private final jij d;
    private final jil e;
    private final jhw f;
    private final jhz g;
    private final fbx h;
    private final fbw i;

    public jis(Context context, aagi aagiVar, jie jieVar, jij jijVar, jil jilVar, jhw jhwVar, jhz jhzVar, fbx fbxVar, fbw fbwVar) {
        this.a = context;
        this.b = aagiVar;
        this.c = jieVar;
        this.d = jijVar;
        this.e = jilVar;
        this.f = jhwVar;
        this.g = jhzVar;
        this.h = fbxVar;
        this.i = fbwVar;
    }

    private final List i(String str, ampg ampgVar) {
        return (List) this.b.c().f(emn.t(str)).g(awkg.class).O().t(iyw.n).V(new aitj(ampgVar, 1)).I(jgs.d).aq().U();
    }

    private final Set j(List list, ampg... ampgVarArr) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            for (int i = 0; i < 4; i++) {
                hashSet.add(this.c.a((String) ampgVarArr[i].apply(str)));
            }
        }
        return hashSet;
    }

    @Override // defpackage.jic
    public final int a() {
        return 156;
    }

    @Override // defpackage.jic
    public final int b() {
        return 141;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
        if (r10 != 7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cb, code lost:
        if (r16 == false) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0180  */
    @Override // defpackage.jic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ defpackage.jia c(defpackage.aajj r21, java.lang.String r22, defpackage.jib r23) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jis.c(aajj, java.lang.String, jib):jia");
    }

    @Override // defpackage.jic
    public final ampq d(String str) {
        awbp k = hhw.k(str, this.i);
        return k == null ? amon.a : ampq.j(emn.g(k.c));
    }

    @Override // defpackage.jic
    public final amvn e(String str) {
        awbp k = hhw.k(str, this.i);
        if (k == null) {
            return amyg.a;
        }
        String str2 = k.c;
        String g = emn.g(str2);
        String t = emn.t(str2);
        List i = i(str2, jgl.i);
        if (this.h.a()) {
            amvl i2 = amvn.i();
            i2.c(this.c.a(g));
            i2.c(this.c.a(t));
            i2.c(this.d.a());
            i2.c(this.e.a());
            i2.j(j(i, jgl.e, jgl.f, jgl.h, jgl.g));
            Iterator it = i.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (jhz.p((atss) this.b.c().f(emn.q((String) it.next())).g(atss.class).W())) {
                        i2.c(this.f.a());
                        break;
                    }
                } else {
                    break;
                }
            }
            return i2.g();
        }
        amvl i3 = amvn.i();
        i3.c(this.c.a(g));
        i3.c(this.c.a(t));
        i3.c(this.d.a());
        i3.c(this.e.a());
        i3.j(j(i, jgl.e, jgl.f, jgl.h, jgl.g));
        return i3.g();
    }

    @Override // defpackage.jic
    public final Class f() {
        return awjm.class;
    }

    @Override // defpackage.jic
    public final Class g() {
        return aqoi.class;
    }

    @Override // defpackage.jic
    public final mhk h(String str) {
        return new mhk(2, str);
    }
}
