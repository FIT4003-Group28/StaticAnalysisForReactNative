package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bqdc  reason: default package */
/* loaded from: classes4.dex */
public final class bqdc {
    public static void a(List<bqhj> list, int i, bqhr bqhrVar) {
        bqhj bqhjVar = list.get(i);
        if (!bqhjVar.g()) {
            bqhh f = bqhj.f();
            f.c(bqhjVar.a());
            f.e(bqhrVar);
            list.set(i, f.a());
        }
    }
}
