package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cgeb  reason: default package */
/* loaded from: classes4.dex */
public final class cgeb implements Serializable {
    public final ArrayList<byte[]> a;
    public final ArrayList<byte[]> b;
    int c;
    @dzsi
    public final cgec d;

    public cgeb(chac chacVar) {
        cgzd z = chacVar.z();
        this.a = new ArrayList<>();
        for (dspd dspdVar : z.a) {
            this.a.add(dspdVar.G());
        }
        this.b = new ArrayList<>();
        for (dspd dspdVar2 : z.b) {
            this.b.add(dspdVar2.G());
        }
        cgwi H = chacVar.H();
        this.d = H != null ? new cgec(H) : null;
    }
}
