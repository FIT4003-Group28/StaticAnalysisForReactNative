package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.TrackingUrlModel;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: acwk  reason: default package */
/* loaded from: classes.dex */
public final class acwk implements afxt {
    private final Set a;
    private final /* synthetic */ int c;

    public acwk(TrackingUrlModel trackingUrlModel, int i) {
        this.c = i;
        trackingUrlModel.getClass();
        this.a = trackingUrlModel.d;
    }

    @Override // defpackage.afxt
    public final boolean a(aswe asweVar) {
        if (this.c != 0) {
            return this.a.contains(asweVar);
        }
        return this.a.contains(asweVar);
    }

    private acwk() {
        this.a = new HashSet();
    }

    public acwk(aswf[] aswfVarArr) {
        this.a = new HashSet();
        if (aswfVarArr != null) {
            for (aswf aswfVar : aswfVarArr) {
                Set set = this.a;
                aswe b = aswe.b(aswfVar.c);
                if (b == null) {
                    b = aswe.UNKNOWN;
                }
                set.add(b);
            }
        }
    }
}
