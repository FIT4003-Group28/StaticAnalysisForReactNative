package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: crwt  reason: default package */
/* loaded from: classes5.dex */
public final class crwt extends crxa {
    private String a;
    private crti b;
    private dcdc<String> c;
    private Long d;

    public crwt() {
    }

    public crwt(crxb crxbVar) {
        crwu crwuVar = (crwu) crxbVar;
        this.a = crwuVar.a;
        this.b = crwuVar.b;
        this.c = crwuVar.c;
        this.d = crwuVar.d;
    }

    @Override // defpackage.crxa
    public final void b(List<String> list) {
        this.c = dcdc.r(list);
    }

    @Override // defpackage.crxa
    public final void c(crti crtiVar) {
        if (crtiVar != null) {
            this.b = crtiVar;
            return;
        }
        throw new NullPointerException("Null requestData");
    }

    @Override // defpackage.crxa
    public final void d(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null requestId");
    }

    @Override // defpackage.crxa
    public final void e(Long l) {
        if (l != null) {
            this.d = l;
            return;
        }
        throw new NullPointerException("Null requestTime");
    }

    @Override // defpackage.crxa
    public final crxb a() {
        String str = this.a == null ? " requestId" : "";
        if (this.b == null) {
            str = str.concat(" requestData");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" gpuMediaIdList");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" requestTime");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new crwu(this.a, this.b, this.c, this.d);
    }
}
