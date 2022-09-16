package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: phv  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class phv implements pwe {
    public final /* synthetic */ pjs a;
    private final /* synthetic */ int b;

    public /* synthetic */ phv(pjs pjsVar, int i) {
        this.b = i;
        this.a = pjsVar;
    }

    @Override // defpackage.pwe
    public final void a(Object obj) {
        switch (this.b) {
            case 0:
                pjs pjsVar = this.a;
                pjv pjvVar = (pjv) obj;
                boolean z = pjsVar.f;
                pjvVar.ab();
                pjvVar.n(pjsVar.f);
                return;
            case 1:
                List list = this.a.i;
                ((pjv) obj).ao();
                return;
            case 2:
                pjs pjsVar2 = this.a;
                ((pjv) obj).s(pjsVar2.j, pjsVar2.d);
                return;
            case 3:
                ((pjv) obj).q(this.a.d);
                return;
            case 4:
                int i = this.a.k;
                ((pjv) obj).am();
                return;
            case 5:
                ((pjv) obj).o(pig.E(this.a));
                return;
            case 6:
                ((pjv) obj).p(this.a.l);
                return;
            case 7:
                phr phrVar = this.a.e;
                ((pjv) obj).ac();
                return;
            default:
                ((pjv) obj).r(this.a.e);
                return;
        }
    }
}
