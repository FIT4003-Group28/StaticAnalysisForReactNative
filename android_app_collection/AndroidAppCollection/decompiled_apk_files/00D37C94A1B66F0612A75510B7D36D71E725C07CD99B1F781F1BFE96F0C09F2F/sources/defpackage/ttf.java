package defpackage;
/* compiled from: PG */
/* renamed from: ttf  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class ttf implements anir {
    public final /* synthetic */ tqm a;
    private final /* synthetic */ int b;

    public /* synthetic */ ttf(tqm tqmVar) {
        this.a = tqmVar;
    }

    public /* synthetic */ ttf(tqm tqmVar, int i) {
        this.b = i;
        this.a = tqmVar;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        int i = this.b;
        boolean z = false;
        if (i == 0) {
            tqm tqmVar = this.a;
            tqm tqmVar2 = (tqm) obj;
            if (tqmVar2 != null) {
                z = tuk.p(tqmVar, tqmVar2);
            }
            return anlz.q(Boolean.valueOf(z));
        } else if (i == 1) {
            typ.h((tqa) obj, "%s: Unable to correct isolated structure, returning null instead of group %s", "FileGroupManager", this.a.d);
            return ankq.a;
        } else {
            tqm tqmVar3 = this.a;
            if (true != ((Boolean) obj).booleanValue()) {
                tqmVar3 = null;
            }
            return anlz.q(tqmVar3);
        }
    }
}
