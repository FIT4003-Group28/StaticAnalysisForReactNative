package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cchx  reason: default package */
/* loaded from: classes4.dex */
public class cchx implements ccii {
    private final gga a;
    private final List<ccib> b;
    private int c;
    private final jco d;

    public cchx(gga ggaVar, List<ccib> list, jco jcoVar) {
        this.a = ggaVar;
        this.d = new cchw(this, jcoVar);
        this.b = list;
    }

    @Override // defpackage.ccii
    public cqkl a() {
        this.a.g().e();
        return cqkl.a;
    }

    @Override // defpackage.ccii
    public jco b() {
        return this.d;
    }

    @Override // defpackage.ccii
    public Integer c() {
        return Integer.valueOf(this.c);
    }

    @Override // defpackage.ccii
    public List<ccib> d() {
        return this.b;
    }

    public void e(int i) {
        if (this.c == i) {
            return;
        }
        this.c = i;
        cqkx.p(this);
    }

    @Override // defpackage.ccii
    public CharSequence f() {
        return this.b.get(this.c).a();
    }
}
