package defpackage;

import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
/* compiled from: PG */
/* renamed from: acse  reason: default package */
/* loaded from: classes.dex */
public final class acse implements acsf {
    private final acrr a;
    private final zfq b;
    private final ConcurrentHashMap c = new ConcurrentHashMap();
    private boolean d;

    public acse(acrr acrrVar, zfq zfqVar, aacz aaczVar) {
        this.d = false;
        this.a = acrrVar;
        this.b = zfqVar;
        apyy b = aaczVar.b();
        if (b != null) {
            asvs asvsVar = b.r;
            aqyy aqyyVar = (asvsVar == null ? asvs.a : asvsVar).c;
            this.d = (aqyyVar == null ? aqyy.a : aqyyVar).b;
        }
    }

    private static arrh f(acsd acsdVar, aqzj aqzjVar, String str) {
        arrf a = arrh.a();
        aqys a2 = aqyt.a();
        aopa createBuilder = aqyv.a.createBuilder();
        int i = acsdVar.b;
        createBuilder.copyOnWrite();
        aqyv aqyvVar = (aqyv) createBuilder.instance;
        aqyvVar.b |= 2;
        aqyvVar.d = i;
        int i2 = acsdVar.c;
        createBuilder.copyOnWrite();
        aqyv aqyvVar2 = (aqyv) createBuilder.instance;
        aqyvVar2.c = i2 - 1;
        aqyvVar2.b |= 1;
        a2.copyOnWrite();
        aqyt.f((aqyt) a2.instance, (aqyv) createBuilder.mo39build());
        a2.copyOnWrite();
        aqyt.e((aqyt) a2.instance, 0);
        aqyu aqyuVar = acsdVar.a;
        if (aqyuVar != null) {
            a2.copyOnWrite();
            aqyt.g((aqyt) a2.instance, aqyuVar);
        }
        a2.copyOnWrite();
        aqyt.c((aqyt) a2.instance, str);
        a2.copyOnWrite();
        aqyt.d((aqyt) a2.instance, aqzjVar);
        a.copyOnWrite();
        ((arrh) a.instance).cw((aqyt) a2.mo39build());
        return (arrh) a.mo39build();
    }

    private final boolean g(aqzj aqzjVar) {
        return this.d && aqzjVar != null;
    }

    @Override // defpackage.acsf
    public final String a() {
        return this.b.b(16);
    }

    @Override // defpackage.acsf
    public final void b(acsd acsdVar, aqzj aqzjVar) {
        if (g(aqzjVar)) {
            String str = (String) this.c.get(aqzjVar);
            if (str == null) {
                str = a();
                String str2 = (String) this.c.putIfAbsent(aqzjVar, str);
                if (str2 != null) {
                    str = str2;
                }
            }
            c(acsdVar, aqzjVar, str);
        }
    }

    @Override // defpackage.acsf
    public final void c(acsd acsdVar, aqzj aqzjVar, String str) {
        if (g(aqzjVar) && !TextUtils.isEmpty(str)) {
            this.a.c(f(acsdVar, aqzjVar, str));
        }
    }

    @Override // defpackage.acsf
    public final void d(acsd acsdVar, aqzj aqzjVar, String str, long j) {
        if (g(aqzjVar) && !TextUtils.isEmpty(str)) {
            this.a.f(f(acsdVar, aqzjVar, str), j);
        }
    }

    @Override // defpackage.acsf
    public final void e(acsd acsdVar, aqzj aqzjVar) {
        if (!g(aqzjVar)) {
            return;
        }
        String a = a();
        this.c.put(aqzjVar, a);
        c(acsdVar, aqzjVar, a);
    }
}
