package defpackage;
/* compiled from: PG */
/* renamed from: bmx  reason: default package */
/* loaded from: classes3.dex */
public final class bmx implements bms {
    public final boolean a;
    public final int b;

    public bmx(int i, boolean z) {
        this.b = i;
        this.a = z;
    }

    @Override // defpackage.bms
    public final bkk b(bjr bjrVar, bnl bnlVar) {
        if (!bjrVar.m) {
            bpo.a("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new bkt(this);
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
