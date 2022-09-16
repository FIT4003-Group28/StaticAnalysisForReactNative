package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
/* compiled from: PG */
/* renamed from: afci  reason: default package */
/* loaded from: classes.dex */
public class afci {
    public final yrj a;
    public final aexg[] b;
    public final afjz c;
    private final asu d;
    private final int e;
    private final int f;
    private final aflm g;
    private final int h;

    public afci(asu asuVar, afjz afjzVar, int i, int i2, aflm aflmVar, int i3, aexg[] aexgVarArr, yrj yrjVar) {
        this.d = asuVar;
        this.c = afjzVar;
        this.e = i;
        this.f = i2;
        this.g = aflmVar;
        this.h = i3;
        this.b = aexgVarArr;
        this.a = yrjVar;
    }

    protected afcl a(ave aveVar, FormatStreamModel[] formatStreamModelArr, afjz afjzVar, int[] iArr, pvf pvfVar, int i, atk atkVar, aflm aflmVar, int i2, PlayerConfigModel playerConfigModel, yrj yrjVar) {
        return new afcl(aveVar, formatStreamModelArr, afjzVar, iArr, pvfVar, i, c(atkVar), b(i), aflmVar, i2, this.b, playerConfigModel, yrjVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int b(int i) {
        return i == 1 ? this.f : this.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final asv c(atk atkVar) {
        asv a = this.d.a();
        if (atkVar != null) {
            a.b(atkVar);
        }
        return a;
    }

    public final pry d(ave aveVar, FormatStreamModel[] formatStreamModelArr, int[] iArr, pvf pvfVar, int i, atk atkVar, PlayerConfigModel playerConfigModel) {
        return a(aveVar, formatStreamModelArr, this.c, iArr, pvfVar, i, atkVar, this.g, this.h, playerConfigModel, this.a);
    }
}
