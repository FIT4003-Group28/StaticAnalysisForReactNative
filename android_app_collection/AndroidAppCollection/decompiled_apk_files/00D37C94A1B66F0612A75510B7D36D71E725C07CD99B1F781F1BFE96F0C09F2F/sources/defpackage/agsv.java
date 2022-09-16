package defpackage;

import android.os.Environment;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: agsv  reason: default package */
/* loaded from: classes.dex */
public final class agsv extends ailf {
    private static final long l = TimeUnit.SECONDS.toMillis(5);
    private final azqb m;
    private final azqb n;
    private final aadd o;
    private final agwp p;
    private aghe q;
    private final ahdn r;
    private final ahdf s;

    public agsv(yni yniVar, ailv ailvVar, aimy aimyVar, azqb azqbVar, azqb azqbVar2, Executor executor, Executor executor2, List list, aadd aaddVar, agwp agwpVar, zey zeyVar, ahdn ahdnVar, ahdf ahdfVar) {
        super(yniVar, ailvVar, aimyVar, executor, executor2, list, zeyVar);
        this.m = azqbVar;
        this.n = azqbVar2;
        this.o = aaddVar;
        this.p = agwpVar;
        this.r = ahdnVar;
        this.s = ahdfVar;
    }

    private final agqv j(String str) {
        try {
            ampq ampqVar = (ampq) ((agrf) this.m.get()).a().m().h(str).get(l, TimeUnit.MILLISECONDS);
            if (!ampqVar.h()) {
                return null;
            }
            return (agqv) ampqVar.c();
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            return null;
        }
    }

    private final boolean k(agql agqlVar) {
        agws a;
        char c;
        File file;
        if (agqlVar != null) {
            agwp agwpVar = this.p;
            aghe agheVar = this.q;
            String f = agqlVar.f();
            if (agheVar == null) {
                return false;
            }
            for (pde pdeVar : ((aghc) agheVar).get()) {
                if (pdeVar != null && pdeVar.g().contains(f)) {
                    if (!pdeVar.m(f, 0L, agqlVar.b())) {
                        c = 2;
                        a = null;
                    } else {
                        a = agwpVar.a.a(agqlVar);
                        c = (a == null || a.c.length == 0) ? (char) 1 : (char) 3;
                    }
                    try {
                        pdj c2 = pdeVar.c(f, 0L);
                        if (c2 != null && (file = c2.e) != null && file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().getAbsolutePath())) {
                            Environment.isExternalStorageEmulated();
                        }
                    } catch (pdc unused) {
                    }
                    if (c != 3) {
                        return c == 1;
                    }
                    a.getClass();
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ailf
    public final PlayerResponseModel a(String str, PlayerResponseModel playerResponseModel) {
        agqv j;
        avhn k;
        agqu agquVar;
        if (!this.r.c() || !((agrf) this.m.get()).h() || (j = j(str)) == null) {
            return playerResponseModel;
        }
        atqv atqvVar = this.s.a.a().g;
        if (atqvVar == null) {
            atqvVar = atqv.a;
        }
        if (atqvVar.E && ((agquVar = j.j) == null || !agquVar.h())) {
            return playerResponseModel;
        }
        aadd aaddVar = this.o;
        if (aaddVar != null && aaddVar.a() != null) {
            atqv atqvVar2 = aaddVar.a().g;
            if (atqvVar2 == null) {
                atqvVar2 = atqv.a;
            }
            if (atqvVar2.h && (k = j.k()) != null) {
                playerResponseModel.D(new aalc(k));
            }
        }
        agqm agqmVar = j.n;
        aghe b = ((agrf) this.m.get()).a().b();
        this.q = b;
        if (agqmVar == null || b == null) {
            return playerResponseModel;
        }
        aadd aaddVar2 = this.o;
        PlayerConfigModel c = playerResponseModel.c();
        if (aaddVar2 != null && aaddVar2.a() != null) {
            atqv atqvVar3 = aaddVar2.a().g;
            if (atqvVar3 == null) {
                atqvVar3 = atqv.a;
            }
            if (atqvVar3.g && ((c.aQ() || k(agqmVar.a)) && k(agqmVar.b))) {
                aanz aanzVar = (aanz) this.n.get();
                FormatStreamModel d = agqmVar.d(b.g());
                FormatStreamModel b2 = agqmVar.b(b.g());
                long j2 = playerResponseModel.b;
                asan asanVar = playerResponseModel.a.h;
                if (asanVar == null) {
                    asanVar = asan.a;
                }
                return playerResponseModel.h(aanzVar, d, b2, j2, asanVar.c, false);
            }
        }
        aadd aaddVar3 = this.o;
        if (aaddVar3 != null && aaddVar3.a() != null) {
            atqv atqvVar4 = aaddVar3.a().g;
            if (atqvVar4 == null) {
                atqvVar4 = atqv.a;
            }
            if (atqvVar4.o && (k(agqmVar.a) || k(agqmVar.b))) {
                aanz aanzVar2 = (aanz) this.n.get();
                FormatStreamModel d2 = agqmVar.d(b.g());
                FormatStreamModel b3 = agqmVar.b(b.g());
                long j3 = playerResponseModel.b;
                asan asanVar2 = playerResponseModel.a.h;
                if (asanVar2 == null) {
                    asanVar2 = asan.a;
                }
                return playerResponseModel.h(aanzVar2, d2, b3, j3, asanVar2.c, true);
            }
        }
        return playerResponseModel.g((aanz) this.n.get(), agqmVar.d(b.g()), agqmVar.b(b.g()));
    }

    public agsv(yni yniVar, ailv ailvVar, aimy aimyVar, azqb azqbVar, azqb azqbVar2, Executor executor, Executor executor2, Set set, aadd aaddVar, aenl aenlVar, snc sncVar, agwp agwpVar, zey zeyVar, ahdn ahdnVar, ahdf ahdfVar, aiix aiixVar) {
        super(yniVar, ailvVar, aimyVar, executor, executor2, set, aenlVar, sncVar, aaddVar, aiixVar, zeyVar);
        this.m = azqbVar;
        this.n = azqbVar2;
        this.o = aaddVar;
        this.p = agwpVar;
        this.r = ahdnVar;
        this.s = ahdfVar;
    }
}
