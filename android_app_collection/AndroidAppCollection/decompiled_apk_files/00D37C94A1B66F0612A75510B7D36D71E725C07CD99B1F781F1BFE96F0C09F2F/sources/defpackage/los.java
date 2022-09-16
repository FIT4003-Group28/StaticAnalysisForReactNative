package defpackage;

import android.widget.ImageView;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: los  reason: default package */
/* loaded from: classes3.dex */
public final class los implements loq, ajmx, yoj {
    private final ems b;
    private final zdj c;
    private final azqb d;
    private final azqb e;
    private final azqb f;
    private final azqb g;
    private final snc h;
    private final aacz l;
    final Map a = new HashMap();
    private volatile int i = -1;
    private int j = 0;
    private volatile long k = 0;

    public los(ems emsVar, zdj zdjVar, azqb azqbVar, aacz aaczVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, snc sncVar) {
        this.b = emsVar;
        this.c = zdjVar;
        this.d = azqbVar;
        this.l = aaczVar;
        this.e = azqbVar2;
        this.f = azqbVar3;
        this.g = azqbVar4;
        this.h = sncVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x03b9 A[LOOP:2: B:84:0x02f2->B:135:0x03b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04f6 A[Catch: tiu -> 0x0516, NullPointerException -> 0x052f, TryCatch #4 {NullPointerException -> 0x052f, blocks: (B:48:0x0237, B:50:0x024a, B:51:0x0251, B:53:0x025f, B:57:0x026e, B:59:0x0274, B:146:0x044f, B:147:0x0461, B:160:0x0483, B:164:0x04e0, B:166:0x04f6, B:168:0x0501, B:167:0x04fb, B:60:0x027a, B:61:0x0284, B:63:0x028a, B:65:0x0292, B:67:0x02a0, B:69:0x02a8, B:71:0x02b0, B:73:0x02b6, B:74:0x02ba, B:83:0x02d4, B:84:0x02f2, B:86:0x02f8, B:88:0x0313, B:90:0x0317, B:92:0x031b, B:93:0x0323, B:95:0x0329, B:98:0x0336, B:117:0x038e, B:119:0x0392, B:138:0x03c7, B:139:0x03dc, B:140:0x0403, B:122:0x039b, B:124:0x039f, B:127:0x03a7, B:129:0x03ab, B:99:0x0345, B:101:0x034b, B:102:0x0351, B:104:0x0359, B:107:0x0367, B:114:0x0378, B:156:0x0476, B:157:0x047b, B:159:0x047e, B:141:0x0404, B:142:0x042d, B:143:0x042e, B:144:0x0448, B:145:0x0449, B:54:0x0264, B:56:0x026a, B:150:0x0467, B:151:0x0470, B:161:0x04a6, B:163:0x04ae), top: B:177:0x0237 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04fb A[Catch: tiu -> 0x0516, NullPointerException -> 0x052f, TryCatch #4 {NullPointerException -> 0x052f, blocks: (B:48:0x0237, B:50:0x024a, B:51:0x0251, B:53:0x025f, B:57:0x026e, B:59:0x0274, B:146:0x044f, B:147:0x0461, B:160:0x0483, B:164:0x04e0, B:166:0x04f6, B:168:0x0501, B:167:0x04fb, B:60:0x027a, B:61:0x0284, B:63:0x028a, B:65:0x0292, B:67:0x02a0, B:69:0x02a8, B:71:0x02b0, B:73:0x02b6, B:74:0x02ba, B:83:0x02d4, B:84:0x02f2, B:86:0x02f8, B:88:0x0313, B:90:0x0317, B:92:0x031b, B:93:0x0323, B:95:0x0329, B:98:0x0336, B:117:0x038e, B:119:0x0392, B:138:0x03c7, B:139:0x03dc, B:140:0x0403, B:122:0x039b, B:124:0x039f, B:127:0x03a7, B:129:0x03ab, B:99:0x0345, B:101:0x034b, B:102:0x0351, B:104:0x0359, B:107:0x0367, B:114:0x0378, B:156:0x0476, B:157:0x047b, B:159:0x047e, B:141:0x0404, B:142:0x042d, B:143:0x042e, B:144:0x0448, B:145:0x0449, B:54:0x0264, B:56:0x026a, B:150:0x0467, B:151:0x0470, B:161:0x04a6, B:163:0x04ae), top: B:177:0x0237 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03b6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void h(android.widget.ImageView r21, defpackage.avhn r22, long r23, boolean r25, defpackage.lor r26) {
        /*
            Method dump skipped, instructions count: 1371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.los.h(android.widget.ImageView, avhn, long, boolean, lor):void");
    }

    @Override // defpackage.loq
    public final void a() {
        this.c.a(this);
        ((ajmy) this.d.get()).d(this);
    }

    @Override // defpackage.ajmx
    public final void b(ImageView imageView, ajmu ajmuVar, avhn avhnVar) {
        if (((lor) this.a.get(imageView)) != null) {
            this.a.remove(imageView);
        }
    }

    @Override // defpackage.ajmx
    public final void c(ImageView imageView, ajmu ajmuVar, avhn avhnVar) {
        lor lorVar = (lor) this.a.get(imageView);
        if (lorVar != null) {
            h(imageView, avhnVar, lorVar.a, false, lorVar);
            this.a.remove(imageView);
        }
    }

    @Override // defpackage.ajmx
    public final void d(ImageView imageView, ajmu ajmuVar, avhn avhnVar) {
        this.j++;
        long e = this.h.e();
        if (this.i == -1) {
            aveq aveqVar = this.l.b().u;
            if (aveqVar == null) {
                aveqVar = aveq.a;
            }
            double d = aveqVar.h;
            Double.isNaN(d);
            this.i = (int) (d * 1.048576d);
        }
        if ((1048575 & e) < this.i) {
            this.a.put(imageView, new lor(e, this.j));
        }
    }

    @Override // defpackage.ajmx
    public final void e(ImageView imageView, ajmu ajmuVar, avhn avhnVar) {
        lor lorVar = (lor) this.a.get(imageView);
        if (lorVar != null) {
            h(imageView, avhnVar, lorVar.a, true, lorVar);
            this.a.remove(imageView);
        }
    }

    @Override // defpackage.loq
    public final void f() {
        this.c.b(this);
        ((ajmy) this.d.get()).o(this);
    }

    @Override // defpackage.yoj
    public final void g() {
        this.k = this.h.e();
    }
}
