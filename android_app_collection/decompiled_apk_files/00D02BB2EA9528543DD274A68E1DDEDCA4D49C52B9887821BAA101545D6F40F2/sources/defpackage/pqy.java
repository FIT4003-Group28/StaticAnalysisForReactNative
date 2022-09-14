package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: pqy  reason: default package */
/* loaded from: classes7.dex */
public final class pqy extends prb {
    private final int a;
    private final amvh b;
    private final cjqm c;

    public pqy(int i, amvh amvhVar, cjqm cjqmVar) {
        this.a = i;
        if (amvhVar != null) {
            this.b = amvhVar;
            if (cjqmVar != null) {
                this.c = cjqmVar;
                return;
            }
            throw new NullPointerException("Null loggedInteraction");
        }
        throw new NullPointerException("Null waypoint");
    }

    @Override // defpackage.prb
    public final int a() {
        return this.a;
    }

    @Override // defpackage.prb
    public final amvh b() {
        return this.b;
    }

    @Override // defpackage.prb
    public final cjqm c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof prb) {
            prb prbVar = (prb) obj;
            if (this.a == prbVar.a() && this.b.equals(prbVar.b()) && this.c.equals(prbVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 90 + String.valueOf(valueOf2).length());
        sb.append("DirectionsDidYouMeanDialogResult{waypointIndex=");
        sb.append(i);
        sb.append(", waypoint=");
        sb.append(valueOf);
        sb.append(", loggedInteraction=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
