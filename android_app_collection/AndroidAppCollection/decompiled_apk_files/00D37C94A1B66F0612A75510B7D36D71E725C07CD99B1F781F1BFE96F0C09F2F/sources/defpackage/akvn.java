package defpackage;

import android.content.Context;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: akvn  reason: default package */
/* loaded from: classes.dex */
public final class akvn implements axou {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final /* synthetic */ int d;

    public akvn(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
    }

    public akvn(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i) {
        this.d = i;
        this.a = azqbVar;
        this.c = azqbVar2;
        this.b = azqbVar3;
    }

    public akvn(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, byte[] bArr) {
        this.d = i;
        this.b = azqbVar;
        this.c = azqbVar2;
        this.a = azqbVar3;
    }

    public akvn(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, int i, char[] cArr) {
        this.d = i;
        this.b = azqbVar;
        this.a = azqbVar2;
        this.c = azqbVar3;
    }

    public static akvn a(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new akvn(azqbVar, azqbVar2, azqbVar3);
    }

    public static akvm b(aacz aaczVar, vpm vpmVar, azqb azqbVar) {
        aveq aveqVar = aaczVar.b().u;
        if (aveqVar == null) {
            aveqVar = aveq.a;
        }
        akvm akvmVar = new akvm((ScheduledExecutorService) azqbVar.get(), vpmVar);
        if (aveqVar != null) {
            apet apetVar = aveqVar.d;
            if (apetVar == null) {
                apetVar = apet.a;
            }
            if (!apetVar.b) {
                akvmVar.f(false);
                return akvmVar;
            }
        }
        akvmVar.f(true);
        long j = 100;
        if (aveqVar != null) {
            apet apetVar2 = aveqVar.d;
            if (apetVar2 == null) {
                apetVar2 = apet.a;
            }
            if (apetVar2.d > 20) {
                apet apetVar3 = aveqVar.d;
                if (apetVar3 == null) {
                    apetVar3 = apet.a;
                }
                j = apetVar3.d;
            }
        }
        ((vpq) akvmVar.b).c = j;
        long j2 = 60000;
        if (aveqVar != null) {
            apet apetVar4 = aveqVar.d;
            if (apetVar4 == null) {
                apetVar4 = apet.a;
            }
            if (apetVar4.c > 10000) {
                apet apetVar5 = aveqVar.d;
                if (apetVar5 == null) {
                    apetVar5 = apet.a;
                }
                j2 = apetVar5.c;
            }
        }
        ((vpq) akvmVar.b).d = j2;
        return akvmVar;
    }

    public static akqq c(Context context, Executor executor, azqb azqbVar) {
        akqq akqqVar;
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            akqqVar = (akqq) azqbVar.get();
        } else {
            String absolutePath = filesDir.getAbsolutePath();
            String str = File.separator;
            StringBuilder sb = new StringBuilder(String.valueOf(absolutePath).length() + 7 + String.valueOf(str).length());
            sb.append(absolutePath);
            sb.append(str);
            sb.append("storage");
            akqn akqnVar = new akqn(sb.toString(), executor);
            akqnVar.c(new akqk(akqnVar));
            akqqVar = akqnVar;
        }
        axzl.o(akqqVar);
        return akqqVar;
    }

    public static akvn d(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        return new akvn(azqbVar, azqbVar2, azqbVar3, 1);
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        int i = this.d;
        if (i != 0) {
            if (i == 1) {
                return c((Context) ((axov) this.a).a, (Executor) this.c.get(), this.b);
            }
            if (i == 2) {
                return new alqz((alri) this.b.get(), (alqx) this.c.get(), ((alrb) this.a).get());
            }
            return new altg(axot.a(this.b), axot.a(this.a), axot.a(this.c));
        }
        return b((aacz) this.a.get(), (vpm) this.b.get(), this.c);
    }
}
