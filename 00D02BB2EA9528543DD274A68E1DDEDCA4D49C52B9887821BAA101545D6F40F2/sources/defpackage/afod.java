package defpackage;

import android.content.Intent;
import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: afod  reason: default package */
/* loaded from: classes2.dex */
public final class afod implements afks {
    private final afms a;

    public afod(afms afmsVar) {
        this.a = afmsVar;
    }

    @Override // defpackage.afks
    public final durz b() {
        return durz.EIT_DIRECTIONS;
    }

    @Override // defpackage.afks
    public final Runnable a(@dzsi Intent intent, duqp duqpVar) {
        if ((duqpVar.a & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) == 0) {
            throw new afkt("No transit station response");
        }
        qdf o = qdg.o();
        durv durvVar = duqpVar.k;
        if (durvVar == null) {
            durvVar = durv.b;
        }
        dopk dopkVar = durvVar.a;
        if (dopkVar == null) {
            dopkVar = dopk.x;
        }
        ((qaw) o).f = dopkVar;
        return new afmr(this.a, o.h());
    }
}
