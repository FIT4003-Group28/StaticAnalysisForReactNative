package defpackage;

import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: augb  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class augb implements dbrn {
    static final dbrn a = new augb();

    private augb() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        augf augfVar = (augf) obj;
        return augfVar != null ? augfVar.d().a : new Intent();
    }
}
