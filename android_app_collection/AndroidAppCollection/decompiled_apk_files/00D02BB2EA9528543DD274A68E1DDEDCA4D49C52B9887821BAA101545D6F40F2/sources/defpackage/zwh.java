package defpackage;
/* compiled from: PG */
/* renamed from: zwh  reason: default package */
/* loaded from: classes7.dex */
public final class zwh implements Comparable<zwh> {
    public final dpfu a;

    public zwh(dpfu dpfuVar) {
        this.a = dpfuVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(zwh zwhVar) {
        return this.a.d.compareTo(zwhVar.a.d);
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj instanceof zwh) {
            return this.a.d.equals(((zwh) obj).a.d);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.d.hashCode();
    }
}
