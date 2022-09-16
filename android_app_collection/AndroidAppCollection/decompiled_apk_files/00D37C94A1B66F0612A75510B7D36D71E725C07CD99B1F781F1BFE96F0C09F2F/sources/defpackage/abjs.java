package defpackage;

import android.text.TextUtils;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: abjs  reason: default package */
/* loaded from: classes.dex */
public final class abjs implements abgz, abjh, afzf {
    private String a;
    private assu b;
    private ajvj c;
    private final abiq d;
    private final abha e;
    private final yzj f;
    private final String g;
    private abri h;
    private abrd i;
    private TextView j;

    public abjs(abiq abiqVar, abha abhaVar, yzj yzjVar, ajvj ajvjVar, assu assuVar, String str, abri abriVar, abrd abrdVar, TextView textView) {
        this.d = abiqVar;
        this.e = abhaVar;
        this.f = yzjVar;
        this.c = ajvjVar;
        this.b = assuVar;
        this.g = str;
        this.h = abriVar;
        this.i = abrdVar;
        this.j = textView;
    }

    public abjs(abiq abiqVar, abha abhaVar, yzj yzjVar, String str, String str2) {
        this.d = abiqVar;
        this.e = abhaVar;
        this.f = yzjVar;
        this.a = str;
        this.g = str2;
    }

    @Override // defpackage.abjh
    public final abgz a() {
        return this;
    }

    @Override // defpackage.abjh
    public final afzf b() {
        return this;
    }

    @Override // defpackage.abjh
    public final assu c() {
        return this.b;
    }

    @Override // defpackage.abjh
    public final String d() {
        return this.g;
    }

    @Override // defpackage.abjh
    public final String e() {
        return this.a;
    }

    @Override // defpackage.abgz
    public final abhb f() {
        abiq abiqVar = this.d;
        if (abiqVar != null) {
            return abiqVar.g;
        }
        return null;
    }

    @Override // defpackage.abgz
    public final abhe g() {
        abiq abiqVar = this.d;
        if (abiqVar != null) {
            return abiqVar.k;
        }
        return null;
    }

    @Override // defpackage.abgz
    public final abhg h() {
        abiq abiqVar = this.d;
        if (abiqVar != null) {
            return abiqVar.b;
        }
        return null;
    }

    @Override // defpackage.abgz
    public final abhi i() {
        abiq abiqVar = this.d;
        if (abiqVar != null) {
            return abiqVar;
        }
        return null;
    }

    @Override // defpackage.abgz
    public final abhk k() {
        abiq abiqVar = this.d;
        if (abiqVar != null) {
            return abiqVar.l;
        }
        return null;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        this.f.e(cffVar);
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.abgz
    public final abho l() {
        abiq abiqVar = this.d;
        if (abiqVar != null) {
            return abiqVar.o();
        }
        return null;
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        asqo asqoVar;
        ascm ascmVar = (ascm) obj;
        if (this.d == null) {
            return;
        }
        abrd abrdVar = this.i;
        if (abrdVar != null) {
            abrdVar.n(false);
        }
        abri abriVar = this.h;
        if (abriVar != null && (ascmVar.b & 4) == 0) {
            abriVar.p();
        }
        this.e.a(ascmVar.d, this, true);
        asck asckVar = ascmVar.e;
        if (asckVar == null) {
            asckVar = asck.a;
        }
        if (asckVar.b != 136403337) {
            return;
        }
        asck asckVar2 = ascmVar.e;
        if (asckVar2 == null) {
            asckVar2 = asck.a;
        }
        if (asckVar2.b == 136403337) {
            asqoVar = (asqo) asckVar2.c;
        } else {
            asqoVar = asqo.a;
        }
        arag aragVar = asqoVar.c;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        zag.m(this.j, ajgl.b(aragVar));
    }

    @Override // defpackage.abgz
    public final abhw m() {
        abiq abiqVar = this.d;
        if (abiqVar != null) {
            return abiqVar.d;
        }
        return null;
    }

    @Override // defpackage.abgz
    public final Object n(String str) {
        ajvj ajvjVar;
        if (TextUtils.equals(str, "ClientMessageIdKey")) {
            return this.g;
        }
        if (!TextUtils.equals(str, "MessageKey")) {
            return null;
        }
        assu assuVar = this.b;
        return (assuVar == null || (ajvjVar = this.c) == null) ? this.a : ajvjVar.a(assuVar);
    }
}
