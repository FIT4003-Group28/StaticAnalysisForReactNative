package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: kyj  reason: default package */
/* loaded from: classes3.dex */
public final class kyj implements ajry {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final azqb d;
    private final /* synthetic */ int e;

    public kyj(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i) {
        this.e = i;
        azqbVar.getClass();
        this.a = azqbVar;
        this.c = azqbVar2;
        azqbVar3.getClass();
        this.b = azqbVar3;
        azqbVar4.getClass();
        this.d = azqbVar4;
    }

    public kyj(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4) {
        azqbVar.getClass();
        this.a = azqbVar;
        azqbVar2.getClass();
        this.b = azqbVar2;
        azqbVar3.getClass();
        this.c = azqbVar3;
        azqbVar4.getClass();
        this.d = azqbVar4;
    }

    @Override // defpackage.ajry
    public final /* bridge */ /* synthetic */ ajru b(ViewGroup viewGroup) {
        int i = this.e;
        if (i == 0) {
            Activity activity = (Activity) this.a.get();
            activity.getClass();
            return new kyi(activity, (kyn) this.b.get(), this.c, (kzh) this.d.get(), viewGroup);
        } else if (i == 1) {
            Activity activity2 = (Activity) this.a.get();
            activity2.getClass();
            ajmy ajmyVar = (ajmy) this.c.get();
            ajmyVar.getClass();
            aafo aafoVar = (aafo) this.b.get();
            aafoVar.getClass();
            akem akemVar = (akem) this.d.get();
            akemVar.getClass();
            return new kxg(activity2, ajmyVar, aafoVar, akemVar, viewGroup);
        } else if (i == 2) {
            Context context = (Context) this.b.get();
            context.getClass();
            gem gemVar = (gem) this.a.get();
            gemVar.getClass();
            ony onyVar = (ony) this.d.get();
            onyVar.getClass();
            ayor ayorVar = (ayor) this.c.get();
            ayorVar.getClass();
            return new lle(context, gemVar, onyVar, ayorVar, viewGroup);
        } else if (i == 3) {
            Context context2 = (Context) ((axov) this.c).a;
            context2.getClass();
            aafo aafoVar2 = (aafo) this.b.get();
            aafoVar2.getClass();
            snc sncVar = (snc) this.a.get();
            sncVar.getClass();
            Executor executor = (Executor) this.d.get();
            executor.getClass();
            viewGroup.getClass();
            return new ndi(context2, aafoVar2, sncVar, executor, viewGroup);
        } else if (i == 4) {
            aafo aafoVar3 = (aafo) this.b.get();
            aafoVar3.getClass();
            acti actiVar = (acti) this.d.get();
            actiVar.getClass();
            Context context3 = (Context) ((axov) this.c).a;
            context3.getClass();
            egn egnVar = (egn) this.a.get();
            egnVar.getClass();
            return new ons(aafoVar3, actiVar, context3, egnVar, viewGroup);
        } else {
            Context context4 = (Context) ((axov) this.c).a;
            context4.getClass();
            aafo aafoVar4 = (aafo) this.b.get();
            aafoVar4.getClass();
            ajmy ajmyVar2 = (ajmy) this.d.get();
            ajmyVar2.getClass();
            akbn akbnVar = (akbn) this.a.get();
            akbnVar.getClass();
            viewGroup.getClass();
            return new ygy(context4, aafoVar4, ajmyVar2, akbnVar, viewGroup);
        }
    }

    public kyj(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i, byte[] bArr) {
        this.e = i;
        azqbVar.getClass();
        this.b = azqbVar;
        azqbVar2.getClass();
        this.a = azqbVar2;
        this.d = azqbVar3;
        azqbVar4.getClass();
        this.c = azqbVar4;
    }

    public kyj(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i, char[] cArr) {
        this.e = i;
        azqbVar.getClass();
        this.c = azqbVar;
        azqbVar2.getClass();
        this.b = azqbVar2;
        azqbVar3.getClass();
        this.a = azqbVar3;
        azqbVar4.getClass();
        this.d = azqbVar4;
    }

    public kyj(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i, short[] sArr) {
        this.e = i;
        azqbVar.getClass();
        this.b = azqbVar;
        azqbVar2.getClass();
        this.d = azqbVar2;
        azqbVar3.getClass();
        this.c = azqbVar3;
        azqbVar4.getClass();
        this.a = azqbVar4;
    }

    public kyj(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, int i, int[] iArr) {
        this.e = i;
        azqbVar.getClass();
        this.c = azqbVar;
        azqbVar2.getClass();
        this.b = azqbVar2;
        this.d = azqbVar3;
        azqbVar4.getClass();
        this.a = azqbVar4;
    }
}
