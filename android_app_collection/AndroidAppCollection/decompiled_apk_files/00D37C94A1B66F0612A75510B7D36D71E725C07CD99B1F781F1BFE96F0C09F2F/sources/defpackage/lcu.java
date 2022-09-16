package defpackage;
/* compiled from: PG */
/* renamed from: lcu  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class lcu implements anir {
    public final /* synthetic */ lcv a;
    private final /* synthetic */ int b;

    public /* synthetic */ lcu(lcv lcvVar) {
        this.a = lcvVar;
    }

    public /* synthetic */ lcu(lcv lcvVar, int i) {
        this.b = i;
        this.a = lcvVar;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        int i = this.b;
        if (i == 0) {
            aurq aurqVar = (aurq) obj;
            this.a.a.b();
            if (aurqVar != null) {
                return anlz.q(aurqVar);
            }
            return anlz.p(new Exception("Cached voice language renderer is null"));
        } else if (i == 1) {
            akqf akqfVar = (akqf) obj;
            this.a.a.b();
            return anlz.p(new akqf("Voice language renderer not found in cache"));
        } else {
            lcv lcvVar = this.a;
            String str = (String) obj;
            if (str.isEmpty()) {
                return anlz.q(lcvVar.b);
            }
            return anlz.q(str);
        }
    }
}
