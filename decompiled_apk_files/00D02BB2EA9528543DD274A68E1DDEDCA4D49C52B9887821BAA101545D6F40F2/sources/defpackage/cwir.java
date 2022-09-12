package defpackage;

import java.util.concurrent.ThreadFactory;
/* compiled from: PG */
/* renamed from: cwir  reason: default package */
/* loaded from: classes.dex */
public final class cwir {
    public static ThreadFactory a() {
        deip deipVar = new deip();
        deipVar.a = "OneGoogle #%d";
        deipVar.b(false);
        dbsk.h(true, "Thread priority (%s) must be >= %s", 5, 1);
        dbsk.h(true, "Thread priority (%s) must be <= %s", 5, 10);
        deipVar.b = 5;
        deipVar.c(cwiq.a);
        return deip.a(deipVar);
    }
}
