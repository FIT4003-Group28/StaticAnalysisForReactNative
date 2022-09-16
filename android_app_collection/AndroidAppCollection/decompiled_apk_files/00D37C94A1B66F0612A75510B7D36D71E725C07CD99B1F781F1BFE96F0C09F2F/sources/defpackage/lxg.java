package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lxg  reason: default package */
/* loaded from: classes3.dex */
public final class lxg extends ajwe {
    final /* synthetic */ lwm a;
    final /* synthetic */ ajzq b;
    final /* synthetic */ fhg c;
    final /* synthetic */ String d;
    final /* synthetic */ frv e;
    final /* synthetic */ acti f;

    public lxg(lwm lwmVar, ajzq ajzqVar, fhg fhgVar, String str, frv frvVar, acti actiVar) {
        this.a = lwmVar;
        this.b = ajzqVar;
        this.c = fhgVar;
        this.d = str;
        this.e = frvVar;
        this.f = actiVar;
    }

    @Override // defpackage.ajwe, defpackage.akae
    public final void c(aakw aakwVar, boolean z) {
        if (!z) {
            this.a.i();
            return;
        }
        fsg a = lxh.a(this.a, this.b, this.c);
        a.a = this.d;
        fsh a2 = a.a();
        if (!lxh.f(this.d)) {
            if (!this.a.l()) {
                return;
            }
            lxh.c(this.a.q(aakwVar), this.e, a2);
            return;
        }
        if (!lxh.d(aakwVar)) {
            this.a.g();
            this.e.i();
        }
        if (this.a.m()) {
            return;
        }
        lxh.c(this.a.k(aakwVar, this.b, this.f), this.e, a2);
    }
}
