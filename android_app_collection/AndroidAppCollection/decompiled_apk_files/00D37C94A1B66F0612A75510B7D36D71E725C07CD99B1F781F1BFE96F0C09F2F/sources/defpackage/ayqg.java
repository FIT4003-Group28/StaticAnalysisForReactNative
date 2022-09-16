package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: ayqg  reason: default package */
/* loaded from: classes2.dex */
public final class ayqg extends AtomicReference implements aypg {
    private static final long serialVersionUID = 5718521705281392066L;

    public ayqg(ayqa ayqaVar) {
        super(ayqaVar);
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return get() == null;
    }

    @Override // defpackage.aypg
    public final void qr() {
        ayqa ayqaVar;
        if (get() == null || (ayqaVar = (ayqa) getAndSet(null)) == null) {
            return;
        }
        try {
            ayqaVar.a();
        } catch (Exception e) {
            bapv.j(e);
            azqc.d(e);
        }
    }
}
