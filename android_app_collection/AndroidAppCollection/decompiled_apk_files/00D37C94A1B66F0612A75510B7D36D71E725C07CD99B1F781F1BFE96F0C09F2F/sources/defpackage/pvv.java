package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: pvv  reason: default package */
/* loaded from: classes4.dex */
public final class pvv implements Iterable {
    public final Object a = new Object();
    public final Map b = new HashMap();
    public Set c = Collections.emptySet();
    public List d = Collections.emptyList();

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.a) {
            it = this.d.iterator();
        }
        return it;
    }
}
