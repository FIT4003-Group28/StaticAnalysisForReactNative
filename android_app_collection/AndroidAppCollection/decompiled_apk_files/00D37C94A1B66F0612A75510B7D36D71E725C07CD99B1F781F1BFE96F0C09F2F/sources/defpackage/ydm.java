package defpackage;
/* compiled from: PG */
/* renamed from: ydm  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class ydm implements zdt {
    public final /* synthetic */ ycz a;
    private final /* synthetic */ int b;

    public /* synthetic */ ydm(ycz yczVar) {
        this.a = yczVar;
    }

    public /* synthetic */ ydm(ycz yczVar, int i) {
        this.b = i;
        this.a = yczVar;
    }

    @Override // defpackage.zdt
    public final void a(Object obj) {
        if (this.b == 0) {
            ycz yczVar = this.a;
            int i = ydo.c;
            final yda ydaVar = yczVar.b;
            apzg apzgVar = yczVar.a;
            abeq abeqVar = ydaVar.b;
            abep abepVar = new abep(abeqVar.e, abeqVar.a.c());
            abepVar.a = ((ardm) apzgVar.qm(ardm.b)).c;
            abepVar.j(apzgVar.c);
            abepVar.b = aoob.x((byte[]) obj);
            abeq abeqVar2 = ydaVar.b;
            ylx.k(abeqVar2.b.b(abepVar, ydaVar.e), ydaVar.e, new ylv() { // from class: ycx
                @Override // defpackage.zdt
                /* renamed from: b */
                public final void a(Throwable th) {
                    yda ydaVar2 = yda.this;
                    ydaVar2.d.dismiss();
                    ydaVar2.c.e(th);
                }
            }, new ylw() { // from class: ycy
                @Override // defpackage.ylw, defpackage.zdt
                public final void a(Object obj2) {
                    yda ydaVar2 = yda.this;
                    artn artnVar = (artn) obj2;
                    ydaVar2.d.dismiss();
                    if ((artnVar.b & 2) != 0) {
                        aafo aafoVar = ydaVar2.a;
                        apzg apzgVar2 = artnVar.d;
                        if (apzgVar2 == null) {
                            apzgVar2 = apzg.a;
                        }
                        aafoVar.a(apzgVar2);
                    }
                }
            });
            return;
        }
        int i2 = ydo.c;
        this.a.a((Throwable) obj);
    }
}
