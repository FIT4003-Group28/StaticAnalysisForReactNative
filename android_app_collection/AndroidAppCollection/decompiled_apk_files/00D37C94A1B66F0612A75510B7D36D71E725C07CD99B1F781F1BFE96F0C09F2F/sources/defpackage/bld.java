package defpackage;
/* compiled from: PG */
/* renamed from: bld  reason: default package */
/* loaded from: classes2.dex */
final class bld implements Comparable {
    final int a;
    final int b;
    final String c;
    final String d;

    public bld(int i, int i2, String str, String str2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        bld bldVar = (bld) obj;
        int i = this.a - bldVar.a;
        return i == 0 ? this.b - bldVar.b : i;
    }
}
