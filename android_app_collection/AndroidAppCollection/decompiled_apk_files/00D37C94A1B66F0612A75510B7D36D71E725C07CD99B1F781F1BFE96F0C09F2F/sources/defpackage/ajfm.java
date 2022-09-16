package defpackage;

import android.os.Parcelable;
import com.google.android.libraries.youtube.player.video.state.PlaybackListenerStateRestorerState;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: ajfm  reason: default package */
/* loaded from: classes.dex */
public final class ajfm {
    public final Set a;

    public ajfm() {
        this.a = Collections.newSetFromMap(new WeakHashMap());
    }

    public ajfm(Set set) {
        this.a = set;
    }

    public final PlaybackListenerStateRestorerState a() {
        HashMap hashMap = new HashMap();
        for (ajfb ajfbVar : this.a) {
            Parcelable Q = ajfbVar.Q();
            if (Q != null) {
                hashMap.put(ajfbVar.getClass().toString(), Q);
            }
        }
        return new PlaybackListenerStateRestorerState(hashMap);
    }

    public final void b(PlaybackListenerStateRestorerState playbackListenerStateRestorerState, anvz anvzVar) {
        Map map = playbackListenerStateRestorerState.a;
        for (ajfb ajfbVar : this.a) {
            Parcelable parcelable = (Parcelable) map.get(ajfbVar.getClass().toString());
            if (parcelable != null) {
                ajfbVar.f(parcelable, anvzVar);
            }
        }
    }
}
