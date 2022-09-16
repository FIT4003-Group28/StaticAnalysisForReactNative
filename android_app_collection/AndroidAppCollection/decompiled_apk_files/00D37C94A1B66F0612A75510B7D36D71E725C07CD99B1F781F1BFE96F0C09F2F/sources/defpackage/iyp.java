package defpackage;
/* compiled from: PG */
/* renamed from: iyp  reason: default package */
/* loaded from: classes3.dex */
public final class iyp extends aias implements ynl {
    private final adoa a;

    public iyp(adoa adoaVar, airr airrVar, aire aireVar, aiaq aiaqVar) {
        super(airrVar, aireVar, aiaqVar);
        this.a = adoaVar;
    }

    @Override // defpackage.aias, defpackage.aiap
    public final void a() {
        adnt e = this.a.e();
        if (e != null) {
            e.H();
        } else {
            super.a();
        }
    }

    @Override // defpackage.aias, defpackage.aiap
    public final void b() {
        adnt e = this.a.e();
        if (e != null) {
            e.M();
        } else {
            super.b();
        }
    }

    @Override // defpackage.aias, defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (cls == iyp.class) {
            if (i == -1) {
                return new Class[]{ahhl.class};
            }
            if (i == 0) {
                ahhl ahhlVar = (ahhl) obj;
                e();
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return ahfc.c(this, obj, i);
    }
}
