package defpackage;

import android.content.ServiceConnection;
/* compiled from: PG */
/* renamed from: bmpe  reason: default package */
/* loaded from: classes3.dex */
final class bmpe implements degu<bmpf> {
    final /* synthetic */ ServiceConnection a;
    final /* synthetic */ bmph b;

    public bmpe(bmph bmphVar, ServiceConnection serviceConnection) {
        this.b = bmphVar;
        this.a = serviceConnection;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        bmph.b(this.b.b, this.a);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi bmpf bmpfVar) {
        bmpf bmpfVar2 = bmpfVar;
        if (bmpfVar2 == null || !bmpfVar2.a().a()) {
            bmph.b(this.b.b, this.a);
        }
    }
}
