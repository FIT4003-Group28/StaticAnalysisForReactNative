package defpackage;

import com.google.android.apps.gmm.navigation.developer.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: arpe  reason: default package */
/* loaded from: classes2.dex */
public class arpe extends ibd implements arox {
    private final List<iao> g;
    private final List<cqix<?>> h;
    private final List<cqix<?>> i;

    public arpe(cqhn cqhnVar, cjqy cjqyVar, @dzsi arni arniVar, dzsj<gga> dzsjVar, @dzsi atmz atmzVar) {
        super(cqhnVar, cjqyVar);
        if (arniVar == null) {
            this.g = dcdc.e();
            this.h = dcdc.e();
            this.i = dcdc.e();
            return;
        }
        dcdc i = dcdc.i(f(dzsjVar.a().getString(R.string.GUIDANCE_TAB_TITLE)), f(dzsjVar.a().getString(R.string.PROMPTS_TAB_TITLE)), f(dzsjVar.a().getString(R.string.DASHBOARD_TAB_TITLE)), f(dzsjVar.a().getString(R.string.VOICE_GUIDANCE_TAB_TITLE)));
        this.g = i;
        this.h = dcdc.i(cqgr.fT(new aroo(), new arpg(arniVar, atmzVar, cqhnVar, dzsjVar)), cqgr.fT(new arot(), new arph(arniVar, atmzVar)), cqgr.fT(new arno(), new arpb(arniVar, cqhnVar)), cqgr.fT(new arov(), new arpi(arniVar, atmzVar)));
        this.i = dcdc.q(dcbg.b(i).s(arpc.a));
    }

    private static iao f(String str) {
        return new arpd(str);
    }

    @Override // defpackage.arox
    public List<cqix<?>> d() {
        return this.h;
    }

    @Override // defpackage.arox
    public List<cqix<?>> e() {
        return this.i;
    }
}
