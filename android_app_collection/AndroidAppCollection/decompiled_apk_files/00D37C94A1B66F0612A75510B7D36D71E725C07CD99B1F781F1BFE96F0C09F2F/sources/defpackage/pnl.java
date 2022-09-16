package defpackage;

import android.os.Looper;
import com.google.android.exoplayer2.Format;
/* compiled from: PG */
/* renamed from: pnl  reason: default package */
/* loaded from: classes4.dex */
final class pnl implements pnp {
    @Override // defpackage.pnp
    public final pne b(Looper looper, pnj pnjVar, Format format) {
        if (format.o == null) {
            return null;
        }
        return new pnt(new pnd(new poe(), 6001));
    }

    @Override // defpackage.pnp
    public final Class c(Format format) {
        if (format.o != null) {
            return pof.class;
        }
        return null;
    }

    @Override // defpackage.pnp
    public final /* synthetic */ pno g() {
        return pno.b;
    }
}
