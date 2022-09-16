package defpackage;
/* compiled from: PG */
/* renamed from: aplw  reason: default package */
/* loaded from: classes.dex */
public final class aplw extends aopi implements aoqv {
    public static final aplw a;
    private static volatile aorb i;
    private byte A = 2;
    public int b;
    public apmm c;
    public aplz d;
    public apmf e;
    public atfh f;
    public aplx g;
    public apmo h;
    private apmr j;
    private apms k;
    private apmt l;
    private apmc m;
    private apmq n;
    private aply o;
    private aplv p;
    private avop q;
    private avsb r;
    private apmd s;
    private aplu t;
    private atnm u;
    private asmv v;
    private asmi w;
    private atks x;
    private apma y;
    private apme z;

    static {
        aplw aplwVar = new aplw();
        a = aplwVar;
        aopi.registerDefaultInstance(aplw.class, aplwVar);
    }

    private aplw() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.A);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.A = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0017\u0000\u0001\uedbbᡂ\uf23c飏\u0017\u0000\u0000\u0015\uedbbᡂᐉ\u0004\ue7d2ᡆᐉ\u0003ￆᡇᐉ\u0001\ue5d8ᡈᐉ\u0000\ue5f3ᡉᐉ\u0002\ue14a\u1cb1ᐉ\u0007\ue1acṯဉ\b\ue859ἀᐉ\u000fￜ⚌ᐉ\t\ue425⩷ᐉ\n\uf6ea⪗ᐉ\u000bﻠⷡᐉ\r\ue384〠ᐉ\u0010\ue496㴵ᐉ\u0011\uef0d䄖ᐉ\u000eￊ䈕ᐉ\u0012\uead0䫓ᐉ\u0013\uf547偵ᐉ\u0014\uee97八ᐉ\u0015\uf682嗮ᐉ\u0017\ue16b蓉ဉ\u0018\ue16c蓉ᐉ\u0019\uf23c飏ᐉ\u001a", new Object[]{"b", "l", "k", "d", "c", "j", "m", "e", "s", "n", "o", "p", "q", "t", "f", "r", "u", "g", "v", "w", "x", "h", "y", "z"});
            case 3:
                return new aplw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (aplw.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
