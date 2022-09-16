package defpackage;

import android.media.MediaRouter2;
import java.util.List;
/* compiled from: PG */
/* renamed from: bfw  reason: default package */
/* loaded from: classes2.dex */
final class bfw extends MediaRouter2.RouteCallback {
    final /* synthetic */ bfy a;

    public bfw(bfy bfyVar) {
        this.a = bfyVar;
    }

    @Override // android.media.MediaRouter2.RouteCallback
    public final void onRoutesAdded(List list) {
        this.a.e();
    }

    @Override // android.media.MediaRouter2.RouteCallback
    public final void onRoutesChanged(List list) {
        this.a.e();
    }

    @Override // android.media.MediaRouter2.RouteCallback
    public final void onRoutesRemoved(List list) {
        this.a.e();
    }
}
