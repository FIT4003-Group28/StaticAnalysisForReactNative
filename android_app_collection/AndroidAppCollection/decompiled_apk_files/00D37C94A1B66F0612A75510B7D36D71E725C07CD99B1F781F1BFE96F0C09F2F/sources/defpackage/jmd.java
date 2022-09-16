package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: jmd  reason: default package */
/* loaded from: classes3.dex */
public final class jmd extends jlq {
    private final Context a;

    public jmd(Context context) {
        super(fcl.class, apke.class);
        this.a = context;
    }

    private static int a(aqpa aqpaVar) {
        aqpa aqpaVar2 = aqpa.FILTER_TYPE_UNSPECIFIED;
        int ordinal = aqpaVar.ordinal();
        return ordinal != 2 ? ordinal != 3 ? R.string.no_offline_content_title : R.string.no_offline_videos_title : R.string.no_offline_playlists_title;
    }

    @Override // defpackage.jmf
    public final /* bridge */ /* synthetic */ Object b(Object obj, amup amupVar) {
        aqpa b = aqpa.b(((Integer) e(amupVar, "downloads_page_filter_type")).intValue());
        aopa createBuilder = apke.a.createBuilder();
        aopa createBuilder2 = apkg.a.createBuilder();
        arhr arhrVar = arhr.DOWNLOADS_PAGE_EMPTY;
        createBuilder2.copyOnWrite();
        apkg apkgVar = (apkg) createBuilder2.instance;
        apkgVar.c = arhrVar.pS;
        apkgVar.b |= 1;
        createBuilder.copyOnWrite();
        apke apkeVar = (apke) createBuilder.instance;
        apkg apkgVar2 = (apkg) createBuilder2.mo39build();
        apkgVar2.getClass();
        apkeVar.d = apkgVar2;
        apkeVar.c = 3;
        if (((fcl) obj).e()) {
            arag g = ajgl.g(this.a.getString(a(b)));
            createBuilder.copyOnWrite();
            apke apkeVar2 = (apke) createBuilder.instance;
            g.getClass();
            apkeVar2.f = g;
            apkeVar2.b |= 2;
            aopa createBuilder3 = apkf.a.createBuilder();
            createBuilder3.copyOnWrite();
            apkf apkfVar = (apkf) createBuilder3.instance;
            apkfVar.c = 2;
            apkfVar.b |= 1;
            createBuilder.copyOnWrite();
            apke apkeVar3 = (apke) createBuilder.instance;
            apkf apkfVar2 = (apkf) createBuilder3.mo39build();
            apkfVar2.getClass();
            apkeVar3.j = apkfVar2;
            apkeVar3.b |= 256;
        } else {
            arag g2 = ajgl.g(this.a.getString(a(b)));
            createBuilder.copyOnWrite();
            apke apkeVar4 = (apke) createBuilder.instance;
            g2.getClass();
            apkeVar4.e = g2;
            apkeVar4.b |= 1;
            String[] strArr = new String[1];
            strArr[0] = this.a.getString(b == aqpa.FILTER_TYPE_PLAYLISTS_ONLY ? R.string.no_offline_playlists_subtitle : R.string.no_offline_videos_subtitle);
            arag g3 = ajgl.g(strArr);
            createBuilder.copyOnWrite();
            apke apkeVar5 = (apke) createBuilder.instance;
            g3.getClass();
            apkeVar5.f = g3;
            apkeVar5.b |= 2;
            aopa createBuilder4 = apkf.a.createBuilder();
            createBuilder4.copyOnWrite();
            apkf apkfVar3 = (apkf) createBuilder4.instance;
            apkfVar3.c = 1;
            apkfVar3.b |= 1;
            createBuilder.copyOnWrite();
            apke apkeVar6 = (apke) createBuilder.instance;
            apkf apkfVar4 = (apkf) createBuilder4.mo39build();
            apkfVar4.getClass();
            apkeVar6.j = apkfVar4;
            apkeVar6.b |= 256;
        }
        return (apke) createBuilder.mo39build();
    }
}
