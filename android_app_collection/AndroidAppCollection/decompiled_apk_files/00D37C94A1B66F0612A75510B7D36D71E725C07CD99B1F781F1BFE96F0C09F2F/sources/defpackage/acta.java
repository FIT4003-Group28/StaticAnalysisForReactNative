package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
/* compiled from: PG */
/* renamed from: acta  reason: default package */
/* loaded from: classes.dex */
public final class acta extends acsx implements acud, actz {
    final amqo j;
    public final boolean k;
    private int m;
    private final acuc n;
    private final azqb o;
    private final azqb p;
    private final aacz q;

    public acta(acuc acucVar, zfq zfqVar, yni yniVar, actm actmVar, actr actrVar, acuf acufVar, Context context, aadd aaddVar, aacz aaczVar, azqb azqbVar, azqb azqbVar2) {
        this(acucVar, zfqVar, yniVar, actmVar, actrVar, acufVar, acul.b, context, aaddVar, aaczVar, azqbVar, azqbVar2);
    }

    private final synchronized int K() {
        int i = this.m;
        if (i == -1) {
            i = (int) ((awtn) ((yve) this.j.get()).c()).g;
        }
        if (i >= 60000 || i < 10000) {
            i = 10000;
        }
        int i2 = i + 1;
        this.m = i2;
        ylx.m(((yve) this.j.get()).b(new fgn(i2, 7)), acsn.c);
        return this.m;
    }

    @Override // defpackage.acsx
    protected final awbs A(int i, int i2) {
        aopa createBuilder = awbs.a.createBuilder();
        createBuilder.copyOnWrite();
        awbs awbsVar = (awbs) createBuilder.instance;
        awbsVar.b |= 2;
        awbsVar.d = i;
        if (i2 <= 0) {
            createBuilder.copyOnWrite();
            awbs awbsVar2 = (awbs) createBuilder.instance;
            awbsVar2.b |= 4;
            awbsVar2.e = 0;
        } else {
            createBuilder.copyOnWrite();
            awbs awbsVar3 = (awbs) createBuilder.instance;
            awbsVar3.b |= 4;
            awbsVar3.e = i2;
        }
        int K = K();
        createBuilder.copyOnWrite();
        awbs awbsVar4 = (awbs) createBuilder.instance;
        awbsVar4.b |= 8;
        awbsVar4.f = K;
        return (awbs) createBuilder.mo39build();
    }

    @Override // defpackage.acsx, defpackage.acti
    public final void B(InteractionLoggingScreen interactionLoggingScreen) {
        if (interactionLoggingScreen == null) {
            return;
        }
        this.d.d(this.n, interactionLoggingScreen);
        this.d.b(interactionLoggingScreen, this.f);
    }

    @Override // defpackage.acsx, defpackage.acti
    public final acti b(acul aculVar) {
        acta actaVar = new acta(this.n, this.a, this.b, this.c, this.d, this.e, aculVar, this.g, this.h, this.q, this.o, this.p);
        actaVar.B(actaVar.c());
        return actaVar;
    }

    @Override // defpackage.acsx, defpackage.acti, defpackage.actz
    public final InteractionLoggingScreen c() {
        return this.d.a(this.n);
    }

    @Override // defpackage.acsx, defpackage.acti
    public final String k() {
        InteractionLoggingScreen c = c();
        return c == null ? "" : c.a;
    }

    @Override // defpackage.acsx, defpackage.acti
    public final void y() {
    }

    public acta(acuc acucVar, zfq zfqVar, yni yniVar, actm actmVar, actr actrVar, acuf acufVar, acul aculVar, Context context, aadd aaddVar, aacz aaczVar, final azqb azqbVar, final azqb azqbVar2) {
        super(zfqVar, yniVar, actmVar, actrVar, acufVar, aculVar, context, aaddVar, null);
        this.m = -1;
        acucVar.getClass();
        this.n = acucVar;
        aaczVar.getClass();
        this.q = aaczVar;
        athd athdVar = aaczVar.b().o;
        aujq aujqVar = (athdVar == null ? athd.a : athdVar).g;
        this.k = (aujqVar == null ? aujq.a : aujqVar).g;
        this.j = aqxo.i(new amqo() { // from class: acsz
            @Override // defpackage.amqo
            public final Object get() {
                acta actaVar = acta.this;
                azqb azqbVar3 = azqbVar2;
                azqb azqbVar4 = azqbVar;
                if (actaVar.k) {
                    return (yve) azqbVar3.get();
                }
                return (yve) azqbVar4.get();
            }
        });
        this.o = azqbVar;
        this.p = azqbVar2;
    }
}
