package defpackage;

import android.support.v4.media.MediaBrowserCompat$MediaItem;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: arvl  reason: default package */
/* loaded from: classes2.dex */
public final class arvl {
    public final lq a;
    public final arvj b;
    public final int c;
    public final List<MediaBrowserCompat$MediaItem> d = new ArrayList();
    public final AtomicInteger e = new AtomicInteger(0);

    private arvl(lq lqVar, arvj arvjVar, int i) {
        this.a = lqVar;
        this.b = arvjVar;
        this.c = i;
    }

    public static void a(lq lqVar, arvj arvjVar, int i) {
        arvl arvlVar = new arvl(lqVar, arvjVar, i);
        lq lqVar2 = arvlVar.a;
        lqVar2.a(lqVar2.a.e(), new arvk(arvlVar));
    }
}
