package defpackage;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: afwo  reason: default package */
/* loaded from: classes.dex */
public final class afwo extends afyl implements afxa {
    public final afvm a;
    public final snc b;
    public final String c;
    public final long k;
    public final long l;
    public final List m;
    public final Set n;
    private final String q;
    private final Set r;
    private final byte[] s;
    private final Map t;
    private final afxt u;

    public afwo(int i, String str, String str2, long j, long j2, List list, byte[] bArr, Map map, cez cezVar, Set set, snc sncVar, int i2, afvm afvmVar, String str3, afxt afxtVar) {
        super(i, str, cezVar);
        boolean z = true;
        aqxo.y(i != 1 || (map == null && bArr == null));
        if (map != null && bArr != null) {
            z = false;
        }
        aqxo.y(z);
        this.f = new cet((int) TimeUnit.SECONDS.toMillis(i2), 0, 0.0f);
        this.h = false;
        str2.getClass();
        this.c = str2;
        this.k = j;
        this.l = j2;
        this.m = list;
        this.s = bArr;
        this.t = map;
        this.r = set;
        this.b = sncVar;
        afvmVar.getClass();
        this.a = afvmVar;
        this.q = str3;
        afxtVar.getClass();
        this.u = afxtVar;
        this.n = new HashSet();
    }

    @Override // defpackage.afyl, defpackage.afye
    public final afvm e() {
        return this.a;
    }

    @Override // defpackage.yua
    public final Map f() {
        HashMap hashMap = new HashMap();
        for (afxq afxqVar : this.r) {
            if (this.u.a(afxqVar.a())) {
                this.n.add(afxqVar.a());
                try {
                    afxqVar.b(hashMap, this);
                } catch (ceq e) {
                    String valueOf = String.valueOf(e.toString());
                    zep.b(valueOf.length() != 0 ? "HttpPingRequest: AuthFailureError".concat(valueOf) : new String("HttpPingRequest: AuthFailureError"));
                }
            }
        }
        return hashMap;
    }

    @Override // defpackage.yua
    public final void o(cff cffVar) {
        cew cewVar = cffVar.b;
    }

    @Override // defpackage.yua
    public final byte[] qA() {
        byte[] bArr = this.s;
        if (bArr != null) {
            return bArr;
        }
        Map map = this.t;
        if (map == null || map.isEmpty()) {
            return null;
        }
        try {
            return yqt.d(this.t, "UTF-8").c();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.yua
    public final cfb qy(cew cewVar) {
        return cfb.b(null, null);
    }

    @Override // defpackage.yua
    public final /* bridge */ /* synthetic */ void qz(Object obj) {
        Void r1 = (Void) obj;
    }

    @Override // defpackage.afyl, defpackage.afye
    public final String u() {
        return this.q;
    }

    @Override // defpackage.afyl, defpackage.afye
    public final boolean z() {
        return this.q != null;
    }
}
