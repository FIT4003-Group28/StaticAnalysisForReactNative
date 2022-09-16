package defpackage;
/* compiled from: PG */
/* renamed from: nso  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class nso implements ayqb {
    public final /* synthetic */ nsq a;
    private final /* synthetic */ int b;

    public /* synthetic */ nso(nsq nsqVar, int i) {
        this.b = i;
        this.a = nsqVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            nsq nsqVar = this.a;
            if (((Boolean) obj).booleanValue()) {
                nsqVar.d.a();
                return;
            } else {
                nsqVar.d.b();
                return;
            }
        }
        nsq nsqVar2 = this.a;
        nsp nspVar = nsp.NONE;
        int ordinal = ((nsp) obj).ordinal();
        if (ordinal == 1) {
            nsqVar2.b.a();
            nsqVar2.e.h(6);
        } else if (ordinal != 2) {
        } else {
            nsqVar2.e.m(6);
            nsqVar2.b.b();
        }
    }
}
