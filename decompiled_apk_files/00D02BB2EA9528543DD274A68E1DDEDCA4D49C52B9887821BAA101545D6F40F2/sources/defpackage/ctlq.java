package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: ctlq  reason: default package */
/* loaded from: classes5.dex */
public final class ctlq {
    private static ctlq a;
    private final Map<Uri, Set<ContentObserver>> b = new HashMap();

    public static synchronized ctlq a() {
        ctlq ctlqVar;
        synchronized (ctlq.class) {
            if (a == null) {
                a = new ctlq();
            }
            ctlqVar = a;
        }
        return ctlqVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b(Uri uri, ContentObserver contentObserver) {
        Set<ContentObserver> set;
        if (!this.b.containsKey(uri)) {
            set = Collections.newSetFromMap(new WeakHashMap());
            this.b.put(uri, set);
        } else {
            set = this.b.get(uri);
        }
        set.add(contentObserver);
    }

    public final synchronized void c(Uri uri) {
        if (!this.b.containsKey(uri)) {
            return;
        }
        for (ContentObserver contentObserver : this.b.get(uri)) {
            contentObserver.dispatchChange(false, uri);
        }
    }
}
