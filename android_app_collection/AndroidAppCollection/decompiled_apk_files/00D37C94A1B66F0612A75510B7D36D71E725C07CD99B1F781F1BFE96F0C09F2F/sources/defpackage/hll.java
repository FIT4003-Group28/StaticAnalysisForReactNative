package defpackage;
/* compiled from: PG */
/* renamed from: hll  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class hll implements zub {
    public final /* synthetic */ hlp a;
    private final /* synthetic */ int b;

    public /* synthetic */ hll(hlp hlpVar, int i) {
        this.b = i;
        this.a = hlpVar;
    }

    @Override // defpackage.zdt
    public final void a(Object obj) {
        if (this.b == 0) {
            hlp hlpVar = this.a;
            hlpVar.t = ((Boolean) obj).booleanValue();
            hlpVar.c();
            return;
        }
        hlp hlpVar2 = this.a;
        hlpVar2.s = ((Boolean) obj).booleanValue();
        hlpVar2.c();
    }
}
