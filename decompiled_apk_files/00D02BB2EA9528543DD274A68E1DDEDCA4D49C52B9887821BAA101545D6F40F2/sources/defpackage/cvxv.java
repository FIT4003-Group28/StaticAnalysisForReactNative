package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cvxv  reason: default package */
/* loaded from: classes5.dex */
public final class cvxv extends tp {
    final /* synthetic */ List a;
    final /* synthetic */ List b;
    final /* synthetic */ cvxw c;

    public cvxv(cvxw cvxwVar, List list, List list2) {
        this.c = cvxwVar;
        this.a = list;
        this.b = list2;
    }

    @Override // defpackage.tp
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.tp
    public final int b() {
        return this.b.size();
    }

    @Override // defpackage.tp
    public final boolean c(int i, int i2) {
        String b;
        String b2;
        b = ((cwfm) this.a.get(i)).b();
        b2 = ((cwfm) this.b.get(i2)).b();
        return b.equals(b2);
    }

    @Override // defpackage.tp
    public final boolean d(int i, int i2) {
        CharSequence b;
        CharSequence b2;
        CharSequence a;
        CharSequence a2;
        Object obj = this.a.get(i);
        Object obj2 = this.b.get(i2);
        b = ((cwfm) obj).b();
        b2 = ((cwfm) obj2).b();
        if (cvxw.b(b, b2)) {
            a = ((cwfm) obj).a();
            a2 = ((cwfm) obj2).a();
            return cvxw.b(a, a2);
        }
        return false;
    }
}
