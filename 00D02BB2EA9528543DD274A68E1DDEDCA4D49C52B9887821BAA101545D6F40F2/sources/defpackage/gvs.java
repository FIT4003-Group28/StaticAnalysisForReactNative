package defpackage;

import java.lang.reflect.Type;
/* compiled from: PG */
/* renamed from: gvs  reason: default package */
/* loaded from: classes.dex */
public final class gvs extends cqiw<jar> {
    public static final /* synthetic */ int a = 0;
    private final boolean b;
    private final boolean c;
    private final cqtv d;
    private final cqtv e;

    public gvs() {
        this(true, true, gwu.b(), gwu.a());
    }

    public static gvr d() {
        return new gvr();
    }

    @Override // defpackage.cqiw
    protected final Type ND() {
        return jar.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<jar> a() {
        return gwu.k(gvq.a, this.b, this.c, null, cqkz.a(this.e), cqkz.a(this.d));
    }

    public gvs(boolean z, boolean z2, cqtv cqtvVar, cqtv cqtvVar2) {
        super(Boolean.valueOf(z), Boolean.valueOf(z2));
        this.b = z;
        this.c = z2;
        this.e = cqtvVar;
        this.d = cqtvVar2;
    }
}
