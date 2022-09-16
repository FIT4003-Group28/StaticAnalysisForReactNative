package defpackage;
/* compiled from: PG */
/* renamed from: gso  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gso implements ylw {
    public final /* synthetic */ gsp a;
    public final /* synthetic */ String b;
    public final /* synthetic */ aspb c;
    private final /* synthetic */ int d;

    public /* synthetic */ gso(gsp gspVar, String str, aspb aspbVar) {
        this.a = gspVar;
        this.b = str;
        this.c = aspbVar;
    }

    public /* synthetic */ gso(gsp gspVar, String str, aspb aspbVar, int i) {
        this.d = i;
        this.a = gspVar;
        this.b = str;
        this.c = aspbVar;
    }

    @Override // defpackage.ylw, defpackage.zdt
    public final void a(Object obj) {
        int i = this.d;
        if (i == 0) {
            arvl arvlVar = (arvl) obj;
            this.a.a(this.b, this.c);
        } else if (i == 1) {
            arvj arvjVar = (arvj) obj;
            this.a.a(this.b, this.c);
        } else {
            arvn arvnVar = (arvn) obj;
            this.a.a(this.b, this.c);
        }
    }
}
