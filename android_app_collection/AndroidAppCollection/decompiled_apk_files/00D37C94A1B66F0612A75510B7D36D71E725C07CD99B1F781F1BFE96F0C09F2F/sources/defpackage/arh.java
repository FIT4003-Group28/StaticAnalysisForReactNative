package defpackage;

import android.content.Context;
import android.service.media.MediaBrowserService;
/* compiled from: PG */
/* renamed from: arh  reason: default package */
/* loaded from: classes2.dex */
class arh extends are {
    public arh(ari ariVar, Context context) {
        super(ariVar, context);
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadItem(String str, MediaBrowserService.Result result) {
        arx.c(new arg(str, new arn(result)));
    }
}
