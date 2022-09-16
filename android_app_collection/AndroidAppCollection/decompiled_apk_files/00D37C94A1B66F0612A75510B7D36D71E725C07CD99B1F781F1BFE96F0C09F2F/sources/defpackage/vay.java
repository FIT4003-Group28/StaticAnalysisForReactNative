package defpackage;

import android.database.ContentObserver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: vay  reason: default package */
/* loaded from: classes4.dex */
public final class vay extends ContentObserver {
    final /* synthetic */ vaz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vay(vaz vazVar) {
        super(null);
        this.a = vazVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.e();
    }
}
