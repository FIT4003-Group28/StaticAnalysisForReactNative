package defpackage;

import android.content.Intent;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: joo  reason: default package */
/* loaded from: classes7.dex */
public final class joo extends afhx {
    public final gga a;
    public final bvrb b;
    public final bvjj c;
    public final auhi d;
    private final dxio<joc> e;
    private final dxio<ahjq> i;
    private final btvo j;

    public joo(Intent intent, @dzsi String str, gga ggaVar, bvrb bvrbVar, auhi auhiVar, bvjj bvjjVar, dxio<joc> dxioVar, dxio<ahjq> dxioVar2, btvo btvoVar) {
        super(intent, str, afid.MADDEN);
        this.a = ggaVar;
        this.b = bvrbVar;
        this.d = auhiVar;
        this.c = bvjjVar;
        this.e = dxioVar;
        this.i = dxioVar2;
        this.j = btvoVar;
    }

    public static boolean d(auhi auhiVar, Intent intent) {
        Integer l = auhiVar.l(intent);
        return l != null && l.intValue() == dpyv.MADDEN_GROWTH.dm;
    }

    @Override // defpackage.afhx
    public final void a() {
        if (!this.j.getEnableFeatureParameters().aj || this.i.a().a() == null || "dining".equals(this.f.getStringExtra("landing_vertical"))) {
            this.b.b(new jom(this), bvrj.UI_THREAD);
            return;
        }
        String stringExtra = this.f.getStringExtra("landing_vertical");
        byte[] byteArrayExtra = this.f.getByteArrayExtra("user_stream");
        byte[] byteArrayExtra2 = this.f.getByteArrayExtra("notification_context");
        boolean d = d(this.d, this.f);
        gga ggaVar = this.e.a().a;
        jof jofVar = new jof();
        Bundle bundle = new Bundle();
        bundle.putString("initVertical", stringExtra);
        bundle.putBoolean("fromNotification", d);
        if (byteArrayExtra != null) {
            bundle.putByteArray("prioritizedUserStream", byteArrayExtra);
        }
        if (byteArrayExtra2 != null) {
            bundle.putByteArray("notificationContext", byteArrayExtra2);
        }
        jofVar.B(bundle);
        ggaVar.D(jofVar);
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_MADDEN;
    }
}
