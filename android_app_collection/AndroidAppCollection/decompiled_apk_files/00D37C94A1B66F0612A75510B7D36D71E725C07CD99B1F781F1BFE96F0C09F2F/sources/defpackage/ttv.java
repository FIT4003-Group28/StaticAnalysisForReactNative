package defpackage;
/* compiled from: PG */
/* renamed from: ttv  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class ttv implements anir {
    public final /* synthetic */ tuk a;
    public final /* synthetic */ tqv b;
    private final /* synthetic */ int c;

    public /* synthetic */ ttv(tuk tukVar, tqv tqvVar) {
        this.a = tukVar;
        this.b = tqvVar;
    }

    public /* synthetic */ ttv(tuk tukVar, tqv tqvVar, int i) {
        this.c = i;
        this.a = tukVar;
        this.b = tqvVar;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        int i = this.c;
        if (i == 0) {
            tuk tukVar = this.a;
            tqv tqvVar = this.b;
            if (((tqm) obj) == null) {
                return anlz.q(null);
            }
            String str = tqvVar.c;
            String str2 = tqvVar.d;
            int i2 = typ.a;
            tukVar.b.g(1049);
            return anii.h(tukVar.d.i(tqvVar), new ttr(tukVar, 1), tukVar.h);
        } else if (i == 1) {
            tuk tukVar2 = this.a;
            tqv tqvVar2 = this.b;
            tqm tqmVar = (tqm) obj;
            String str3 = tqvVar2.c;
            int i3 = typ.a;
            tuk.u(1018, tukVar2.b, tqmVar);
            return amnt.f(tukVar2.l(tqmVar, 0, tqmVar.n.size()), new tts(tukVar2, tqvVar2, tqmVar, 6), tukVar2.h);
        } else {
            tuk tukVar3 = this.a;
            tqv tqvVar3 = this.b;
            tqm tqmVar2 = (tqm) obj;
            if (tqmVar2 == null) {
                return anlz.q(null);
            }
            return tukVar3.n(tqvVar3, tqmVar2);
        }
    }
}
