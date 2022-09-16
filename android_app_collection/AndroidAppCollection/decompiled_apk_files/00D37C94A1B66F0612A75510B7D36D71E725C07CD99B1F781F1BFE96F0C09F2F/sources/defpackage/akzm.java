package defpackage;
/* compiled from: PG */
/* renamed from: akzm  reason: default package */
/* loaded from: classes.dex */
public abstract class akzm extends akzu {
    public akzm(albf albfVar) {
        super(albfVar);
    }

    @Override // defpackage.akzu
    public final alcw b(alcw alcwVar) {
        if (alcwVar == null) {
            return null;
        }
        aopa mo52toBuilder = alcwVar.mo52toBuilder();
        c(mo52toBuilder);
        return (alcw) mo52toBuilder.mo39build();
    }

    public abstract void c(aopa aopaVar);
}
