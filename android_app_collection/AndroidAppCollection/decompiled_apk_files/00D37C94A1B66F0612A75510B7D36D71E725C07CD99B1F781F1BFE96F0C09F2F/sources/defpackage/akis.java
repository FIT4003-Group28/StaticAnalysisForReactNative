package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
/* compiled from: PG */
/* renamed from: akis  reason: default package */
/* loaded from: classes.dex */
public final class akis {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final azqb d;
    private final azqb e;
    private final azqb f;
    private final azqb g;
    private final azqb h;

    public akis(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8) {
        azqbVar.getClass();
        this.a = azqbVar;
        azqbVar2.getClass();
        this.b = azqbVar2;
        azqbVar3.getClass();
        this.c = azqbVar3;
        azqbVar4.getClass();
        this.d = azqbVar4;
        azqbVar5.getClass();
        this.e = azqbVar5;
        azqbVar6.getClass();
        this.f = azqbVar6;
        azqbVar7.getClass();
        this.g = azqbVar7;
        this.h = azqbVar8;
    }

    public final akir a(akip akipVar, akio akioVar, int i, String str, byte[] bArr, int i2, int i3, int i4, String str2, String str3) {
        CronetEngine cronetEngine = (CronetEngine) this.a.get();
        cronetEngine.getClass();
        vzm vzmVar = (vzm) this.b.get();
        vzmVar.getClass();
        aaqf aaqfVar = (aaqf) this.c.get();
        aaqfVar.getClass();
        afvn afvnVar = (afvn) this.d.get();
        afvnVar.getClass();
        Executor executor = (Executor) this.e.get();
        executor.getClass();
        Handler handler = (Handler) this.f.get();
        handler.getClass();
        String str4 = (String) this.g.get();
        str4.getClass();
        axxo axxoVar = (axxo) this.h.get();
        axxoVar.getClass();
        akipVar.getClass();
        akioVar.getClass();
        str.getClass();
        bArr.getClass();
        str3.getClass();
        return new akir(cronetEngine, vzmVar, aaqfVar, afvnVar, executor, handler, str4, axxoVar, akipVar, akioVar, i, str, bArr, i2, i3, i4, str2, str3);
    }
}
