package defpackage;

import com.google.protos.youtube.api.innertube.UserMentionSuggestionRendererOuterClass;
/* compiled from: PG */
/* renamed from: iij  reason: default package */
/* loaded from: classes3.dex */
final class iij implements afzf {
    final /* synthetic */ iil a;

    public iij(iil iilVar) {
        this.a = iilVar;
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
        iil iilVar = this.a;
        if (!asfuVar.d.equals(iilVar.h)) {
            return;
        }
        iilVar.e.D(new acte(asfuVar.e));
        int size = iilVar.g.size();
        iilVar.g.clear();
        for (aunb aunbVar : asfuVar.c) {
            iilVar.g.add(aunbVar.qm(UserMentionSuggestionRendererOuterClass.userMentionSuggestionRenderer));
        }
        boolean z = asfuVar.c.size() == 0;
        iilVar.c.e(z);
        if (size == 0 && !z) {
            iilVar.c(avvp.USER_MENTION_AUTO_COMPLETE_BOX_EVENT_TYPE_BOX_OPENED);
        }
        iilVar.c(avvp.USER_MENTION_AUTO_COMPLETE_BOX_EVENT_TYPE_CONTENT_UPDATED);
    }
}
