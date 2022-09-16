package defpackage;
/* compiled from: PG */
/* renamed from: jen  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jen implements zdt {
    public final /* synthetic */ jer a;
    private final /* synthetic */ int b;

    public /* synthetic */ jen(jer jerVar, int i) {
        this.b = i;
        this.a = jerVar;
    }

    @Override // defpackage.zdt
    public final void a(Object obj) {
        if (this.b == 0) {
            jer jerVar = this.a;
            ampq ampqVar = (ampq) obj;
            if (ampqVar == null || !ampqVar.h()) {
                return;
            }
            srv srvVar = jerVar.c;
            awnn awnnVar = ((aqmi) ampqVar.c()).h;
            if (awnnVar == null) {
                awnnVar = awnn.a;
            }
            srvVar.b(awnnVar, sru.a().a());
            return;
        }
        jer jerVar2 = this.a;
        ampq ampqVar2 = (ampq) obj;
        if (ampqVar2 == null || !ampqVar2.h()) {
            return;
        }
        jerVar2.d.d((awsq) ampqVar2.c(), tcs.a().a());
    }
}
