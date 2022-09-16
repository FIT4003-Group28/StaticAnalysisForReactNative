package defpackage;
/* compiled from: PG */
/* renamed from: aksu  reason: default package */
/* loaded from: classes.dex */
public final class aksu {
    public final asbu a;

    public aksu(asbu asbuVar) {
        this.a = asbuVar;
    }

    public final aakw a() {
        auqh auqhVar;
        if (this.a.c.isEmpty() || ((ascb) this.a.c.get(0)).b != 49399797) {
            return null;
        }
        ascb ascbVar = (ascb) this.a.c.get(0);
        if (ascbVar.b == 49399797) {
            auqhVar = (auqh) ascbVar.c;
        } else {
            auqhVar = auqh.a;
        }
        return new aakw(auqhVar);
    }
}
