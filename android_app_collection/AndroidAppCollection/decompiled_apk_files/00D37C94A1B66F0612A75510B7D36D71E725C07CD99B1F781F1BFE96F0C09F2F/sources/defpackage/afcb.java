package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
/* compiled from: PG */
/* renamed from: afcb  reason: default package */
/* loaded from: classes.dex */
public final class afcb extends afci {
    private final aenf d;

    public afcb(asu asuVar, afjz afjzVar, int i, int i2, aenf aenfVar, aflm aflmVar, int i3, aexg[] aexgVarArr, yrj yrjVar) {
        super(asuVar, afjzVar, i, i2, aflmVar, i3, aexgVarArr, yrjVar);
        this.d = aenfVar;
    }

    @Override // defpackage.afci
    public final afcl a(ave aveVar, FormatStreamModel[] formatStreamModelArr, afjz afjzVar, int[] iArr, pvf pvfVar, int i, atk atkVar, aflm aflmVar, int i2, PlayerConfigModel playerConfigModel, yrj yrjVar) {
        return new afcc(this.d, aveVar, formatStreamModelArr, afjzVar, iArr, pvfVar, i, c(atkVar), b(i), aflmVar, i2, this.b, playerConfigModel, yrjVar);
    }
}
