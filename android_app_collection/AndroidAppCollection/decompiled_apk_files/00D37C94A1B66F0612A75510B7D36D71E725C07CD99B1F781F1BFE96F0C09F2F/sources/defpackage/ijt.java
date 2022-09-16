package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: ijt  reason: default package */
/* loaded from: classes3.dex */
public final class ijt implements aafl {
    private final ijc a;

    public ijt(ijc ijcVar) {
        this.a = ijcVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (apzgVar.qn(atwk.b)) {
            this.a.a();
        } else if (apzgVar.qn(atwn.b)) {
            ijc ijcVar = this.a;
            ijcVar.a();
            afrm afrmVar = (afrm) ijcVar.c.f("edit_thumbnails_fragment");
            if (afrmVar == null) {
                return;
            }
            afrmVar.ae = true;
        } else if (!apzgVar.qn(atwm.b)) {
        } else {
            this.a.a();
        }
    }
}
