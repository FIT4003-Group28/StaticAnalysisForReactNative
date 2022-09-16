package defpackage;

import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: PG */
/* renamed from: adwv  reason: default package */
/* loaded from: classes.dex */
public final class adwv implements adwq, airt {
    public final aypf a = new aypf();
    public final Set b = new CopyOnWriteArraySet();

    static {
        zep.a("MDX.SequencerStageQueueStatusMonitor");
    }

    @Override // defpackage.adwq
    public final void a(adwp adwpVar) {
        this.b.add(adwpVar);
    }

    @Override // defpackage.adwq
    public final void b(adwp adwpVar) {
        this.b.remove(adwpVar);
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.ao().Z(new ayqb() { // from class: adwu
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                audg audgVar;
                adwv adwvVar = adwv.this;
                ahhm ahhmVar = (ahhm) obj;
                if (!ahhmVar.c().b(aijx.VIDEO_WATCH_LOADED) || ahhmVar.a() == null || (audgVar = ahhmVar.a().g) == null) {
                    return;
                }
                int i = audgVar.j;
                int i2 = audgVar.m;
                for (adwp adwpVar : adwvVar.b) {
                    adwt adwtVar = adwpVar.a;
                    String.format(Locale.getDefault(), "currentIndex:%d totalVideos:%d", Integer.valueOf(i), Integer.valueOf(i2));
                    adwtVar.h(i, i2);
                }
            }
        })};
    }
}
