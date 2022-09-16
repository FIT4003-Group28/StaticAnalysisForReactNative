package defpackage;

import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: fov  reason: default package */
/* loaded from: classes3.dex */
public final class fov implements Comparable, fou {
    final WeakReference a;
    final long b;

    public fov(fou fouVar, long j) {
        this.a = new WeakReference(fouVar);
        this.b = j;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.valueOf(this.b).compareTo(Long.valueOf(((fov) obj).b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fov)) {
            return false;
        }
        fou fouVar = (fou) this.a.get();
        fou fouVar2 = (fou) ((fov) obj).a.get();
        if (fouVar == fouVar2) {
            return true;
        }
        return fouVar != null && fouVar.equals(fouVar2);
    }

    @Override // defpackage.fou
    public final void g(String str) {
        fou fouVar = (fou) this.a.get();
        if (fouVar != null) {
            fouVar.g(str);
        }
    }

    public final int hashCode() {
        fou fouVar = (fou) this.a.get();
        if (fouVar != null) {
            return fouVar.hashCode();
        }
        return 0;
    }
}
