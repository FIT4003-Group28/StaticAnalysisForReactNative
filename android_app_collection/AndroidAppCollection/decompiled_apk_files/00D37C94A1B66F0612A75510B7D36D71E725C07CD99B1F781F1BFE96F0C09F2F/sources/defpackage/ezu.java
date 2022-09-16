package defpackage;

import android.view.View;
import com.google.android.libraries.youtube.player.model.WatchDescriptor;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: ezu  reason: default package */
/* loaded from: classes3.dex */
public final class ezu {
    public final WatchDescriptor a;
    public final avhn b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    private final WeakReference g;

    public ezu() {
    }

    public ezu(WatchDescriptor watchDescriptor, WeakReference weakReference, avhn avhnVar, int i, boolean z, boolean z2, boolean z3) {
        this.a = watchDescriptor;
        this.g = weakReference;
        this.b = avhnVar;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public static ezt b() {
        ezt eztVar = new ezt();
        eztVar.c(false);
        eztVar.e(false);
        eztVar.d(0);
        eztVar.b(false);
        eztVar.g(null);
        return eztVar;
    }

    public final View a() {
        return (View) this.g.get();
    }

    public final boolean equals(Object obj) {
        avhn avhnVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ezu) {
            ezu ezuVar = (ezu) obj;
            if (this.a.equals(ezuVar.a) && this.g.equals(ezuVar.g) && ((avhnVar = this.b) != null ? avhnVar.equals(ezuVar.b) : ezuVar.b == null) && this.c == ezuVar.c && this.d == ezuVar.d && this.e == ezuVar.e && this.f == ezuVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.g.hashCode()) * 1000003;
        avhn avhnVar = this.b;
        int i = 1237;
        int hashCode2 = (((((((hashCode ^ (avhnVar == null ? 0 : avhnVar.hashCode())) * 1000003) ^ this.c) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003;
        if (true == this.f) {
            i = 1231;
        }
        return hashCode2 ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.g);
        String valueOf3 = String.valueOf(this.b);
        int i = this.c;
        boolean z = this.d;
        boolean z2 = this.e;
        boolean z3 = this.f;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 221 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("AppWatchDescriptor{watchDescriptor=");
        sb.append(valueOf);
        sb.append(", sourceViewWeakReference=");
        sb.append(valueOf2);
        sb.append(", thumbnailDetails=");
        sb.append(valueOf3);
        sb.append(", playbackStartFlag=");
        sb.append(i);
        sb.append(", shouldStartWatchShuffled=");
        sb.append(z);
        sb.append(", overrideExitFullscreenToMaximized=");
        sb.append(z2);
        sb.append(", persistCurrentPlayerViewMode=");
        sb.append(z3);
        sb.append("}");
        return sb.toString();
    }
}
