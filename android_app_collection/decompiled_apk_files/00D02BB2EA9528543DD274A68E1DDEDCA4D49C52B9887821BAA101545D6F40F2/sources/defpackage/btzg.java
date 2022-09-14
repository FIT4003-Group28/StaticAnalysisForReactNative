package defpackage;

import defpackage.dssj;
/* compiled from: PG */
/* renamed from: btzg  reason: default package */
/* loaded from: classes4.dex */
public final class btzg<S extends dssj> {
    @dzsi
    public final S a;
    @dzsi
    public final Throwable b;

    public btzg(@dzsi S s, @dzsi Throwable th) {
        this.a = s;
        this.b = th;
    }

    public static btzg<dssj> a(dssj dssjVar) {
        return new btzg<>(dssjVar, null);
    }

    public static btzg<dssj> b() {
        return new btzg<>(null, null);
    }

    public final boolean c() {
        return this.a != null;
    }

    public final S d() {
        S s = this.a;
        dbsk.s(s);
        return s;
    }
}
