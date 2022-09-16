package defpackage;
/* compiled from: PG */
/* renamed from: ttw  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class ttw implements anir {
    public final /* synthetic */ tuk a;
    public final /* synthetic */ tqv b;
    public final /* synthetic */ tqa c;
    public final /* synthetic */ tqm d;
    private final /* synthetic */ int e;

    public /* synthetic */ ttw(tuk tukVar, tqv tqvVar, tqa tqaVar, tqm tqmVar) {
        this.a = tukVar;
        this.b = tqvVar;
        this.c = tqaVar;
        this.d = tqmVar;
    }

    public /* synthetic */ ttw(tuk tukVar, tqv tqvVar, tqa tqaVar, tqm tqmVar, int i) {
        this.e = i;
        this.a = tukVar;
        this.b = tqvVar;
        this.c = tqaVar;
        this.d = tqmVar;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        if (this.e == 0) {
            tuk tukVar = this.a;
            tqv tqvVar = this.b;
            tqa tqaVar = this.c;
            tqm tqmVar = this.d;
            Void r8 = (Void) obj;
            return tukVar.j(tqvVar, tqaVar, tqmVar.r, tqmVar.s);
        }
        tuk tukVar2 = this.a;
        tqv tqvVar2 = this.b;
        tqa tqaVar2 = this.c;
        tqm tqmVar2 = this.d;
        Void r82 = (Void) obj;
        return tukVar2.j(tqvVar2, tqaVar2, tqmVar2.r, tqmVar2.s);
    }
}
