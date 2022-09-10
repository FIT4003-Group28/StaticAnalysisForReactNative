package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: ajfk  reason: default package */
/* loaded from: classes2.dex */
public class ajfk implements ajfg {
    private final dcdc<ajfj> a;

    public ajfk(Iterable<ahwl> iterable, final cqat cqatVar, final Resources resources, final ajsc ajscVar) {
        this.a = dcdc.q(dcft.o(iterable, new dbrn(resources, cqatVar, ajscVar) { // from class: ajfh
            private final Resources a;
            private final cqat b;
            private final ajsc c;

            {
                this.a = resources;
                this.b = cqatVar;
                this.c = ajscVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return new ajfj((ahwl) obj, this.a, this.b, this.c);
            }
        }));
    }

    @Override // defpackage.ajfg
    public dcdc<? extends jax> a() {
        return this.a;
    }

    public void b(ajfi ajfiVar) {
        dcdc<ajfj> dcdcVar = this.a;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dcdcVar.get(i).a(ajfiVar);
        }
    }
}
