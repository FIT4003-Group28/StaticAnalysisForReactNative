package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.CreateLivestreamHighlightClipCommandOuterClass;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: abwb  reason: default package */
/* loaded from: classes.dex */
public final class abwb implements aafl {
    public final Context a;
    public final aafo b;
    private final abyy c;
    private final abwe d;
    private final Executor e;

    public abwb(Context context, abyy abyyVar, abwe abweVar, aafo aafoVar, Executor executor) {
        this.a = context;
        abyyVar.getClass();
        this.c = abyyVar;
        abweVar.getClass();
        this.d = abweVar;
        aafoVar.getClass();
        this.b = aafoVar;
        executor.getClass();
        this.e = executor;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        map.getClass();
        aqxo.p(map.containsKey("callback"));
        aqxo.p(map.get("callback") instanceof abwt);
        aqxo.p(map.containsKey("menuIndex"));
        aqxo.p(map.get("menuIndex") instanceof Integer);
        abwf k = this.d.k();
        if (k == null) {
            zep.b("HighlightFrontendIdGenerator null - livestream not in progress?");
            return;
        }
        arpx arpxVar = ((aqiv) apzgVar.qm(CreateLivestreamHighlightClipCommandOuterClass.createLivestreamHighlightClipCommand)).b;
        if (arpxVar == null) {
            arpxVar = arpx.a;
        }
        abyy abyyVar = this.c;
        abyx abyxVar = new abyx(abyyVar.e, abyyVar.a.c());
        abyxVar.a = arpxVar.b;
        abyxVar.b = ((acke) k).az.n.d();
        abyxVar.c = TimeUnit.SECONDS.convert(arpxVar.c, TimeUnit.MILLISECONDS);
        abyxVar.d = (int) TimeUnit.NANOSECONDS.convert(arpxVar.c % 1000, TimeUnit.MILLISECONDS);
        abyxVar.s = 3;
        abyy abyyVar2 = this.c;
        ankt b = abyyVar2.c(arpz.a, abyyVar2.b, aber.l, abdw.t).b(abyxVar, abyyVar2.c);
        zag.q(this.a, R.string.lc_highlight_creation_started, 0);
        anlz.A(b, new abwa(this, map), this.e);
    }
}
