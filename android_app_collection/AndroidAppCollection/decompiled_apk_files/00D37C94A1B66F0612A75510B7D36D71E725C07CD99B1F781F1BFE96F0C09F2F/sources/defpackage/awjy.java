package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: awjy  reason: default package */
/* loaded from: classes2.dex */
public final class awjy extends abga {
    private final aopa a;

    private awjy() {
        awkc awkcVar = awkc.a;
        throw null;
    }

    public awjy(aopa aopaVar) {
        this.a = aopaVar;
    }

    @Override // defpackage.abga
    public final /* bridge */ /* synthetic */ aajj a(aajl aajlVar) {
        return new awka((awkc) this.a.mo39build(), aajlVar);
    }

    public final void b(awkb... awkbVarArr) {
        for (int i = 0; i <= 0; i++) {
            this.a.aX(awkbVarArr[i]);
        }
    }

    public final void c(awkb... awkbVarArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(awkbVarArr));
        List<awkb> unmodifiableList = Collections.unmodifiableList(((awkc) this.a.instance).e);
        aopa aopaVar = this.a;
        aopaVar.copyOnWrite();
        ((awkc) aopaVar.instance).e = awkc.emptyProtobufList();
        for (awkb awkbVar : unmodifiableList) {
            if (!linkedHashSet.contains(awkbVar)) {
                this.a.aX(awkbVar);
            }
        }
    }
}
