package defpackage;

import com.spotify.protocol.types.ListItem;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: arwd  reason: default package */
/* loaded from: classes2.dex */
public final class arwd implements arwu {
    final /* synthetic */ arwp a;

    public arwd(arwp arwpVar) {
        this.a = arwpVar;
    }

    @Override // defpackage.arwu
    public final void a(dcdc<ListItem> dcdcVar) {
        if (!dcdcVar.isEmpty()) {
            arwp arwpVar = this.a;
            arwpVar.e = new arwm(arwpVar, dcdcVar.get(0));
        }
        cqkx.p(this.a);
    }
}
