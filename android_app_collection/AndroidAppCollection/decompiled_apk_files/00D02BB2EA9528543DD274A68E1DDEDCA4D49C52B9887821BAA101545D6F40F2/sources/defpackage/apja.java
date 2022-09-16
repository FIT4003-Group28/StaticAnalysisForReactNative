package defpackage;
/* compiled from: PG */
/* renamed from: apja  reason: default package */
/* loaded from: classes2.dex */
final class apja implements acnw {
    final /* synthetic */ apjb a;

    public apja(apjb apjbVar) {
        this.a = apjbVar;
    }

    @Override // defpackage.acnw
    public final void a(int i, int i2, boolean z, boolean z2) {
        int intValue = this.a.Os().intValue();
        if (intValue == 0) {
            this.a.a.b(aowo.RECENT);
        } else if (intValue == 1) {
            this.a.a.b(aowo.CITIES);
        } else if (intValue != 2) {
        } else {
            this.a.a.b(aowo.COUNTRIES);
        }
    }
}
