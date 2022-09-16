package defpackage;
/* compiled from: PG */
/* renamed from: zig  reason: default package */
/* loaded from: classes4.dex */
final class zig {
    final /* synthetic */ zih a;
    public final aopa b;
    private final long c;
    private boolean d = false;

    public zig(zih zihVar, String str) {
        this.a = zihVar;
        this.c = zihVar.a.d();
        aopa createBuilder = aqka.a.createBuilder();
        int a = zih.a(str);
        createBuilder.copyOnWrite();
        aqka aqkaVar = (aqka) createBuilder.instance;
        aqkaVar.b |= 128;
        aqkaVar.f = a;
        int b = zih.b(str);
        createBuilder.copyOnWrite();
        aqka aqkaVar2 = (aqka) createBuilder.instance;
        aqkaVar2.b |= 256;
        aqkaVar2.g = b;
        this.b = createBuilder;
    }

    public final void a() {
        aqxo.y(!this.d);
        acrr acrrVar = this.a.b;
        arrf a = arrh.a();
        aopa aopaVar = this.b;
        long d = this.a.a.d();
        long j = this.c;
        aopaVar.copyOnWrite();
        aqka aqkaVar = (aqka) aopaVar.instance;
        aqka aqkaVar2 = aqka.a;
        aqkaVar.b |= 32;
        aqkaVar.d = (int) (d - j);
        a.copyOnWrite();
        ((arrh) a.instance).ck((aqka) aopaVar.mo39build());
        acrrVar.c((arrh) a.mo39build());
        this.d = true;
    }
}
