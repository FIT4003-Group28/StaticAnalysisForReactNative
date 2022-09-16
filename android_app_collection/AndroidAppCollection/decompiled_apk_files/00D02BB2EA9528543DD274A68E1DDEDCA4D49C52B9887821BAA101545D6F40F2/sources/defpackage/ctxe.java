package defpackage;

import android.content.Context;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: ctxe  reason: default package */
/* loaded from: classes5.dex */
public final class ctxe implements ctxf<dszm, dszo, Void, dxpk> {
    public final String a = UUID.randomUUID().toString();
    private final Context b;
    private final ctyy c;
    private final boolean d;
    private final long e;
    private final dxnc f;
    private final ConversationId g;

    public ctxe(Context context, ctyy ctyyVar, ConversationId conversationId, boolean z, long j, dxnc dxncVar) {
        this.b = context;
        this.c = ctyyVar;
        this.d = z;
        this.e = j;
        this.f = dxncVar;
        this.g = conversationId;
    }

    @Override // defpackage.ctxf
    public final dehn<dszm> a(dxwi dxwiVar) {
        dszl bZ = dszm.e.bZ();
        dxnc dxncVar = this.f;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dszm dszmVar = (dszm) bZ.b;
        dxncVar.getClass();
        dszmVar.b = dxncVar;
        dxwiVar.getClass();
        dszmVar.a = dxwiVar;
        ctrh g = ctri.g();
        g.b(this.g);
        g.f(this.a);
        g.d(this.c.b().e());
        int i = 2;
        g.g(true != this.d ? 2 : 1);
        g.c(this.e);
        g.e(0L);
        ctri a = g.a();
        dxnc a2 = ctus.a(this.c.b().e());
        int d = a.d();
        if (d == 1) {
            i = 3;
        } else if (d == 2) {
            i = 4;
        }
        dsoj bZ2 = dsok.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ((dsok) bZ2.b).a = "type.googleapis.com/google.internal.communications.instantmessaging.v1.TypingIndicatorEvent";
        dxqv bZ3 = dxqw.c.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        ((dxqw) bZ3.b).a = dxph.a(i);
        long e = a.e();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        ((dxqw) bZ3.b).b = e;
        dspd bR = bZ3.bK().bR();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        bR.getClass();
        ((dsok) bZ2.b).b = bR;
        dsok bK = bZ2.bK();
        dxqg bZ4 = dxqi.t.bZ();
        String a3 = a.a();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dxqi dxqiVar = (dxqi) bZ4.b;
        a3.getClass();
        dxqiVar.g = a3;
        a2.getClass();
        dxqiVar.i = a2;
        dxmq b = ctuq.b(a.b());
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        b.getClass();
        ((dxqi) bZ4.b).j = b;
        dxos dxosVar = dxos.EVENT;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        ((dxqi) bZ4.b).l = dxosVar.a();
        dxqe bZ5 = dxqf.c.bZ();
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        ((dxqf) bZ5.b).a = dxow.a(4);
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        bK.getClass();
        ((dxqf) bZ5.b).b = bK;
        dxqf bK2 = bZ5.bK();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dxqi dxqiVar2 = (dxqi) bZ4.b;
        bK2.getClass();
        dxqiVar2.d = bK2;
        dxqiVar2.c = 105;
        dxqi bK3 = bZ4.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bK3.getClass();
        ((dszm) bZ.b).c = bK3;
        dxoa bZ6 = dxob.b.bZ();
        String a4 = cstk.a(this.b);
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        a4.getClass();
        ((dxob) bZ6.b).a = a4;
        dxob bK4 = bZ6.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bK4.getClass();
        ((dszm) bZ.b).d = bK4;
        return deha.a(bZ.bK());
    }

    @Override // defpackage.ctxf
    public final void b(UUID uuid, int i, dyjb dyjbVar, ctog ctogVar, long j) {
        ctxm r = ctxn.r();
        r.g(10003);
        r.n(this.c.b().e());
        r.o(this.c.c().J());
        r.p(this.a);
        r.d(this.g);
        r.j(23);
        r.m(Integer.valueOf(dyjbVar.p.r));
        r.f(i);
        r.e(j);
        ctogVar.b(r.a());
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ void c(UUID uuid, Void r2, ctog ctogVar, long j) {
        ctxm r = ctxn.r();
        r.g(10003);
        r.n(this.c.b().e());
        r.o(this.c.c().J());
        r.p(this.a);
        r.d(this.g);
        r.j(23);
        r.f(1);
        r.e(j);
        ctogVar.b(r.a());
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ Void d(dszo dszoVar) {
        return null;
    }

    @Override // defpackage.ctxf
    public final /* bridge */ /* synthetic */ dehn<dszo> e(dehn<dxpk> dehnVar, dszm dszmVar) {
        final dszm dszmVar2 = dszmVar;
        return deew.g(dehnVar, new defg(dszmVar2) { // from class: ctxd
            private final dszm a;

            {
                this.a = dszmVar2;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                return ((dxpk) obj).b(this.a);
            }
        }, dege.a);
    }
}
