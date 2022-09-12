package defpackage;

import java.util.AbstractMap;
import java.util.EnumSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: daul  reason: default package */
/* loaded from: classes5.dex */
public class daul extends AbstractMap<String, Object> implements Cloneable {
    Map<String, Object> c;
    public final daty d;

    public daul() {
        this(EnumSet.noneOf(dauk.class));
    }

    public void a(String str, Object obj) {
        dauh c = this.d.c(str);
        if (c != null) {
            c.f(this, obj);
            return;
        }
        if (this.d.b) {
            str = str.toLowerCase(Locale.US);
        }
        this.c.put(str, obj);
    }

    @Override // java.util.AbstractMap
    /* renamed from: d */
    public daul clone() {
        try {
            daul daulVar = (daul) super.clone();
            daub.e(this, daulVar);
            daulVar.c = (Map) daub.d(this.c);
            return daulVar;
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<String, Object>> entrySet() {
        return new dauj(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        dauh c = this.d.c(str);
        if (c != null) {
            return c.e(this);
        }
        if (this.d.b) {
            str = str.toLowerCase(Locale.US);
        }
        return this.c.get(str);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        String str = (String) obj;
        dauh c = this.d.c(str);
        if (c != null) {
            Object e = c.e(this);
            c.f(this, obj2);
            return e;
        }
        if (this.d.b) {
            str = str.toLowerCase(Locale.US);
        }
        return this.c.put(str, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends String, ?> map) {
        for (Map.Entry<? extends String, ?> entry : map.entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        if (this.d.c(str) == null) {
            if (this.d.b) {
                str = str.toLowerCase(Locale.US);
            }
            return this.c.remove(str);
        }
        throw new UnsupportedOperationException();
    }

    public daul(EnumSet<dauk> enumSet) {
        this.c = dats.a();
        this.d = daty.b(getClass(), enumSet.contains(dauk.a));
    }
}
