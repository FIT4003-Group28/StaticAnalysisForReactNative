package defpackage;

import com.google.android.apps.gmm.locationsharing.api.Profile;
import java.util.List;
/* compiled from: PG */
/* renamed from: aiig  reason: default package */
/* loaded from: classes2.dex */
public abstract class aiig implements aihd {
    final eapd b;
    final Profile c;
    final eaow d;

    public aiig(eapd eapdVar, Profile profile, eaow eaowVar) {
        this.b = eapdVar;
        this.c = profile;
        this.d = eaowVar;
    }

    static aiml g(Profile profile) {
        aimk bZ = aiml.i.bZ();
        ajja i = profile.a().i();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        aiml aimlVar = (aiml) bZ.b;
        i.getClass();
        aimlVar.b = i;
        aimlVar.a |= 1;
        if (profile.c().a()) {
            String b = profile.c().b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            aiml aimlVar2 = (aiml) bZ.b;
            b.getClass();
            aimlVar2.a |= 4;
            aimlVar2.d = b;
        }
        if (profile.e().a()) {
            String b2 = profile.e().b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            aiml aimlVar3 = (aiml) bZ.b;
            b2.getClass();
            aimlVar3.a |= 16;
            aimlVar3.f = b2;
        }
        if (profile.b().a()) {
            String b3 = profile.b().b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            aiml aimlVar4 = (aiml) bZ.b;
            b3.getClass();
            aimlVar4.a |= 2;
            aimlVar4.c = b3;
        }
        if (profile.d().a()) {
            String b4 = profile.d().b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            aiml aimlVar5 = (aiml) bZ.b;
            b4.getClass();
            aimlVar5.a |= 8;
            aimlVar5.e = b4;
        }
        return bZ.bK();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(aiml aimlVar, List<aiml> list) {
        int i = -1;
        for (int i2 = 0; i2 < list.size(); i2++) {
            ajja ajjaVar = list.get(i2).b;
            if (ajjaVar == null) {
                ajjaVar = ajja.d;
            }
            ajja ajjaVar2 = aimlVar.b;
            if (ajjaVar2 == null) {
                ajjaVar2 = ajja.d;
            }
            if (true == ajjaVar.equals(ajjaVar2)) {
                i = i2;
            }
        }
        return i;
    }

    public abstract aimj a(aimj aimjVar);

    public abstract aimp b();

    @Override // defpackage.aihd
    public final eapd d() {
        return this.b;
    }

    @Override // defpackage.aihd
    public final eaow e() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final aimm f() {
        aimm bZ = aimp.f.bZ();
        long j = this.b.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        aimp aimpVar = (aimp) bZ.b;
        aimpVar.a |= 1;
        aimpVar.b = j;
        aiml g = g(this.c);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        aimp aimpVar2 = (aimp) bZ.b;
        g.getClass();
        aimpVar2.c = g;
        aimpVar2.a |= 2;
        return bZ;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final aiml i() {
        return g(this.c);
    }
}
