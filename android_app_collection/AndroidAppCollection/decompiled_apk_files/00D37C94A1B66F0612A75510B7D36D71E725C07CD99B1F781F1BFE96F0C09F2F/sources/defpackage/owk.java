package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: owk  reason: default package */
/* loaded from: classes4.dex */
public final class owk extends owm implements ovy {
    private final own a;

    public owk(String str, ovm ovmVar, own ownVar, String str2) {
        super(str, -1L, ovmVar, str2, ownVar, null);
        this.a = ownVar;
    }

    @Override // defpackage.ovy
    public final int a() {
        return this.a.a;
    }

    @Override // defpackage.ovy
    public final int b(long j) {
        return this.a.a(j);
    }

    @Override // defpackage.ovy
    public final int c(long j, long j2) {
        own ownVar = this.a;
        int i = ownVar.a;
        int a = ownVar.a(j2);
        if (ownVar.c == null) {
            int i2 = ownVar.a + ((int) (j / ((ownVar.b * 1000000) / ownVar.g)));
            return i2 < i ? i : (a == -1 || i2 <= a) ? i2 : a;
        }
        int i3 = i;
        while (i3 <= a) {
            int i4 = (i3 + a) / 2;
            long b = ownVar.b(i4);
            if (b < j) {
                i3 = i4 + 1;
            } else if (b <= j) {
                return i4;
            } else {
                a = i4 - 1;
            }
        }
        return i3 != i ? a : i3;
    }

    @Override // defpackage.ovy
    public final long d(int i, long j) {
        own ownVar = this.a;
        List list = ownVar.c;
        if (list != null) {
            return (((owq) list.get(i - ownVar.a)).b * 1000000) / ownVar.g;
        }
        if (i == ownVar.a(j)) {
            return j - ownVar.b(i);
        }
        return (ownVar.b * 1000000) / ownVar.g;
    }

    @Override // defpackage.ovy
    public final long e(int i) {
        return this.a.b(i);
    }

    @Override // defpackage.ovy
    public final owj f(int i) {
        return this.a.c(this, i);
    }

    @Override // defpackage.ovy
    public final boolean g() {
        return this.a.d();
    }

    @Override // defpackage.owm
    public final ovy h() {
        return this;
    }

    @Override // defpackage.owm
    public final owj i() {
        return null;
    }
}
