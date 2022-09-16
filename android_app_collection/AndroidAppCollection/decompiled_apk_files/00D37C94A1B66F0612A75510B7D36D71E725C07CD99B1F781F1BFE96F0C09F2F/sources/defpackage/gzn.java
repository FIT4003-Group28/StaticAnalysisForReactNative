package defpackage;
/* compiled from: PG */
/* renamed from: gzn  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gzn implements ayqb {
    public final /* synthetic */ gzt a;
    private final /* synthetic */ int b;

    public /* synthetic */ gzn(gzt gztVar) {
        this.a = gztVar;
    }

    public /* synthetic */ gzn(gzt gztVar, int i) {
        this.b = i;
        this.a = gztVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        axbo axboVar;
        if (this.b == 0) {
            this.a.aM(((Boolean) obj).booleanValue());
            return;
        }
        gzt gztVar = this.a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        gztVar.aM(booleanValue);
        if (!gztVar.az && !gztVar.aA) {
            return;
        }
        if (booleanValue) {
            axboVar = axbo.PREVIEW_MODE_MINI;
        } else if (gztVar.aA) {
            axboVar = axbo.PREVIEW_MODE_REGULAR;
        } else {
            axboVar = axbo.PREVIEW_MODE_UNSPECIFIED;
        }
        String valueOf = String.valueOf(axboVar.toString());
        if (valueOf.length() != 0) {
            "Updating preview mode: ".concat(valueOf);
        }
        gztVar.ah.p(axboVar);
    }
}
