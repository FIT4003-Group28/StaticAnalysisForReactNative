package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: afbp  reason: default package */
/* loaded from: classes.dex */
public abstract class afbp implements afbw {
    final afbo a;
    final /* synthetic */ afbx b;

    public afbp(afbx afbxVar, afbo afboVar) {
        this.b = afbxVar;
        this.a = afboVar;
    }

    @Override // defpackage.afbw
    public final int b() {
        int a = a();
        if (a == 1) {
            return 0;
        }
        return this.b.a.a(a - 1);
    }

    @Override // defpackage.afbw
    public final /* synthetic */ long c() {
        return -9223372036854775807L;
    }

    @Override // defpackage.afbw
    public boolean e() {
        throw null;
    }
}
