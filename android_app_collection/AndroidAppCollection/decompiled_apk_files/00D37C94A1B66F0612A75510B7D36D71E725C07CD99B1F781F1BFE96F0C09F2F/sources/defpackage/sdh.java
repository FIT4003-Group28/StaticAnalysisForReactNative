package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: sdh  reason: default package */
/* loaded from: classes4.dex */
public final class sdh implements sdl {
    private final List a;
    private final /* synthetic */ int b;

    public sdh(int i) {
        this.b = i;
        this.a = sbv.d();
    }

    public sdh(List list) {
        this.a = sbv.e(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [set] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [sep] */
    @Override // defpackage.sdl
    public final List b(List list, sek sekVar, int i, sbz sbzVar, sdj sdjVar, sda sdaVar, set setVar, boolean z) {
        Collection linkedHashSet;
        if (this.b == 0) {
            List a = sdjVar.a(this.a);
            if (z) {
                setVar = setVar.h();
                for (Object obj : this.a) {
                    setVar.j(obj);
                }
            }
            return sdaVar.e(this.a, a, i, setVar, false).b;
        }
        if (setVar instanceof seu) {
            linkedHashSet = ((seu) setVar).a.b;
        } else {
            linkedHashSet = new LinkedHashSet(list);
        }
        this.a.clear();
        this.a.addAll(linkedHashSet);
        return sdaVar.e(this.a, sdjVar.a(this.a), i, setVar, false).b;
    }
}
