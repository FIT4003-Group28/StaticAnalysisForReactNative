package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import android.util.Base64;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.g;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: rzo  reason: default package */
/* loaded from: classes4.dex */
public final class rzo {
    private final Context a;
    private final ayal b;
    private final ankw c;
    private final ampq d;
    private final ampq e;
    private final Object f;
    private final Map g;

    public rzo(Context context, ayal ayalVar, ankw ankwVar, ampq ampqVar, ampq ampqVar2) {
        context.getClass();
        this.a = context;
        this.b = ayalVar;
        this.c = ankwVar;
        this.d = ampqVar;
        this.e = ampqVar2;
        this.f = new Object();
        this.g = new HashMap();
    }

    public final ankt a(int i, Account account, String str, int i2) {
        aopa createBuilder = aofb.a.createBuilder();
        aofx d = d(i);
        createBuilder.copyOnWrite();
        d.getClass();
        ((aofb) createBuilder.instance).b = d;
        aopa createBuilder2 = aofj.a.createBuilder();
        createBuilder2.copyOnWrite();
        str.getClass();
        ((aofj) createBuilder2.instance).b = str;
        createBuilder.copyOnWrite();
        aofj aofjVar = (aofj) createBuilder2.mo39build();
        aofjVar.getClass();
        ((aofb) createBuilder.instance).c = aofjVar;
        createBuilder.copyOnWrite();
        ((aofb) createBuilder.instance).d = i2;
        final aofb aofbVar = (aofb) createBuilder.mo39build();
        return b(account, new rzn() { // from class: rzh
            @Override // defpackage.rzn
            public final ankt a(aymy aymyVar) {
                aofb aofbVar2 = aofb.this;
                axye axyeVar = aymyVar.a;
                ayax ayaxVar = aoex.c;
                if (ayaxVar == null) {
                    synchronized (aoex.class) {
                        ayaxVar = aoex.c;
                        if (ayaxVar == null) {
                            ayau a = ayax.a();
                            a.c = ayaw.UNARY;
                            a.d = ayax.c("google.internal.identity.accountlinking.v1.AccountLinkingService", "DeleteLink");
                            a.b();
                            a.a = aymw.b(aofb.a);
                            a.b = aymw.b(aofc.a);
                            ayaxVar = a.a();
                            aoex.c = ayaxVar;
                        }
                    }
                }
                return aynh.a(axyeVar.a(ayaxVar, aymyVar.b), aofbVar2);
            }
        });
    }

    public final ankt b(Account account, rzn rznVar) {
        return anhq.i(c(account, rznVar), Throwable.class, g.d, anjk.a);
    }

    public final ankt c(Account account, final rzn rznVar) {
        ayna a;
        synchronized (this.f) {
            if (!this.g.containsKey(account)) {
                ayna aymyVar = new aymy(axyl.b(this.b, new rzf(this.a, account), new rzq(this.a)), axyd.a.d(aynh.a, aynf.FUTURE));
                if (this.e.h() && !((List) this.e.c()).isEmpty()) {
                    ayat ayatVar = new ayat();
                    StringBuilder sb = new StringBuilder(26);
                    sb.append("x-goog-ext-");
                    sb.append(202964622);
                    sb.append("-bin");
                    ayaq e = ayaq.e(sb.toString(), ayat.e);
                    amuk C = amuk.C(amxo.a, (List) this.e.c());
                    aopa createBuilder = anvb.a.createBuilder();
                    int i = ((amxx) C).c;
                    for (int i2 = 0; i2 < i; i2++) {
                        aoob x = aoob.x(Base64.decode((String) C.get(i2), 8));
                        createBuilder.copyOnWrite();
                        anvb anvbVar = (anvb) createBuilder.instance;
                        aopu aopuVar = anvbVar.b;
                        if (!aopuVar.c()) {
                            anvbVar.b = aopi.mutableCopy(aopuVar);
                        }
                        anvbVar.b.add(x);
                    }
                    ayatVar.f(e, ((anvb) createBuilder.mo39build()).toByteArray());
                    aymyVar = aymyVar.a(axyl.b(aymyVar.a, new aynk(ayatVar)), aymyVar.b);
                }
                this.g.put(account, aymyVar);
            }
            aymy aymyVar2 = (aymy) this.g.get(account);
            a = aymyVar2.a(aymyVar2.a, aymyVar2.b.a(axyy.c(12L, TimeUnit.SECONDS)));
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ankt q = anlz.q(a);
            rznVar.getClass();
            return anii.i(q, new anir() { // from class: rzg
                @Override // defpackage.anir
                public final ankt a(Object obj) {
                    return rzn.this.a((aymy) obj);
                }
            }, this.c);
        }
        return rznVar.a((aymy) a);
    }

    public final aofx d(int i) {
        aopa createBuilder = aofx.a.createBuilder();
        createBuilder.copyOnWrite();
        ((aofx) createBuilder.instance).c = i;
        createBuilder.copyOnWrite();
        ((aofx) createBuilder.instance).d = 1;
        if (this.d.h()) {
            createBuilder.copyOnWrite();
            ((aofx) createBuilder.instance).b = (String) this.d.c();
        }
        return (aofx) createBuilder.mo39build();
    }
}
