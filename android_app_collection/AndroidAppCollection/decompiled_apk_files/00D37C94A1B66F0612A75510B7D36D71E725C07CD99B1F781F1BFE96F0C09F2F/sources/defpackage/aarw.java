package defpackage;

import android.text.Spanned;
import com.google.protos.youtube.api.innertube.InlineAuthCommandOuterClass$InlineAuthCommand;
import com.google.protos.youtube.api.innertube.SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint;
import com.google.protos.youtube.api.innertube.SignInEndpointOuterClass;
import com.google.protos.youtube.api.innertube.StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand;
/* compiled from: PG */
/* renamed from: aarw  reason: default package */
/* loaded from: classes.dex */
public final class aarw {
    public final aowy a;
    public aalc b;
    public aasf c;
    public auvx d;
    public InlineAuthCommandOuterClass$InlineAuthCommand e;
    public StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand f;
    private aalc g;

    public aarw(aowy aowyVar) {
        this.a = aowyVar;
        if (aowyVar == null || (aowyVar.b & 256) == 0) {
            return;
        }
        apzg apzgVar = aowyVar.j;
        if (!(apzgVar == null ? apzg.a : apzgVar).qn(SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint.selectActiveIdentityEndpoint)) {
            apzg apzgVar2 = aowyVar.j;
            if (!(apzgVar2 == null ? apzg.a : apzgVar2).qn(auqo.b)) {
                apzg apzgVar3 = aowyVar.j;
                if (!(apzgVar3 == null ? apzg.a : apzgVar3).qn(SignInEndpointOuterClass.signInEndpoint)) {
                    apzg apzgVar4 = aowyVar.j;
                    if (!(apzgVar4 == null ? apzg.a : apzgVar4).qn(InlineAuthCommandOuterClass$InlineAuthCommand.inlineAuthCommand)) {
                        apzg apzgVar5 = aowyVar.j;
                        if (!(apzgVar5 == null ? apzg.a : apzgVar5).qn(StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand.startModularOnboardingCommand)) {
                            return;
                        }
                        apzg apzgVar6 = aowyVar.j;
                        StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand startModularOnboardingCommandOuterClass$StartModularOnboardingCommand = (StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand) (apzgVar6 == null ? apzg.a : apzgVar6).qm(StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand.startModularOnboardingCommand);
                        this.f = startModularOnboardingCommandOuterClass$StartModularOnboardingCommand;
                        apzg apzgVar7 = startModularOnboardingCommandOuterClass$StartModularOnboardingCommand.e;
                        if ((apzgVar7 == null ? apzg.a : apzgVar7).qn(SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint.selectActiveIdentityEndpoint)) {
                            apzg apzgVar8 = this.f.e;
                            this.c = new aasf((SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint) (apzgVar8 == null ? apzg.a : apzgVar8).qm(SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint.selectActiveIdentityEndpoint));
                        }
                        apzg apzgVar9 = this.f.e;
                        if (!(apzgVar9 == null ? apzg.a : apzgVar9).qn(SignInEndpointOuterClass.signInEndpoint)) {
                            return;
                        }
                        apzg apzgVar10 = this.f.e;
                        apwe apweVar = ((auvx) (apzgVar10 == null ? apzg.a : apzgVar10).qm(SignInEndpointOuterClass.signInEndpoint)).e;
                        this.c = new aasf(apweVar == null ? apwe.b : apweVar);
                        return;
                    }
                    apzg apzgVar11 = aowyVar.j;
                    InlineAuthCommandOuterClass$InlineAuthCommand inlineAuthCommandOuterClass$InlineAuthCommand = (InlineAuthCommandOuterClass$InlineAuthCommand) (apzgVar11 == null ? apzg.a : apzgVar11).qm(InlineAuthCommandOuterClass$InlineAuthCommand.inlineAuthCommand);
                    this.e = inlineAuthCommandOuterClass$InlineAuthCommand;
                    apzg apzgVar12 = inlineAuthCommandOuterClass$InlineAuthCommand.c;
                    if (!(apzgVar12 == null ? apzg.a : apzgVar12).qn(SignInEndpointOuterClass.signInEndpoint)) {
                        return;
                    }
                    apzg apzgVar13 = this.e.c;
                    apwe apweVar2 = ((auvx) (apzgVar13 == null ? apzg.a : apzgVar13).qm(SignInEndpointOuterClass.signInEndpoint)).e;
                    this.c = new aasf(apweVar2 == null ? apwe.b : apweVar2);
                    return;
                }
                apzg apzgVar14 = aowyVar.j;
                this.d = (auvx) (apzgVar14 == null ? apzg.a : apzgVar14).qm(SignInEndpointOuterClass.signInEndpoint);
                apwe apweVar3 = this.d.e;
                this.c = new aasf(apweVar3 == null ? apwe.b : apweVar3);
                return;
            }
            apzg apzgVar15 = aowyVar.j;
            auqo auqoVar = (auqo) (apzgVar15 == null ? apzg.a : apzgVar15).qm(auqo.b);
            this.c = new aasf();
            return;
        }
        apzg apzgVar16 = aowyVar.j;
        this.c = new aasf((SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint) (apzgVar16 == null ? apzg.a : apzgVar16).qm(SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint.selectActiveIdentityEndpoint));
    }

    public final Spanned a() {
        arag aragVar;
        aowy aowyVar = this.a;
        if ((aowyVar.b & 4) != 0) {
            aragVar = aowyVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        return ajgl.b(aragVar);
    }

    public final Spanned b() {
        arag aragVar;
        aowy aowyVar = this.a;
        if ((aowyVar.b & 8) != 0) {
            aragVar = aowyVar.e;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        return ajgl.b(aragVar);
    }

    public final aalc c() {
        if (this.g == null) {
            avhn avhnVar = this.a.f;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            this.g = new aalc(avhnVar);
        }
        return this.g;
    }

    public final apzg d() {
        apzg apzgVar = this.a.j;
        return apzgVar == null ? apzg.a : apzgVar;
    }

    public final arhr e() {
        aowy aowyVar = this.a;
        if ((aowyVar.b & 1024) != 0) {
            arhr b = arhr.b(aowyVar.k);
            return b == null ? arhr.UNKNOWN : b;
        }
        return null;
    }

    public final aunb f() {
        aowy aowyVar = this.a;
        if ((aowyVar.b & 32) != 0) {
            aunb aunbVar = aowyVar.g;
            return aunbVar == null ? aunb.a : aunbVar;
        }
        return null;
    }

    public final String g() {
        aasf aasfVar = this.c;
        if (aasfVar.a == null) {
            aasfVar.b();
        }
        return aasfVar.a;
    }

    public final String h() {
        aasf aasfVar = this.c;
        if (aasfVar.c == null) {
            aasfVar.b();
        }
        return aasfVar.c;
    }

    public final String i() {
        return this.c.a();
    }

    public final String j() {
        aasf aasfVar = this.c;
        if (aasfVar.b == null) {
            aasfVar.b();
        }
        return aasfVar.b;
    }

    public final String k() {
        aasf aasfVar = this.c;
        if (aasfVar.i == null) {
            aasfVar.b();
        }
        return aasfVar.i;
    }

    public final boolean l() {
        return this.c != null;
    }

    public final boolean m() {
        aasf aasfVar = this.c;
        if (aasfVar.g == null) {
            aasfVar.b();
        }
        Boolean bool = aasfVar.g;
        return bool != null && bool.booleanValue();
    }

    public final boolean n() {
        aasf aasfVar = this.c;
        if (aasfVar.e == null) {
            aasfVar.b();
        }
        Boolean bool = aasfVar.e;
        return bool != null && bool.booleanValue();
    }

    public final boolean o() {
        return this.a.h;
    }

    public final boolean p() {
        aasf aasfVar = this.c;
        if (aasfVar.f == null) {
            aasfVar.b();
        }
        Boolean bool = aasfVar.f;
        return bool != null && bool.booleanValue();
    }

    public final byte[] q() {
        return this.a.c.I();
    }
}
