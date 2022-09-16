package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aiyi  reason: default package */
/* loaded from: classes.dex */
public final class aiyi {
    public final atzs a;
    public atzq b;
    private final String c;
    private final boolean d;
    private final String e;
    private final aiix f;

    private aiyi(String str, boolean z, atzs atzsVar, String str2, aiix aiixVar) {
        this.c = str;
        this.a = atzsVar;
        this.d = z;
        this.e = str2;
        this.f = aiixVar;
        int i = atzsVar.d;
        atzq atzqVar = null;
        if (i >= 0 && i < atzsVar.c.size()) {
            atzqVar = (atzq) atzsVar.c.get(atzsVar.d);
        }
        this.b = atzqVar;
    }

    public static aiyi e(PlayerResponseModel playerResponseModel, String str, aiix aiixVar) {
        atzs atzsVar;
        playerResponseModel.getClass();
        String B = playerResponseModel.B();
        boolean E = playerResponseModel.E();
        asaj asajVar = playerResponseModel.a;
        if ((asajVar.b & 256) != 0) {
            appu appuVar = asajVar.n;
            if (appuVar == null) {
                appuVar = appu.a;
            }
            atzsVar = appuVar.b;
            if (atzsVar == null) {
                atzsVar = atzs.a;
            }
        } else {
            atzsVar = null;
        }
        if (B == null || atzsVar == null) {
            return null;
        }
        return new aiyi(B, E, atzsVar, str, aiixVar);
    }

    private final SubtitleTrack g(atzr atzrVar) {
        aiyg a = a(atzrVar);
        a.d(false);
        return a.a();
    }

    public final aiyg a(atzr atzrVar) {
        arag aragVar;
        aiyg m = SubtitleTrack.m();
        m.e(atzrVar.f);
        m.j(this.c);
        m.k(atzrVar.e);
        m.i(atzrVar.c);
        if ((atzrVar.b & 16) != 0) {
            aragVar = atzrVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        m.b = ajgl.b(aragVar);
        m.c(this.d);
        return m;
    }

    public final SubtitleTrack b() {
        int i;
        atzq atzqVar = this.b;
        if (atzqVar == null || !atzqVar.f || (i = atzqVar.e) < 0 || i >= this.a.b.size()) {
            return null;
        }
        return g((atzr) this.a.b.get(atzqVar.e));
    }

    public final SubtitleTrack c(String str) {
        atzq atzqVar;
        if (str != null && (atzqVar = this.b) != null) {
            for (Integer num : atzqVar.d) {
                int intValue = num.intValue();
                if (intValue >= 0 && intValue < this.a.b.size() && ((atzr) this.a.b.get(intValue)).f.equals(str)) {
                    return g((atzr) this.a.b.get(intValue));
                }
            }
        }
        return null;
    }

    public final aiyh d() {
        aiyh aiyhVar;
        atzq atzqVar = this.b;
        if (atzqVar == null) {
            return aiyh.UNKNOWN;
        }
        aiix aiixVar = this.f;
        aiyh aiyhVar2 = aiyh.UNKNOWN;
        if (!aiixVar.x() || (atzqVar.b & 64) == 0) {
            Map map = aiyh.e;
            atzp b = atzp.b(atzqVar.i);
            if (b == null) {
                b = atzp.UNKNOWN;
            }
            aiyhVar = (aiyh) zew.H(map, b, aiyh.UNKNOWN);
        } else {
            Map map2 = aiyh.f;
            apps b2 = apps.b(atzqVar.j);
            if (b2 == null) {
                b2 = apps.CAPTIONS_INITIAL_STATE_UNKNOWN;
            }
            aiyhVar = (aiyh) zew.H(map2, b2, aiyh.UNKNOWN);
        }
        return aiyhVar == null ? aiyh.UNKNOWN : aiyhVar;
    }

    public final List f() {
        atzq atzqVar;
        ArrayList arrayList = new ArrayList();
        if (this.a.b.size() != 0 && this.a.c.size() != 0 && (atzqVar = this.b) != null) {
            for (Integer num : atzqVar.d) {
                int intValue = num.intValue();
                if (intValue >= 0 && intValue < this.a.b.size()) {
                    arrayList.add(g((atzr) this.a.b.get(intValue)));
                }
            }
            arrayList.add(0, SubtitleTrack.o(this.e));
        }
        return arrayList;
    }
}
