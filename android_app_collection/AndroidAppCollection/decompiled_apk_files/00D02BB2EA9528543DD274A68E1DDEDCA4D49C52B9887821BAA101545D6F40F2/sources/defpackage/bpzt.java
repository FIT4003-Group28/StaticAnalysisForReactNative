package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bpzt  reason: default package */
/* loaded from: classes4.dex */
final class bpzt extends bptg {
    final /* synthetic */ bpzx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpzt(bpzx bpzxVar, boxa boxaVar, acwo acwoVar, bvrb bvrbVar) {
        super(boxaVar, acwoVar, bvrbVar);
        this.b = bpzxVar;
    }

    @Override // defpackage.bptp
    public final void a(dwhd dwhdVar) {
        int a = dwhc.a(dwhdVar.b);
        if (a != 0 && a == 4) {
            bpzx bpzxVar = this.b;
            dnof dnofVar = dwhdVar.c;
            if (dnofVar == null) {
                dnofVar = dnof.b;
            }
            for (dneq dneqVar : dnofVar.a) {
                dqgh b = dqgh.b(dneqVar.a);
                int a2 = dneo.a(dneqVar.b);
                if (a2 != 0 && a2 == 2 && b == dqgh.NAME) {
                    String string = bpzxVar.b.getString(R.string.RAP_INVALID_NAME);
                    bpzxVar.f.x(true);
                    bpzxVar.f.y(string);
                    cqkx.p(bpzxVar.f);
                    return;
                }
            }
        }
    }
}
