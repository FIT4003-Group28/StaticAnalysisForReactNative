package defpackage;
/* compiled from: PG */
/* renamed from: atvb  reason: default package */
/* loaded from: classes2.dex */
public final class atvb implements aajq {
    public static final aajr a = new atva();
    private final atvc b;

    public atvb(atvc atvcVar) {
        this.b = atvcVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        return new amvl().g();
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
        return new atuz(this.b.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof atvb) && this.b.equals(((atvb) obj).b);
    }

    public atvd getState() {
        atvd b = atvd.b(this.b.d);
        return b == null ? atvd.PARTICIPANT_JOIN_STATE_UNKNOWN : b;
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
        sb.append("ParticipantJoinStateEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
