package defpackage;

import android.support.v4.media.MediaBrowserCompat$MediaItem;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: arvk  reason: default package */
/* loaded from: classes2.dex */
public final class arvk extends lp {
    final /* synthetic */ arvl d;

    public arvk(arvl arvlVar) {
        this.d = arvlVar;
        arvlVar.e.addAndGet(1);
    }

    @Override // defpackage.lp
    public final void a(List<MediaBrowserCompat$MediaItem> list) {
        synchronized (this.d) {
            if (this.d.d.size() < this.d.c) {
                for (MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem : list) {
                    int i = mediaBrowserCompat$MediaItem.a;
                    if ((i & 2) != 0) {
                        this.d.d.add(mediaBrowserCompat$MediaItem);
                    } else if ((i & 1) != 0 && mediaBrowserCompat$MediaItem.b() != null) {
                        lq lqVar = this.d.a;
                        String b = mediaBrowserCompat$MediaItem.b();
                        dbsk.s(b);
                        lqVar.a(b, new arvk(this.d));
                    }
                }
            }
            if (this.d.e.decrementAndGet() == 0) {
                arvl arvlVar = this.d;
                arvlVar.b.a(dcdc.r(arvlVar.d));
            }
        }
    }

    @Override // defpackage.lp
    public final void b() {
        synchronized (this.d) {
            if (this.d.e.decrementAndGet() == 0) {
                arvl arvlVar = this.d;
                arvlVar.b.a(dcdc.r(arvlVar.d));
            }
        }
    }
}
