package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: bzgv  reason: default package */
/* loaded from: classes.dex */
public final class bzgv extends afhx {
    public static final String a = String.valueOf(bzgv.class.getSimpleName()).concat(".SCHEMATIC_MAP");
    public static final String b = String.valueOf(bzgv.class.getSimpleName()).concat(".PARAMS");
    public static final dbsl<afga> c = bzgu.a;
    private final dxio<qbt> d;

    public bzgv(Intent intent, @dzsi String str, dxio<qbt> dxioVar) {
        super(intent, str, afid.TRANSIT_SCHEMATIC_MAP);
        this.d = dxioVar;
    }

    @Override // defpackage.afhx
    public final void a() {
        djyo djyoVar = (djyo) bvrs.f(this.f.getBundleExtra(b), a, (dssr) djyo.h.cu(7));
        if (djyoVar != null) {
            this.d.a().F(djyoVar);
        }
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_TRANSIT_SCHEMATIC_MAP;
    }
}
