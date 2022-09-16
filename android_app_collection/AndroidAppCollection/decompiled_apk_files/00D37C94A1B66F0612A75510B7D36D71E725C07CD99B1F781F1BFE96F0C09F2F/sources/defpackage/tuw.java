package defpackage;
/* compiled from: PG */
/* renamed from: tuw  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class tuw implements anir {
    public final /* synthetic */ tve a;
    public final /* synthetic */ tzb b;
    private final /* synthetic */ int c;

    public /* synthetic */ tuw(tve tveVar, tzb tzbVar) {
        this.a = tveVar;
        this.b = tzbVar;
    }

    public /* synthetic */ tuw(tve tveVar, tzb tzbVar, int i) {
        this.c = i;
        this.a = tveVar;
        this.b = tzbVar;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        int i = this.c;
        if (i != 0) {
            if (i == 1) {
                return this.a.h(this.b, (tzb) obj, 1104);
            }
            if (i == 2) {
                return this.a.h(this.b, (tzb) obj, 1102);
            }
            return this.a.h(this.b, (tzb) obj, 1101);
        }
        return this.a.h(this.b, (tzb) obj, 1100);
    }
}
