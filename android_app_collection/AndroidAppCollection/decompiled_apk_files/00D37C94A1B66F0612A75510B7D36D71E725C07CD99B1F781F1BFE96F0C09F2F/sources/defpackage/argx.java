package defpackage;

import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;
/* compiled from: PG */
/* renamed from: argx  reason: default package */
/* loaded from: classes2.dex */
public final class argx extends aopi implements aoqv {
    public static final argx a;
    private static volatile aorb v;
    public int b;
    public apdv c;
    public aprh d;
    public aqdg e;
    public atim f;
    public auce g;
    public augn h;
    public augp i;
    public aumj j;
    public aupl k;
    public avxc l;
    public ReelItemRendererOuterClass$ReelItemRenderer m;
    public ardt n;
    public aquu o;
    public arbq p;
    public arjl q;
    public asxd r;
    public aqtb s;
    public arfe t;
    public aumi u;
    private byte w = 2;

    static {
        argx argxVar = new argx();
        a = argxVar;
        aopi.registerDefaultInstance(argx.class, argxVar);
    }

    private argx() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.w);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.w = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0013\u0000\u0001啕\u1cc9\uf166銚\u0013\u0000\u0000\u0013啕\u1cc9ᐉ\u0011\ueabc⩬ᐉ\bﻶ㥌ᐉ\tﱋ㥩ᐉ\u0000ﲺ㨷ᐉ\u0003\ue69e㩒ᐉ\u0012\ue8dc㩦ᐉ\u0007\ue7a9㬞ᐉ\u0004\uf255㵣ᐉ\u0001\uf103䅟ᐉ\u0002\ue0bf䕚ᐉ\u000b\uf37f䖯ᐉ\u0006\uf492䤳ᐉ\u0010\ue656䦔ᐉ\u0005\ue156䯃ᐉ\n\ue362倦ᐉ\f\uec2c岒ᐉ\r\uedff谟ᐉ\u000e\uf166銚ᐉ\u000f", new Object[]{"b", "t", "k", "l", "c", "f", "u", "j", "g", "d", "e", "n", "i", "s", "h", "m", "o", "p", "q", "r"});
            case 3:
                return new argx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = v;
                if (aorbVar == null) {
                    synchronized (argx.class) {
                        aorbVar = v;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            v = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
