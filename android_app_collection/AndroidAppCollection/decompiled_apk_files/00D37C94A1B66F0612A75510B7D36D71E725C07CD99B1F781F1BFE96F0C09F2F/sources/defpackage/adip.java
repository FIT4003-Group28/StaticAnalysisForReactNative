package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: adip  reason: default package */
/* loaded from: classes.dex */
public final class adip implements Iterable {
    public static final adip a = new adip(Collections.emptyMap());
    public final Map b;

    public adip() {
        this(new HashMap());
    }

    public final void a(String str, String str2) {
        this.b.put(str, str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof adip)) {
            return false;
        }
        return this.b.equals(((adip) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new adin(this);
    }

    public final String toString() {
        return TextUtils.join(", ", this);
    }

    public adip(Map map) {
        this.b = new HashMap(map);
    }
}
