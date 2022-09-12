package defpackage;
/* compiled from: PG */
/* renamed from: za  reason: default package */
/* loaded from: classes7.dex */
final class za {
    public acl a;
    public acl b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public za(acl aclVar, acl aclVar2, int i, int i2, int i3, int i4) {
        this.a = aclVar;
        this.b = aclVar2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    public final String toString() {
        return "ChangeInfo{oldHolder=" + this.a + ", newHolder=" + this.b + ", fromX=" + this.c + ", fromY=" + this.d + ", toX=" + this.e + ", toY=" + this.f + '}';
    }
}
