package com.google.android.apps.youtube.embeddedplayer.service.innertube;

import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class e extends aarb {
    public e(aaqf aaqfVar, afvn afvnVar, aopa aopaVar) {
        super(aaqfVar, afvnVar.c(), "embedded_player", aopaVar);
        i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        arrd arrdVar;
        arrc arrcVar;
        aopa aopaVar = (aopa) a();
        arra arraVar = (arra) aopaVar.instance;
        if (arraVar.c == 2) {
            arrdVar = (arrd) arraVar.d;
        } else {
            arrdVar = arrd.a;
        }
        boolean z = !arrdVar.c.isEmpty();
        arra arraVar2 = (arra) aopaVar.instance;
        if (arraVar2.c == 3) {
            arrcVar = (arrc) arraVar2.d;
        } else {
            arrcVar = arrc.a;
        }
        aqxo.y((!arrcVar.c.isEmpty()) ^ z);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        return akzj.f(a(), ((e) obj).a());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a()});
    }
}
