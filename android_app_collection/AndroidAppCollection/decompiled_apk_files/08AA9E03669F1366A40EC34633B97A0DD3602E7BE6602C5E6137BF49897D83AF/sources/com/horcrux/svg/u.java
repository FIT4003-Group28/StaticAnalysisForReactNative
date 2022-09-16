package com.horcrux.svg;
/* compiled from: PaintCompat.java */
/* loaded from: classes.dex */
class u<F, S> {

    /* renamed from: a  reason: collision with root package name */
    final F f4915a;

    /* renamed from: b  reason: collision with root package name */
    final S f4916b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(F f, S s) {
        this.f4915a = f;
        this.f4916b = s;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return a(uVar.f4915a, this.f4915a) && a(uVar.f4916b, this.f4916b);
    }

    private static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public int hashCode() {
        int i = 0;
        int hashCode = this.f4915a == null ? 0 : this.f4915a.hashCode();
        if (this.f4916b != null) {
            i = this.f4916b.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.f4915a) + " " + String.valueOf(this.f4916b) + "}";
    }
}
