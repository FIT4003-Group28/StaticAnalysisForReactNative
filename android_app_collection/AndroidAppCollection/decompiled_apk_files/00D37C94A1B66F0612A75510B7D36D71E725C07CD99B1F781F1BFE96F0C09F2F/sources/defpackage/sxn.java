package defpackage;

import com.google.android.libraries.elements.interfaces.IntersectionObserver;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: sxn  reason: default package */
/* loaded from: classes4.dex */
public final class sxn extends IntersectionObserver {
    private final ArrayList a;
    private final tcu b;
    private final tcs c;
    private final tfw d;

    public sxn(axms axmsVar, tcu tcuVar, tcs tcsVar, tfy tfyVar) {
        this.b = tcuVar;
        this.c = tcsVar;
        aodt aodtVar = new aodt();
        int b = axmsVar.b(4);
        aodt aodtVar2 = null;
        if (b != 0) {
            aodtVar.f(axmsVar.a(b + axmsVar.a), axmsVar.b);
        } else {
            aodtVar = null;
        }
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        if (aodtVar == null) {
            this.d = null;
            return;
        }
        arrayList.add(tfy.f(aodtVar));
        aodt aodtVar3 = new aodt();
        int b2 = axmsVar.b(6);
        if (b2 != 0) {
            aodtVar3.f(axmsVar.a(b2 + axmsVar.a), axmsVar.b);
            aodtVar2 = aodtVar3;
        }
        this.d = tfyVar.g(aodtVar2);
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public final void criteriaMatched(ArrayList arrayList) {
        tfw tfwVar = this.d;
        if (tfwVar != null) {
            this.b.b(tfwVar.a(), this.c).Q();
        }
    }

    @Override // com.google.android.libraries.elements.interfaces.IntersectionObserver
    public final ArrayList getCriteriaList() {
        return this.a;
    }
}
