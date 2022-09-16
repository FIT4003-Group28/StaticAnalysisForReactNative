package defpackage;
/* compiled from: PG */
/* renamed from: jms  reason: default package */
/* loaded from: classes3.dex */
public final class jms extends jlq {
    private final azqb a;
    private final azqb b;

    public jms(azqb azqbVar, azqb azqbVar2) {
        super(agqo.class, ater.class);
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    @Override // defpackage.jmf
    public final /* bridge */ /* synthetic */ Object b(Object obj, amup amupVar) {
        String f = ((agqo) obj).f();
        String str = null;
        if (amupVar != null) {
            str = (String) amupVar.getOrDefault("downloaded_video_playlist_id", null);
        }
        agqv e = ((agrf) this.b.get()).a().m().e(f);
        if (e != null) {
            return ((jml) this.a.get()).e(e, str);
        }
        aopa createBuilder = ater.a.createBuilder();
        apzg e2 = far.e(f, str);
        createBuilder.copyOnWrite();
        ater aterVar = (ater) createBuilder.instance;
        e2.getClass();
        aterVar.e = e2;
        aterVar.b |= 8;
        return (ater) createBuilder.mo39build();
    }
}
