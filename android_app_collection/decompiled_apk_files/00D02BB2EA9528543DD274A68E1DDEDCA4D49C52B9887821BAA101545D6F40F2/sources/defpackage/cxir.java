package defpackage;

import android.database.ContentObserver;
/* compiled from: PG */
/* renamed from: cxir  reason: default package */
/* loaded from: classes.dex */
final class cxir extends ContentObserver {
    final /* synthetic */ cxis a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxir(cxis cxisVar) {
        super(null);
        this.a = cxisVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.b();
    }
}
