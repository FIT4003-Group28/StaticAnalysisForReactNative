package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: amvf  reason: default package */
/* loaded from: classes2.dex */
public abstract class amvf implements Serializable {
    public static amvf d(akqq akqqVar, int i) {
        return new amsp(akqqVar, i, Math.max(10, 200));
    }

    public abstract akqq a();

    public abstract int b();

    public abstract int c();
}
