package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bptu  reason: default package */
/* loaded from: classes4.dex */
public abstract class bptu {
    public abstract bptw a();

    public abstract void b(List<akqi> list);

    public abstract void c(bptv bptvVar);

    public final bptw d() {
        bptw a = a();
        if (a.e().equals(bptv.WHOLE_ROUTE)) {
            dbsk.m(a.d().a(), "Cannot report on whole route without supplying parent route");
        }
        return a;
    }
}
