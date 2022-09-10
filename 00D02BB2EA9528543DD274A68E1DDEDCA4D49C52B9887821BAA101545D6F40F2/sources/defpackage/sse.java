package defpackage;
/* compiled from: PG */
/* renamed from: sse  reason: default package */
/* loaded from: classes7.dex */
final class sse implements btzi<djyy, djza> {
    final /* synthetic */ ssf a;
    private final degu<dopk> b;

    public sse(ssf ssfVar, degu<dopk> deguVar) {
        this.a = ssfVar;
        this.b = deguVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<djyy> btzrVar, btzy btzyVar) {
        bvrj.UI_THREAD.c();
        if (!btzyVar.equals(btzy.d)) {
            try {
                bttq bttqVar = btzyVar.p;
                this.b.a(new Throwable());
            } finally {
                this.a.c = null;
            }
        }
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<djyy> btzrVar, djza djzaVar) {
        degu<dopk> deguVar;
        Throwable qdrVar;
        djza djzaVar2 = djzaVar;
        bvrj.UI_THREAD.c();
        try {
            int a = doqd.a(djzaVar2.c);
            if (a != 0 && a == 1) {
                degu<dopk> deguVar2 = this.b;
                dopk dopkVar = djzaVar2.b;
                if (dopkVar == null) {
                    dopkVar = dopk.x;
                }
                deguVar2.b(dopkVar);
            }
            int a2 = doqd.a(djzaVar2.c);
            if (a2 != 0 && a2 == 6) {
                deguVar = this.b;
                qdrVar = new qdr();
                deguVar.a(qdrVar);
            }
            int i = djzaVar2.c;
            deguVar = this.b;
            qdrVar = new Throwable();
            deguVar.a(qdrVar);
        } finally {
            this.a.c = null;
        }
    }
}
