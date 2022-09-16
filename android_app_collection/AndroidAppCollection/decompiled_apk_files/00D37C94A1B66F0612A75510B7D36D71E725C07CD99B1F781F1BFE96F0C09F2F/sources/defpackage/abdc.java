package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: abdc  reason: default package */
/* loaded from: classes.dex */
public final class abdc implements aafl {
    public static final /* synthetic */ int a = 0;
    private final abde b;

    public abdc(abde abdeVar) {
        this.b = abdeVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        String str = (String) zew.K(map, "com.google.android.libraries.youtube.innertube.services.social.query", String.class);
        afzf afzfVar = (afzf) zew.K(map, "com.google.android.libraries.youtube.innertube.services.social.listener", afzf.class);
        if (str == null || afzfVar == null) {
            return;
        }
        byte[] I = aafx.a(apzgVar).I();
        abde abdeVar = this.b;
        ylx.k(abdeVar.b.b(new abdd(abdeVar, str, I), abdeVar.a), anjk.a, new itc(afzfVar, 4), new itd(afzfVar, 4));
    }
}
