package defpackage;
/* compiled from: PG */
/* renamed from: xzv  reason: default package */
/* loaded from: classes7.dex */
public class xzv implements xyt {
    private final dpgw a;
    private final String b;
    private final byyp c;

    public xzv(dpgw dpgwVar, cqss cqssVar, byyp byypVar) {
        this.a = dpgwVar;
        this.b = dpgwVar.b;
        this.c = byypVar;
    }

    @Override // defpackage.xyt
    public String a() {
        return this.b;
    }

    @Override // defpackage.xyt
    public Boolean b() {
        bzdk c = this.c.c();
        if (c.h() != bzdj.STARTED) {
            return false;
        }
        bzdh g = c.g();
        if (!(g instanceof bzcz)) {
            return false;
        }
        return Boolean.valueOf(this.c.c().g().b().v((int) Math.ceil(((bzcz) g).j())).n.equals(this.a.n));
    }
}
