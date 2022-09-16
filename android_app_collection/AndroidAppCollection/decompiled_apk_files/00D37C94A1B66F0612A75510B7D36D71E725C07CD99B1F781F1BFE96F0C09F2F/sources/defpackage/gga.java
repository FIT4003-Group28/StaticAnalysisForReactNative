package defpackage;

import android.widget.TextView;
import java.util.Map;
/* compiled from: PG */
/* renamed from: gga  reason: default package */
/* loaded from: classes3.dex */
public final class gga extends akbm {
    private final TextView k;
    private final akfb l;

    public gga(aafo aafoVar, akfb akfbVar, ajxz ajxzVar, ajsk ajskVar, aacz aaczVar, TextView textView) {
        super(aafoVar, ajxzVar, ajskVar, aaczVar, textView);
        this.l = akfbVar;
        this.k = textView;
    }

    @Override // defpackage.akbm, defpackage.akbj
    public final void a(apoj apojVar, acti actiVar, Map map) {
        argj argjVar;
        super.a(apojVar, actiVar, map);
        if (apojVar != null) {
            argl arglVar = apojVar.m;
            if (arglVar == null) {
                arglVar = argl.a;
            }
            if (arglVar.b != 102716411) {
                return;
            }
            akfb akfbVar = this.l;
            argl arglVar2 = apojVar.m;
            if (arglVar2 == null) {
                arglVar2 = argl.a;
            }
            if (arglVar2.b == 102716411) {
                argjVar = (argj) arglVar2.c;
            } else {
                argjVar = argj.a;
            }
            akfbVar.b(argjVar, this.k, apojVar, actiVar);
        }
    }
}
