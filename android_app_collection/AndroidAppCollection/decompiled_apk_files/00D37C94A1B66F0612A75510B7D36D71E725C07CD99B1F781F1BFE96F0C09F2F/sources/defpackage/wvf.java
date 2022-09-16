package defpackage;

import j$.util.function.ToLongFunction;
/* compiled from: PG */
/* renamed from: wvf  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class wvf implements ToLongFunction {
    private final /* synthetic */ int c;
    public static final /* synthetic */ wvf b = new wvf(1);
    public static final /* synthetic */ wvf a = new wvf();

    private /* synthetic */ wvf() {
    }

    private /* synthetic */ wvf(int i) {
        this.c = i;
    }

    @Override // j$.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        if (this.c == 0) {
            return ((xcz) obj).d.a;
        }
        return ((auzy) obj).d;
    }
}
