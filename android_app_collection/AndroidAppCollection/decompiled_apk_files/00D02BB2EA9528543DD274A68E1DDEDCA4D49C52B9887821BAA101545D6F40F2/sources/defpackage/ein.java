package defpackage;

import com.airbnb.lottie.LottieAnimationView;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ein  reason: default package */
/* loaded from: classes6.dex */
public final class ein implements eim {
    private final dcdn<String, String> a;

    public ein(dcdn<String, String> dcdnVar) {
        this.a = dcdnVar;
    }

    @Override // defpackage.eim
    public final bkf a(LottieAnimationView lottieAnimationView) {
        bkf bkfVar = new bkf(lottieAnimationView);
        dcpd<Map.Entry<String, String>> it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            bkfVar.a.put(next.getKey(), next.getValue());
            LottieAnimationView lottieAnimationView2 = bkfVar.b;
            if (lottieAnimationView2 != null) {
                lottieAnimationView2.invalidate();
            }
        }
        return bkfVar;
    }
}
