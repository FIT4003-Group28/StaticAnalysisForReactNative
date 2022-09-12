package defpackage;
/* compiled from: PG */
/* renamed from: afbx  reason: default package */
/* loaded from: classes2.dex */
final class afbx implements afcf {
    @Override // defpackage.afcf
    public final boolean a(afcj afcjVar) {
        if (afcjVar.f() == 1) {
            String e = afcjVar.e(bvjk.br);
            String e2 = afcjVar.e(bvjk.q);
            if (e2.isEmpty()) {
                return false;
            }
            afcjVar.a().ac(bvjk.bs, e);
            afcjVar.a().ac(bvjk.br, e2);
            return afcjVar.a().aq();
        }
        String e3 = afcjVar.e(bvjk.br);
        String e4 = afcjVar.e(bvjk.q);
        afcjVar.a().ac(bvjk.br, e3);
        afcjVar.a().ac(bvjk.q, e4);
        afcjVar.a().P(bvjk.bs);
        afcjVar.a().P(bvjk.j);
        return afcjVar.a().aq();
    }
}
