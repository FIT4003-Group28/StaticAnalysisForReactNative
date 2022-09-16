package defpackage;

import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: ammv  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ammv implements amlw {
    private final /* synthetic */ int d;
    public static final /* synthetic */ ammv c = new ammv(2);
    public static final /* synthetic */ ammv b = new ammv(1);
    public static final /* synthetic */ ammv a = new ammv();

    private /* synthetic */ ammv() {
    }

    private /* synthetic */ ammv(int i) {
        this.d = i;
    }

    @Override // defpackage.amlw, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.d;
        if (i == 0) {
            WeakHashMap weakHashMap = amna.a;
        } else if (i == 1) {
            amna.j();
        } else {
            amna.b.add(amna.d);
            uwp.h(amna.e);
        }
    }
}
