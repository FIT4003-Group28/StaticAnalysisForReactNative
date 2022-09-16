package defpackage;
/* compiled from: PG */
/* renamed from: cas  reason: default package */
/* loaded from: classes2.dex */
public final class cas implements can {
    public final boolean a;
    public final int b;

    public cas(int i, boolean z) {
        this.b = i;
        this.a = z;
    }

    @Override // defpackage.can
    public final byc a(bxn bxnVar, cbd cbdVar) {
        if (!bxnVar.j) {
            cda.a("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new byl(this);
    }

    public final String toString() {
        int i = this.b;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "EXCLUDE_INTERSECTIONS" : "INTERSECT" : "SUBTRACT" : "ADD" : "MERGE";
        StringBuilder sb = new StringBuilder(str.length() + 17);
        sb.append("MergePaths{mode=");
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
