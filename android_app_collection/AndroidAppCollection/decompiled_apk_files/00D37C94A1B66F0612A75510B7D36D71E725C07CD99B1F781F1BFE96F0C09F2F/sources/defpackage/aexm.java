package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.util.List;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aexm  reason: default package */
/* loaded from: classes.dex */
public final class aexm implements awd {
    private final aevy a;

    public aexm(aevy aevyVar) {
        this.a = aevyVar;
    }

    @Override // defpackage.awd
    public final synchronized List a(String str, boolean z, boolean z2) {
        PlayerConfigModel playerConfigModel;
        afbl afblVar;
        Set set;
        avz b;
        afbi afbiVar = this.a.n;
        if (afbiVar != null) {
            playerConfigModel = afbiVar.a();
            afblVar = afbiVar.f();
        } else {
            playerConfigModel = PlayerConfigModel.b;
            afblVar = null;
        }
        if (afblVar == null || afblVar.e != 3) {
            set = amyg.a;
        } else {
            set = playerConfigModel.W();
        }
        affx affxVar = this.a.c;
        aegv aegvVar = aegv.NONE;
        if (affxVar.a && pwl.l(str)) {
            aegvVar = affxVar.f;
        }
        b = afmg.b(str, z, playerConfigModel.V(), set, aegvVar.d);
        return b == null ? amuk.q() : amuk.r(b);
    }
}
