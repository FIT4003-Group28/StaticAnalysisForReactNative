package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: iaa  reason: default package */
/* loaded from: classes6.dex */
public class iaa implements hzw {
    public final cqhn b;
    protected final cjqy c;
    protected iaz e;
    private final hzv f = new hzx(this);
    protected final dafw a = new hzy(this);
    protected final List<hzz> d = new ArrayList();

    public iaa(cqhn cqhnVar, cjqy cjqyVar, int i) {
        this.b = cqhnVar;
        this.c = cjqyVar;
        this.e = new iba(i, false);
        new iay(i, 0.0f, true, true);
    }

    public void NP(int i) {
        this.e = new iba(i, true);
        cqkx.p(this);
    }

    public void NQ(hzz... hzzVarArr) {
        Collections.addAll(this.d, hzzVarArr);
    }

    @Override // defpackage.hzw, defpackage.absq
    public hzv a() {
        return this.f;
    }

    @Override // defpackage.hzw
    public Integer b() {
        iaz iazVar = this.e;
        return Integer.valueOf(iazVar == null ? 0 : ((iba) iazVar).a);
    }
}
