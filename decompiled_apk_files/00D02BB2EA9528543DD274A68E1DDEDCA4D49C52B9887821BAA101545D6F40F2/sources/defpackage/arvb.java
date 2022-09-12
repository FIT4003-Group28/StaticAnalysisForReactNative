package defpackage;

import android.support.v4.media.MediaBrowserCompat$MediaItem;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: arvb  reason: default package */
/* loaded from: classes2.dex */
public final class arvb implements arvj {
    final /* synthetic */ arvh a;

    public arvb(arvh arvhVar) {
        this.a = arvhVar;
    }

    @Override // defpackage.arvj
    public final void a(dcdc<MediaBrowserCompat$MediaItem> dcdcVar) {
        if (!dcdcVar.isEmpty()) {
            arvh arvhVar = this.a;
            arvhVar.g = new arvf(arvhVar, dcdcVar.get(0), false);
            cqkx.p(this.a);
        }
    }
}
