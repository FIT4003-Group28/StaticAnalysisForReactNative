package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: jbs  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jbs implements ampg {
    public final /* synthetic */ agqh a;
    private final /* synthetic */ int b;

    public /* synthetic */ jbs(agqh agqhVar, int i) {
        this.b = i;
        this.a = agqhVar;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        int i = this.b;
        if (i == 0) {
            return new jcn((aajs) obj, this.a);
        } else if (i == 1) {
            return new jcn((aajs) obj, this.a, 1);
        } else if (i == 2) {
            return jdg.g(this.a, (Set) obj);
        } else {
            return jdg.g(this.a, (Set) obj);
        }
    }
}
