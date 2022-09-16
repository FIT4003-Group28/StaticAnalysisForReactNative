package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
/* compiled from: PG */
/* renamed from: aeje  reason: default package */
/* loaded from: classes.dex */
public final class aeje {
    public final aeub a;
    public final PlayerConfigModel b;
    public final aflm c;

    public aeje(aeub aeubVar, PlayerConfigModel playerConfigModel, aflm aflmVar) {
        if (aeubVar != null) {
            this.a = aeubVar;
            if (playerConfigModel != null) {
                this.b = playerConfigModel;
                if (aflmVar != null) {
                    this.c = aflmVar;
                    return;
                }
                throw new NullPointerException("Null csiAdapter");
            }
            throw new NullPointerException("Null playerConfigModel");
        }
        throw new NullPointerException("Null qoeLogger");
    }

    public static aeje a(aeub aeubVar, PlayerConfigModel playerConfigModel, aflm aflmVar) {
        return new aeje(aeubVar, playerConfigModel, aflmVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aeje) {
            aeje aejeVar = (aeje) obj;
            if (this.a.equals(aejeVar.a) && this.b.equals(aejeVar.b) && this.c.equals(aejeVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 63 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("PlaybackMappedData{qoeLogger=");
        sb.append(valueOf);
        sb.append(", playerConfigModel=");
        sb.append(valueOf2);
        sb.append(", csiAdapter=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }

    public aeje() {
    }
}
