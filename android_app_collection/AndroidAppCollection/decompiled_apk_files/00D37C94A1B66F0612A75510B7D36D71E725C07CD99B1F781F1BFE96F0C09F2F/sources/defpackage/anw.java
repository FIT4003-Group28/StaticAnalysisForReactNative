package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: anw  reason: default package */
/* loaded from: classes.dex */
public final class anw extends ContentObserver {
    final /* synthetic */ any a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anw(any anyVar, Handler handler) {
        super(handler);
        this.a = anyVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.a.a();
    }
}
