package defpackage;

import com.google.android.apps.youtube.app.extensions.accountlinking.AccountLinkingController;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: goe  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class goe implements ayqb {
    public final /* synthetic */ AccountLinkingController a;
    private final /* synthetic */ int b;

    public /* synthetic */ goe(AccountLinkingController accountLinkingController) {
        this.a = accountLinkingController;
    }

    public /* synthetic */ goe(AccountLinkingController accountLinkingController, int i) {
        this.b = i;
        this.a = accountLinkingController;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            AccountLinkingController accountLinkingController = this.a;
            aajj aajjVar = ((aajp) obj).c;
            if (aajjVar instanceof aowf) {
                accountLinkingController.i(((aowf) aajjVar).getLinked().booleanValue());
            } else {
                zep.b("Entity update does not have account link status.");
            }
        } else if (i == 1) {
            this.a.i(((aowf) ((aajj) obj)).getLinked().booleanValue());
        } else if (i == 2) {
            final AccountLinkingController accountLinkingController2 = this.a;
            ajff a = ((ahic) obj).a();
            PlayerResponseModel c = a.c();
            if (c == null) {
                zep.b("Video changed event does not have a PlayerResponse.");
                return;
            }
            final aowh n = c.n();
            if (n == null) {
                return;
            }
            if ((n.b & 1) == 0) {
                zep.b("Account linking config does not have an entity key.");
                return;
            }
            accountLinkingController2.c = new WeakReference(a.k());
            aagh c2 = accountLinkingController2.a.c();
            String str = n.c;
            accountLinkingController2.b = c2.h(str, false).X(aypa.a()).at(new goe(accountLinkingController2), fzc.n);
            c2.f(str).y(aypa.a()).o(new goe(accountLinkingController2, 1)).l(new aypv() { // from class: god
                @Override // defpackage.aypv
                public final void a() {
                    AccountLinkingController.this.i(n.d);
                }
            }).S();
        } else {
            ahie ahieVar = (ahie) obj;
            this.a.h();
        }
    }
}
