package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvgr  reason: default package */
/* loaded from: classes4.dex */
public final class bvgr {
    public static Executor a(bvrb bvrbVar, @dzsi bvrj bvrjVar) {
        Executor g = bvrjVar != null ? bvrbVar.g(bvrjVar) : null;
        if (g != null) {
            return g;
        }
        Executor g2 = bvrbVar.g(bvrj.BACKGROUND_THREADPOOL);
        dbsk.s(g2);
        return g2;
    }
}
