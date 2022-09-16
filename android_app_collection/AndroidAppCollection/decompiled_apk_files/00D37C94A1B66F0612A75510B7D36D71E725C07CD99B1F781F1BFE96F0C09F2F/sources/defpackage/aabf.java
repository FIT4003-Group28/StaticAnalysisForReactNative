package defpackage;
/* compiled from: PG */
/* renamed from: aabf  reason: default package */
/* loaded from: classes.dex */
public final class aabf {
    private final afsx a;

    public aabf(afsx afsxVar) {
        afsxVar.getClass();
        this.a = afsxVar;
    }

    public final void a(yua yuaVar, final cfb cfbVar) {
        if (!(yuaVar instanceof aaqk) || !((aaqk) yuaVar).A()) {
            return;
        }
        final afyl afylVar = (afyl) yuaVar;
        ylx.i(this.a.c(), new afxx(afylVar, 1));
        if (cfbVar.b == null) {
            return;
        }
        ylx.i(this.a.e(), new ylw() { // from class: aabe
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                cfb cfbVar2 = cfb.this;
                afyl afylVar2 = afylVar;
                Boolean bool = (Boolean) obj;
                cer cerVar = cfbVar2.b;
                cew cewVar = new cew(cerVar.a, cerVar.g);
                zep.g("Logging response for YouTube API call.");
                for (String str : afylVar2.w(cewVar)) {
                    zep.g(str);
                }
            }
        });
    }
}
