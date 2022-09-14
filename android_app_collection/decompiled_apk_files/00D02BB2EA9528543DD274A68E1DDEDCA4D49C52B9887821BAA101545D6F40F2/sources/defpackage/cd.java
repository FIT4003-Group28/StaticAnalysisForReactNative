package defpackage;
/* compiled from: PG */
/* renamed from: cd  reason: default package */
/* loaded from: classes4.dex */
final class cd implements Comparable<cd> {
    final int a;
    final int b;
    final String c;
    final String d;

    public cd(int i, int i2, String str, String str2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(cd cdVar) {
        cd cdVar2 = cdVar;
        int i = this.a - cdVar2.a;
        return i == 0 ? this.b - cdVar2.b : i;
    }
}
