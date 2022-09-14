package defpackage;

import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: kly  reason: default package */
/* loaded from: classes7.dex */
public final class kly implements btph {
    public final crzo<Boolean> a = new crzo<>(false);
    private final crzo<Boolean> c = new crzo<>(false);
    public final crzo<jzq> b = new crzo<>(new jzq(false, false, false));

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        throw null;
    }

    public final crzm<Boolean> a() {
        return this.c.a;
    }

    public final void b(boolean z, boolean z2) {
        this.a.b(Boolean.valueOf(z2));
        this.c.b(Boolean.valueOf(z));
        this.b.b(new jzq(z, z2, z));
    }
}
