package defpackage;
/* compiled from: PG */
/* renamed from: ggx  reason: default package */
/* loaded from: classes3.dex */
public final class ggx {
    private arjm a;
    private arjz b;
    private arjo c;
    private arjy d;

    public final void b(arjm arjmVar) {
        if (arjmVar != null) {
            this.a = arjmVar;
            return;
        }
        throw new NullPointerException("Null inlineAudioControlUIStyle");
    }

    public final void c(arjo arjoVar) {
        if (arjoVar != null) {
            this.c = arjoVar;
            return;
        }
        throw new NullPointerException("Null inlinePlaybackFullScreenUIStyle");
    }

    public final void d(arjy arjyVar) {
        if (arjyVar != null) {
            this.d = arjyVar;
            return;
        }
        throw new NullPointerException("Null inlinePlaybackTriggerStyle");
    }

    public final void e(arjz arjzVar) {
        if (arjzVar != null) {
            this.b = arjzVar;
            return;
        }
        throw new NullPointerException("Null inlineScrubbingUIStyle");
    }

    public final ggy a() {
        arjz arjzVar;
        arjo arjoVar;
        arjy arjyVar;
        arjm arjmVar = this.a;
        if (arjmVar == null || (arjzVar = this.b) == null || (arjoVar = this.c) == null || (arjyVar = this.d) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" inlineAudioControlUIStyle");
            }
            if (this.b == null) {
                sb.append(" inlineScrubbingUIStyle");
            }
            if (this.c == null) {
                sb.append(" inlinePlaybackFullScreenUIStyle");
            }
            if (this.d == null) {
                sb.append(" inlinePlaybackTriggerStyle");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new ggy(arjmVar, arjzVar, arjoVar, arjyVar);
    }
}
