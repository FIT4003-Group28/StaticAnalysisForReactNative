package defpackage;
/* compiled from: PG */
/* renamed from: uod  reason: default package */
/* loaded from: classes4.dex */
public final class uod {
    public uok a;
    public adtz b;

    public uod() {
    }

    public uod(uoe uoeVar) {
        this.b = uoeVar.b;
        this.a = uoeVar.a;
    }

    public final uoe a() {
        uok uokVar;
        adtz adtzVar = this.b;
        if (adtzVar == null || (uokVar = this.a) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.b == null) {
                sb.append(" onContinueWithAccountListenerWithAsyncCallback");
            }
            if (this.a == null) {
                sb.append(" features");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new uoe(adtzVar, uokVar);
    }
}
