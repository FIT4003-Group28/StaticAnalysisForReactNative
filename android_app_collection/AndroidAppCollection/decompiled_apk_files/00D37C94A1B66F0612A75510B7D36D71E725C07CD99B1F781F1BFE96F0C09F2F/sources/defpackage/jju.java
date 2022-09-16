package defpackage;

import android.content.Context;
import android.util.Pair;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: jju  reason: default package */
/* loaded from: classes3.dex */
public final class jju extends agul {
    private final Context e;
    private final boolean f;

    public jju(Context context, agvx agvxVar, String str, aacz aaczVar) {
        super(context, agvxVar, str);
        this.e = context;
        asxj asxjVar = aaczVar.b().e;
        this.f = (asxjVar == null ? asxj.a : asxjVar).bb;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agul, defpackage.agsp
    public final Pair a() {
        if (g()) {
            List k = this.a.m().k();
            arhs arhsVar = null;
            if (k == null || k.isEmpty()) {
                return b(null, Collections.emptyList());
            }
            ArrayList arrayList = new ArrayList(k);
            Collections.sort(arrayList, fay.d);
            int size = arrayList.size();
            String string = this.e.getString(R.string.single_videos_playlist_title);
            String string2 = this.f ? this.e.getString(R.string.single_videos_playlist_subtitle) : null;
            if (this.f) {
                aopc aopcVar = (aopc) arhs.a.createBuilder();
                arhr arhrVar = arhr.OFFLINE_PIN;
                aopcVar.copyOnWrite();
                arhs arhsVar2 = (arhs) aopcVar.instance;
                arhsVar2.c = arhrVar.pS;
                arhsVar2.b |= 1;
                arhsVar = (arhs) aopcVar.mo39build();
            }
            return b(agqf.b(size, string, string2, arhsVar), arrayList);
        }
        return super.a();
    }
}
