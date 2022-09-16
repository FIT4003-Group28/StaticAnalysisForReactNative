package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.ViewGroup;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mpu  reason: default package */
/* loaded from: classes3.dex */
public final class mpu implements mpx {
    public final azqb a;
    public final azqb b;
    public final azqb c;
    public final azqb d;
    public final azqb e;
    public final azqb f;
    public final azqb g;
    public final azqb h;
    public final azqb i;

    public mpu(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9) {
        azqbVar.getClass();
        this.a = azqbVar;
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
        azqbVar8.getClass();
        this.h = azqbVar8;
        azqbVar9.getClass();
        this.i = azqbVar9;
    }

    @Override // defpackage.mpx
    public final /* bridge */ /* synthetic */ mpy a(ViewGroup viewGroup) {
        aafo aafoVar = (aafo) this.a.get();
        aafoVar.getClass();
        ajxz ajxzVar = (ajxz) this.b.get();
        ajxzVar.getClass();
        Context context = (Context) this.c.get();
        context.getClass();
        yni yniVar = (yni) this.d.get();
        yniVar.getClass();
        aagi aagiVar = (aagi) this.e.get();
        aagiVar.getClass();
        aacz aaczVar = (aacz) this.f.get();
        aaczVar.getClass();
        ayor ayorVar = (ayor) this.g.get();
        ayorVar.getClass();
        yrj yrjVar = (yrj) this.h.get();
        yrjVar.getClass();
        SharedPreferences sharedPreferences = (SharedPreferences) this.i.get();
        sharedPreferences.getClass();
        return new mpt(aafoVar, ajxzVar, context, yniVar, aagiVar, aaczVar, ayorVar, yrjVar, sharedPreferences, viewGroup, R.layout.slim_metadata_button, null);
    }
}
