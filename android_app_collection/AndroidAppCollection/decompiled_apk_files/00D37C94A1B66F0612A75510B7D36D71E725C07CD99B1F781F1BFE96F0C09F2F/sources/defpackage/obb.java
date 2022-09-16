package defpackage;

import java.util.HashSet;
/* compiled from: PG */
/* renamed from: obb  reason: default package */
/* loaded from: classes3.dex */
public final class obb implements odb {
    private final akaf a;
    private final ajyj b;

    public obb(akaf akafVar, ajyj ajyjVar) {
        akafVar.getClass();
        this.a = akafVar;
        ajyjVar.getClass();
        this.b = ajyjVar;
    }

    @Override // defpackage.odb
    public final void a() {
        HashSet hashSet;
        akaf akafVar = this.a;
        ajyj ajyjVar = this.b;
        ajqm r = akafVar.r();
        if (r == null) {
            hashSet = new HashSet();
        } else {
            ajrj ajrjVar = (ajrj) r;
            int i = ajrjVar.i(ajyjVar.lA());
            int h = ajrjVar.h() - 1;
            HashSet hashSet2 = new HashSet();
            for (int i2 = i + 1; i2 <= h; i2++) {
                ajri k = ajrjVar.k(i2);
                if (k != null) {
                    for (int i3 = 0; i3 < k.a.a(); i3++) {
                        hashSet2.add(k.a.c(i3));
                    }
                }
            }
            hashSet = hashSet2;
        }
        if (hashSet.isEmpty()) {
            return;
        }
        this.a.y(new afkx(hashSet, 1));
    }

    @Override // defpackage.odb
    public final void b() {
        this.a.H();
    }
}
