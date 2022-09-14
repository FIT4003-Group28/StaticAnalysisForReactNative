package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dbie  reason: default package */
/* loaded from: classes5.dex */
public final class dbie {
    private static Executor a;

    public static Executor a() {
        if (a == null) {
            a = new dbid();
        }
        return a;
    }
}
