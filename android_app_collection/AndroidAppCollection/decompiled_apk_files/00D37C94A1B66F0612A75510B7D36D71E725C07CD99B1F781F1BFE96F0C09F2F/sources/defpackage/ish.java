package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: ish  reason: default package */
/* loaded from: classes3.dex */
public final class ish implements aaoo {
    private final azqb a;
    private final Context b;
    private final aacz c;

    public ish(Context context, azqb azqbVar, aacz aaczVar) {
        this.a = azqbVar;
        this.b = context;
        this.c = aaczVar;
    }

    @Override // defpackage.aaoo
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        int round;
        avhn avhnVar = (avhn) obj;
        aopu aopuVar = avhnVar.c;
        if (!aopuVar.isEmpty()) {
            if (aopuVar.size() > 1 && this.b.getResources().getConfiguration().orientation != 1) {
                return;
            }
            ajmy ajmyVar = (ajmy) this.a.get();
            if (aopuVar.size() == 1) {
                round = 1;
            } else {
                float l = zew.l(this.b);
                aveq aveqVar = this.c.b().u;
                if (aveqVar == null) {
                    aveqVar = aveq.a;
                }
                round = Math.round(l * aveqVar.l);
            }
            ajmyVar.n(avhnVar, round, 1);
        }
    }
}
