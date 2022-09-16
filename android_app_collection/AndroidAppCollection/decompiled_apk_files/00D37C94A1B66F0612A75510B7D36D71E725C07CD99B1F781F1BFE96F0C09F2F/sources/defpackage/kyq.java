package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: kyq  reason: default package */
/* loaded from: classes3.dex */
public final class kyq implements ajry {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final azqb d;
    private final azqb e;
    private final /* synthetic */ int f;

    public kyq(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, int i) {
        this.f = i;
        azqbVar.getClass();
        this.d = azqbVar;
        azqbVar2.getClass();
        this.b = azqbVar2;
        azqbVar3.getClass();
        this.c = azqbVar3;
        azqbVar4.getClass();
        this.a = azqbVar4;
        this.e = azqbVar5;
    }

    public kyq(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, int i, short[] sArr) {
        this.f = i;
        azqbVar.getClass();
        this.a = azqbVar;
        azqbVar2.getClass();
        this.e = azqbVar2;
        azqbVar3.getClass();
        this.c = azqbVar3;
        this.b = azqbVar4;
        this.d = azqbVar5;
    }

    @Override // defpackage.ajry
    public final /* bridge */ /* synthetic */ ajru b(ViewGroup viewGroup) {
        int i = this.f;
        if (i == 0) {
            Activity activity = (Activity) this.a.get();
            activity.getClass();
            ajmy ajmyVar = (ajmy) this.b.get();
            ajmyVar.getClass();
            aafo aafoVar = (aafo) this.c.get();
            aafoVar.getClass();
            SharedPreferences sharedPreferences = (SharedPreferences) this.d.get();
            sharedPreferences.getClass();
            akem akemVar = (akem) this.e.get();
            akemVar.getClass();
            return new kyp(activity, ajmyVar, aafoVar, sharedPreferences, akemVar, viewGroup);
        } else if (i == 1) {
            Context context = (Context) ((axov) this.d).a;
            context.getClass();
            aafo aafoVar2 = (aafo) this.b.get();
            aafoVar2.getClass();
            ktc ktcVar = (ktc) this.c.get();
            snc sncVar = (snc) this.a.get();
            sncVar.getClass();
            ajmy ajmyVar2 = (ajmy) this.e.get();
            ajmyVar2.getClass();
            return new ktd(context, aafoVar2, ktcVar, sncVar, ajmyVar2, viewGroup);
        } else if (i == 2) {
            Context context2 = (Context) this.d.get();
            context2.getClass();
            aafo aafoVar3 = (aafo) this.c.get();
            aafoVar3.getClass();
            gem gemVar = (gem) this.a.get();
            gemVar.getClass();
            jxn jxnVar = (jxn) this.e.get();
            jxnVar.getClass();
            ajve ajveVar = (ajve) this.b.get();
            ajveVar.getClass();
            return new lki(context2, aafoVar3, gemVar, jxnVar, ajveVar, viewGroup);
        } else if (i == 3) {
            Context context3 = (Context) ((axov) this.b).a;
            context3.getClass();
            ajsn ajsnVar = (ajsn) this.c.get();
            ajsnVar.getClass();
            ajxz ajxzVar = (ajxz) this.d.get();
            ajxzVar.getClass();
            ggb ggbVar = (ggb) this.a.get();
            ggbVar.getClass();
            return new mld(context3, ajsnVar, ajxzVar, ggbVar, (ampq) this.e.get(), viewGroup);
        } else {
            dt dtVar = (dt) this.a.get();
            dtVar.getClass();
            akbn akbnVar = (akbn) this.e.get();
            akbnVar.getClass();
            aafo aafoVar4 = (aafo) this.c.get();
            aafoVar4.getClass();
            ajxz ajxzVar2 = (ajxz) this.b.get();
            ajxzVar2.getClass();
            ajmy ajmyVar3 = (ajmy) this.d.get();
            ajmyVar3.getClass();
            viewGroup.getClass();
            return new yet(dtVar, akbnVar, aafoVar4, ajxzVar2, ajmyVar3, viewGroup);
        }
    }

    public kyq(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5) {
        azqbVar.getClass();
        this.a = azqbVar;
        this.b = azqbVar2;
        azqbVar3.getClass();
        this.c = azqbVar3;
        azqbVar4.getClass();
        this.d = azqbVar4;
        azqbVar5.getClass();
        this.e = azqbVar5;
    }

    public kyq(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, int i, byte[] bArr) {
        this.f = i;
        azqbVar.getClass();
        this.d = azqbVar;
        azqbVar2.getClass();
        this.c = azqbVar2;
        azqbVar3.getClass();
        this.a = azqbVar3;
        azqbVar4.getClass();
        this.e = azqbVar4;
        azqbVar5.getClass();
        this.b = azqbVar5;
    }

    public kyq(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, int i, char[] cArr) {
        this.f = i;
        azqbVar.getClass();
        this.b = azqbVar;
        azqbVar2.getClass();
        this.c = azqbVar2;
        this.d = azqbVar3;
        this.a = azqbVar4;
        azqbVar5.getClass();
        this.e = azqbVar5;
    }
}
