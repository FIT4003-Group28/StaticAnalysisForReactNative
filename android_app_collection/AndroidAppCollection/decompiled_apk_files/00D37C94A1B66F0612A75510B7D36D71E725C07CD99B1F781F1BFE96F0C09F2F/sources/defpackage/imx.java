package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: imx  reason: default package */
/* loaded from: classes3.dex */
public final class imx {
    public final imw a;
    public final Map b = new HashMap();

    public imx(imw imwVar) {
        this.a = imwVar;
    }

    public final void a(String str) {
        imv imvVar = (imv) this.b.remove(str);
        if (imvVar != null) {
            imvVar.c();
            imvVar.c.qZ(null);
            if (imvVar.n.isEmpty()) {
                return;
            }
            aajs c = imvVar.d.c();
            c.g(imvVar.n);
            c.b().T();
        }
    }
}
