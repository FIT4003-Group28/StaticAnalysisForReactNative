package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: kng  reason: default package */
/* loaded from: classes3.dex */
public final class kng implements aafl {
    private final aizb a;
    private final gca b;

    public kng(gca gcaVar, aizb aizbVar) {
        this.b = gcaVar;
        this.a = aizbVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        gca gcaVar = this.b;
        boolean d = this.a.d();
        boolean k = elk.k(this.b.a());
        int i = 0;
        if (k) {
            if (!d) {
                i = 5;
                gcaVar.d(i);
            }
            d = true;
        }
        if (!k && d) {
            i = 3;
        }
        gcaVar.d(i);
    }
}
