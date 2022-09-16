package defpackage;
/* compiled from: PG */
/* renamed from: jmq  reason: default package */
/* loaded from: classes3.dex */
public final class jmq extends jlq {
    public jmq() {
        super(agqv.class, ater.class);
    }

    @Override // defpackage.jmf
    public final /* bridge */ /* synthetic */ Object b(Object obj, amup amupVar) {
        String m = ((agqv) obj).m();
        String str = null;
        if (amupVar != null) {
            str = (String) amupVar.getOrDefault("downloaded_video_playlist_id", null);
        }
        aopa createBuilder = ater.a.createBuilder();
        apzg e = far.e(m, str);
        createBuilder.copyOnWrite();
        ater aterVar = (ater) createBuilder.instance;
        e.getClass();
        aterVar.e = e;
        aterVar.b |= 8;
        return (ater) createBuilder.mo39build();
    }
}
