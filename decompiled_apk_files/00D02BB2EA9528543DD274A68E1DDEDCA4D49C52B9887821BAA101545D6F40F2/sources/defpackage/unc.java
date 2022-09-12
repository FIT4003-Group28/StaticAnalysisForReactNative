package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: unc  reason: default package */
/* loaded from: classes7.dex */
public final class unc extends afhx {
    public static final String a = String.valueOf(unc.class.getName()).concat(".sr");
    public static final dbsl<afga> b = unb.a;
    private static final String c = "unc";
    private final dxio<ahwf> d;
    private final dxio<ahvo> e;

    public unc(Intent intent, @dzsi String str, dxio<ahwf> dxioVar, dxio<ahvo> dxioVar2) {
        super(intent, str, afid.SHARE_TRIP);
        this.d = dxioVar;
        this.e = dxioVar2;
    }

    @Override // defpackage.afhx
    public final void a() {
        this.f.getIntExtra(a, 0);
        if (this.e.a().e()) {
            this.e.a().d();
        } else {
            this.d.a().K(ahvk.TRANSIT_NAVIGATION);
        }
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_DIRECTIONS;
    }
}
