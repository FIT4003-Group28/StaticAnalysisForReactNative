package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: mlg  reason: default package */
/* loaded from: classes3.dex */
public final class mlg implements ajru {
    private final ajqb a;

    public mlg(ajqz ajqzVar) {
        ajqb ajqkVar;
        if (ajqk.class.equals(ajqq.class)) {
            ajqkVar = new ajqq(ajqzVar.a, (ajrx) ajqzVar.b.get(), ajqzVar.c);
        } else if (ajqk.class.equals(ajqk.class)) {
            ajqkVar = new ajqk(ajqzVar.a, (ajrx) ajqzVar.b.get(), ajqzVar.c);
        } else {
            throw new IllegalArgumentException("Unknown presenter class requested.");
        }
        this.a = ajqkVar;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a.a();
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        this.a.oK(ajrsVar, (ajqo) obj);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.a.qZ(ajsaVar);
    }
}
