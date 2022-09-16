package defpackage;
/* compiled from: PG */
/* renamed from: uaf  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class uaf implements anir {
    public final /* synthetic */ uam a;
    private final /* synthetic */ int b;

    public /* synthetic */ uaf(uam uamVar) {
        this.a = uamVar;
    }

    public /* synthetic */ uaf(uam uamVar, int i) {
        this.b = i;
        this.a = uamVar;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        if (this.b == 0) {
            aogp aogpVar = (aogp) obj;
            return this.a.b.a();
        }
        uam uamVar = this.a;
        uav uavVar = (uav) obj;
        if (uam.l(uavVar)) {
            return anlz.q(uavVar);
        }
        return uamVar.h();
    }
}
