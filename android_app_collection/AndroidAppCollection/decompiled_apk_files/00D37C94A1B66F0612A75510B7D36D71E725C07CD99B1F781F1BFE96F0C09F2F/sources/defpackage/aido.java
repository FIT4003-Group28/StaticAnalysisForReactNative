package defpackage;

import com.google.android.libraries.youtube.player.features.prefetch.WillAutonavInformer;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aido  reason: default package */
/* loaded from: classes.dex */
public class aido implements aaon {
    protected final yni a;
    protected final azqb b;
    protected final azqb c;
    private final Executor d;
    private final azqb e;
    private final azqb f;
    private final WillAutonavInformer g;
    private final ampq h;
    private final Map i;
    private final aacz j;

    public aido(yni yniVar, Executor executor, azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, WillAutonavInformer willAutonavInformer, aacz aaczVar, ampq ampqVar, Map map) {
        yniVar.getClass();
        this.a = yniVar;
        executor.getClass();
        this.d = executor;
        azqbVar.getClass();
        this.e = azqbVar;
        azqbVar2.getClass();
        this.b = azqbVar2;
        this.c = azqbVar3;
        azqbVar4.getClass();
        this.f = azqbVar4;
        willAutonavInformer.getClass();
        this.g = willAutonavInformer;
        this.j = aaczVar;
        this.h = ampqVar;
        this.i = map;
    }

    @Override // defpackage.aaon
    public final /* bridge */ /* synthetic */ ymc a(Object obj, ymb ymbVar) {
        Object a;
        apzg apzgVar = (apzg) obj;
        aidy aidyVar = (aidy) this.i.get(awel.class);
        atzt D = aiix.D(this.j);
        if (D != null && D.u && (a = aafp.a(apzgVar)) != null && this.i.containsKey(a.getClass())) {
            aidyVar = (aidy) this.i.get(a.getClass());
        }
        atzb b = aidyVar.b(apzgVar);
        aidm aidmVar = null;
        if (b == null) {
            return null;
        }
        atzc c = aidyVar.c(apzgVar);
        amvn g = b(apzgVar, b).g();
        if (c != null) {
            aidmVar = new aidm(c, this.f, this.a, aidyVar.a(b));
        }
        return new aidx(this.d, g, ymbVar, (aids) this.e.get(), apzgVar, b, aidmVar, this.a, this.h, (airw) this.c.get());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public amvl b(apzg apzgVar, atzb atzbVar) {
        amvl i = amvn.i();
        if (atzbVar.d != 0) {
            aidl aidlVar = new aidl((airr) this.b.get(), (airw) this.c.get(), atzbVar);
            aidlVar.f.g(aidlVar.g(aidlVar.e));
            if (aidlVar.d.S() && aidlVar.d.n() != null) {
                aidlVar.d(aidlVar.d.n());
            }
            i.c(aidlVar);
        }
        if (aied.d(atzbVar)) {
            aidc aidcVar = new aidc(apzgVar, this.g, (airw) this.c.get());
            aidcVar.e.g(aidcVar.g(aidcVar.d));
            i.c(aidcVar);
        }
        return i;
    }
}
