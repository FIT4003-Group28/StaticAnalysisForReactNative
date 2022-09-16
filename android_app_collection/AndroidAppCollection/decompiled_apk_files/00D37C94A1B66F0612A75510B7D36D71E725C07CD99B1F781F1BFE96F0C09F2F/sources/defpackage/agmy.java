package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: agmy  reason: default package */
/* loaded from: classes.dex */
public final class agmy {
    public List a;
    public agqs b;
    final /* synthetic */ agmz c;
    private final agqq d;
    private final List e;
    private final int f;

    public agmy(agmz agmzVar, agqq agqqVar, List list, List list2, int i) {
        this.c = agmzVar;
        this.d = agqqVar;
        list.getClass();
        this.e = list;
        this.a = list2;
        this.f = i;
    }

    public final agqs a() {
        agqs agqsVar;
        synchronized (this.c.k) {
            if (this.b == null) {
                this.b = new agqs(this.d, this.e, this.a, this.f);
            }
            agqsVar = this.b;
        }
        return agqsVar;
    }
}
