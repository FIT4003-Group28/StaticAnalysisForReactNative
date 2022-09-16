package com.google.android.libraries.youtube.gaming.thirdpartylinking;

import android.app.Activity;
import android.net.Uri;
import android.text.Spanned;
import androidx.preference.Preference;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.ab;
import com.google.android.libraries.youtube.gaming.thirdpartylinking.ThirdPartyAccountPreference;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand;
import com.google.protos.youtube.api.innertube.GamingAccountLinkSettingRendererOuterClass;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class ThirdPartyAccountPreference extends Preference {
    public arct a;
    public final aafo b;
    private final aagi c;
    private aypg d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThirdPartyAccountPreference(Activity activity, aafo aafoVar, ajmy ajmyVar, aagi aagiVar, arct arctVar) {
        super(activity, null);
        arag aragVar = null;
        this.b = aafoVar;
        this.a = arctVar;
        this.c = aagiVar;
        if ((arctVar.b & 1) != 0 && (aragVar = arctVar.c) == null) {
            aragVar = arag.a;
        }
        M(ajgl.b(aragVar));
        k(new zyo(this));
        this.o = new bjg() { // from class: zyn
            @Override // defpackage.bjg
            public final boolean b(Preference preference) {
                ThirdPartyAccountPreference thirdPartyAccountPreference = ThirdPartyAccountPreference.this;
                thirdPartyAccountPreference.k(new zyo(thirdPartyAccountPreference, 1));
                return true;
            }
        };
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(R.dimen.third_party_icon_size);
        avhn avhnVar = arctVar.f;
        Uri s = akel.s(avhnVar == null ? avhn.a : avhnVar, dimensionPixelSize);
        if (s != null) {
            H(akf.a(activity, R.drawable.third_party_icon_placeholder));
            ajmyVar.l(s, new zyt(this, activity));
        }
        if ((arctVar.b & 512) != 0) {
            this.d = aagiVar.c().h(arctVar.j, false).X(aypa.a()).at(new ayqb() { // from class: zyr
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    ThirdPartyAccountPreference thirdPartyAccountPreference = ThirdPartyAccountPreference.this;
                    aajj aajjVar = ((aajp) obj).c;
                    if (aajjVar instanceof aowf) {
                        thirdPartyAccountPreference.l(((aowf) aajjVar).getLinked().booleanValue());
                    } else {
                        zep.b("Entity update does not have account link status.");
                    }
                }
            }, ab.t);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final void C() {
        super.P();
        aypg aypgVar = this.d;
        if (aypgVar != null) {
            ayqi.c((AtomicReference) aypgVar);
            this.d = null;
        }
    }

    public final void l(boolean z) {
        Spanned b;
        arag aragVar = null;
        if (z) {
            arct arctVar = this.a;
            if ((arctVar.b & 2) != 0 && (aragVar = arctVar.d) == null) {
                aragVar = arag.a;
            }
            b = ajgl.b(aragVar);
        } else {
            arct arctVar2 = this.a;
            if ((arctVar2.b & 4) != 0 && (aragVar = arctVar2.e) == null) {
                aragVar = arag.a;
            }
            b = ajgl.b(aragVar);
        }
        n(b);
    }

    public final void k(final zyu zyuVar) {
        String str;
        String d;
        arct arctVar = this.a;
        int i = arctVar.b;
        if ((i & 512) != 0) {
            d = arctVar.j;
        } else {
            if ((i & 1024) == 0) {
                apzg apzgVar = arctVar.h;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                aunb aunbVar = ((GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand) apzgVar.qm(GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand.gamingAccountLinkSettingCommand)).c;
                if (aunbVar == null) {
                    aunbVar = aunb.a;
                }
                str = ((arbx) aunbVar.qm(GamingAccountLinkSettingRendererOuterClass.gamingAccountLinkSettingRenderer)).h;
            } else {
                str = arctVar.k;
            }
            d = aakj.d(122, str);
        }
        this.c.c().f(d).y(aypa.a()).o(new ayqb() { // from class: zyq
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                zyu.this.a(((aowf) ((aajj) obj)).getLinked().booleanValue());
            }
        }).l(new aypv() { // from class: zyp
            @Override // defpackage.aypv
            public final void a() {
                zyuVar.a(ThirdPartyAccountPreference.this.a.g);
            }
        }).S();
    }
}
