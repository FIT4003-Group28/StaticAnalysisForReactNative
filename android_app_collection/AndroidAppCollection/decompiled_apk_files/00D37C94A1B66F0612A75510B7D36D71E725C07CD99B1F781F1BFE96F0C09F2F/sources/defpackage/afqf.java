package defpackage;

import com.google.protos.youtube.api.innertube.UserMentionSuggestionRendererOuterClass;
/* compiled from: PG */
/* renamed from: afqf  reason: default package */
/* loaded from: classes.dex */
final class afqf implements afzf {
    final /* synthetic */ afqg a;

    public afqf(afqg afqgVar) {
        this.a = afqgVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        asfu asfuVar = (asfu) obj;
        afqg afqgVar = this.a;
        if (!asfuVar.d.equals(afqgVar.f)) {
            return;
        }
        ((acsx) afqgVar.c).D(new acte(asfuVar.e));
        int size = afqgVar.e.size();
        afqgVar.e.clear();
        for (aunb aunbVar : asfuVar.c) {
            afqgVar.e.add(aunbVar.qm(UserMentionSuggestionRendererOuterClass.userMentionSuggestionRenderer));
        }
        boolean z = asfuVar.c.size() == 0;
        afqgVar.b.d(z);
        if (size == 0 && !z) {
            afqgVar.i(avvp.USER_MENTION_AUTO_COMPLETE_BOX_EVENT_TYPE_BOX_OPENED);
        }
        afqgVar.i(avvp.USER_MENTION_AUTO_COMPLETE_BOX_EVENT_TYPE_CONTENT_UPDATED);
    }
}
