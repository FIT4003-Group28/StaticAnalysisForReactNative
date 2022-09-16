package defpackage;

import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: aicc  reason: default package */
/* loaded from: classes.dex */
public class aicc {
    public final aicb a;
    public final TimelineMarker[] b;

    public aicc(aicb aicbVar, List list) {
        aicbVar.getClass();
        this.a = aicbVar;
        this.b = new TimelineMarker[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.b[i] = (TimelineMarker) list.get(i);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof aicc)) {
            return false;
        }
        aicc aiccVar = (aicc) obj;
        return this.a == aiccVar.a && Arrays.equals(this.b, aiccVar.b);
    }

    public int hashCode() {
        return this.a.hashCode() ^ Arrays.hashCode(this.b);
    }
}
