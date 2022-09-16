package defpackage;

import android.content.Intent;
import com.google.android.libraries.parenttools.youtube.ParentToolsActivity;
import com.google.android.libraries.parenttools.youtube.ParentToolsResult;
import com.google.protos.youtube.api.innertube.StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand;
import java.util.Map;
/* compiled from: PG */
/* renamed from: vyi  reason: default package */
/* loaded from: classes4.dex */
public final class vyi implements aafl, yiu {
    private final dt a;
    private final wfy b;
    private final aafo c;
    private final aadd d;
    private final yjk e;

    public vyi(dt dtVar, aafo aafoVar, yjk yjkVar, wfy wfyVar, aadd aaddVar) {
        this.a = dtVar;
        this.c = aafoVar;
        this.e = yjkVar;
        this.b = wfyVar;
        this.d = aaddVar;
    }

    @Override // defpackage.yiu
    public final void kC(int i, int i2, Intent intent) {
        ParentToolsResult parentToolsResult;
        apzg apzgVar;
        if ((i == 9406 || i2 == -1) && intent.getExtras() != null && (parentToolsResult = (ParentToolsResult) intent.getExtras().getParcelable("parent_tools_result")) != null && parentToolsResult.b() == 3) {
            try {
                apzgVar = (apzg) ((aopc) ((aopc) apzg.a.createBuilder()).mo38mergeFrom(parentToolsResult.a(), aoos.b())).mo39build();
            } catch (aopx unused) {
                this.b.a();
                apzgVar = null;
            }
            this.c.a(apzgVar);
        }
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (apzgVar == null || !apzgVar.qn(StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand.startModularOnboardingCommand)) {
            return;
        }
        StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand startModularOnboardingCommandOuterClass$StartModularOnboardingCommand = (StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand) apzgVar.qm(StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand.startModularOnboardingCommand);
        arhd a = this.d.a();
        boolean z = false;
        if ((a.b & 64) != 0) {
            asxp asxpVar = a.e;
            if (asxpVar == null) {
                asxpVar = asxp.a;
            }
            if (asxpVar.bl) {
                z = true;
            }
        }
        ush a2 = ParentToolsActivity.a(this.a);
        a2.b = "HOST_CLIENT_NAME_MAIN_ANDROID";
        a2.c = zfm.c(this.a);
        a2.e = startModularOnboardingCommandOuterClass$StartModularOnboardingCommand.c;
        a2.f = startModularOnboardingCommandOuterClass$StartModularOnboardingCommand.d;
        a2.i = startModularOnboardingCommandOuterClass$StartModularOnboardingCommand.f;
        apwe apweVar = startModularOnboardingCommandOuterClass$StartModularOnboardingCommand.b;
        if (apweVar == null) {
            apweVar = apwe.b;
        }
        a2.d = apweVar.i;
        apzg apzgVar2 = startModularOnboardingCommandOuterClass$StartModularOnboardingCommand.e;
        if (apzgVar2 == null) {
            apzgVar2 = apzg.a;
        }
        a2.h = apzgVar2.toByteArray();
        a2.j = usk.MODULAR_ONBOARDING;
        a2.k = z;
        this.e.a(a2.a(), 9406, this);
    }
}
