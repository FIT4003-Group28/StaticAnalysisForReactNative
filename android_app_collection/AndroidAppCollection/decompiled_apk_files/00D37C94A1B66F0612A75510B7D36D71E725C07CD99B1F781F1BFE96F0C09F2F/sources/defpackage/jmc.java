package defpackage;

import j$.util.Optional;
import java.util.List;
/* compiled from: PG */
/* renamed from: jmc  reason: default package */
/* loaded from: classes3.dex */
public final class jmc extends jlq {
    private final azqb a;

    public jmc(azqb azqbVar) {
        super(jbc.class, asgt.class);
        this.a = azqbVar;
    }

    @Override // defpackage.jmf
    public final /* bridge */ /* synthetic */ Object b(Object obj, amup amupVar) {
        jbc jbcVar = (jbc) obj;
        aopc aopcVar = (aopc) asgt.a.createBuilder();
        apzg d = aguy.d((String) e(amupVar, "downloaded_video_playlist_id"), jbcVar.a, ((Integer) e(amupVar, "downloaded_video_list_index")).intValue(), (String) e(amupVar, "watch_command_params"), (aoob) e(amupVar, "watch_command_click_tracking_params"));
        aopcVar.copyOnWrite();
        asgt asgtVar = (asgt) aopcVar.instance;
        d.getClass();
        asgtVar.n = d;
        asgtVar.b |= 4096;
        aopa createBuilder = asgu.a.createBuilder();
        aopa createBuilder2 = auqh.a.createBuilder();
        jbcVar.getClass();
        createBuilder2.aI((List) Optional.ofNullable((auxn) ((jml) this.a.get()).g(jbc.class, auxn.class, jbcVar, null)).map(ioc.r).orElseGet(ibz.j));
        auqh auqhVar = (auqh) createBuilder2.mo39build();
        aopa createBuilder3 = asgl.a.createBuilder();
        aopa createBuilder4 = asgk.a.createBuilder();
        createBuilder4.copyOnWrite();
        asgk asgkVar = (asgk) createBuilder4.instance;
        auqhVar.getClass();
        asgkVar.c = auqhVar;
        asgkVar.b = 49399797;
        createBuilder3.copyOnWrite();
        asgl asglVar = (asgl) createBuilder3.instance;
        asgk asgkVar2 = (asgk) createBuilder4.mo39build();
        asgkVar2.getClass();
        asglVar.c = asgkVar2;
        asglVar.b |= 1;
        asgl asglVar2 = (asgl) createBuilder3.mo39build();
        createBuilder.copyOnWrite();
        asgu asguVar = (asgu) createBuilder.instance;
        asglVar2.getClass();
        asguVar.c = asglVar2;
        asguVar.b = 51779735;
        aopcVar.copyOnWrite();
        asgt asgtVar2 = (asgt) aopcVar.instance;
        asgu asguVar2 = (asgu) createBuilder.mo39build();
        asguVar2.getClass();
        asgtVar2.d = asguVar2;
        asgtVar2.b |= 2;
        jbcVar.getClass();
        Optional.ofNullable((aube) ((jml) this.a.get()).g(jbc.class, aube.class, jbcVar, null)).ifPresent(new jmb(aopcVar));
        return (asgt) aopcVar.mo39build();
    }
}
