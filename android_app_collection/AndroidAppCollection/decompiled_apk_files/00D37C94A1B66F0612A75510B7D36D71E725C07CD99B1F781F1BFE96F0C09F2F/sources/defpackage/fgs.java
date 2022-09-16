package defpackage;
/* compiled from: PG */
/* renamed from: fgs  reason: default package */
/* loaded from: classes3.dex */
public final class fgs {
    public static final String[] a = {"snap_zoom_initially_zoomed", etk.VIDEO_ZOOM_USER_EDUCATION_SHOWN, "inline_global_play_pause"};

    public static fgu a(fgu fguVar, fgm fgmVar) {
        if (fgmVar.a.h() || fgmVar.b.h()) {
            aopa createBuilder = fgu.a.createBuilder();
            if (fgmVar.b("snap_zoom_initially_zoomed")) {
                boolean c = fgmVar.c("snap_zoom_initially_zoomed");
                createBuilder.copyOnWrite();
                fgu fguVar2 = (fgu) createBuilder.instance;
                fguVar2.b |= 1;
                fguVar2.c = c;
            }
            if (fgmVar.b(etk.VIDEO_ZOOM_USER_EDUCATION_SHOWN)) {
                boolean c2 = fgmVar.c(etk.VIDEO_ZOOM_USER_EDUCATION_SHOWN);
                createBuilder.copyOnWrite();
                fgu fguVar3 = (fgu) createBuilder.instance;
                fguVar3.b |= 2;
                fguVar3.d = c2;
            }
            if (fgmVar.b("inline_global_play_pause")) {
                int a2 = fgmVar.a("inline_global_play_pause", -1);
                createBuilder.copyOnWrite();
                fgu fguVar4 = (fgu) createBuilder.instance;
                fguVar4.b |= 4;
                fguVar4.e = a2;
            }
            return (fgu) createBuilder.mo39build();
        }
        return fguVar;
    }
}
