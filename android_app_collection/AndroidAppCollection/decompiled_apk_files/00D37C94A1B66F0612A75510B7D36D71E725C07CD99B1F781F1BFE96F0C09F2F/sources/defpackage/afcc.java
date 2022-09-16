package defpackage;

import com.google.android.exoplayer2.Format;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.util.HashSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: afcc  reason: default package */
/* loaded from: classes.dex */
public final class afcc extends afcl {
    private final aenf b;
    private int c;

    public afcc(aenf aenfVar, ave aveVar, FormatStreamModel[] formatStreamModelArr, afjz afjzVar, int[] iArr, pvf pvfVar, int i, asv asvVar, int i2, aflm aflmVar, int i3, aexg[] aexgVarArr, PlayerConfigModel playerConfigModel, yrj yrjVar) {
        super(aveVar, formatStreamModelArr, afjzVar, iArr, pvfVar, i, asvVar, i2, aflmVar, i3, aexgVarArr, playerConfigModel, yrjVar);
        this.c = 0;
        this.b = aenfVar;
    }

    @Override // defpackage.afcl, defpackage.pry
    public final void c(long j, long j2, List list, prw prwVar) {
        boolean h = this.b.h();
        if (!this.b.i()) {
            return;
        }
        if (!h && this.c < 2) {
            HashSet hashSet = new HashSet();
            for (afck afckVar : this.a) {
                hashSet.add(afckVar.a.a.a);
            }
            if (!this.b.g(hashSet)) {
                return;
            }
            this.c++;
        }
        super.c(j, j2, list, prwVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.afcl
    public final pru j(afck afckVar, asv asvVar, Format format, int i, Object obj, avf avfVar, avf avfVar2, long j) {
        avf avfVar3;
        avf avfVar4;
        if (((avd) afckVar.a.b.get(0)).a.contains("oda")) {
            avg b = this.b.b(afckVar.a.a.a);
            if (b == null || !this.b.i()) {
                return null;
            }
            avf avfVar5 = avfVar != null ? b.d : null;
            avfVar4 = avfVar2 != null ? b.g : null;
            avfVar3 = avfVar5;
        } else {
            avfVar3 = avfVar;
            avfVar4 = avfVar2;
        }
        return super.j(afckVar, asvVar, format, i, obj, avfVar3, avfVar4, j);
    }
}
