package defpackage;

import android.content.Context;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: ctwi  reason: default package */
/* loaded from: classes5.dex */
public final class ctwi implements ctxf<dszm, dszo, Void, dxpk> {
    public final String a = UUID.randomUUID().toString();
    private final Context b;
    private final ctyy c;
    private final List<String> d;
    private final boolean e;
    private final dxnc f;
    private final ConversationId g;

    public ctwi(Context context, ctyy ctyyVar, ConversationId conversationId, List<String> list, dxnc dxncVar, boolean z) {
        this.b = context;
        this.c = ctyyVar;
        this.d = list;
        this.f = dxncVar;
        this.e = z;
        this.g = conversationId;
    }

    @Override // defpackage.ctxf
    public final dehn<dszm> a(dxwi dxwiVar) {
        int i;
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
        ctqz f = ctra.f();
        f.c(this.d);
        f.b(this.g);
        f.d(this.a);
        f.e(this.e ? 1 : 0);
        f.f(this.c.b().e());
        ctra a = f.a();
        dxnc a2 = ctus.a(this.c.b().e());
        ArrayList arrayList = new ArrayList();
        for (String str : a.c()) {
            dxqq bZ2 = dxqr.b.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            str.getClass();
            ((dxqr) bZ2.b).a = str;
            arrayList.add(bZ2.bK());
        }
        int a3 = a.a();
        if (a3 == 0) {
            i = 3;
        } else if (a3 == 1) {
            i = 5;
        } else if (a3 != 2) {
            int a4 = a.a();
            StringBuilder sb = new StringBuilder(32);
            sb.append("Invalid receipt type ");
            sb.append(a4);
            throw new RuntimeException(sb.toString());
        } else {
            i = 4;
        }
        dsoj bZ3 = dsok.c.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        ((dsok) bZ3.b).a = "type.googleapis.com/google.internal.communications.instantmessaging.v1.ReceiptEvent";
        dxqp bZ4 = dxqs.c.bZ();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dxqs dxqsVar = (dxqs) bZ4.b;
        dsrj<dxqr> dsrjVar = dxqsVar.a;
        if (!dsrjVar.a()) {
            dxqsVar.a = dsqw.cl(dsrjVar);
        }
        dsod.bv(arrayList, dxqsVar.a);
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        ((dxqs) bZ4.b).b = dxox.a(i);
        dspd bR = bZ4.bK().bR();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        bR.getClass();
        ((dsok) bZ3.b).b = bR;
        dsok bK = bZ3.bK();
        dxqg bZ5 = dxqi.t.bZ();
        String b = a.b();
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        dxqi dxqiVar = (dxqi) bZ5.b;
        b.getClass();
        dxqiVar.g = b;
        a2.getClass();
        dxqiVar.i = a2;
        dxmq b2 = ctuq.b(a.e());
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        b2.getClass();
        ((dxqi) bZ5.b).j = b2;
        dxos dxosVar = dxos.EVENT;
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        ((dxqi) bZ5.b).l = dxosVar.a();
        dxqe bZ6 = dxqf.c.bZ();
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        ((dxqf) bZ6.b).a = dxow.a(6);
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        bK.getClass();
        ((dxqf) bZ6.b).b = bK;
        dxqf bK2 = bZ6.bK();
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        dxqi dxqiVar2 = (dxqi) bZ5.b;
        bK2.getClass();
        dxqiVar2.d = bK2;
        dxqiVar2.c = 105;
        dxqi bK3 = bZ5.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bK3.getClass();
        ((dszm) bZ.b).c = bK3;
        dxoa bZ7 = dxob.b.bZ();
        String a5 = cstk.a(this.b);
        if (bZ7.c) {
            bZ7.bF();
            bZ7.c = false;
        }
        a5.getClass();
        ((dxob) bZ7.b).a = a5;
        dxob bK4 = bZ7.bK();
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
        r.j(15);
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
        r.j(15);
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
        return deew.g(dehnVar, new defg(dszmVar2) { // from class: ctwh
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
