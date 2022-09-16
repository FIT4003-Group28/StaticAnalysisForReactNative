package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fuv  reason: default package */
/* loaded from: classes3.dex */
public final class fuv implements akev {
    private final acti a;
    private final snc b;
    private final aafo c;
    private final akev d;
    private final atds e;
    private long f = 0;

    public fuv(aafo aafoVar, snc sncVar, atds atdsVar, acti actiVar, akev akevVar) {
        this.c = aafoVar;
        this.b = sncVar;
        this.e = atdsVar;
        this.a = actiVar;
        this.d = akevVar;
    }

    private final void c(atdr atdrVar) {
        if (atdrVar != null) {
            apoj apojVar = atdrVar.c;
            if (apojVar == null) {
                apojVar = apoj.a;
            }
            if ((apojVar.b & 1048576) == 0) {
                return;
            }
            acti actiVar = this.a;
            apoj apojVar2 = atdrVar.c;
            if (apojVar2 == null) {
                apojVar2 = apoj.a;
            }
            actiVar.u(new acte(apojVar2.t), null);
        }
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void le(Object obj, int i) {
        this.d.le((akff) obj, i);
        if (this.f == 0) {
            return;
        }
        long c = this.b.c();
        long j = this.f;
        atds atdsVar = this.e;
        if (c - j >= atdsVar.o && (atdsVar.b & 8192) != 0) {
            aafo aafoVar = this.c;
            apzg apzgVar = atdsVar.n;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, null);
        }
        this.f = 0L;
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void lf(Object obj) {
        this.d.lf((akff) obj);
        aafo aafoVar = this.c;
        atds atdsVar = this.e;
        aafx.c(aafoVar, atdsVar.j, atdsVar);
        this.a.u(new acte(this.e.i), null);
        this.f = this.b.c();
        atdr atdrVar = this.e.f;
        if (atdrVar == null) {
            atdrVar = atdr.a;
        }
        c(atdrVar);
        atdr atdrVar2 = this.e.g;
        if (atdrVar2 == null) {
            atdrVar2 = atdr.a;
        }
        c(atdrVar2);
    }
}
