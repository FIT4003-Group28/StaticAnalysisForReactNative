package defpackage;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import java.util.List;
/* compiled from: PG */
/* renamed from: aqj  reason: default package */
/* loaded from: classes2.dex */
final class aqj extends MediaRouter2.RouteCallback {
    final /* synthetic */ aql a;

    public aqj(aql aqlVar) {
        this.a = aqlVar;
    }

    @Override // android.media.MediaRouter2.RouteCallback
    public final void onRoutesAdded(List<MediaRoute2Info> list) {
        this.a.e();
    }

    @Override // android.media.MediaRouter2.RouteCallback
    public final void onRoutesChanged(List<MediaRoute2Info> list) {
        this.a.e();
    }

    @Override // android.media.MediaRouter2.RouteCallback
    public final void onRoutesRemoved(List<MediaRoute2Info> list) {
        this.a.e();
    }
}
