package defpackage;
/* compiled from: PG */
/* renamed from: znm  reason: default package */
/* loaded from: classes4.dex */
public final class znm {
    public final awbs a;
    public final asjj b;

    private znm(awbs awbsVar, asjj asjjVar) {
        this.a = awbsVar;
        this.b = asjjVar;
    }

    public static znm a(acti actiVar, String str) {
        awbs g = actiVar.g(str, actj.UPLOAD_VIDEO_EDITING_VIDEO_EFFECT_KAZOO);
        aopa createBuilder = asjj.a.createBuilder();
        aopa createBuilder2 = askf.a.createBuilder();
        createBuilder2.copyOnWrite();
        askf askfVar = (askf) createBuilder2.instance;
        str.getClass();
        askfVar.b |= 1;
        askfVar.c = str;
        createBuilder.copyOnWrite();
        asjj asjjVar = (asjj) createBuilder.instance;
        askf askfVar2 = (askf) createBuilder2.mo39build();
        askfVar2.getClass();
        asjjVar.g = askfVar2;
        asjjVar.b |= 8;
        return new znm(g, (asjj) createBuilder.mo39build());
    }
}
