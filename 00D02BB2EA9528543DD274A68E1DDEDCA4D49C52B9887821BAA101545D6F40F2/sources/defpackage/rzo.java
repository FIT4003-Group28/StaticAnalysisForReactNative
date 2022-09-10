package defpackage;

import java.util.Arrays;
import java.util.Set;
/* compiled from: PG */
/* renamed from: rzo  reason: default package */
/* loaded from: classes7.dex */
public final class rzo implements dbsl<ror> {
    private final dcep<ror> a;

    public rzo(Set<ror> set) {
        this.a = dcep.K(set);
    }

    public static rzo b(ror... rorVarArr) {
        return new rzo(rorVarArr);
    }

    public static rzo c() {
        return new rzo(ror.TRANSIT_ROUTE_TO_HOME, ror.TRANSIT_ROUTE_BUILDER_TO_HOME, ror.TRANSIT_ROUTE_TO_WORK, ror.TRANSIT_ROUTE_BUILDER_TO_WORK);
    }

    public static rzo d() {
        return new rzo(ror.MULTIMODAL_ROUTE_TO_HOME, ror.MULTIMODAL_ROUTE_TO_WORK);
    }

    public static rzo e() {
        return new rzo(new ror[0]);
    }

    @Override // defpackage.dbsl
    public final /* bridge */ /* synthetic */ boolean a(ror rorVar) {
        return !this.a.contains(rorVar);
    }

    @Override // defpackage.dbsl
    public final boolean equals(@dzsi Object obj) {
        if (obj instanceof rzo) {
            return ((rzo) obj).a.equals(this.a);
        }
        return false;
    }

    public final rzo f(rzo rzoVar) {
        return new rzo(dcnm.n(this.a, rzoVar.a));
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public rzo(ror... rorVarArr) {
        this.a = dcep.K(Arrays.asList(rorVarArr));
    }
}
