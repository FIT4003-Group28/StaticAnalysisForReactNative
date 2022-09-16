package defpackage;

import android.database.DataSetObserver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zqm  reason: default package */
/* loaded from: classes4.dex */
public final class zqm extends DataSetObserver {
    final /* synthetic */ zqq a;

    public zqm(zqq zqqVar) {
        this.a = zqqVar;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.a.B();
    }
}
