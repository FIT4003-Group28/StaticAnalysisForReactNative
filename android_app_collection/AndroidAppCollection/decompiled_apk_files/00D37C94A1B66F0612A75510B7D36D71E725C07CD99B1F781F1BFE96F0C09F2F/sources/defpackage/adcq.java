package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: adcq  reason: default package */
/* loaded from: classes.dex */
public final class adcq implements adbb {
    final /* synthetic */ String a;
    final /* synthetic */ arfn b;
    final /* synthetic */ apzg c;
    final /* synthetic */ adct d;
    final /* synthetic */ adcr e;

    public adcq(adcr adcrVar, String str, arfn arfnVar, apzg apzgVar, adct adctVar) {
        this.e = adcrVar;
        this.a = str;
        this.b = arfnVar;
        this.c = apzgVar;
        this.d = adctVar;
    }

    @Override // defpackage.adbb
    public final void a(final adid adidVar) {
        String str = adidVar.p() == null ? "" : adidVar.p().c;
        int i = adcr.g;
        String.format("onDialScreenFound endpointId=%s name=%s id=%s", this.a, adidVar.d, str);
        if (str.equals(this.a)) {
            this.e.b.f(this);
            adci adciVar = this.e.d;
            ankt b = ((vne) adciVar.a.get()).b(new wdx(this.b.b, 13), adciVar.c);
            final apzg apzgVar = this.c;
            final adct adctVar = this.d;
            ylx.i(b, new ylw() { // from class: adco
                @Override // defpackage.ylw, defpackage.zdt
                public final void a(Object obj) {
                    final adcq adcqVar = adcq.this;
                    final adid adidVar2 = adidVar;
                    final apzg apzgVar2 = apzgVar;
                    final adct adctVar2 = adctVar;
                    Void r6 = (Void) obj;
                    adcqVar.e.c.execute(new Runnable() { // from class: adcp
                        @Override // java.lang.Runnable
                        public final void run() {
                            adcq adcqVar2 = adcq.this;
                            adcqVar2.e.a.c(adidVar2, apzgVar2, adctVar2);
                        }
                    });
                }
            });
            this.e.f = null;
        }
    }

    @Override // defpackage.adbb
    public final void b() {
        int i = adcr.g;
        this.e.b.f(this);
        this.e.d.c();
        this.e.e.b(this.b.b, 5);
        this.e.f = null;
    }
}
