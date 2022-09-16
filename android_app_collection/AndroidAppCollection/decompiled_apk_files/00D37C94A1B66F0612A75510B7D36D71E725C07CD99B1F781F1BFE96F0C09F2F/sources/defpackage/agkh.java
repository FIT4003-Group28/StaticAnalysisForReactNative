package defpackage;

import java.util.HashSet;
/* compiled from: PG */
/* renamed from: agkh  reason: default package */
/* loaded from: classes.dex */
public final class agkh {
    private final HashSet a;
    private final agki b;
    private int c;

    public agkh(agjz agjzVar) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        this.b = new agki(this, hashSet);
        this.c = agjzVar.k().size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized int a() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized agki b() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized HashSet c() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d(String str) {
        this.a.add(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void e(String str) {
        this.a.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void f(int i) {
        b().d();
        this.c = i;
    }
}
