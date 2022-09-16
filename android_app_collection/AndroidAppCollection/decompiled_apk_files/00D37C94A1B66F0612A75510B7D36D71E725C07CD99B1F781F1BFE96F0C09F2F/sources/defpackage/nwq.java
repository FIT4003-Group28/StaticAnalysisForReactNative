package defpackage;

import android.graphics.Rect;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: PG */
/* renamed from: nwq  reason: default package */
/* loaded from: classes3.dex */
public abstract class nwq implements nxe {
    protected static final Rect u = new Rect();
    private final Set a = new CopyOnWriteArraySet();

    @Override // defpackage.nxe
    public ampq I() {
        return amon.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void J() {
        for (nxd nxdVar : this.a) {
            nxdVar.ph(this);
        }
    }

    @Override // defpackage.nxe
    public final void K(nxd nxdVar) {
        this.a.add(nxdVar);
    }

    @Override // defpackage.nxe
    public final void L(nxd nxdVar) {
        this.a.remove(nxdVar);
    }
}
