package defpackage;

import android.content.Context;
import android.text.Spanned;
import androidx.preference.DialogPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.google.android.libraries.youtube.account.inlineauth.settings.QuickPurchaseAuthMethodPreference;
import com.google.android.libraries.youtube.account.inlineauth.settings.QuickPurchaseEnabledPreference;
import com.google.protos.youtube.api.innertube.InlineAuthCommandOuterClass$InlineAuthCommand;
import java.util.HashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: wds  reason: default package */
/* loaded from: classes4.dex */
public class wds extends akjl {
    public final wcy a;
    public final akjm b;
    private final wdv i;

    public wds(Context context, aafo aafoVar, acti actiVar, lfv lfvVar, akjm akjmVar, wcy wcyVar, wdv wdvVar, afvn afvnVar) {
        super(context, aafoVar, actiVar, lfvVar, akjmVar, afvnVar);
        this.a = wcyVar;
        this.i = wdvVar;
        this.b = akjmVar;
    }

    @Override // defpackage.akjl
    public Preference a(auri auriVar, String str) {
        int bf;
        int bf2;
        int i;
        int bf3;
        Spanned b;
        aurg aurgVar = auriVar.e;
        if (aurgVar == null) {
            aurgVar = aurg.a;
        }
        final aurt aurtVar = auriVar.h;
        if (aurtVar == null) {
            aurtVar = aurt.a;
        }
        int bf4 = awwc.bf(aurgVar.c);
        if ((bf4 != 0 && bf4 == 290) || (((bf = awwc.bf(aurgVar.c)) != 0 && bf == 289) || ((bf2 = awwc.bf(aurgVar.c)) != 0 && bf2 == 225))) {
            aurg aurgVar2 = auriVar.e;
            if (aurgVar2 == null) {
                aurgVar2 = aurg.a;
            }
            aurg aurgVar3 = aurgVar2;
            int bf5 = awwc.bf(aurgVar.c);
            boolean z = (bf5 != 0 && bf5 == 289) || ((bf3 = awwc.bf(aurgVar.c)) != 0 && bf3 == 225);
            QuickPurchaseEnabledPreference quickPurchaseEnabledPreference = new QuickPurchaseEnabledPreference(this.c, z, this.i, this.b, aurgVar3);
            if ((aurgVar3.b & 16) != 0) {
                arag aragVar = aurgVar3.d;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
                quickPurchaseEnabledPreference.M(ajgl.b(aragVar));
            }
            quickPurchaseEnabledPreference.y = Boolean.valueOf(aurgVar3.f);
            quickPurchaseEnabledPreference.n = new wdr(quickPurchaseEnabledPreference, this, this.b, aurgVar3, this.i, quickPurchaseEnabledPreference, this.d, z);
            quickPurchaseEnabledPreference.G(!aurgVar3.g);
            if (aurgVar3.g && (aurgVar3.b & 4096) != 0) {
                arag aragVar2 = aurgVar3.k;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
                b = ajgl.b(aragVar2);
            } else if (aurgVar3.f || (aurgVar3.b & 2048) == 0) {
                arag aragVar3 = aurgVar3.e;
                if (aragVar3 == null) {
                    aragVar3 = arag.a;
                }
                b = ajgl.b(aragVar3);
            } else {
                arag aragVar4 = aurgVar3.j;
                if (aragVar4 == null) {
                    aragVar4 = arag.a;
                }
                b = ajgl.b(aragVar4);
            }
            quickPurchaseEnabledPreference.n(b);
            this.i.a.add(quickPurchaseEnabledPreference);
            quickPurchaseEnabledPreference.Z();
            return quickPurchaseEnabledPreference;
        }
        int bf6 = awwc.bf(aurtVar.c);
        if (bf6 == 0 || bf6 != 291) {
            return super.a(auriVar, str);
        }
        final QuickPurchaseAuthMethodPreference quickPurchaseAuthMethodPreference = new QuickPurchaseAuthMethodPreference(this.c, this.b);
        if ((aurtVar.b & 2) != 0) {
            arag aragVar5 = aurtVar.d;
            if (aragVar5 == null) {
                aragVar5 = arag.a;
            }
            quickPurchaseAuthMethodPreference.M(ajgl.b(aragVar5));
            arag aragVar6 = aurtVar.d;
            if (aragVar6 == null) {
                aragVar6 = arag.a;
            }
            ((DialogPreference) quickPurchaseAuthMethodPreference).a = ajgl.b(aragVar6);
            quickPurchaseAuthMethodPreference.I("billing_quick_purchase_auth_preference");
        }
        if ((aurtVar.b & 4) != 0) {
            arag aragVar7 = aurtVar.e;
            if (aragVar7 == null) {
                aragVar7 = arag.a;
            }
            quickPurchaseAuthMethodPreference.n(ajgl.b(aragVar7));
        }
        final List u = amxp.u(amxp.p(arey.p(aurtVar.f, new ampt() { // from class: wdq
            @Override // defpackage.ampt
            public final boolean a(Object obj) {
                auro auroVar;
                wds wdsVar = wds.this;
                aurp aurpVar = (aurp) obj;
                if (aurpVar.b == 64166933) {
                    auroVar = (auro) aurpVar.c;
                } else {
                    auroVar = auro.a;
                }
                return aurpVar.b == 64166933 && (!"FINGERPRINT".equalsIgnoreCase(auroVar.c) || wdsVar.a.a());
            }
        })), wdp.a);
        int i2 = 0;
        while (true) {
            i = -1;
            if (i2 >= u.size()) {
                i2 = -1;
                break;
            } else if ("FINGERPRINT".equalsIgnoreCase(((auro) u.get(i2)).c)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            quickPurchaseAuthMethodPreference.G = i2;
            quickPurchaseAuthMethodPreference.H = u;
        }
        CharSequence[] charSequenceArr = new CharSequence[u.size()];
        CharSequence[] charSequenceArr2 = new CharSequence[u.size()];
        int i3 = -1;
        for (int i4 = 0; i4 < u.size(); i4++) {
            auro auroVar = (auro) u.get(i4);
            charSequenceArr[i4] = auroVar.c;
            charSequenceArr2[i4] = auroVar.e;
            if (true == this.b.h(auroVar)) {
                i3 = i4;
            }
        }
        ((ListPreference) quickPurchaseAuthMethodPreference).g = charSequenceArr;
        ((ListPreference) quickPurchaseAuthMethodPreference).h = charSequenceArr2;
        if (i3 != -1) {
            if (i3 != -1) {
                i = i3;
            }
            quickPurchaseAuthMethodPreference.f(i);
            quickPurchaseAuthMethodPreference.n(quickPurchaseAuthMethodPreference.l());
        }
        quickPurchaseAuthMethodPreference.n = new bjf() { // from class: wdo
            @Override // defpackage.bjf
            public final boolean a(Preference preference, Object obj) {
                wds wdsVar = wds.this;
                aurt aurtVar2 = aurtVar;
                List list = u;
                QuickPurchaseAuthMethodPreference quickPurchaseAuthMethodPreference2 = quickPurchaseAuthMethodPreference;
                akjm akjmVar = wdsVar.b;
                aafo aafoVar = wdsVar.d;
                String str2 = ((ListPreference) quickPurchaseAuthMethodPreference2).i;
                if (str2 == null || !str2.equals(obj)) {
                    String obj2 = obj.toString();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= list.size()) {
                            i5 = -1;
                            break;
                        } else if (((auro) list.get(i5)).e.equals(obj2)) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                    auro auroVar2 = (auro) list.get(i5);
                    if ("FINGERPRINT".equalsIgnoreCase(auroVar2.c)) {
                        apzg apzgVar = auroVar2.g;
                        if (apzgVar == null) {
                            apzgVar = apzg.a;
                        }
                        if (apzgVar.qn(InlineAuthCommandOuterClass$InlineAuthCommand.inlineAuthCommand)) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", quickPurchaseAuthMethodPreference2);
                            apzg apzgVar2 = auroVar2.g;
                            if (apzgVar2 == null) {
                                apzgVar2 = apzg.a;
                            }
                            aafoVar.c(apzgVar2, hashMap);
                            return false;
                        }
                    }
                    alwb.g(obj, aurtVar2, wdsVar, akjmVar, null);
                    return true;
                }
                return false;
            }
        };
        quickPurchaseAuthMethodPreference.Z();
        return quickPurchaseAuthMethodPreference;
    }
}
