package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: bqxn  reason: default package */
/* loaded from: classes4.dex */
final class bqxn implements dbty<byte[]> {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ bqxo c;

    public bqxn(bqxo bqxoVar, int i, int i2) {
        this.c = bqxoVar;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.dbty
    public final /* bridge */ /* synthetic */ byte[] a() {
        Locale locale = Locale.getDefault();
        awck awckVar = this.c.a;
        String locale2 = locale.toString();
        bqxo bqxoVar = this.c;
        byte[] g = awckVar.g(locale2, bqxoVar.d, this.a, this.b, bqxoVar.b);
        if (g != null) {
            this.c.c = true;
        } else {
            try {
                bqxo bqxoVar2 = this.c;
                bqxoVar2.a.j(bqxoVar2.b);
                this.c.c = true;
            } catch (anam e) {
                if (!e.a.equals(drtc.NOT_FOUND)) {
                    throw e;
                }
                this.c.c = false;
            }
        }
        return g;
    }
}
