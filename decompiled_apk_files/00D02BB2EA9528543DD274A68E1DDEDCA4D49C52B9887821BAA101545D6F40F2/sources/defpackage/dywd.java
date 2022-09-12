package defpackage;
/* compiled from: PG */
/* renamed from: dywd  reason: default package */
/* loaded from: classes6.dex */
final class dywd implements dysa {
    final /* synthetic */ dywh a;

    public dywd(dywh dywhVar) {
        this.a = dywhVar;
    }

    @Override // defpackage.dysa
    public final int a() {
        int i = this.a.m;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                return 443;
            }
            StringBuilder sb = new StringBuilder(15);
            sb.append("TLS");
            sb.append(" not handled");
            throw new AssertionError(sb.toString());
        }
        throw null;
    }
}
