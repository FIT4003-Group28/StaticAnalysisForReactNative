package defpackage;

import android.content.Context;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: jiw  reason: default package */
/* loaded from: classes3.dex */
public final class jiw implements jic {
    private final Context a;
    private final aagi b;
    private final jie c;
    private final jhz d;
    private final fbw e;

    public jiw(Context context, aagi aagiVar, jie jieVar, jhz jhzVar, fbw fbwVar) {
        this.a = context;
        this.b = aagiVar;
        this.c = jieVar;
        this.d = jhzVar;
        this.e = fbwVar;
    }

    @Override // defpackage.jic
    public final int a() {
        return 155;
    }

    @Override // defpackage.jic
    public final int b() {
        return 173;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0337  */
    @Override // defpackage.jic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ defpackage.jia c(defpackage.aajj r20, java.lang.String r21, defpackage.jib r22) {
        /*
            Method dump skipped, instructions count: 875
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jiw.c(aajj, java.lang.String, jib):jia");
    }

    @Override // defpackage.jic
    public final ampq d(String str) {
        awbp k = hhw.k(str, this.e);
        return k == null ? amon.a : ampq.j(emn.h(k.c));
    }

    @Override // defpackage.jic
    public final amvn e(String str) {
        awbp k = hhw.k(str, this.e);
        if (k == null) {
            return amyg.a;
        }
        String str2 = k.c;
        String h = emn.h(str2);
        String y = emn.y(str2);
        HashSet g = amyv.g(this.c.a(h), this.c.a(y), this.c.a(emn.q(str2)), this.c.a(emn.A(str2)), this.c.a(emn.l(str2)));
        awkx awkxVar = (awkx) this.b.c().f(y).g(awkx.class).W();
        String f = awkxVar != null ? awkxVar.f() : null;
        if (f != null) {
            g.add(this.c.a(f));
        }
        return amvn.p(g);
    }

    @Override // defpackage.jic
    public final Class f() {
        return awjr.class;
    }

    @Override // defpackage.jic
    public final Class g() {
        return aqqg.class;
    }

    @Override // defpackage.jic
    public final mhk h(String str) {
        return new mhk(2, str);
    }
}
