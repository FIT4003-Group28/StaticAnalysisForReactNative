package defpackage;

import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;
/* compiled from: PG */
/* renamed from: arfa  reason: default package */
/* loaded from: classes2.dex */
public final class arfa extends aopi implements aoqv {
    private static volatile aorb Z;
    public static final arfa a;
    public auje A;
    public ReelItemRendererOuterClass$ReelItemRenderer B;
    public avhz C;
    public avsk D;
    public avox E;
    public avpm F;
    public avpz G;
    public avqa H;
    public avqc I;

    /* renamed from: J  reason: collision with root package name */
    public avrb f98J;
    public avre K;
    public arcp L;
    public arcv M;
    public arco N;
    public apnq O;
    public augd P;
    public aukq Q;
    public atmt R;
    public atkj S;
    public arbq T;
    public avqi U;
    public avlh V;
    public avwp W;
    public atlj X;
    public aqgy Y;
    private byte aa = 2;
    public int b;
    public int c;
    public aqfa d;
    public aqio e;
    public aqdi f;
    public aqei g;
    public aqej h;
    public aqea i;
    public awat j;
    public arej k;
    public arel l;
    public arem m;
    public aren n;
    public areo o;
    public arep p;
    public arer q;
    public ares r;
    public areu s;
    public arev t;
    public arfb u;
    public arfe v;
    public arfc w;
    public asuy x;
    public atlr y;
    public auis z;

    static {
        arfa arfaVar = new arfa();
        a = arfaVar;
        aopi.registerDefaultInstance(arfa.class, arfaVar);
    }

    private arfa() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.aa);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.aa = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u00010\u0000\u0002\uf143ᠤ\uebbc꼧0\u0000\u00000\uf143ᠤᐉ\u0000\ue567ᠲᐉ\u0003\uef41ᠸᐉ\u0002\uea1cᯣᐉ\u0005飼\u1cc9ᐉ\u0007勤\u1cc9ᐉ\t暑\u1cc9ᐉ\r琢\u1cc9ᐉ\u0010啕\u1cc9ᐉ\u0012\ue52a᷒ᐉ\u0015\uf60fΆᐉ\b\ued8a♃ᐉ\u0006\ue0b4✰ᐉ\u000f\ueb31⣡ᐉ\u001a\uefa9Ⱡᐉ\u000e\uead4⸐ᐉ\u001f\ue3c8\u2e52ᐉ\u001e\ue5a9\u2e62ᐉ!\uf5b1⼞ᐉ\u0001\ue772⾩ᐉ\u001b數㉓ᐉ\u0011ﴻ㉳ᐉ\"\ue9f9㉴ᐉ#\uf04b㌶ᐉ%\uf062㝥ᐉ\u001d\ue53c䉁ᐉ'\ue92d䕝ᐉ\f﮻䕭ᐉ&\uf528䖉ᐉ\n\ue93c䖋ᐉ\u000b\uf0c1䣜ᐉ\u0004\uf411䫯ᐉ\u0016\uf423䫯ᐉ\u0017\ue156䯃ᐉ\u0018\uf72c䰍ᐉ/\uedf0䳞ᐉ(\uf556䷚ᐉ,\ue8d9侕ᐉ$\uf7bf卙ᐉ+זּ噾ᐉ)\uf078堽ᐉ\u0014\uec2c岒ᐉ*\ueaf6棪ᐉ\u001c\uf6ce淸ᐉ\u0019\ue7a1紕ᐉ-\uf3b0蘧ᐉ.\ufe53鯰ᐉ \uebbc꼧ᐉ\u0013", new Object[]{"b", "c", "d", "g", "f", "i", "k", "m", "q", "t", "v", "y", "l", "j", "s", "D", "r", "I", "H", "K", "e", "E", "u", "L", "M", "O", "G", "Q", "p", "P", "n", "o", "h", "z", "A", "B", "Y", "R", "V", "N", "U", "S", "x", "T", "F", "C", "W", "X", "J", "w"});
            case 3:
                return new arfa();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = Z;
                if (aorbVar == null) {
                    synchronized (arfa.class) {
                        aorbVar = Z;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            Z = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
