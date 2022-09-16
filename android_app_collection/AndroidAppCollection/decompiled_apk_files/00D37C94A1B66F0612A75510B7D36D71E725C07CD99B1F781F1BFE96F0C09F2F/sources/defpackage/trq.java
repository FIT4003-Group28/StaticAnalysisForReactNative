package defpackage;
/* compiled from: PG */
/* renamed from: trq  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class trq implements anir {
    public final /* synthetic */ tru a;
    public final /* synthetic */ boolean b;
    private final /* synthetic */ int c;

    public /* synthetic */ trq(tru truVar, boolean z) {
        this.a = truVar;
        this.b = z;
    }

    public /* synthetic */ trq(tru truVar, boolean z, int i) {
        this.c = i;
        this.a = truVar;
        this.b = z;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        if (this.c == 0) {
            tru truVar = this.a;
            Void r3 = (Void) obj;
            return truVar.d.b(this.b);
        }
        tru truVar2 = this.a;
        Void r32 = (Void) obj;
        return truVar2.d.b(this.b);
    }
}
