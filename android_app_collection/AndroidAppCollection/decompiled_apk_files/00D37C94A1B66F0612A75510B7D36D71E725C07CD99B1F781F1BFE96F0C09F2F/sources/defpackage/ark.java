package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.service.media.MediaBrowserService;
/* compiled from: PG */
/* renamed from: ark  reason: default package */
/* loaded from: classes2.dex */
final class ark extends arh {
    final /* synthetic */ arl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ark(arl arlVar, Context context) {
        super(arlVar, context);
        this.b = arlVar;
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result, Bundle bundle) {
        iz.c(bundle);
        arl arlVar = this.b;
        arlVar.f.d(new arj(str, new arn(result), bundle));
    }
}
