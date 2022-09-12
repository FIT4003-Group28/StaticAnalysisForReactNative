package defpackage;
/* compiled from: PG */
/* renamed from: ckcp  reason: default package */
/* loaded from: classes.dex */
public final class ckcp {
    @dzsi
    private final cnkn a;

    public ckcp() {
        this(null);
    }

    public ckcp(@dzsi cnkn cnknVar) {
        this.a = cnknVar;
    }

    public final void a(long j) {
        cnkn cnknVar = this.a;
        if (cnknVar != null) {
            cnknVar.c(j);
        }
    }

    public final void b(long j, long j2) {
        cnkn cnknVar = this.a;
        if (cnknVar != null) {
            cnknVar.a(((cnkd) cnknVar).e.a(j), j2, cnkr.e);
        }
    }

    public final String toString() {
        cnkn cnknVar = this.a;
        return cnknVar == null ? "" : cnknVar.toString();
    }
}
