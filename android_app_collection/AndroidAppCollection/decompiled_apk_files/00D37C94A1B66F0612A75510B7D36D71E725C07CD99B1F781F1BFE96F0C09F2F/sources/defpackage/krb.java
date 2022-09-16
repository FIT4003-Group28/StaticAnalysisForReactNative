package defpackage;

import android.content.Context;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: krb  reason: default package */
/* loaded from: classes3.dex */
public final class krb implements ajry {
    private final azqb a;
    private final /* synthetic */ int b;

    public krb(azqb azqbVar) {
        this.a = azqbVar;
    }

    public krb(azqb azqbVar, int i) {
        this.b = i;
        this.a = azqbVar;
    }

    public krb(azqb azqbVar, int i, byte[] bArr) {
        this.b = i;
        azqbVar.getClass();
        this.a = azqbVar;
    }

    public krb(azqb azqbVar, int i, char[] cArr) {
        this.b = i;
        azqbVar.getClass();
        this.a = azqbVar;
    }

    public krb(azqb azqbVar, int i, short[] sArr) {
        this.b = i;
        azqbVar.getClass();
        this.a = azqbVar;
    }

    @Override // defpackage.ajry
    public final /* bridge */ /* synthetic */ ajru b(ViewGroup viewGroup) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return (ekx) this.a.get();
            }
            if (i == 2) {
                return (krp) this.a.get();
            }
            if (i == 3) {
                Context context = (Context) this.a.get();
                context.getClass();
                return new lab(context, viewGroup);
            } else if (i == 4) {
                return new mlg((ajqz) this.a.get());
            } else {
                Context context2 = (Context) this.a.get();
                context2.getClass();
                viewGroup.getClass();
                return new akjz(context2);
            }
        }
        return (kre) this.a.get();
    }
}
