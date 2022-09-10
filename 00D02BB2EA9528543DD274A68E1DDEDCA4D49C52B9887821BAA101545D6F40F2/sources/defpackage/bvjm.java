package defpackage;

import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bvjm  reason: default package */
/* loaded from: classes4.dex */
public final class bvjm extends auf {
    private final bvjj a;

    /* JADX INFO: Access modifiers changed from: protected */
    public bvjm(bvjj bvjjVar) {
        this.a = bvjjVar;
    }

    @Override // defpackage.auf
    public final void a(String str, @dzsi String str2) {
        this.a.ab(str, null, str2);
    }

    @Override // defpackage.auf
    public final void b(String str, @dzsi Set<String> set) {
        this.a.ae(str, null, set);
    }

    @Override // defpackage.auf
    public final void c(String str, int i) {
        this.a.V(str, null, i);
    }

    @Override // defpackage.auf
    public final void d(String str, boolean z) {
        this.a.R(str, null, z);
    }

    @Override // defpackage.auf
    @dzsi
    public final String e(String str, @dzsi String str2) {
        return this.a.y(str, null, str2);
    }

    @Override // defpackage.auf
    @dzsi
    public final Set<String> f(String str, @dzsi Set<String> set) {
        return this.a.B(str, null, set);
    }

    @Override // defpackage.auf
    public final int g(String str, int i) {
        return this.a.r(str, null, i);
    }

    @Override // defpackage.auf
    public final boolean h(String str, boolean z) {
        return this.a.l(str, null, z);
    }
}
