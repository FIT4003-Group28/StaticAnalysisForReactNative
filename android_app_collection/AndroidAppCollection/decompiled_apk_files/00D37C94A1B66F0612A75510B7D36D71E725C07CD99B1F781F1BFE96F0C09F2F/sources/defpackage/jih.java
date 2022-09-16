package defpackage;

import android.content.Context;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: jih  reason: default package */
/* loaded from: classes3.dex */
public final class jih implements jic {
    private final Context a;
    private final aahf b;
    private final jin c;
    private final afvn d;
    private final jhz e;
    private final fbw f;

    public jih(Context context, aahf aahfVar, jin jinVar, afvn afvnVar, jhz jhzVar, fbw fbwVar) {
        this.a = context;
        this.b = aahfVar;
        this.c = jinVar;
        this.d = afvnVar;
        this.e = jhzVar;
        this.f = fbwVar;
    }

    @Override // defpackage.jic
    public final int a() {
        return 261;
    }

    @Override // defpackage.jic
    public final int b() {
        return 173;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0157  */
    @Override // defpackage.jic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ defpackage.jia c(defpackage.aajj r20, java.lang.String r21, defpackage.jib r22) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jih.c(aajj, java.lang.String, jib):jia");
    }

    @Override // defpackage.jic
    public final ampq d(String str) {
        awbp k = hhw.k(str, this.f);
        return k == null ? amon.a : ampq.j(emn.o(k.c));
    }

    @Override // defpackage.jic
    public final amvn e(String str) {
        awbp k = hhw.k(str, this.f);
        if (k == null) {
            return amyg.a;
        }
        String str2 = k.c;
        String o = emn.o(str2);
        HashSet g = amyv.g(this.c.a(o), this.c.a(emn.q(str2)), this.c.a(emn.A(str2)), this.c.a(emn.l(str2)), this.c.a(emn.z(str2)));
        asze aszeVar = (asze) this.b.a(this.d.c()).f(o).g(asze.class).W();
        String str3 = aszeVar != null ? aszeVar.b.f : null;
        if (str3 != null) {
            g.add(this.c.a(str3));
        }
        return amvn.p(g);
    }

    @Override // defpackage.jic
    public final Class f() {
        return asze.class;
    }

    @Override // defpackage.jic
    public final Class g() {
        return aqqg.class;
    }

    @Override // defpackage.jic
    public final mhk h(String str) {
        return new mhk(1, str);
    }
}
