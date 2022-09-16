package defpackage;

import java.util.Random;
/* compiled from: PG */
/* renamed from: afls  reason: default package */
/* loaded from: classes.dex */
public final class afls {
    public static final aqxk a;
    private final amqo b;
    private final Random c = new Random();

    static {
        aopa createBuilder = aqxk.a.createBuilder();
        createBuilder.copyOnWrite();
        aqxk aqxkVar = (aqxk) createBuilder.instance;
        aqxkVar.b |= 1;
        aqxkVar.c = 1000;
        createBuilder.copyOnWrite();
        aqxk aqxkVar2 = (aqxk) createBuilder.instance;
        aqxkVar2.b |= 4;
        aqxkVar2.e = 5000;
        createBuilder.copyOnWrite();
        aqxk aqxkVar3 = (aqxk) createBuilder.instance;
        aqxkVar3.b |= 2;
        aqxkVar3.d = 2.0f;
        createBuilder.copyOnWrite();
        aqxk aqxkVar4 = (aqxk) createBuilder.instance;
        aqxkVar4.b |= 8;
        aqxkVar4.f = 0.0f;
        a = (aqxk) createBuilder.mo39build();
    }

    public afls(amqo amqoVar) {
        this.b = new aflr(aqxo.i(new aflr(amqoVar)), 2);
    }

    public final int a(int i) {
        aqxk aqxkVar = (aqxk) this.b.get();
        double d = aqxkVar.c;
        double pow = Math.pow(aqxkVar.d, Math.max(0, i - 1));
        Double.isNaN(d);
        double min = Math.min(aqxkVar.e, d * pow);
        float nextFloat = aqxkVar.f * (this.c.nextFloat() - 0.5f);
        double d2 = nextFloat + nextFloat;
        Double.isNaN(d2);
        long round = Math.round(d2 * min);
        int i2 = aqxkVar.e;
        double d3 = round;
        Double.isNaN(d3);
        return Math.min(i2, (int) (min + d3));
    }
}
