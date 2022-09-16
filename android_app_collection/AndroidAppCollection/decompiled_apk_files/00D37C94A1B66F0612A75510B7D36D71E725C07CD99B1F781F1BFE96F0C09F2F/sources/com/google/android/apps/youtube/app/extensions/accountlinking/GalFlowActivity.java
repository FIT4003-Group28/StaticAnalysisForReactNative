package com.google.android.apps.youtube.app.extensions.accountlinking;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.activity.result.ActivityResult;
import com.google.android.apps.youtube.app.extensions.accountlinking.GalFlowActivity;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.g;
import com.google.android.libraries.accountlinking.LinkResponse;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class GalFlowActivity extends goy {
    public gos a;
    public rxs b;
    private aby d;

    public final void a(Intent intent) {
        this.d.b(intent);
    }

    @Override // defpackage.dt, defpackage.abp, defpackage.gb, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.d = registerForActivityResult(new acj(), getActivityResultRegistry(), new abw() { // from class: got
            @Override // defpackage.abw
            public final void a(Object obj) {
                gor gorVar;
                int i;
                Intent intent;
                GalFlowActivity galFlowActivity = GalFlowActivity.this;
                ActivityResult activityResult = (ActivityResult) obj;
                gos gosVar = galFlowActivity.a;
                try {
                    i = activityResult.a;
                    intent = activityResult.b;
                } catch (rxv e) {
                    if (e.a == 4) {
                        gorVar = gor.CANCELLED;
                    } else {
                        zep.d("Unable to get link response.", e);
                    }
                }
                if (i != -1) {
                    if (i == -2 && intent.hasExtra("error_type") && intent.hasExtra("message")) {
                        throw new rxv(intent.getIntExtra("error_type", 0), intent.getStringExtra("message"));
                    }
                } else if (intent.hasExtra("link_response")) {
                    if (((LinkResponse) intent.getParcelableExtra("link_response")).a) {
                        gorVar = gor.SUCCESS;
                        gosVar.a(galFlowActivity, gorVar);
                        return;
                    }
                    gorVar = gor.ERROR;
                    gosVar.a(galFlowActivity, gorVar);
                    return;
                }
                throw new rxv(1, "Invalid activity result");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oa, defpackage.dt, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.b.c();
    }

    @Override // defpackage.oa, defpackage.dt, android.app.Activity
    public final void onStart() {
        super.onStart();
        final gos gosVar = this.a;
        final rxs rxsVar = this.b;
        if (gosVar.d) {
            return;
        }
        gosVar.d = true;
        if (!gosVar.a.t()) {
            gosVar.a(this, gor.ERROR);
        } else if (!getIntent().hasExtra("thirdPartyId")) {
            gosVar.a(this, gor.ERROR);
        } else {
            final String stringExtra = getIntent().getStringExtra("thirdPartyId");
            final ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("galCapabilities");
            try {
                final Account a = gosVar.e.a(gosVar.a.c());
                rzd rzdVar = rxsVar.e;
                int a2 = rxs.a();
                rzo rzoVar = rzdVar.a;
                aopa createBuilder = aofh.a.createBuilder();
                aofx d = rzoVar.d(a2);
                createBuilder.copyOnWrite();
                d.getClass();
                ((aofh) createBuilder.instance).b = d;
                aopa createBuilder2 = aofj.a.createBuilder();
                createBuilder2.copyOnWrite();
                stringExtra.getClass();
                ((aofj) createBuilder2.instance).b = stringExtra;
                aofj aofjVar = (aofj) createBuilder2.mo39build();
                createBuilder.copyOnWrite();
                aofjVar.getClass();
                ((aofh) createBuilder.instance).c = aofjVar;
                final aofh aofhVar = (aofh) createBuilder.mo39build();
                ylx.k(anii.i(anko.q(anii.h(anii.h(anhq.i(anii.h(anko.q(rzoVar.c(a, new rzn() { // from class: rzk
                    @Override // defpackage.rzn
                    public final ankt a(aymy aymyVar) {
                        aofh aofhVar2 = aofh.this;
                        axye axyeVar = aymyVar.a;
                        ayax ayaxVar = aoex.e;
                        if (ayaxVar == null) {
                            synchronized (aoex.class) {
                                ayaxVar = aoex.e;
                                if (ayaxVar == null) {
                                    ayau a3 = ayax.a();
                                    a3.c = ayaw.UNARY;
                                    a3.d = ayax.c("google.internal.identity.accountlinking.v1.AccountLinkingService", "GetLink");
                                    a3.b();
                                    a3.a = aymw.b(aofh.a);
                                    a3.b = aymw.b(aofi.a);
                                    ayaxVar = a3.a();
                                    aoex.e = ayaxVar;
                                }
                            }
                        }
                        return aynh.a(axyeVar.a(ayaxVar, aymyVar.b), aofhVar2);
                    }
                })), ryj.h, anjk.a), Throwable.class, g.c, anjk.a), ryj.f, anjk.a), meo.s, anjk.a)), new anir() { // from class: goq
                    @Override // defpackage.anir
                    public final ankt a(Object obj) {
                        gos gosVar2 = gos.this;
                        ArrayList arrayList = stringArrayListExtra;
                        rxs rxsVar2 = rxsVar;
                        Account account = a;
                        String str = stringExtra;
                        GalFlowActivity galFlowActivity = this;
                        LinkResponse linkResponse = (LinkResponse) obj;
                        if (gosVar2.c.isCancelled()) {
                            return anlz.o();
                        }
                        if (linkResponse.a) {
                            return anlz.q(gor.SUCCESS);
                        }
                        if (arrayList == null) {
                            amyg amygVar = amyg.a;
                            int a3 = rxs.a();
                            rzo rzoVar2 = rxsVar2.d;
                            ArrayList arrayList2 = new ArrayList(amygVar);
                            List b = rxs.b(rxsVar2.c.a);
                            String str2 = rxsVar2.c.b;
                            aopa createBuilder3 = aofy.a.createBuilder();
                            aofx d2 = rzoVar2.d(a3);
                            createBuilder3.copyOnWrite();
                            d2.getClass();
                            ((aofy) createBuilder3.instance).b = d2;
                            createBuilder3.copyOnWrite();
                            str.getClass();
                            ((aofy) createBuilder3.instance).c = str;
                            createBuilder3.copyOnWrite();
                            aofy aofyVar = (aofy) createBuilder3.instance;
                            aopu aopuVar = aofyVar.d;
                            if (!aopuVar.c()) {
                                aofyVar.d = aopi.mutableCopy(aopuVar);
                            }
                            aonk.addAll((Iterable) arrayList2, (List) aofyVar.d);
                            createBuilder3.L(b);
                            createBuilder3.copyOnWrite();
                            ((aofy) createBuilder3.instance).j = false;
                            createBuilder3.copyOnWrite();
                            ((aofy) createBuilder3.instance).h = 0;
                            if (str2 != null) {
                                createBuilder3.copyOnWrite();
                                ((aofy) createBuilder3.instance).g = str2;
                            }
                            return anii.h(rxsVar2.d(rzoVar2.b(account, new rzm(createBuilder3, 2)), account, str, a3, amyg.a, amyg.a), new gop(galFlowActivity), gosVar2.b);
                        }
                        amvn p = amvn.p(arrayList);
                        int a4 = rxs.a();
                        rzo rzoVar3 = rxsVar2.d;
                        ArrayList arrayList3 = new ArrayList(p);
                        List b2 = rxs.b(rxsVar2.c.a);
                        String str3 = rxsVar2.c.b;
                        aopa createBuilder4 = aofy.a.createBuilder();
                        aofx d3 = rzoVar3.d(a4);
                        createBuilder4.copyOnWrite();
                        d3.getClass();
                        ((aofy) createBuilder4.instance).b = d3;
                        createBuilder4.copyOnWrite();
                        str.getClass();
                        ((aofy) createBuilder4.instance).c = str;
                        createBuilder4.copyOnWrite();
                        aofy aofyVar2 = (aofy) createBuilder4.instance;
                        aopu aopuVar2 = aofyVar2.e;
                        if (!aopuVar2.c()) {
                            aofyVar2.e = aopi.mutableCopy(aopuVar2);
                        }
                        aonk.addAll((Iterable) arrayList3, (List) aofyVar2.e);
                        createBuilder4.L(b2);
                        createBuilder4.copyOnWrite();
                        ((aofy) createBuilder4.instance).j = false;
                        createBuilder4.copyOnWrite();
                        ((aofy) createBuilder4.instance).h = 0;
                        if (str3 != null) {
                            createBuilder4.copyOnWrite();
                            ((aofy) createBuilder4.instance).g = str3;
                        }
                        return anii.h(rxsVar2.d(rzoVar3.b(account, new rzm(createBuilder4)), account, str, a4, amvn.p(p), amyg.a), new gop(galFlowActivity, 1), gosVar2.b);
                    }
                }, gosVar.b), gosVar.b, new ylv() { // from class: gon
                    @Override // defpackage.zdt
                    /* renamed from: b */
                    public final void a(Throwable th) {
                        gos gosVar2 = gos.this;
                        GalFlowActivity galFlowActivity = this;
                        zep.d("Unable to link account.", th);
                        gosVar2.a(galFlowActivity, gor.ERROR);
                    }
                }, new ylw() { // from class: goo
                    @Override // defpackage.ylw, defpackage.zdt
                    public final void a(Object obj) {
                        gos.this.a(this, (gor) obj);
                    }
                });
            } catch (RemoteException | qsc | qsd unused) {
                gosVar.a(this, gor.ERROR);
            }
        }
    }
}
