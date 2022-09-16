package defpackage;

import android.graphics.Bitmap;
import android.util.Pair;
/* compiled from: PG */
/* renamed from: akxo  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class akxo implements anir {
    public final /* synthetic */ akxz a;
    public final /* synthetic */ String b;
    private final /* synthetic */ int c;

    public /* synthetic */ akxo(akxz akxzVar, String str) {
        this.a = akxzVar;
        this.b = str;
    }

    public /* synthetic */ akxo(akxz akxzVar, String str, int i) {
        this.c = i;
        this.a = akxzVar;
        this.b = str;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        if (this.c == 0) {
            akxz akxzVar = this.a;
            String str = this.b;
            ampq ampqVar = (ampq) obj;
            if (ampqVar.h() && !((akyg) ampqVar.c()).n) {
                alcl a = alcm.a(str);
                a.d = ((akyg) ampqVar.c()).b;
                Bitmap bitmap = ((akyg) ampqVar.c()).h;
                if (bitmap != null) {
                    a.b = bitmap;
                }
                alci alciVar = (alci) akxzVar.j.get();
                alciVar.d.execute(new albx(alciVar, a.a(), 2));
            }
            return anlz.q(ampqVar);
        }
        akxz akxzVar2 = this.a;
        String str2 = this.b;
        Pair pair = (Pair) obj;
        akyg akygVar = (akyg) pair.first;
        if (akygVar == null) {
            return anlz.q(amon.a);
        }
        ampq ampqVar2 = (ampq) pair.second;
        if (!ampqVar2.h()) {
            return anlz.q(ampq.j(akygVar));
        }
        akxzVar2.A(str2, (albg) ampqVar2.c());
        alcw alcwVar = ((albg) ampqVar2.c()).b;
        alcwVar.getClass();
        return anlz.q(ampq.j(akxzVar2.a(alcwVar)));
    }
}
