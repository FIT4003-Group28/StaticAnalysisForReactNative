package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: jmn  reason: default package */
/* loaded from: classes3.dex */
public final class jmn extends jlr {
    private final Context a;
    private final fcl b;

    public jmn(azqb azqbVar, fcl fclVar, Context context) {
        super(azqbVar, aslu.class);
        this.b = fclVar;
        this.a = context;
    }

    private static final auxq g(String str, boolean z, aqpa aqpaVar, int i) {
        aopa createBuilder = auxs.a.createBuilder();
        aumx m = llm.m(aqos.REQUEST_TYPE_FILTER_CHANGE, aqpaVar, i);
        createBuilder.copyOnWrite();
        auxs auxsVar = (auxs) createBuilder.instance;
        m.getClass();
        auxsVar.c = m;
        auxsVar.b |= 1;
        auxs auxsVar2 = (auxs) createBuilder.mo39build();
        aopa createBuilder2 = auxq.a.createBuilder();
        createBuilder2.copyOnWrite();
        auxq auxqVar = (auxq) createBuilder2.instance;
        str.getClass();
        auxqVar.b |= 1;
        auxqVar.e = str;
        createBuilder2.copyOnWrite();
        auxq auxqVar2 = (auxq) createBuilder2.instance;
        auxqVar2.b |= 4;
        auxqVar2.g = z;
        createBuilder2.copyOnWrite();
        auxq auxqVar3 = (auxq) createBuilder2.instance;
        auxsVar2.getClass();
        auxqVar3.d = auxsVar2;
        auxqVar3.c = 3;
        return (auxq) createBuilder2.mo39build();
    }

    @Override // defpackage.jlr
    protected final /* bridge */ /* synthetic */ Object a(agvx agvxVar, amup amupVar) {
        if (this.b.j() || this.b.k()) {
            aqpa b = aqpa.b(((Integer) e(amupVar, "downloads_page_filter_type")).intValue());
            int intValue = ((Integer) e(amupVar, "downloads_page_downloads_section_items_to_show")).intValue();
            aopa createBuilder = aslu.a.createBuilder();
            aopa createBuilder2 = aslr.a.createBuilder();
            Context context = this.a;
            aopa createBuilder3 = auxr.a.createBuilder();
            createBuilder3.aQ(g(context.getString(R.string.downloads_page_playlists_and_videos_menu_item), aqpa.FILTER_TYPE_NONE == b, aqpa.FILTER_TYPE_NONE, intValue));
            createBuilder3.aQ(g(context.getString(R.string.downloads_page_playlists_menu_item), aqpa.FILTER_TYPE_PLAYLISTS_ONLY == b, aqpa.FILTER_TYPE_PLAYLISTS_ONLY, intValue));
            createBuilder3.aQ(g(context.getString(R.string.downloads_page_videos_menu_item), aqpa.FILTER_TYPE_VIDEOS_ONLY == b, aqpa.FILTER_TYPE_VIDEOS_ONLY, intValue));
            auxr auxrVar = (auxr) createBuilder3.mo39build();
            if (auxrVar != null) {
                createBuilder2.copyOnWrite();
                aslr aslrVar = (aslr) createBuilder2.instance;
                aslrVar.c = auxrVar;
                aslrVar.b |= 1;
            }
            createBuilder.copyOnWrite();
            aslu asluVar = (aslu) createBuilder.instance;
            aslr aslrVar2 = (aslr) createBuilder2.mo39build();
            aslrVar2.getClass();
            asluVar.d = aslrVar2;
            asluVar.b |= 2;
            if (this.b.e()) {
                arag g = ajgl.g(this.a.getString(R.string.downloaded_items_title));
                createBuilder.copyOnWrite();
                aslu asluVar2 = (aslu) createBuilder.instance;
                g.getClass();
                asluVar2.c = g;
                asluVar2.b |= 1;
            }
            return (aslu) createBuilder.mo39build();
        }
        return aslu.a;
    }

    @Override // defpackage.jlr
    protected final /* bridge */ /* synthetic */ Object f() {
        return aslu.a;
    }
}
