package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: albj  reason: default package */
/* loaded from: classes2.dex */
public final class albj {
    @dzsi
    public albg a;

    public albj() {
        dcba.a(100);
    }

    public final void a(int i, List<albk> list) {
        albg albgVar = this.a;
        if (albgVar != null) {
            albi albiVar = new albi(i, list);
            albi a = albgVar.a(albiVar.b);
            if (a != null) {
                a.a.addAll(albiVar.a);
                return;
            }
            albgVar.a.add(albiVar);
        }
    }
}
