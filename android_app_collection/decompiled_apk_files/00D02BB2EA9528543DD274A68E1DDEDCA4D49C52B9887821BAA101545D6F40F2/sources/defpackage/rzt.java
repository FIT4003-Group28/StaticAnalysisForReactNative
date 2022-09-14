package defpackage;
/* compiled from: PG */
/* renamed from: rzt  reason: default package */
/* loaded from: classes7.dex */
public final class rzt implements degu<dspd> {
    final /* synthetic */ deig a;

    public rzt(deig deigVar) {
        this.a = deigVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.a.k(th);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi dspd dspdVar) {
        dspd dspdVar2 = dspdVar;
        if (dspdVar2 == null) {
            this.a.k(new NullPointerException());
        } else {
            this.a.j(dspdVar2);
        }
    }
}
