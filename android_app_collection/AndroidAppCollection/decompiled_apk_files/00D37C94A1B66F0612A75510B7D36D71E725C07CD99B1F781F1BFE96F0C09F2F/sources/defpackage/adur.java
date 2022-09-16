package defpackage;
/* compiled from: PG */
/* renamed from: adur  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class adur implements zdt {
    public final /* synthetic */ aduv a;
    public final /* synthetic */ String b;
    private final /* synthetic */ int c;

    public /* synthetic */ adur(aduv aduvVar, String str) {
        this.a = aduvVar;
        this.b = str;
    }

    public /* synthetic */ adur(aduv aduvVar, String str, int i) {
        this.c = i;
        this.a = aduvVar;
        this.b = str;
    }

    @Override // defpackage.zdt
    public final void a(Object obj) {
        if (this.c == 0) {
            aduv aduvVar = this.a;
            String str = this.b;
            zep.f(aduv.a, "Error while setting up account cookies", (Throwable) obj);
            aduvVar.d(str);
            return;
        }
        this.a.d(this.b);
    }
}
