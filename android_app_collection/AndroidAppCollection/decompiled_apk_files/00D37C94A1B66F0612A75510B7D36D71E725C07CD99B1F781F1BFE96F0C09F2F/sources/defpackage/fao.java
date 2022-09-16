package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fao  reason: default package */
/* loaded from: classes3.dex */
public final class fao implements fqc, agco {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());
    public ankt b;
    private final Context c;
    private final agbd d;
    private final Executor e;

    public fao(Context context, Executor executor, agcp agcpVar, agbd agbdVar) {
        this.c = context;
        this.d = agbdVar;
        this.e = executor;
        this.b = agbdVar.b(context);
        agcpVar.b(this);
    }

    private final void e() {
        final ankt b = this.d.b(this.c);
        ylx.k(anlz.k(b, this.b).a(new Callable() { // from class: fam
            @Override // java.util.concurrent.Callable
            public final Object call() {
                fao faoVar = fao.this;
                ankt anktVar = b;
                agbc agbcVar = (agbc) ylx.h(faoVar.b, null);
                agbc agbcVar2 = (agbc) ylx.h(anktVar, null);
                if (agbcVar2 == null || agbcVar2.equals(agbcVar)) {
                    return null;
                }
                faoVar.b = anktVar;
                return agbcVar2;
            }
        }, anjk.a), this.e, dzl.l, new ylw() { // from class: fal
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                fao faoVar = fao.this;
                agbc agbcVar = (agbc) obj;
                if (agbcVar != null) {
                    ArrayList arrayList = new ArrayList(faoVar.a);
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ((fan) arrayList.get(i)).b(agbcVar);
                    }
                }
            }
        });
    }

    @Override // defpackage.fqc
    public final void a() {
    }

    @Override // defpackage.fqc
    public final void b() {
        e();
    }

    @Override // defpackage.agco
    public final void d() {
        e();
    }
}
