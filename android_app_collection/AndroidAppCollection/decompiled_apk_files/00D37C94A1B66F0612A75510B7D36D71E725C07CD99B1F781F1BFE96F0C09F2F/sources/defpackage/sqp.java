package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
/* compiled from: PG */
/* renamed from: sqp  reason: default package */
/* loaded from: classes4.dex */
public final class sqp extends ContentObserver {
    final /* synthetic */ sqq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sqp(sqq sqqVar, Handler handler) {
        super(handler);
        this.a = sqqVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.a.b();
    }
}
