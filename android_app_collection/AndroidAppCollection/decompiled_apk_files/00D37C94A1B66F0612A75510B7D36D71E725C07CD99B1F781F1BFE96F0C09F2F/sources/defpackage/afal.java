package defpackage;

import android.os.Looper;
import com.google.android.exoplayer2.Format;
import java.util.List;
/* compiled from: PG */
/* renamed from: afal  reason: default package */
/* loaded from: classes.dex */
public final class afal {
    public final afak a;
    public final afak b;

    public afal(axf axfVar, Looper looper, pnp pnpVar, pnj pnjVar, long j) {
        this.a = new afak(axfVar, looper, pnpVar, pnjVar, j);
        this.b = new afak(axfVar, looper, pnpVar, pnjVar, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long a(List list) {
        if (list.isEmpty()) {
            return 0L;
        }
        afak c = c((orl) list.get(0));
        long l = c.a.l();
        boolean z = c.d;
        for (int i = 1; i < ((amxx) list).c; i++) {
            afak c2 = c((orl) list.get(i));
            l = Math.min(l, c2.a.l());
            z &= c2.d;
        }
        if (!z) {
            return Math.max(0L, l);
        }
        return Long.MIN_VALUE;
    }

    public final prh b(orl orlVar, Format format) {
        afak afakVar = orlVar == orl.TRACK_TYPE_VIDEO ? this.b : this.a;
        afms.a(format);
        if (!format.equals(afakVar.b) || afakVar.a.n() == null) {
            afakVar.a.rx(format);
            afakVar.b = format;
        }
        return afakVar.a;
    }

    public final afak c(orl orlVar) {
        return orlVar == orl.TRACK_TYPE_VIDEO ? this.b : this.a;
    }
}
