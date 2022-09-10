package defpackage;
/* compiled from: PG */
/* renamed from: crra  reason: default package */
/* loaded from: classes5.dex */
public final class crra extends crpu {
    public final aryv a;
    public final akqq c;
    private final long d;

    public crra(aryv aryvVar, akqq akqqVar, long j) {
        this.a = aryvVar;
        this.c = akqqVar;
        this.d = j;
    }

    @Override // defpackage.crqw
    public final crqv a() {
        return crqv.SPEED_LIMIT_MODERATION;
    }

    @Override // defpackage.crqw
    public final boolean b() {
        return false;
    }

    @Override // defpackage.crqw
    public final boolean c() {
        return true;
    }

    @Override // defpackage.crpu, defpackage.crqw
    public final long f() {
        return this.d + 6000;
    }
}
