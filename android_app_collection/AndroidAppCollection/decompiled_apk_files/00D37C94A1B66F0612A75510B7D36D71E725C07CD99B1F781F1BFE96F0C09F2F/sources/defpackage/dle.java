package defpackage;

import android.support.v7.widget.RecyclerView;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: dle  reason: default package */
/* loaded from: classes3.dex */
public final class dle {
    public dln a;
    public int b;
    private final Runnable c;

    public dle(byte[] bArr) {
        this.c = new dld(this);
        this.b = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
    }

    public final RecyclerView a() {
        dln dlnVar = this.a;
        if (dlnVar == null) {
            return null;
        }
        return dlnVar.l;
    }

    public final void b() {
        dln dlnVar = this.a;
        if (dlnVar == null || !dlnVar.b) {
            return;
        }
        if (czu.y()) {
            dlnVar.l(false);
            return;
        }
        dlnVar.removeCallbacks(this.c);
        dlnVar.post(this.c);
    }

    public dle() {
        this.c = new dld(this);
    }

    public final void c(int i, boolean z) {
        dln dlnVar = this.a;
        if (dlnVar == null) {
            return;
        }
        if (!z) {
            dlnVar.l.ab(i);
        } else {
            dlnVar.l.al(i);
        }
    }
}
