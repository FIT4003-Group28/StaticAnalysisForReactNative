package defpackage;
/* compiled from: PG */
/* renamed from: aqgu  reason: default package */
/* loaded from: classes2.dex */
public final class aqgu extends aqam {
    public ckcw a;
    public btvo b;
    public dxio<aqgv> c;

    @Override // defpackage.cofi
    public final void a() {
        dkhl dkhlVar = this.b.getBusinessMessagingParameters().G;
        if (dkhlVar == null) {
            dkhlVar = dkhl.e;
        }
        if (!dkhlVar.c) {
            return;
        }
        ((ckcn) this.a.a(ckgs.g)).a();
        this.c.a().b();
    }

    @Override // android.app.Service
    public final void onCreate() {
        dxiq.b(this);
        super.onCreate();
    }
}
