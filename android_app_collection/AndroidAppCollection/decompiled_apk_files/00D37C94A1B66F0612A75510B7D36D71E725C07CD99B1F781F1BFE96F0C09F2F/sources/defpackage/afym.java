package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: afym  reason: default package */
/* loaded from: classes.dex */
public final class afym {
    static final aqxk a;
    public final aqxk b;
    public final axnm c;

    static {
        aopa createBuilder = aqxk.a.createBuilder();
        createBuilder.copyOnWrite();
        aqxk aqxkVar = (aqxk) createBuilder.instance;
        aqxkVar.b |= 1;
        aqxkVar.c = 1000;
        createBuilder.copyOnWrite();
        aqxk aqxkVar2 = (aqxk) createBuilder.instance;
        aqxkVar2.b |= 4;
        aqxkVar2.e = 30000;
        createBuilder.copyOnWrite();
        aqxk aqxkVar3 = (aqxk) createBuilder.instance;
        aqxkVar3.b |= 2;
        aqxkVar3.d = 2.0f;
        createBuilder.copyOnWrite();
        aqxk aqxkVar4 = (aqxk) createBuilder.instance;
        aqxkVar4.b |= 8;
        aqxkVar4.f = 0.1f;
        a = (aqxk) createBuilder.mo39build();
    }

    public afym(axnm axnmVar, aqxk aqxkVar) {
        this.c = axnmVar;
        this.b = aqxkVar;
        int i = aqxkVar.c;
        if (i > 0 && aqxkVar.e >= i && aqxkVar.d >= 1.0f) {
            float f = aqxkVar.f;
            if (f >= 0.0f && f < 1.0f) {
                return;
            }
        }
        throw new IllegalArgumentException("Illegal exponential backoff config");
    }
}
