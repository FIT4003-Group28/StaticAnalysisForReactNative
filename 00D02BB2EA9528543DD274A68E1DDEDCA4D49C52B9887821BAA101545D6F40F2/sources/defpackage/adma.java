package defpackage;

import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: adma  reason: default package */
/* loaded from: classes.dex */
public final class adma {
    public final dbty<Integer> a;
    public final Map<aczr, admb> b = new WeakHashMap();
    public final Set<aczr> c = dcnm.c();

    public adma(final acyr acyrVar) {
        this.a = dbud.a(new dbty(acyrVar) { // from class: adlz
            private final acyr a;

            {
                this.a = acyrVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return Integer.valueOf(this.a.a().g);
            }
        });
    }
}
