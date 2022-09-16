package defpackage;
/* compiled from: PG */
/* renamed from: ybj  reason: default package */
/* loaded from: classes4.dex */
final class ybj implements afzf {
    final /* synthetic */ ashp a;
    final /* synthetic */ ybo b;
    private final arrh c;

    public ybj(ybo yboVar, ashp ashpVar) {
        arrh arrhVar;
        this.b = yboVar;
        this.a = ashpVar;
        if ((ashpVar.b & 4096) != 0) {
            ybr ybrVar = new ybr();
            ybrVar.a = ashpVar.n;
            ybrVar.b = 3;
            arrhVar = ybrVar.b();
        } else {
            arrhVar = null;
        }
        this.c = arrhVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        this.b.e.dismiss();
        arrh arrhVar = this.c;
        if (arrhVar != null) {
            this.b.g.c(arrhVar);
        }
        this.b.d(cffVar);
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        ashn ashnVar = (ashn) obj;
        this.b.e.dismiss();
        awja b = yce.b(ashnVar);
        if (b != null) {
            if ((ashnVar.b & 16) != 0) {
                this.b.f.oi().D(new acte(ashnVar.g.I()));
            }
            CharSequence i = yic.i(b);
            arrh arrhVar = this.c;
            if (arrhVar != null) {
                this.b.g.c(arrhVar);
            }
            this.b.e(i);
            String str = ybo.a;
            String valueOf = String.valueOf(i);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 17 + String.valueOf(valueOf).length());
            sb.append("youtubePayment::");
            sb.append(str);
            sb.append(" ");
            sb.append(valueOf);
            afus.b(1, 11, sb.toString());
            String.valueOf(String.valueOf(i)).length();
            ybm ybmVar = this.b.k;
            if (ybmVar == null) {
                return;
            }
            ybmVar.f();
            return;
        }
        ycu ycuVar = this.b.n;
        if (ycuVar != null && (ashnVar.b & 8) != 0) {
            ashu ashuVar = ashnVar.e;
            if (ashuVar == null) {
                ashuVar = ashu.a;
            }
            CharSequence a = ycuVar.a(ashuVar);
            if (a != null) {
                this.b.f.oi().D(new acte(ashnVar.g.I()));
                String str2 = ybo.a;
                String valueOf2 = String.valueOf(a);
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 17 + String.valueOf(valueOf2).length());
                sb2.append("youtubePayment::");
                sb2.append(str2);
                sb2.append(" ");
                sb2.append(valueOf2);
                afus.b(1, 11, sb2.toString());
                String.valueOf(String.valueOf(a)).length();
                arrh arrhVar2 = this.c;
                if (arrhVar2 != null) {
                    this.b.g.c(arrhVar2);
                }
                this.b.e(a);
                return;
            }
        }
        ybm ybmVar2 = this.b.k;
        if (ybmVar2 != null) {
            ybmVar2.e(ashnVar);
        }
        if ((this.a.b & 4096) == 0) {
            return;
        }
        acrr acrrVar = this.b.g;
        ybr ybrVar = new ybr();
        ybrVar.a = this.a.n;
        acrrVar.c(ybrVar.f());
    }
}
