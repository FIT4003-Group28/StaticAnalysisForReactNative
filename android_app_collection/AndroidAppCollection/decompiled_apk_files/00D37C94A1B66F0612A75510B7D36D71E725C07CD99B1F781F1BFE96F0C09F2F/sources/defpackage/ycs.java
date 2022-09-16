package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: ycs  reason: default package */
/* loaded from: classes4.dex */
public final class ycs {
    public final Set a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap(4)));

    public final zdx a(ycr ycrVar) {
        Set set = this.a;
        ycrVar.getClass();
        set.add(ycrVar);
        return new ycq(this, ycrVar);
    }
}
