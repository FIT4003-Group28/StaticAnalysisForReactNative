package defpackage;
/* compiled from: PG */
/* renamed from: lwc  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class lwc implements lxn {
    public final /* synthetic */ lwk a;
    private final /* synthetic */ int b;

    public /* synthetic */ lwc(lwk lwkVar, int i) {
        this.b = i;
        this.a = lwkVar;
    }

    @Override // defpackage.lxn
    public final void a() {
        if (this.b != 0) {
            lwk lwkVar = this.a;
            lwkVar.l();
            lwkVar.c = fsf.a;
            return;
        }
        lwk lwkVar2 = this.a;
        if (lwkVar2.i == null) {
            return;
        }
        lwkVar2.i = null;
        lwkVar2.c = fsf.c;
        lwkVar2.p();
    }
}
