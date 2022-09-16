package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zfg  reason: default package */
/* loaded from: classes4.dex */
public final class zfg extends WeakReference implements Map.Entry {
    public final int a;
    public final boolean b;
    public Object c;
    public zfg d;

    public zfg(Object obj, Object obj2, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        int i = 0;
        boolean z = obj == null;
        this.b = z;
        this.a = !z ? zfi.a(obj) : i;
        this.c = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = super.get();
        if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
            Object obj3 = this.c;
            if (obj3 == null) {
                if (entry.getValue() == null) {
                    return true;
                }
            } else if (obj3.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return super.get();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int i = this.a;
        Object obj = this.c;
        return i + (obj == null ? 0 : obj.hashCode());
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.c;
        this.c = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(super.get());
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
