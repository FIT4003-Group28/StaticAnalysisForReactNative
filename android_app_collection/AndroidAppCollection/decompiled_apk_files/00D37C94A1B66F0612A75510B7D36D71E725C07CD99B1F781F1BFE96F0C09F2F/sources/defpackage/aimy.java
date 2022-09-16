package defpackage;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aimy  reason: default package */
/* loaded from: classes.dex */
public final class aimy {
    public final aaqj a;
    public final zdz b;
    public final aadd c;
    private final aaqf d;
    private final ainb e;
    private final afvn f;
    private final String g;
    private final boolean h;
    private final yni i;

    public aimy(aaqj aaqjVar, aaqf aaqfVar, ainb ainbVar, afvn afvnVar, String str, yni yniVar, aacz aaczVar, aadd aaddVar, zdz zdzVar) {
        this.e = ainbVar;
        aaqfVar.getClass();
        this.d = aaqfVar;
        afvnVar.getClass();
        this.f = afvnVar;
        zgh.m(str);
        this.g = str;
        aaqjVar.getClass();
        this.a = aaqjVar;
        apyy b = aaczVar.b();
        boolean z = true;
        if (b != null) {
            atfw atfwVar = b.k;
            if (((atfwVar == null ? atfw.a : atfwVar).c & 16) != 0) {
                atfw atfwVar2 = b.k;
                apgt apgtVar = (atfwVar2 == null ? atfw.a : atfwVar2).v;
                z = (apgtVar == null ? apgt.a : apgtVar).d;
            }
        }
        this.h = z;
        yniVar.getClass();
        this.i = yniVar;
        this.c = aaddVar;
        this.b = zdzVar;
    }

    public final aina a(String str, byte[] bArr, String str2, String str3, int i, int i2, Set set, String str4, acvg acvgVar, boolean z) {
        aina d = d(new aimw(this.i, acvgVar));
        d.q(1);
        d.k(bArr);
        d.b = str;
        d.d = str3;
        d.s = i;
        d.P = i2;
        d.c = str2;
        d.j = z;
        d.K = str4;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((aimx) it.next()).rj(d);
        }
        return d;
    }

    public final aina b(PlaybackStartDescriptor playbackStartDescriptor, int i, Set set, acvg acvgVar, String str) {
        aina a = a(playbackStartDescriptor.l(), playbackStartDescriptor.y(), playbackStartDescriptor.j(), playbackStartDescriptor.k(), playbackStartDescriptor.a(), i, set, str, acvgVar, false);
        if (playbackStartDescriptor.s()) {
            a.G = true;
        }
        if (playbackStartDescriptor.r()) {
            a.H = true;
        }
        if (!playbackStartDescriptor.n().isEmpty()) {
            for (Map.Entry entry : playbackStartDescriptor.n().entrySet()) {
                a.h().put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        a.f51J = playbackStartDescriptor.u();
        return a;
    }

    public final aina c() {
        return d(new yph(this.i, new aads(), new aadr(), new aadq(), new aadp()));
    }

    public final aina d(yre yreVar) {
        ainb ainbVar = this.e;
        aaqf aaqfVar = this.d;
        afvm c = this.f.c();
        c.getClass();
        zfq zfqVar = (zfq) ainbVar.a.get();
        zfqVar.getClass();
        Set set = (Set) ainbVar.b.get();
        set.getClass();
        aiix aiixVar = (aiix) ainbVar.c.get();
        aiixVar.getClass();
        aina ainaVar = new aina(aaqfVar, c, zfqVar, set, aiixVar);
        ainaVar.k = this.g;
        ainaVar.i = this.h;
        ainaVar.p = yreVar;
        return ainaVar;
    }
}
