package defpackage;

import com.google.android.youtube.R;
import java.util.Map;
/* compiled from: PG */
/* renamed from: abwa  reason: default package */
/* loaded from: classes.dex */
final class abwa implements ankb {
    final /* synthetic */ Map a;
    final /* synthetic */ abwb b;

    public abwa(abwb abwbVar, Map map) {
        this.b = abwbVar;
        this.a = map;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        zag.q(this.b.a, R.string.lc_highlight_creation_failed, 0);
        ((abwt) this.a.get("callback")).a(((Integer) this.a.get("menuIndex")).intValue());
    }

    @Override // defpackage.ankb
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        for (apzg apzgVar : ((arpz) obj).c) {
            this.b.b.c(apzgVar, null);
        }
    }
}
