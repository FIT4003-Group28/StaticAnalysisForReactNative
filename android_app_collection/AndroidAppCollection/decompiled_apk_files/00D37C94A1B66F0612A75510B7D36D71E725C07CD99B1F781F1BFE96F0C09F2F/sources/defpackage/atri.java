package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: atri  reason: default package */
/* loaded from: classes2.dex */
public final class atri implements aajq {
    public static final aajr a = new atrh();
    public final atrj b;
    private final aajl c;

    public atri(atrj atrjVar, aajl aajlVar) {
        this.b = atrjVar;
        this.c = aajlVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        amvl amvlVar = new amvl();
        amvlVar.j(getActionProtoModel().a());
        return amvlVar.g();
    }

    @Override // defpackage.aajj
    public final byte[] c() {
        return this.b.toByteArray();
    }

    @Override // defpackage.aajj
    public final String d() {
        return this.b.c;
    }

    @Override // defpackage.aajj
    public final /* bridge */ /* synthetic */ abga e() {
        return new atrg(this.b.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof atri) && this.b.equals(((atri) obj).b);
    }

    public atrf getActionProto() {
        atrf atrfVar = this.b.d;
        return atrfVar == null ? atrf.a : atrfVar;
    }

    public atre getActionProtoModel() {
        atrf atrfVar = this.b.d;
        if (atrfVar == null) {
            atrfVar = atrf.a;
        }
        return atre.b(atrfVar).a(this.c);
    }

    public List getChildActionIds() {
        return this.b.h;
    }

    public Long getEnqueueTimeSec() {
        return Long.valueOf(this.b.e);
    }

    public Boolean getHasChildActionFailed() {
        return Boolean.valueOf(this.b.l);
    }

    public String getParentActionId() {
        return this.b.g;
    }

    public List getPostreqActionIds() {
        return this.b.j;
    }

    public String getPrereqActionId() {
        return this.b.i;
    }

    public Integer getRetryScheduleIndex() {
        return Integer.valueOf(this.b.k);
    }

    public String getRootActionId() {
        return this.b.f;
    }

    @Override // defpackage.aajj
    /* renamed from: getType  reason: collision with other method in class */
    public aajr mo145getType() {
        return a;
    }

    @Override // defpackage.aajj
    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46);
        sb.append("OfflineOrchestrationActionWrapperEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
