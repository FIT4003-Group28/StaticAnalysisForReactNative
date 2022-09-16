package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: awpn  reason: default package */
/* loaded from: classes.dex */
public final class awpn extends afhx {
    public static final dbsl<afga> a = awpm.a;
    private final btvo b;
    private final dxio<awps> c;

    public awpn(Intent intent, @dzsi String str, btvo btvoVar, dxio<awps> dxioVar) {
        super(intent, str, afid.PARKING_PAYMENT);
        this.b = btvoVar;
        this.c = dxioVar;
    }

    @Override // defpackage.afhx
    public final void a() {
        awps a2 = this.c.a();
        if (awpl.a(this.b)) {
            a2.f();
        }
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_PARKING_PAYMENT;
    }
}
