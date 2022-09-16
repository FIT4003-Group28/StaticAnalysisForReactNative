package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: bnuw  reason: default package */
/* loaded from: classes.dex */
public abstract class bnuw implements Serializable {
    public static bnuw c(int i, int i2) {
        return new bnrc(i, i2);
    }

    public abstract int a();

    public abstract int b();

    public final boolean d() {
        return a() > 0 && b() > 0;
    }
}
