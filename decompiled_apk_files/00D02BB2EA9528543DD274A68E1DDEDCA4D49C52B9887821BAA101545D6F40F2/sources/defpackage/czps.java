package defpackage;
/* compiled from: PG */
/* renamed from: czps  reason: default package */
/* loaded from: classes5.dex */
final class czps {
    public final String a;
    public final boolean[] b;

    public czps(String str, boolean[] zArr) {
        this.a = str;
        this.b = zArr;
    }

    public final boolean a() {
        for (boolean z : this.b) {
            if (z) {
                return true;
            }
        }
        return false;
    }
}
