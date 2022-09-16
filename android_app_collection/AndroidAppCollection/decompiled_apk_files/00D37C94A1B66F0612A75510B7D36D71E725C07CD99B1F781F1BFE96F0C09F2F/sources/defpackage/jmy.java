package defpackage;

import java.util.Iterator;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: jmy  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jmy implements Callable {
    public final /* synthetic */ jna a;
    public final /* synthetic */ jnb b;
    private final /* synthetic */ int c;

    public /* synthetic */ jmy(jna jnaVar, jnb jnbVar) {
        this.a = jnaVar;
        this.b = jnbVar;
    }

    public /* synthetic */ jmy(jna jnaVar, jnb jnbVar, int i) {
        this.c = i;
        this.a = jnaVar;
        this.b = jnbVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        aslq aslqVar;
        if (this.c == 0) {
            jna jnaVar = this.a;
            jnb jnbVar = this.b;
            String str = jnbVar.a;
            auqh auqhVar = (auqh) ((jur) jnaVar.b.a(jnbVar).get(0)).a;
            if (auqhVar == null) {
                return new jmz(null, null);
            }
            Iterator it = auqhVar.d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    aslqVar = null;
                    break;
                }
                auqk auqkVar = (auqk) it.next();
                if ((auqkVar.b & 16) != 0) {
                    aslqVar = auqkVar.j;
                    if (aslqVar == null) {
                        aslqVar = aslq.a;
                    }
                    if (str.equals(aslqVar.h)) {
                        break;
                    }
                }
            }
            return new jmz(null, aslqVar);
        }
        return new jmz((auqh) ((jur) this.a.b.a(this.b).get(0)).a, null);
    }
}
