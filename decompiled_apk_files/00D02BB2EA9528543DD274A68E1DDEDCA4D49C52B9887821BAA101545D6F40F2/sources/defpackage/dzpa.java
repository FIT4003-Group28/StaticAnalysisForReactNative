package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dzpa  reason: default package */
/* loaded from: classes6.dex */
final class dzpa implements Map.Entry {
    int a;
    final /* synthetic */ dzpe b;

    public dzpa(dzpe dzpeVar, int i) {
        this.b = dzpeVar;
        this.a = i;
    }

    public final float a() {
        return this.b.b[this.a];
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.b.a[this.a];
        if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
            if (this.b.b[this.a] == ((Float) entry.getValue()).floatValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b.a[this.a];
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final /* bridge */ /* synthetic */ Object getValue() {
        return Float.valueOf(this.b.b[this.a]);
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.b.a[this.a];
        return (obj == null ? 0 : obj.hashCode()) ^ Float.floatToRawIntBits(this.b.b[this.a]);
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final /* bridge */ /* synthetic */ Object setValue(Object obj) {
        float floatValue = ((Float) obj).floatValue();
        float[] fArr = this.b.b;
        int i = this.a;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final String toString() {
        return this.b.a[this.a] + "=>" + this.b.b[this.a];
    }
}
