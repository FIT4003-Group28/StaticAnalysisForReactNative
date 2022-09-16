package defpackage;
/* compiled from: PG */
/* renamed from: isw  reason: default package */
/* loaded from: classes3.dex */
public final class isw {
    private final Object a;
    private final ampq b;
    private final ampq c;
    private final ampq d;
    private final ampq e;
    private final ampq f;
    private final ampq g;
    private final ampq h;

    private isw(Object obj, aunk aunkVar) {
        ater aterVar;
        atpl atplVar;
        apsm apsmVar;
        arkf arkfVar;
        ateo ateoVar;
        atou atouVar;
        this.a = obj;
        aunkVar.getClass();
        int i = aunkVar.b;
        aqxo.q(((i & 4) == 0 && (i & 1) == 0 && (i & 16) == 0 && (i & 32) == 0 && (i & 8) == 0 && (i & 2) == 0 && (i & 512) == 0) ? false : true, "At least one renderer must be non-null");
        aukz aukzVar = null;
        if ((aunkVar.b & 4) != 0) {
            aterVar = aunkVar.e;
            if (aterVar == null) {
                aterVar = ater.a;
            }
        } else {
            aterVar = null;
        }
        this.b = ampq.i(aterVar);
        if ((aunkVar.b & 1) != 0) {
            atplVar = aunkVar.c;
            if (atplVar == null) {
                atplVar = atpl.a;
            }
        } else {
            atplVar = null;
        }
        this.c = ampq.i(atplVar);
        if ((aunkVar.b & 16) != 0) {
            apsmVar = aunkVar.g;
            if (apsmVar == null) {
                apsmVar = apsm.a;
            }
        } else {
            apsmVar = null;
        }
        this.d = ampq.i(apsmVar);
        if ((aunkVar.b & 32) != 0) {
            arkfVar = aunkVar.h;
            if (arkfVar == null) {
                arkfVar = arkf.a;
            }
        } else {
            arkfVar = null;
        }
        this.e = ampq.i(arkfVar);
        if ((aunkVar.b & 8) != 0) {
            ateoVar = aunkVar.f;
            if (ateoVar == null) {
                ateoVar = ateo.a;
            }
        } else {
            ateoVar = null;
        }
        this.f = ampq.i(ateoVar);
        if ((aunkVar.b & 2) != 0) {
            atouVar = aunkVar.d;
            if (atouVar == null) {
                atouVar = atou.a;
            }
        } else {
            atouVar = null;
        }
        this.g = ampq.i(atouVar);
        if ((aunkVar.b & 512) != 0 && (aukzVar = aunkVar.i) == null) {
            aukzVar = aukz.a;
        }
        this.h = ampq.i(aukzVar);
    }

    public static isw a(Object obj, aunk aunkVar) {
        return new isw(obj, aunkVar);
    }

    public ampq b() {
        return this.e;
    }

    public ampq c() {
        return this.f;
    }

    public ampq d() {
        return this.b;
    }

    public ampq e() {
        return this.g;
    }

    public ampq f() {
        return this.c;
    }

    public ampq g() {
        return this.h;
    }

    public Object h() {
        return this.a;
    }
}
