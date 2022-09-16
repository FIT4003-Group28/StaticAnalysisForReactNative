package defpackage;

import java.util.HashMap;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: rll  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class rll implements Callable {
    public final /* synthetic */ rlp a;
    public final /* synthetic */ String b;
    private final /* synthetic */ int c;

    public /* synthetic */ rll(rlp rlpVar, String str) {
        this.a = rlpVar;
        this.b = str;
    }

    public /* synthetic */ rll(rlp rlpVar, String str, int i) {
        this.c = i;
        this.a = rlpVar;
        this.b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.c;
        if (i != 0) {
            if (i == 1) {
                return new dpz(new rlo(this.a, this.b));
            }
            return new dqe(new rll(this.a, this.b));
        }
        rlp rlpVar = this.a;
        String str = this.b;
        rix f = rlpVar.R().f(str);
        HashMap hashMap = new HashMap();
        hashMap.put("platform", "android");
        hashMap.put("package_name", str);
        rlpVar.J().y();
        hashMap.put("gmp_version", 43009L);
        if (f != null) {
            String p = f.p();
            if (p != null) {
                hashMap.put("app_version", p);
            }
            hashMap.put("app_version_int", Long.valueOf(f.b()));
            hashMap.put("dynamite_version", Long.valueOf(f.e()));
        }
        return hashMap;
    }
}
