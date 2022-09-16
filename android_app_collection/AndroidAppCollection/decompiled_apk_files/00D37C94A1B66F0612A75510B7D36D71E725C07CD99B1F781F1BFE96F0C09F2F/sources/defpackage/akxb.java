package defpackage;

import android.util.Pair;
import com.google.apps.tiktok.account.api.controller.ValidationResult;
/* compiled from: PG */
/* renamed from: akxb  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class akxb implements ampt {
    private final /* synthetic */ int i;
    public static final /* synthetic */ akxb h = new akxb(7);
    public static final /* synthetic */ akxb g = new akxb(6);
    public static final /* synthetic */ akxb f = new akxb(5);
    public static final /* synthetic */ akxb e = new akxb(4);
    public static final /* synthetic */ akxb d = new akxb(3);
    public static final /* synthetic */ akxb c = new akxb(2);
    public static final /* synthetic */ akxb b = new akxb(1);
    public static final /* synthetic */ akxb a = new akxb();

    private /* synthetic */ akxb() {
    }

    private /* synthetic */ akxb(int i) {
        this.i = i;
    }

    @Override // defpackage.ampt
    public final boolean a(Object obj) {
        switch (this.i) {
            case 0:
                alcw alcwVar = (alcw) obj;
                int i = akxz.s;
                if (alcwVar.s && !alcwVar.t) {
                    return true;
                }
                break;
            case 1:
                return ((alcw) obj).s;
            case 2:
                return ((alcw) obj).s;
            case 3:
                alcw alcwVar2 = (alcw) obj;
                return !alcwVar2.s && !aley.c(alcwVar2);
            case 4:
                alcw alcwVar3 = (alcw) obj;
                if (!alcwVar3.ad && !alcwVar3.ac) {
                    alct alctVar = alcwVar3.y;
                    if (alctVar == null) {
                        alctVar = alct.a;
                    }
                    if (!alht.k(alctVar)) {
                        alct alctVar2 = alcwVar3.H;
                        if (alctVar2 == null) {
                            alctVar2 = alct.a;
                        }
                        if (!alht.k(alctVar2)) {
                            return true;
                        }
                    }
                }
                return false;
            case 5:
                int i2 = alhc.g;
                return !((alhe) obj).b();
            case 6:
                return !((ValidationResult) obj).c();
            default:
                if (((Pair) obj).second != null) {
                    return true;
                }
                break;
        }
        return false;
    }
}
