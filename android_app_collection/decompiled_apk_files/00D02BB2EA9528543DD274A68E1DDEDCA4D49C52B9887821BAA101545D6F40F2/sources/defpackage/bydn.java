package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bydn  reason: default package */
/* loaded from: classes4.dex */
public final class bydn {
    public final boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    private final Set<byea> f;

    public bydn(byea byeaVar, int i, int i2, int i3, int i4) {
        HashSet hashSet = new HashSet();
        this.f = hashSet;
        hashSet.add(byeaVar);
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.a = false;
    }

    public final void a(byea byeaVar) {
        this.f.add(byeaVar);
    }

    public final Set<byea> b() {
        return dcep.K(this.f);
    }

    public final boolean c() {
        int i;
        int i2;
        return !this.a && (i = this.b) == this.d && (i2 = this.c) == this.e && i == 0 && i2 == 0;
    }

    public bydn(byea byeaVar) {
        HashSet hashSet = new HashSet();
        this.f = hashSet;
        hashSet.add(byeaVar);
        this.a = true;
    }
}
