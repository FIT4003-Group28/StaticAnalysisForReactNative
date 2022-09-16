package defpackage;

import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: cqhd  reason: default package */
/* loaded from: classes.dex */
public final class cqhd implements cqkv {
    private final cqkv[] a;

    public cqhd(List<cqkv> list) {
        this.a = (cqkv[]) list.toArray(new cqkv[list.size()]);
    }

    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, @dzsi Object obj, cqjz<?> cqjzVar) {
        for (cqkv cqkvVar : this.a) {
            if (cqkvVar.a(cqkuVar, obj, cqjzVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cqkv
    public final boolean b(cqku cqkuVar, cqjz<?> cqjzVar) {
        for (cqkv cqkvVar : this.a) {
            if (cqkvVar.b(cqkuVar, cqjzVar)) {
                return true;
            }
        }
        return false;
    }

    public cqhd(cqkv... cqkvVarArr) {
        this.a = (cqkv[]) Arrays.copyOf(cqkvVarArr, cqkvVarArr.length);
    }
}
