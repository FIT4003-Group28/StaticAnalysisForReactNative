package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: ajqc  reason: default package */
/* loaded from: classes.dex */
public final class ajqc implements ajrt {
    private final List a = new ArrayList();

    @Override // defpackage.ajrt
    public final void a(ajrs ajrsVar, ajqm ajqmVar, int i) {
        for (ajrt ajrtVar : this.a) {
            ajrtVar.a(ajrsVar, ajqmVar, i);
        }
    }

    public final void b(ajrt ajrtVar) {
        ajrtVar.getClass();
        this.a.add(ajrtVar);
    }
}
