package defpackage;

import java.util.HashMap;
/* compiled from: PG */
/* renamed from: kya  reason: default package */
/* loaded from: classes3.dex */
public final class kya implements ajrt {
    public argv a;
    public las b;
    public lar c;

    @Override // defpackage.ajrt
    public final void a(ajrs ajrsVar, ajqm ajqmVar, int i) {
        ajrsVar.f("REFINEMENT_POSITION", Integer.valueOf(i));
        HashMap hashMap = new HashMap();
        argv argvVar = this.a;
        if (argvVar != null) {
            hashMap.put("HORIZONTAL_CARD_LIST", argvVar);
            ajrsVar.f("HORIZONTAL_CARD_LIST", this.a);
        }
        ajrsVar.g(hashMap);
        ajrsVar.f("REFINEMENT_SELECTION_CONTROLLER", this.b);
        ajrsVar.f("REFINEMENT_SELECTION_LISTENER", this.c);
    }
}
