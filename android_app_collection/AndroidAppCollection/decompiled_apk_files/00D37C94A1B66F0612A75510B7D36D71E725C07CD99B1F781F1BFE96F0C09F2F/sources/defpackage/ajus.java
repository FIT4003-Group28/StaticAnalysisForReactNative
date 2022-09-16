package defpackage;

import android.database.DataSetObserver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ajus  reason: default package */
/* loaded from: classes.dex */
public final class ajus extends DataSetObserver {
    final /* synthetic */ ajut a;

    public ajus(ajut ajutVar) {
        this.a = ajutVar;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        ajut ajutVar = this.a;
        atui a = ajutVar.e.a();
        if (a == null) {
            ajutVar.b();
            return;
        }
        for (apzg apzgVar : a.h) {
            ajuw.a(apzgVar, ajutVar);
        }
        ajutVar.d(!a.f);
    }
}
