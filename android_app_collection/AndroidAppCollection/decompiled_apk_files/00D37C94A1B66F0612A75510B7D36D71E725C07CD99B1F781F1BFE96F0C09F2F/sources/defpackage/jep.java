package defpackage;
/* compiled from: PG */
/* renamed from: jep  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jep implements zdt {
    public final /* synthetic */ jer a;
    public final /* synthetic */ amuk b;
    public final /* synthetic */ amuk c;
    public final /* synthetic */ acti d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ ampq h;
    private final /* synthetic */ int i;

    public /* synthetic */ jep(jer jerVar, amuk amukVar, amuk amukVar2, acti actiVar, String str, String str2, String str3, ampq ampqVar) {
        this.a = jerVar;
        this.b = amukVar;
        this.c = amukVar2;
        this.d = actiVar;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = ampqVar;
    }

    public /* synthetic */ jep(jer jerVar, amuk amukVar, amuk amukVar2, acti actiVar, String str, String str2, String str3, ampq ampqVar, int i) {
        this.i = i;
        this.a = jerVar;
        this.b = amukVar;
        this.c = amukVar2;
        this.d = actiVar;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = ampqVar;
    }

    @Override // defpackage.zdt
    public final void a(Object obj) {
        if (this.i == 0) {
            jer jerVar = this.a;
            amuk amukVar = this.b;
            amuk amukVar2 = this.c;
            acti actiVar = this.d;
            String str = this.e;
            String str2 = this.f;
            String str3 = this.g;
            ampq ampqVar = this.h;
            String valueOf = String.valueOf((Throwable) obj);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
            sb.append("Failed to read the offlineStreamSelection value.");
            sb.append(valueOf);
            zep.b(sb.toString());
            jerVar.b(amukVar, amukVar2, actiVar, str, str2, false, str3, ampqVar);
            return;
        }
        this.a.b(this.b, this.c, this.d, this.e, this.f, Boolean.TRUE.equals((Boolean) obj), this.g, this.h);
    }
}
