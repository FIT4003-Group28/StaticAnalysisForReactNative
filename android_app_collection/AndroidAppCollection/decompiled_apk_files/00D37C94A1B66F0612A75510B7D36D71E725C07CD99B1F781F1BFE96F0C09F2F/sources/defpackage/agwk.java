package defpackage;

import java.util.HashSet;
/* compiled from: PG */
/* renamed from: agwk  reason: default package */
/* loaded from: classes.dex */
public final class agwk {
    public agwl b;
    public final HashSet a = new HashSet();
    private int c = 0;

    public final synchronized int a() {
        return this.c;
    }

    public final synchronized agwl b() {
        return this.b;
    }

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

    public final synchronized void f(int i) {
        b().e();
        this.c = i;
    }
}
