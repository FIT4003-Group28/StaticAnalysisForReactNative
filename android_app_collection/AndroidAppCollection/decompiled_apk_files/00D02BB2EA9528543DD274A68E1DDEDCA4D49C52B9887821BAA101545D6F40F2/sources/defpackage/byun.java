package defpackage;

import android.app.Application;
import android.os.Build;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: byun  reason: default package */
/* loaded from: classes4.dex */
public final class byun {
    private final btvo a;
    private final auhi b;
    private final bytc c;
    private final auhj d;
    private final bysw e;
    private final cqat f;
    private final bzle g;
    private final Application h;

    public byun(btvo btvoVar, bytc bytcVar, auhi auhiVar, auhj auhjVar, bysw byswVar, cqat cqatVar, bzle bzleVar, Application application) {
        this.a = btvoVar;
        this.c = bytcVar;
        this.b = auhiVar;
        this.d = auhjVar;
        this.e = byswVar;
        this.f = cqatVar;
        this.g = bzleVar;
        this.h = application;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public static djyo d(Bundle bundle) {
        return (djyo) bvrs.f(bundle, "EXTRA_SCHEMATIC_MAP_GROUP", (dssr) djyo.h.cu(7));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final boolean e(@dzsi djyo djyoVar) {
        return ((djyoVar.a & 4) == 0 || djyoVar.g.size() == 0) ? false : true;
    }

    public static Bundle f(djyo djyoVar) {
        Bundle bundle = new Bundle();
        bvrs.k(bundle, "EXTRA_SCHEMATIC_MAP_GROUP", djyoVar);
        return bundle;
    }

    public final boolean a() {
        if (Build.VERSION.SDK_INT >= 29) {
            return false;
        }
        if (!this.b.s(dpyv.TRANSIT_SCHEMATIC_MAP.dm)) {
            this.c.a(263);
            return false;
        }
        return this.a.getEnableFeatureParameters().aE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.bzjj r9, @defpackage.dzsi defpackage.djyo r10, defpackage.byua r11) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byun.b(bzjj, djyo, byua):void");
    }

    public final void c() {
        this.b.m(dpyv.TRANSIT_SCHEMATIC_MAP.dm);
    }
}
