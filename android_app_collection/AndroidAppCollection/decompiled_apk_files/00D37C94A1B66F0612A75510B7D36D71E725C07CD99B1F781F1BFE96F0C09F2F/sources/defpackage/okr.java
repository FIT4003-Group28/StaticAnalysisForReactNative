package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: okr  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class okr implements zdt {
    public final /* synthetic */ oku a;
    public final /* synthetic */ zdt b;
    private final /* synthetic */ int c;

    public /* synthetic */ okr(oku okuVar, zdt zdtVar) {
        this.a = okuVar;
        this.b = zdtVar;
    }

    public /* synthetic */ okr(oku okuVar, zdt zdtVar, int i) {
        this.c = i;
        this.a = okuVar;
        this.b = zdtVar;
    }

    @Override // defpackage.zdt
    public final void a(Object obj) {
        boolean z = true;
        if (this.c == 0) {
            oku okuVar = this.a;
            zdt zdtVar = this.b;
            okz okzVar = (okz) obj;
            if (okuVar.d < 3 || okzVar == null || okzVar.c) {
                z = false;
            }
            zdtVar.a(Boolean.valueOf(z));
            return;
        }
        oku okuVar2 = this.a;
        zdt zdtVar2 = this.b;
        okz okzVar2 = (okz) obj;
        if (okuVar2.d < 6 || okzVar2 == null || okzVar2.e == 0 || okzVar2.d || okuVar2.a.c() < okzVar2.e + TimeUnit.HOURS.toMillis(24L)) {
            z = false;
        }
        zdtVar2.a(Boolean.valueOf(z));
    }
}
