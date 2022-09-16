package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: aabs  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aabs implements ylw {
    public final /* synthetic */ aabt a;
    private final /* synthetic */ int b;

    public /* synthetic */ aabs(aabt aabtVar) {
        this.a = aabtVar;
    }

    public /* synthetic */ aabs(aabt aabtVar, int i) {
        this.b = i;
        this.a = aabtVar;
    }

    @Override // defpackage.ylw, defpackage.zdt
    public final void a(Object obj) {
        if (this.b == 0) {
            aabt aabtVar = this.a;
            if (((arwj) obj) == null) {
                aabtVar.b(7);
                return;
            } else {
                aabtVar.b(8);
                return;
            }
        }
        final aabt aabtVar2 = this.a;
        arlb arlbVar = (arlb) obj;
        if (arlbVar == null || (arlbVar.b & 2) == 0) {
            afus.b(2, 12, "Received an empty response without a challenge.");
            aabtVar2.b(2);
            return;
        }
        final String str = arlbVar.d;
        String valueOf = String.valueOf(str);
        zgp b = zgp.b(Uri.parse(valueOf.length() != 0 ? "?".concat(valueOf) : new String("?")));
        if (!aabt.a(b, "c5a") || !b.d("c5a").equals("1")) {
            afus.b(2, 12, "Received invalid challenge.");
            aabtVar2.b(5);
            return;
        }
        amup k = amup.k("atr_challenge", str);
        qys qysVar = aabtVar2.f;
        String valueOf2 = String.valueOf(str);
        zgp b2 = zgp.b(Uri.parse(valueOf2.length() != 0 ? "?".concat(valueOf2) : new String("?")));
        qysVar.a(aabt.a(b2, "c5b") ? b2.d("c5b") : "", k, new qyu() { // from class: aabq
            @Override // defpackage.qyu
            public final void a(String str2) {
                aabt aabtVar3 = aabt.this;
                String str3 = str;
                afvm c = aabtVar3.b.c();
                aasz aaszVar = aabtVar3.e;
                aasy aasyVar = new aasy(aaszVar.e, c, aabtVar3.c.f(), c.g());
                aasyVar.a = str3;
                aasyVar.b = str2;
                aasz aaszVar2 = aabtVar3.e;
                ylx.k(aaszVar2.a.b(aasyVar, aabtVar3.a), anjk.a, new aabr(aabtVar3), new aabs(aabtVar3));
            }
        });
    }
}
