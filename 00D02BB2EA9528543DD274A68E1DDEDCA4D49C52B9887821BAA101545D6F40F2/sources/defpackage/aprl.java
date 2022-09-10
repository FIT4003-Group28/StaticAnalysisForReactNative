package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aprl  reason: default package */
/* loaded from: classes2.dex */
public final class aprl implements btzi<dwuv, dwuz> {
    final /* synthetic */ String a;
    final /* synthetic */ deig b;
    final /* synthetic */ btlu c;
    final /* synthetic */ apro d;

    public aprl(apro aproVar, String str, deig deigVar, btlu btluVar) {
        this.d = aproVar;
        this.a = str;
        this.b = deigVar;
        this.c = btluVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwuv> btzrVar, btzy btzyVar) {
        this.d.i.remove(this.a);
        this.b.k(new btzz(btzyVar));
        this.d.f.c();
        if (this.a.equals(this.d.j.first)) {
            this.d.j = apro.a;
            Throwable th = btzyVar.r;
        }
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwuv> btzrVar, dwuz dwuzVar) {
        dwuz dwuzVar2 = dwuzVar;
        this.d.i.remove(this.a);
        this.d.f.c();
        if (!this.a.equals(this.d.j.first)) {
            if ((dwuzVar2.a & 4) != 0) {
                dwuy dwuyVar = dwuzVar2.b;
                if (dwuyVar == null) {
                    dwuyVar = dwuy.c;
                }
                if (dwuyVar.a) {
                    deig deigVar = this.b;
                    dwuy dwuyVar2 = dwuzVar2.b;
                    if (dwuyVar2 == null) {
                        dwuyVar2 = dwuy.c;
                    }
                    deigVar.j(apro.f(dwuyVar2.b));
                    return;
                }
            }
            this.b.j(dcdc.e());
            return;
        }
        if ((dwuzVar2.a & 4) != 0) {
            dwuy dwuyVar3 = dwuzVar2.b;
            if (dwuyVar3 == null) {
                dwuyVar3 = dwuy.c;
            }
            if (dwuyVar3.a) {
                this.d.j = apro.a;
                apro aproVar = this.d;
                dwuy dwuyVar4 = dwuzVar2.b;
                if (dwuyVar4 == null) {
                    dwuyVar4 = dwuy.c;
                }
                aproVar.h = apro.f(dwuyVar4.b);
                this.b.j(this.d.h);
                bvjj bvjjVar = this.d.c;
                bvjk bvjkVar = bvjk.jp;
                btlu btluVar = this.c;
                dwuy dwuyVar5 = dwuzVar2.b;
                if (dwuyVar5 == null) {
                    dwuyVar5 = dwuy.c;
                }
                bvjjVar.X(bvjkVar, btluVar, dwuyVar5.b.size());
                if (!this.d.g.c()) {
                    return;
                }
                String t = this.c.t();
                List<String> F = this.d.c.F(bvjk.js, dcdc.e());
                if (dbsj.d(t) || F.contains(t)) {
                    return;
                }
                bvjj bvjjVar2 = this.d.c;
                bvjk bvjkVar2 = bvjk.js;
                dccx F2 = dcdc.F();
                F2.i(F);
                F2.g(t);
                bvjjVar2.ah(bvjkVar2, F2.f());
                return;
            }
        }
        this.d.a(this.c);
        this.b.j(dcdc.e());
    }
}
