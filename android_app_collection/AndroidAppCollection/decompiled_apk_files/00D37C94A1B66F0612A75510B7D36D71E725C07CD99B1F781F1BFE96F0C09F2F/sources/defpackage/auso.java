package defpackage;
/* compiled from: PG */
/* renamed from: auso  reason: default package */
/* loaded from: classes2.dex */
public final class auso implements aajq {
    public static final aajr a = new ausn();
    private final ausp b;

    public auso(ausp auspVar) {
        this.b = auspVar;
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
        return new ausm(this.b.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof auso) && this.b.equals(((auso) obj).b);
    }

    public String getExternalVideoId() {
        return this.b.d;
    }

    public String getNowPlayingEntityValue() {
        return this.b.f;
    }

    public ausr getSfvAudioItemPlaybackState() {
        ausr b = ausr.b(this.b.e);
        return b == null ? ausr.SFV_AUDIO_ITEM_PLAYBACK_STATE_UNKNOWN : b;
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
        sb.append("SfvAudioItemCurrentlyPlayingEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
