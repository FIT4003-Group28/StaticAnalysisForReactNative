package defpackage;
/* compiled from: PG */
/* renamed from: awvw  reason: default package */
/* loaded from: classes2.dex */
public final class awvw {
    private final awvx a;

    public awvw(awvx awvxVar) {
        this.a = awvxVar;
    }

    public static awvv b(awvx awvxVar) {
        return new awvv(awvxVar.mo52toBuilder());
    }

    public final amvn a() {
        amvl amvlVar = new amvl();
        awwb awwbVar = this.a.b;
        if (awwbVar == null) {
            awwbVar = awwb.a;
        }
        awwa awwaVar = new awwa((awwb) awwbVar.mo52toBuilder().mo39build());
        amvl amvlVar2 = new amvl();
        awvz awvzVar = awwaVar.a.b;
        if (awvzVar == null) {
            awvzVar = awvz.a;
        }
        new awvy((awvz) ((aopc) awvzVar.mo52toBuilder()).mo39build());
        amvlVar2.j(new amvl().g());
        amvlVar.j(amvlVar2.g());
        awvs awvsVar = this.a.c;
        if (awvsVar == null) {
            awvsVar = awvs.a;
        }
        new awvr((awvs) ((aopc) awvsVar.mo52toBuilder()).mo39build());
        amvlVar.j(new amvl().g());
        return amvlVar.g();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof awvw) && this.a.equals(((awvw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
        sb.append("FocusVisibilityLoggingCriteriaModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
