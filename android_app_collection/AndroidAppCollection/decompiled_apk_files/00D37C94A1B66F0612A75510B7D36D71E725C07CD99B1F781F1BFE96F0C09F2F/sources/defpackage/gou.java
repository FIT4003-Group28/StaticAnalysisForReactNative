package defpackage;

import android.content.Context;
import android.text.Spanned;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.GamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand;
import com.google.protos.youtube.api.innertube.GamingAccountLinkConfirmDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand;
import com.google.protos.youtube.api.innertube.GamingAccountLinkSettingRendererOuterClass;
import java.util.Map;
/* compiled from: PG */
/* renamed from: gou  reason: default package */
/* loaded from: classes3.dex */
public final class gou implements aafl {
    private final Context a;
    private final aafo b;
    private final acti c;
    private final ajxz d;
    private final ajmy e;
    private final ajgz f;

    public gou(Context context, ajmy ajmyVar, aafo aafoVar, acti actiVar, ajxz ajxzVar, ajgz ajgzVar) {
        this.a = context;
        this.b = aafoVar;
        this.c = actiVar;
        this.d = ajxzVar;
        this.e = ajmyVar;
        this.f = ajgzVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        arbw arbwVar;
        arbx arbxVar;
        avhn avhnVar;
        avhn avhnVar2;
        avhn avhnVar3;
        arhs arhsVar;
        avhn avhnVar4;
        avhn avhnVar5;
        avhn avhnVar6;
        arhs arhsVar2;
        apzgVar.getClass();
        gow gowVar = new gow(this.b, this.c, this.d, this.e, this.f);
        GamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand gamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand = (GamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand) apzgVar.qm(GamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand.gamingAccountLinkConfirmDialogCommand);
        if (gamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand == null || (gamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand.b & 1) == 0) {
            arbwVar = null;
        } else {
            aunb aunbVar = gamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand.c;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            arbwVar = (arbw) aunbVar.qm(GamingAccountLinkConfirmDialogRendererOuterClass.gamingAccountLinkConfirmDialogRenderer);
        }
        if (arbwVar == null) {
            GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand gamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand = (GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand) apzgVar.qm(GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand.gamingAccountLinkSettingCommand);
            if (gamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand == null || (gamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand.b & 1) == 0) {
                arbxVar = null;
            } else {
                aunb aunbVar2 = gamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand.c;
                if (aunbVar2 == null) {
                    aunbVar2 = aunb.a;
                }
                arbxVar = (arbx) aunbVar2.qm(GamingAccountLinkSettingRendererOuterClass.gamingAccountLinkSettingRenderer);
            }
            if (arbxVar == null) {
                return;
            }
            Context context = this.a;
            apok apokVar = arbxVar.k;
            if (apokVar == null) {
                apokVar = apok.a;
            }
            apoj apojVar = apokVar.c;
            if (apojVar == null) {
                apojVar = apoj.a;
            }
            gowVar.e = apojVar;
            apok apokVar2 = arbxVar.e;
            if (apokVar2 == null) {
                apokVar2 = apok.a;
            }
            apoj apojVar2 = apokVar2.c;
            if (apojVar2 == null) {
                apojVar2 = apoj.a;
            }
            gowVar.d = apojVar2;
            gowVar.f = map;
            arag aragVar = arbxVar.f;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            Spanned b = ajgl.b(aragVar);
            aopu aopuVar = arbxVar.g;
            if ((arbxVar.b & 16384) != 0) {
                avhn avhnVar7 = arbxVar.i;
                if (avhnVar7 == null) {
                    avhnVar7 = avhn.a;
                }
                avhnVar = avhnVar7;
            } else {
                avhnVar = null;
            }
            if ((arbxVar.b & 8) != 0) {
                avhnVar2 = arbxVar.d;
                if (avhnVar2 == null) {
                    avhnVar2 = avhn.a;
                }
            } else {
                avhnVar2 = null;
            }
            if ((arbxVar.b & 4) != 0) {
                avhn avhnVar8 = arbxVar.c;
                if (avhnVar8 == null) {
                    avhnVar8 = avhn.a;
                }
                avhnVar3 = avhnVar8;
            } else {
                avhnVar3 = null;
            }
            if ((arbxVar.b & 32768) != 0) {
                arhs arhsVar3 = arbxVar.j;
                if (arhsVar3 == null) {
                    arhsVar3 = arhs.a;
                }
                arhsVar = arhsVar3;
            } else {
                arhsVar = null;
            }
            gowVar.h(context, R.layout.linked_account_settings_dialog_main, b, aopuVar, avhnVar, avhnVar2, avhnVar3, arhsVar, true);
            this.c.d(acuo.a(57203), apzgVar, null);
            return;
        }
        this.c.d(acuo.a(57204), apzgVar, null);
        Context context2 = this.a;
        apok apokVar3 = arbwVar.j;
        if (apokVar3 == null) {
            apokVar3 = apok.a;
        }
        apoj apojVar3 = apokVar3.c;
        if (apojVar3 == null) {
            apojVar3 = apoj.a;
        }
        gowVar.e = apojVar3;
        apok apokVar4 = arbwVar.i;
        if (apokVar4 == null) {
            apokVar4 = apok.a;
        }
        apoj apojVar4 = apokVar4.c;
        if (apojVar4 == null) {
            apojVar4 = apoj.a;
        }
        gowVar.d = apojVar4;
        gowVar.f = map;
        arag aragVar2 = arbwVar.c;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        Spanned b2 = ajgl.b(aragVar2);
        aopu aopuVar2 = arbwVar.h;
        if ((arbwVar.b & 2) != 0) {
            avhn avhnVar9 = arbwVar.d;
            if (avhnVar9 == null) {
                avhnVar9 = avhn.a;
            }
            avhnVar4 = avhnVar9;
        } else {
            avhnVar4 = null;
        }
        if ((arbwVar.b & 8) != 0) {
            avhnVar5 = arbwVar.f;
            if (avhnVar5 == null) {
                avhnVar5 = avhn.a;
            }
        } else {
            avhnVar5 = null;
        }
        if ((arbwVar.b & 4) != 0) {
            avhn avhnVar10 = arbwVar.e;
            if (avhnVar10 == null) {
                avhnVar10 = avhn.a;
            }
            avhnVar6 = avhnVar10;
        } else {
            avhnVar6 = null;
        }
        if ((arbwVar.b & 16) != 0) {
            arhs arhsVar4 = arbwVar.g;
            if (arhsVar4 == null) {
                arhsVar4 = arhs.a;
            }
            arhsVar2 = arhsVar4;
        } else {
            arhsVar2 = null;
        }
        gowVar.h(context2, R.layout.linked_account_confirmation_dialog, b2, aopuVar2, avhnVar4, avhnVar5, avhnVar6, arhsVar2, false);
    }
}
