package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ad  reason: default package */
/* loaded from: classes2.dex */
public final class ad {
    public static final Class[] e = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};
    final Map<String, Object> a;
    final Map<String, avo> b;
    public final Map<String, ac<?>> c;
    public final avo d;

    public ad() {
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new ab(this);
        this.a = new HashMap();
    }

    private final <T> z<T> c(String str, boolean z, T t) {
        ac<?> acVar;
        ac<?> acVar2 = this.c.get(str);
        if (acVar2 != null) {
            return acVar2;
        }
        if (this.a.containsKey(str)) {
            acVar = new ac<>(this, str, this.a.get(str));
        } else if (z) {
            acVar = new ac<>(this, str, t);
        } else {
            acVar = new ac<>(this, str);
        }
        this.c.put(str, acVar);
        return acVar;
    }

    public final <T> z<T> a(String str) {
        return c(str, false, null);
    }

    public final <T> z<T> b(String str, T t) {
        return c(str, true, t);
    }

    public ad(Map<String, Object> map) {
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new ab(this);
        this.a = new HashMap(map);
    }
}
