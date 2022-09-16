package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.apps.youtube.app.extensions.accountlinking.GalFlowActivity;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protos.youtube.api.innertube.AccountLinkCommandOuterClass$AccountLinkCommand;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: PG */
/* renamed from: goc  reason: default package */
/* loaded from: classes3.dex */
public final class goc implements aafl {
    public final aafo a;
    private final dt b;
    private final gos c;

    public goc(dt dtVar, gos gosVar, aafo aafoVar) {
        this.b = dtVar;
        this.c = gosVar;
        this.a = aafoVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        final apzg apzgVar2;
        ankt anktVar;
        apzgVar.getClass();
        AccountLinkCommandOuterClass$AccountLinkCommand accountLinkCommandOuterClass$AccountLinkCommand = (AccountLinkCommandOuterClass$AccountLinkCommand) apzgVar.qm(AccountLinkCommandOuterClass$AccountLinkCommand.accountLinkCommand);
        final apzg apzgVar3 = null;
        String str = (accountLinkCommandOuterClass$AccountLinkCommand.b & 4) != 0 ? accountLinkCommandOuterClass$AccountLinkCommand.e : null;
        if (!TextUtils.isEmpty(str)) {
            aopu aopuVar = ((AccountLinkCommandOuterClass$AccountLinkCommand) apzgVar.qm(AccountLinkCommandOuterClass$AccountLinkCommand.accountLinkCommand)).f;
            AccountLinkCommandOuterClass$AccountLinkCommand accountLinkCommandOuterClass$AccountLinkCommand2 = (AccountLinkCommandOuterClass$AccountLinkCommand) apzgVar.qm(AccountLinkCommandOuterClass$AccountLinkCommand.accountLinkCommand);
            if ((accountLinkCommandOuterClass$AccountLinkCommand2.b & 1) != 0) {
                apzgVar2 = accountLinkCommandOuterClass$AccountLinkCommand2.c;
                if (apzgVar2 == null) {
                    apzgVar2 = apzg.a;
                }
            } else {
                apzgVar2 = null;
            }
            AccountLinkCommandOuterClass$AccountLinkCommand accountLinkCommandOuterClass$AccountLinkCommand3 = (AccountLinkCommandOuterClass$AccountLinkCommand) apzgVar.qm(AccountLinkCommandOuterClass$AccountLinkCommand.accountLinkCommand);
            if ((accountLinkCommandOuterClass$AccountLinkCommand3.b & 2) != 0 && (apzgVar3 = accountLinkCommandOuterClass$AccountLinkCommand3.d) == null) {
                apzgVar3 = apzg.a;
            }
            dt dtVar = this.b;
            gos gosVar = this.c;
            SettableFuture settableFuture = gosVar.c;
            if (settableFuture != null) {
                settableFuture.cancel(true);
                anktVar = anlz.o();
            } else {
                gosVar.c = SettableFuture.f();
                Intent intent = new Intent(dtVar, GalFlowActivity.class);
                intent.putExtra("thirdPartyId", str);
                if (!aopuVar.isEmpty()) {
                    intent.putStringArrayListExtra("galCapabilities", new ArrayList<>(aopuVar));
                }
                dtVar.startActivity(intent);
                anktVar = gosVar.c;
            }
            ylx.n(dtVar, anktVar, new zdt() { // from class: goa
                @Override // defpackage.zdt
                public final void a(Object obj) {
                    goc gocVar = goc.this;
                    apzg apzgVar4 = apzgVar3;
                    zep.d("Unable to link account.", (Throwable) obj);
                    gocVar.a.a(apzgVar4);
                }
            }, new zdt() { // from class: gob
                @Override // defpackage.zdt
                public final void a(Object obj) {
                    goc gocVar = goc.this;
                    apzg apzgVar4 = apzgVar2;
                    apzg apzgVar5 = apzgVar3;
                    gor gorVar = (gor) obj;
                    if (gorVar == gor.SUCCESS) {
                        gocVar.a.a(apzgVar4);
                    } else if (gorVar != gor.ERROR) {
                    } else {
                        gocVar.a.a(apzgVar5);
                    }
                }
            });
            return;
        }
        zep.b("No third party id in AccountLinkCommand.");
    }
}
