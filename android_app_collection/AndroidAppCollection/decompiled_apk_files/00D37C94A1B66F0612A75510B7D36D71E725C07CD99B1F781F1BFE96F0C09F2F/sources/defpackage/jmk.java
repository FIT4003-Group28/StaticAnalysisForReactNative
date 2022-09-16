package defpackage;

import android.content.Context;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: jmk  reason: default package */
/* loaded from: classes3.dex */
public final class jmk extends jlq {
    private final Context a;
    private final azqb b;
    private final azqb c;
    private final azqb d;

    public jmk(Context context, azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        super(agqh.class, auqh.class);
        this.a = context;
        this.b = azqbVar;
        this.c = azqbVar2;
        this.d = azqbVar3;
    }

    @Override // defpackage.jmf
    public final /* bridge */ /* synthetic */ Object b(Object obj, amup amupVar) {
        arag aragVar;
        auex auexVar;
        agqh agqhVar = (agqh) obj;
        agqf agqfVar = agqhVar.a;
        String str = agqfVar.a;
        jml jmlVar = (jml) this.c.get();
        agwh m = ((agrf) this.b.get()).a().m();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (String str2 : agqhVar.b) {
            agqo d = m.d(str2);
            if (d != null && (auexVar = (auex) jmlVar.g(agqo.class, auex.class, d, amup.l("downloaded_video_playlist_id", str, "downloaded_video_list_index", Integer.valueOf(i)))) != null) {
                arrayList.add(auexVar);
                i++;
            }
        }
        aopa createBuilder = aueq.a.createBuilder();
        if (!amps.e(str)) {
            createBuilder.copyOnWrite();
            aueq aueqVar = (aueq) createBuilder.instance;
            aueqVar.c |= 1;
            aueqVar.f = str;
        }
        if (eog.M((aadd) this.d.get()) && (aragVar = agqfVar.k) != null) {
            aopa createBuilder2 = aues.a.createBuilder();
            atfa k = nni.k(this.a.getResources(), aragVar);
            createBuilder2.copyOnWrite();
            aues auesVar = (aues) createBuilder2.instance;
            k.getClass();
            auesVar.i = k;
            auesVar.b |= 64;
            createBuilder.aG((aues) createBuilder2.mo39build());
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            aopa createBuilder3 = aues.a.createBuilder();
            auex auexVar2 = (auex) arrayList.get(i2);
            createBuilder3.copyOnWrite();
            aues auesVar2 = (aues) createBuilder3.instance;
            auexVar2.getClass();
            auesVar2.c = auexVar2;
            auesVar2.b |= 1;
            createBuilder.aG((aues) createBuilder3.mo39build());
        }
        aopa createBuilder4 = auqh.a.createBuilder();
        aopa createBuilder5 = auqk.a.createBuilder();
        createBuilder5.copyOnWrite();
        auqk auqkVar = (auqk) createBuilder5.instance;
        aueq aueqVar2 = (aueq) createBuilder.mo39build();
        aueqVar2.getClass();
        auqkVar.r = aueqVar2;
        auqkVar.b |= 4096;
        createBuilder4.aJ((auqk) createBuilder5.mo39build());
        return (auqh) createBuilder4.mo39build();
    }
}
