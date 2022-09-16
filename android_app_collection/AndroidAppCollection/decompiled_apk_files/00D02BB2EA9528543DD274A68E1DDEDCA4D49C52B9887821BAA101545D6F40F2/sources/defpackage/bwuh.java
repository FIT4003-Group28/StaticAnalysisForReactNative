package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: bwuh  reason: default package */
/* loaded from: classes.dex */
public final class bwuh extends afho {
    public static final dbsl<afga> a = bwug.a;
    private final dxio<bwsh> i;
    private final afhj j;

    public bwuh(Intent intent, @dzsi String str, gga ggaVar, afih afihVar, afhe afheVar, dxio<bwsh> dxioVar, eeu eeuVar, dxio<afwr> dxioVar2, afhj afhjVar) {
        super(intent, str, afid.STREET_VIEW_ACTION, ggaVar, eeuVar, afihVar, afheVar, dxioVar2);
        this.i = dxioVar;
        this.j = afhjVar;
    }

    @Override // defpackage.afho
    public final void e(afia afiaVar, String str) {
        this.j.a(afiaVar);
        this.i.a().o(dbsj.d(afiaVar.b) ? null : afiaVar.b, afiaVar.v, afiaVar.u, afiaVar.w);
    }
}
