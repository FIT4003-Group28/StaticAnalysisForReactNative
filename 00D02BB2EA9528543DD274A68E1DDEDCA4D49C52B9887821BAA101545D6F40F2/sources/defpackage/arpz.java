package defpackage;

import android.content.Intent;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: arpz  reason: default package */
/* loaded from: classes.dex */
public final class arpz extends afhx {
    public static final dbsl<afga> a = arpy.a;
    private final ascb b;
    private final asim c;
    private final asik d;
    private final ckcw e;

    public arpz(Intent intent, @dzsi String str, ascb ascbVar, asim asimVar, asik asikVar, ckcw ckcwVar) {
        super(intent, str, afid.RESUME_NAVIGATION);
        this.b = ascbVar;
        this.c = asimVar;
        this.d = asikVar;
        this.e = ckcwVar;
    }

    @Override // defpackage.afhx
    public final void a() {
        amte amteVar;
        Bundle bundle = (Bundle) this.f.getParcelableExtra("ResumeNavigationIntent_DIRECTIONS_STORAGE_ITEM");
        if (bundle == null || (amteVar = (amte) bundle.getSerializable("ResumeNavigationIntent_DIRECTIONS_STORAGE_ITEM")) == null) {
            return;
        }
        int intExtra = this.f.getIntExtra("ResumeNavigationIntent_TRIP_INDEX", 0);
        if (this.d.a()) {
            this.c.i(amteVar, intExtra);
            ((ckco) this.e.a(ckee.x)).a(asij.a(1));
            return;
        }
        this.b.a(amteVar, intExtra, asca.RESUME_INTENT, false);
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_NAVIGATION;
    }
}
