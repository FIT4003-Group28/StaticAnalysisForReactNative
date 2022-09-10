package defpackage;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cgec  reason: default package */
/* loaded from: classes4.dex */
final class cgec implements Serializable {
    public final byte[] a;
    public final Map<dspd, Serializable> b;

    public cgec(cgwi cgwiVar) {
        bxeq l = cgwiVar.l();
        this.a = l != null ? ((chal) l).F().bS() : new byte[0];
        this.b = new HashMap();
        for (cgwg cgwgVar : cgwiVar.e()) {
            Serializable D = cgwgVar.D();
            if (D != null && !cgwgVar.v().booleanValue()) {
                this.b.put(cgwgVar.F().d, D);
            }
        }
    }
}
