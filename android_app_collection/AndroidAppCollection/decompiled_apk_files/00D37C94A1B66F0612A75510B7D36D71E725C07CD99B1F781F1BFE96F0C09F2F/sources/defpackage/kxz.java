package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kxz  reason: default package */
/* loaded from: classes3.dex */
public final class kxz implements ajry {
    private final azqb a;
    private final azqb b;
    private final /* synthetic */ int c;

    public kxz(azqb azqbVar, azqb azqbVar2, int i) {
        this.c = i;
        azqbVar.getClass();
        this.b = azqbVar;
        azqbVar2.getClass();
        this.a = azqbVar2;
    }

    public kxz(azqb azqbVar, azqb azqbVar2) {
        azqbVar.getClass();
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public kxz(azqb azqbVar, azqb azqbVar2, int i, byte[] bArr) {
        this.c = i;
        azqbVar.getClass();
        this.a = azqbVar;
        azqbVar2.getClass();
        this.b = azqbVar2;
    }

    public kxz(azqb azqbVar, azqb azqbVar2, int i, char[] cArr) {
        this.c = i;
        azqbVar.getClass();
        this.b = azqbVar;
        azqbVar2.getClass();
        this.a = azqbVar2;
    }

    public kxz(azqb azqbVar, azqb azqbVar2, int i, short[] sArr) {
        this.c = i;
        azqbVar.getClass();
        this.a = azqbVar;
        azqbVar2.getClass();
        this.b = azqbVar2;
    }

    public kxz(azqb azqbVar, azqb azqbVar2, int i, int[] iArr) {
        this.c = i;
        azqbVar.getClass();
        this.b = azqbVar;
        azqbVar2.getClass();
        this.a = azqbVar2;
    }

    @Override // defpackage.ajry
    public final /* bridge */ /* synthetic */ ajru b(ViewGroup viewGroup) {
        switch (this.c) {
            case 0:
                Activity activity = (Activity) this.a.get();
                activity.getClass();
                ajmy ajmyVar = (ajmy) this.b.get();
                ajmyVar.getClass();
                return new kxy(activity, ajmyVar, viewGroup);
            case 1:
                Context context = (Context) ((axov) this.b).a;
                context.getClass();
                aafo aafoVar = (aafo) this.a.get();
                aafoVar.getClass();
                return new kty(context, aafoVar, viewGroup);
            case 2:
                Context context2 = (Context) this.a.get();
                context2.getClass();
                yni yniVar = (yni) this.b.get();
                yniVar.getClass();
                viewGroup.getClass();
                return new kzo(context2, yniVar, viewGroup);
            case 3:
                Context context3 = (Context) this.b.get();
                context3.getClass();
                aafo aafoVar2 = (aafo) this.a.get();
                aafoVar2.getClass();
                viewGroup.getClass();
                return new kzr(context3, aafoVar2, viewGroup);
            case 4:
                Context context4 = (Context) this.a.get();
                context4.getClass();
                ajsa ajsaVar = (ajsa) this.b.get();
                ajsaVar.getClass();
                return new lko(context4, ajsaVar, viewGroup);
            case 5:
                Context context5 = (Context) this.b.get();
                context5.getClass();
                aafo aafoVar3 = (aafo) this.a.get();
                aafoVar3.getClass();
                viewGroup.getClass();
                return new mmv(context5, aafoVar3);
            case 6:
                Context context6 = (Context) ((axov) this.b).a;
                context6.getClass();
                aafo aafoVar4 = (aafo) this.a.get();
                aafoVar4.getClass();
                viewGroup.getClass();
                return new ncy(context6, aafoVar4, viewGroup);
            case 7:
                Context context7 = (Context) ((axov) this.a).a;
                context7.getClass();
                ajmy ajmyVar2 = (ajmy) this.b.get();
                ajmyVar2.getClass();
                viewGroup.getClass();
                return new ygx(context7, ajmyVar2, R.layout.sponsorships_header_layout, viewGroup);
            case 8:
                Context context8 = (Context) ((axov) this.b).a;
                context8.getClass();
                aafo aafoVar5 = (aafo) this.a.get();
                aafoVar5.getClass();
                viewGroup.getClass();
                return new ygz(context8, aafoVar5, viewGroup);
            default:
                Context context9 = (Context) this.a.get();
                context9.getClass();
                ajxz ajxzVar = (ajxz) this.b.get();
                ajxzVar.getClass();
                viewGroup.getClass();
                return new akjw(context9, ajxzVar);
        }
    }

    public kxz(azqb azqbVar, azqb azqbVar2, int i, boolean[] zArr) {
        this.c = i;
        azqbVar.getClass();
        this.b = azqbVar;
        azqbVar2.getClass();
        this.a = azqbVar2;
    }

    public kxz(azqb azqbVar, azqb azqbVar2, int i, float[] fArr) {
        this.c = i;
        azqbVar.getClass();
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public kxz(azqb azqbVar, azqb azqbVar2, int i, byte[][] bArr) {
        this.c = i;
        azqbVar.getClass();
        this.b = azqbVar;
        azqbVar2.getClass();
        this.a = azqbVar2;
    }

    public kxz(azqb azqbVar, azqb azqbVar2, int i, char[][] cArr) {
        this.c = i;
        azqbVar.getClass();
        this.a = azqbVar;
        this.b = azqbVar2;
    }
}
