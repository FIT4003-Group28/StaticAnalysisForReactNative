package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: amcf  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class amcf implements ampg {
    private final /* synthetic */ int h;
    public static final /* synthetic */ amcf g = new amcf(8);
    public static final /* synthetic */ amcf f = new amcf(7);
    public static final /* synthetic */ amcf e = new amcf(6);
    public static final /* synthetic */ amcf d = new amcf(3);
    public static final /* synthetic */ amcf c = new amcf(2);
    public static final /* synthetic */ amcf b = new amcf(1);
    public static final /* synthetic */ amcf a = new amcf();

    private /* synthetic */ amcf() {
    }

    public /* synthetic */ amcf(int i) {
        this.h = i;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        boolean z = false;
        switch (this.h) {
            case 0:
                aopa mo52toBuilder = ((amcm) obj).mo52toBuilder();
                mo52toBuilder.clear();
                return (amcm) mo52toBuilder.mo39build();
            case 1:
                ambn ambnVar = (ambn) obj;
                if (ambnVar.c == 2) {
                    z = true;
                }
                aqxo.p(z);
                return ambnVar;
            case 2:
                amuf f2 = amuk.f();
                for (amds amdsVar : Collections.unmodifiableMap(((amdp) obj).d).values()) {
                    f2.h(amct.a(amdsVar));
                }
                return f2.g();
            case 3:
                amuf f3 = amuk.f();
                for (amds amdsVar2 : Collections.unmodifiableMap(((amdp) obj).d).values()) {
                    int k = answ.k(amdsVar2.e);
                    if (k != 0 && k == 2) {
                        f3.h(amct.a(amdsVar2));
                    }
                }
                return f3.g();
            case 4:
                aoqp aoqpVar = ((amdr) obj).b;
                if (aoqpVar.containsKey("accountmanager")) {
                    z = ((Boolean) aoqpVar.get("accountmanager")).booleanValue();
                }
                return Boolean.valueOf(!z);
            case 5:
                aopa mo52toBuilder2 = ((amdr) obj).mo52toBuilder();
                mo52toBuilder2.copyOnWrite();
                amdr amdrVar = (amdr) mo52toBuilder2.instance;
                aoqp aoqpVar2 = amdrVar.b;
                if (!aoqpVar2.b) {
                    amdrVar.b = aoqpVar2.a();
                }
                amdrVar.b.put("accountmanager", true);
                return (amdr) mo52toBuilder2.mo39build();
            case 6:
                IllegalArgumentException illegalArgumentException = (IllegalArgumentException) obj;
                return null;
            case 7:
                HashSet hashSet = new HashSet();
                for (ambn ambnVar2 : (List) obj) {
                    if (!ambnVar2.b.i.equals("incognito")) {
                        hashSet.add(ambnVar2.a);
                    }
                }
                return hashSet;
            default:
                return adz.i();
        }
    }
}
