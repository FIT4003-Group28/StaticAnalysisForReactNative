package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ahop  reason: default package */
/* loaded from: classes2.dex */
public final class ahop extends ContentObserver {
    final /* synthetic */ Context a;
    final /* synthetic */ ahos b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahop(ahos ahosVar, Handler handler, Context context) {
        super(handler);
        this.b = ahosVar;
        this.a = context;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        onChange(z, null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, @dzsi Uri uri) {
        this.b.v = ahnz.a(this.a);
    }
}
