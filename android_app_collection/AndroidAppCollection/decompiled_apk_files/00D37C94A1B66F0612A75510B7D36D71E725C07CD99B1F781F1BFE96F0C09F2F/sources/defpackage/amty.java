package defpackage;

import j$.util.Map;
/* compiled from: PG */
/* renamed from: amty  reason: default package */
/* loaded from: classes.dex */
public abstract class amty extends amup implements Map, amsa {
    public static amtw b() {
        return new amtw();
    }

    @Override // defpackage.amsa
    public final /* bridge */ /* synthetic */ amsa a() {
        throw null;
    }

    public abstract amty c();

    @Override // defpackage.amup
    public final /* bridge */ /* synthetic */ amub d() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.amup, java.util.Map, j$.util.Map
    /* renamed from: f */
    public final amvn values() {
        return c().keySet();
    }

    @Override // defpackage.amup
    Object writeReplace() {
        return new amtx(this);
    }
}
