package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zij  reason: default package */
/* loaded from: classes4.dex */
public final class zij implements ankb {
    final /* synthetic */ zig a;
    final /* synthetic */ zik b;

    public zij(zik zikVar, zig zigVar) {
        this.b = zikVar;
        this.a = zigVar;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        zep.f(zik.a, "Failed to fetch CPID", th);
        this.b.c = null;
        zig zigVar = this.a;
        aopa aopaVar = zigVar.b;
        aopaVar.copyOnWrite();
        aqka aqkaVar = (aqka) aopaVar.instance;
        aqka aqkaVar2 = aqka.a;
        aqkaVar.c = 2;
        aqkaVar.b |= 8;
        aopaVar.copyOnWrite();
        aqka aqkaVar3 = (aqka) aopaVar.instance;
        aqkaVar3.b |= 64;
        aqkaVar3.e = -1;
        zigVar.a();
    }

    @Override // defpackage.ankb
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        zii ziiVar = (zii) obj;
        String str = zik.a;
        String.valueOf(String.valueOf(ziiVar)).length();
        this.b.c = ziiVar;
        zig zigVar = this.a;
        long j = ziiVar.a;
        aopa aopaVar = zigVar.b;
        aopaVar.copyOnWrite();
        aqka aqkaVar = (aqka) aopaVar.instance;
        aqka aqkaVar2 = aqka.a;
        aqkaVar.c = 1;
        aqkaVar.b |= 8;
        aopaVar.copyOnWrite();
        aqka aqkaVar3 = (aqka) aopaVar.instance;
        aqkaVar3.b |= 64;
        aqkaVar3.e = (int) j;
        zigVar.a();
    }
}
