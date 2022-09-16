package defpackage;

import android.support.v4.media.MediaBrowserCompat$MediaItem;
/* compiled from: PG */
/* renamed from: aruz  reason: default package */
/* loaded from: classes2.dex */
final class aruz implements arvj {
    final dccx<arye> a = dcdc.F();
    final /* synthetic */ arvh b;

    public aruz(arvh arvhVar) {
        this.b = arvhVar;
    }

    @Override // defpackage.arvj
    public final void a(dcdc<MediaBrowserCompat$MediaItem> dcdcVar) {
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            this.a.g(new arvf(this.b, dcdcVar.get(i), true));
        }
        this.b.a = this.a.f();
        arvh arvhVar = this.b;
        arvhVar.b = false;
        cqkx.p(arvhVar);
    }
}
