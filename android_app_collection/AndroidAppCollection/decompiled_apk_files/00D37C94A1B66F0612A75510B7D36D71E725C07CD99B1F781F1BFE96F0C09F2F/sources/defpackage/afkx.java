package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: afkx  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class afkx implements ampt {
    public final /* synthetic */ Set a;
    private final /* synthetic */ int b;

    public /* synthetic */ afkx(Set set, int i) {
        this.b = i;
        this.a = set;
    }

    @Override // defpackage.ampt
    public final boolean a(Object obj) {
        if (this.b != 0) {
            return !this.a.contains(obj) || (obj instanceof aqci);
        }
        return this.a.contains(agpr.i(((Integer) obj).intValue()));
    }
}
