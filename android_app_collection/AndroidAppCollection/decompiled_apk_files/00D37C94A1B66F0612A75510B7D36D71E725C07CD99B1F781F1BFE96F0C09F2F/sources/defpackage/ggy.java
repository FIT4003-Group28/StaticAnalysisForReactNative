package defpackage;
/* compiled from: PG */
/* renamed from: ggy  reason: default package */
/* loaded from: classes3.dex */
public final class ggy {
    public final arjm a;
    public final arjz b;
    public final arjo c;
    public final arjy d;

    public ggy() {
    }

    public ggy(arjm arjmVar, arjz arjzVar, arjo arjoVar, arjy arjyVar) {
        this.a = arjmVar;
        this.b = arjzVar;
        this.c = arjoVar;
        this.d = arjyVar;
    }

    public static ggx a() {
        ggx ggxVar = new ggx();
        ggxVar.b(arjm.INLINE_AUDIO_CONTROL_UI_STYLE_UNKNOWN);
        ggxVar.e(arjz.INLINE_SCRUBBING_UI_STYLE_UNKNOWN);
        ggxVar.c(arjo.INLINE_PLAYBACK_FULLSCREEN_UI_STYLE_UNKNOWN);
        ggxVar.d(arjy.INLINE_PLAYBACK_TRIGGER_STYLE_UNKNOWN);
        return ggxVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ggy) {
            ggy ggyVar = (ggy) obj;
            if (this.a.equals(ggyVar.a) && this.b.equals(ggyVar.b) && this.c.equals(ggyVar.c) && this.d.equals(ggyVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 144 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("InlinePlaybackControlsConfig{inlineAudioControlUIStyle=");
        sb.append(valueOf);
        sb.append(", inlineScrubbingUIStyle=");
        sb.append(valueOf2);
        sb.append(", inlinePlaybackFullScreenUIStyle=");
        sb.append(valueOf3);
        sb.append(", inlinePlaybackTriggerStyle=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
