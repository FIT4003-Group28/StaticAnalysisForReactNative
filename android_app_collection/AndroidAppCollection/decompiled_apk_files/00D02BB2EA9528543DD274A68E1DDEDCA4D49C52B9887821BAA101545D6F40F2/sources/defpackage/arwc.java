package defpackage;

import com.spotify.protocol.types.ListItem;
/* compiled from: PG */
/* renamed from: arwc  reason: default package */
/* loaded from: classes2.dex */
final class arwc implements arwu {
    final /* synthetic */ arwp a;

    public arwc(arwp arwpVar) {
        this.a = arwpVar;
    }

    @Override // defpackage.arwu
    public final void a(dcdc<ListItem> dcdcVar) {
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            arwp arwpVar = this.a;
            arwpVar.f.add(new arwm(arwpVar, dcdcVar.get(i)));
        }
        arwp arwpVar2 = this.a;
        arwpVar2.a = false;
        cqkx.p(arwpVar2);
    }
}
