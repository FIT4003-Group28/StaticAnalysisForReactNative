package defpackage;
/* compiled from: PG */
/* renamed from: aur  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class aur implements pwe {
    public final /* synthetic */ auz a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    private final /* synthetic */ int e;

    public /* synthetic */ aur(auz auzVar, String str, long j, long j2) {
        this.a = auzVar;
        this.b = str;
        this.c = j;
        this.d = j2;
    }

    public /* synthetic */ aur(auz auzVar, String str, long j, long j2, int i) {
        this.e = i;
        this.a = auzVar;
        this.b = str;
        this.c = j;
        this.d = j2;
    }

    @Override // defpackage.pwe
    public final void a(Object obj) {
        if (this.e == 0) {
            auz auzVar = this.a;
            String str = this.b;
            long j = this.c;
            long j2 = this.d;
            ava avaVar = (ava) obj;
            avaVar.ah();
            avaVar.v(auzVar, str, j2, j);
            avaVar.H();
            return;
        }
        auz auzVar2 = this.a;
        String str2 = this.b;
        long j3 = this.c;
        long j4 = this.d;
        ava avaVar2 = (ava) obj;
        avaVar2.y();
        avaVar2.a(auzVar2, str2, j4, j3);
        avaVar2.H();
    }
}
