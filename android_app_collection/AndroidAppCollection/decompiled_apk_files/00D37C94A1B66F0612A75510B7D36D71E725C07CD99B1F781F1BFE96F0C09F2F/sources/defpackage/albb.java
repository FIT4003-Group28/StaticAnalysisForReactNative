package defpackage;
/* compiled from: PG */
/* renamed from: albb  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class albb implements yjb {
    private final /* synthetic */ int d;
    public static final /* synthetic */ albb c = new albb(2);
    public static final /* synthetic */ albb b = new albb(1);
    public static final /* synthetic */ albb a = new albb();

    private /* synthetic */ albb() {
    }

    private /* synthetic */ albb(int i) {
        this.d = i;
    }

    @Override // defpackage.yjb
    public final Object a(Object obj) {
        int i = this.d;
        if (i == 0) {
            arpa arpaVar = ((asfl) obj).b;
            return arpaVar == null ? arpa.a : arpaVar;
        } else if (i == 1) {
            arpa arpaVar2 = ((asfj) obj).b;
            return arpaVar2 == null ? arpa.a : arpaVar2;
        } else {
            arpa arpaVar3 = ((asfp) obj).c;
            return arpaVar3 == null ? arpa.a : arpaVar3;
        }
    }
}
