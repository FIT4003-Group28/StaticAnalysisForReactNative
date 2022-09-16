package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
/* compiled from: PG */
/* renamed from: bwey  reason: default package */
/* loaded from: classes4.dex */
public final class bwey extends bwdr<bwex> {
    public static final String aw = "bwey";
    public bwie ax;
    private bwid ay;

    @Override // defpackage.bwdr, defpackage.ex, defpackage.fd
    public final void Qi(Context context) {
        dxix.a(this);
        super.Qi(context);
    }

    @Override // defpackage.bwdr
    protected final boolean aK() {
        return this.am.getSharingParameters().c;
    }

    @Override // defpackage.bwdr
    @dzsi
    protected final Pair<bwhy, cqnm<bwhz>> aL() {
        return new Pair<>(this.ay, cqgr.fP(new bwgq(), cqkz.a(this.ay), new cqmp[0]));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bwdr
    @dzsi
    public final bwfs[] aN() {
        return ((bwex) this.at).e;
    }

    @Override // defpackage.bwdr
    public final Class<bwex> aO() {
        return bwex.class;
    }

    @Override // defpackage.bwdr, defpackage.ex, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        this.ay = this.ax.a();
    }
}
