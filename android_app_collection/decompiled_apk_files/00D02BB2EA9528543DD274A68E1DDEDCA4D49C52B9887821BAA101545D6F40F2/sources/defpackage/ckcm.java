package defpackage;
/* compiled from: PG */
/* renamed from: ckcm  reason: default package */
/* loaded from: classes.dex */
public final class ckcm {
    @dzsi
    private final cnke a;

    public ckcm() {
        this(null);
    }

    public ckcm(@dzsi cnke cnkeVar) {
        this.a = cnkeVar;
    }

    public final void a(boolean z) {
        cnke cnkeVar = this.a;
        if (cnkeVar != null) {
            cnkeVar.a(true != z ? 0L : 1L, 1L, cnkr.e);
        }
    }

    public final String toString() {
        cnke cnkeVar = this.a;
        return cnkeVar == null ? "" : cnkeVar.toString();
    }
}
