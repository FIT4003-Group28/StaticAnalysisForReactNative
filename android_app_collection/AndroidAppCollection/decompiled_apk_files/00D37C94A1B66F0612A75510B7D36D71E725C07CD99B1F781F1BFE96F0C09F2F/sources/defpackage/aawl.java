package defpackage;

import com.google.android.youtube.R;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aawl  reason: default package */
/* loaded from: classes.dex */
final class aawl implements afzf {
    final /* synthetic */ aawm a;
    private final Map b;

    public aawl(aawm aawmVar, Map map) {
        this.a = aawmVar;
        this.b = map;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        zep.d("Error flagging", cffVar);
        this.a.a.e(cffVar);
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        arrz arrzVar = (arrz) obj;
        Object I = zew.I(this.b, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        if (arrzVar.g.size() > 0) {
            this.a.c.e(arrzVar.g, I);
        } else {
            zag.q(this.a.b, R.string.video_is_flagged, 1);
        }
    }
}
