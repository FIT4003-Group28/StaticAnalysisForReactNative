package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: adfg  reason: default package */
/* loaded from: classes.dex */
public final class adfg {
    public final adkr a;
    public ampr b;
    public final adih d;
    private ampr e;
    public final Object c = new Object();
    private final Object f = new Object();

    public adfg(adkr adkrVar, adih adihVar, byte[] bArr) {
        this.a = adkrVar;
        this.d = adihVar;
    }

    public final adff a(String str) {
        adff a;
        aqxo.p(!TextUtils.isEmpty(str));
        synchronized (this.f) {
            ampr amprVar = this.e;
            if (amprVar != null && adgl.c((String) amprVar.a, str)) {
                a = (adff) this.e.b;
            }
            a = adff.a().a();
        }
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(String str, adff adffVar) {
        aqxo.p(!TextUtils.isEmpty(str));
        synchronized (this.f) {
            this.e = adffVar == null ? null : ampr.a(str, adffVar);
        }
    }
}
