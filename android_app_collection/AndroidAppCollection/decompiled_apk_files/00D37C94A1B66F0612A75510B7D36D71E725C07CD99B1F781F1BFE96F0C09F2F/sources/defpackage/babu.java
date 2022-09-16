package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: babu  reason: default package */
/* loaded from: classes2.dex */
public abstract class babu {
    private static final AtomicReference a = new AtomicReference();

    private babu() {
    }

    public static babu a() {
        return (babu) a.get();
    }

    public abstract String b();

    public abstract boolean c();
}
