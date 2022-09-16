package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: ysz  reason: default package */
/* loaded from: classes4.dex */
public final class ysz implements axou {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final azqb d;
    private final azqb e;
    private final azqb f;
    private final azqb g;
    private final azqb h;
    private final azqb i;
    private final azqb j;
    private final azqb k;
    private final azqb l;
    private final /* synthetic */ int m;

    public ysz(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, azqb azqbVar11, azqb azqbVar12) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
        this.e = azqbVar5;
        this.f = azqbVar6;
        this.g = azqbVar7;
        this.h = azqbVar8;
        this.i = azqbVar9;
        this.j = azqbVar10;
        this.k = azqbVar11;
        this.l = azqbVar12;
    }

    public ysz(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, azqb azqbVar11, azqb azqbVar12, int i) {
        this.m = i;
        this.i = azqbVar;
        this.h = azqbVar2;
        this.l = azqbVar3;
        this.f = azqbVar4;
        this.d = azqbVar5;
        this.c = azqbVar6;
        this.j = azqbVar7;
        this.k = azqbVar8;
        this.b = azqbVar9;
        this.e = azqbVar10;
        this.g = azqbVar11;
        this.a = azqbVar12;
    }

    public ysz(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, azqb azqbVar11, azqb azqbVar12, int i, byte[] bArr) {
        this.m = i;
        this.g = azqbVar;
        this.h = azqbVar2;
        this.f = azqbVar3;
        this.l = azqbVar4;
        this.a = azqbVar5;
        this.e = azqbVar6;
        this.d = azqbVar7;
        this.b = azqbVar8;
        this.c = azqbVar9;
        this.k = azqbVar10;
        this.i = azqbVar11;
        this.j = azqbVar12;
    }

    public ysz(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, azqb azqbVar11, azqb azqbVar12, int i, char[] cArr) {
        this.m = i;
        this.f = azqbVar;
        this.k = azqbVar2;
        this.l = azqbVar3;
        this.a = azqbVar4;
        this.e = azqbVar5;
        this.d = azqbVar6;
        this.h = azqbVar7;
        this.i = azqbVar8;
        this.c = azqbVar9;
        this.g = azqbVar10;
        this.j = azqbVar11;
        this.b = azqbVar12;
    }

    public static ysz a(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, azqb azqbVar11, azqb azqbVar12) {
        return new ysz(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, azqbVar9, azqbVar10, azqbVar11, azqbVar12);
    }

    public static afjz b(Context context, yve yveVar, ampq ampqVar, yrj yrjVar, aadd aaddVar, aacz aaczVar, afmq afmqVar, afme afmeVar, afsz afszVar, axxl axxlVar, axxm axxmVar, axxj axxjVar) {
        return new afjz(context, yveVar, ampqVar, yrjVar, aaddVar, aaczVar, afmqVar, afmeVar, afszVar, axxlVar, axxmVar, axxjVar);
    }

    public static ysz c(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, azqb azqbVar11, azqb azqbVar12) {
        return new ysz(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, azqbVar9, azqbVar10, azqbVar11, azqbVar12, 1);
    }

    public static ysz d(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, azqb azqbVar11, azqb azqbVar12) {
        return new ysz(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, azqbVar9, azqbVar10, azqbVar11, azqbVar12, 2, (byte[]) null);
    }

    public static ysz e(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, azqb azqbVar11, azqb azqbVar12) {
        return new ysz(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, azqbVar9, azqbVar10, azqbVar11, azqbVar12, 3, (char[]) null);
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        int i = this.m;
        if (i != 0) {
            if (i == 1) {
                azqb azqbVar = this.i;
                azqb azqbVar2 = this.h;
                azqb azqbVar3 = this.l;
                azqb azqbVar4 = this.f;
                azqb azqbVar5 = this.d;
                azqb azqbVar6 = this.c;
                azqb azqbVar7 = this.j;
                azqb azqbVar8 = this.k;
                azqb azqbVar9 = this.b;
                azqb azqbVar10 = this.e;
                Executor executor = (Executor) this.g.get();
                wwf wwfVar = (wwf) this.a.get();
                return new wtu(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, azqbVar9, azqbVar10);
            } else if (i == 2) {
                return b((Context) ((axov) this.g).a, (yve) this.h.get(), (ampq) ((axov) this.f).a, (yrj) this.l.get(), (aadd) this.a.get(), (aacz) this.e.get(), (afmq) this.d.get(), ((afmf) this.b).get(), (afsz) ((axov) this.c).a, (axxl) this.k.get(), (axxm) this.i.get(), (axxj) this.j.get());
            } else {
                yni yniVar = (yni) this.f.get();
                axnm a = axot.a(this.k);
                Handler handler = (Handler) this.l.get();
                yzj yzjVar = (yzj) this.a.get();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.e.get();
                Executor executor2 = (Executor) this.d.get();
                aiqp aiqpVar = (aiqp) this.h.get();
                ahey aheyVar = ((aisd) this.i).get();
                aadd aaddVar = (aadd) this.c.get();
                aacz aaczVar = (aacz) this.g.get();
                ahfm ahfmVar = (ahfm) ((axov) this.j).a;
                return new ailu(yniVar, a, handler, yzjVar, scheduledExecutorService, executor2, aiqpVar, aheyVar, aaddVar, aaczVar, (aiix) this.b.get());
            }
        }
        return new ysy((snc) this.a.get(), this.b, this.c, this.d, ((yrx) this.e).get(), (yme) this.f.get(), (ScheduledExecutorService) this.g.get(), (yqm) this.h.get(), (Executor) this.i.get(), this.j, ((yrz) this.k).get(), (zex) this.l.get());
    }
}
