package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: aibi  reason: default package */
/* loaded from: classes2.dex */
public final class aibi {
    public static final dcqe a = dcqe.c("aibi");
    public final btlu b;
    public final aibh c;
    @dzsi
    public List<String> d;
    @dzsi
    public String e;
    public dcdc<dqzv> f = dcdc.e();
    @dzsi
    public ahvn g;
    @dzsi
    private ahvn h;
    private final aibk i;

    public aibi(btlu btluVar, aibk aibkVar, aibh aibhVar) {
        this.b = btluVar;
        this.i = aibkVar;
        this.c = aibhVar;
    }

    public final boolean a() {
        return this.h != null;
    }

    public final boolean b() {
        return this.e != null && this.g == null && !a() && this.d != null;
    }

    public final void c(ahvn ahvnVar) {
        if (this.g == null && this.h == null) {
            if (this.d == null || this.e != null) {
                d(ahvnVar);
            } else {
                this.g = ahvnVar;
            }
        }
    }

    public final void d(ahvn ahvnVar) {
        dbsk.l(!a());
        this.h = ahvnVar;
        this.g = null;
        if (this.e != null) {
            aibk aibkVar = this.i;
            aibkVar.a.i(this.b, this.f);
        }
        this.c.c(ahvnVar, this.b);
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("recipients", this.d);
        b.b("journeyId", this.e);
        b.b("pendingStopReason", this.g);
        b.b("stopReason", this.h);
        return b.toString();
    }
}
