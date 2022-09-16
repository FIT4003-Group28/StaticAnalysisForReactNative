package defpackage;
/* compiled from: PG */
/* renamed from: ai  reason: default package */
/* loaded from: classes.dex */
public final class ai {
    private final ae a;
    private final aj b;

    public ai(aj ajVar, ae aeVar) {
        this.a = aeVar;
        this.b = ajVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ai(defpackage.ak r3) {
        /*
            r2 = this;
            aj r0 = r3.getViewModelStore()
            boolean r1 = r3 instanceof defpackage.i
            if (r1 == 0) goto Lf
            i r3 = (defpackage.i) r3
            ae r3 = r3.getDefaultViewModelProviderFactory()
            goto L13
        Lf:
            ag r3 = defpackage.ag.b()
        L13:
            r2.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ai.<init>(ak):void");
    }

    public final ac a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return b("android.arch.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
    }

    public final ac b(String str, Class cls) {
        ac a;
        ac a2 = this.b.a(str);
        if (!cls.isInstance(a2)) {
            ae aeVar = this.a;
            if (aeVar instanceof af) {
                a = ((af) aeVar).b(str, cls);
            } else {
                a = aeVar.a(cls);
            }
            ac acVar = (ac) this.b.a.put(str, a);
            if (acVar != null) {
                acVar.b();
            }
            return a;
        }
        ae aeVar2 = this.a;
        if (aeVar2 instanceof ah) {
            ((ah) aeVar2).c(a2);
        }
        return a2;
    }

    public ai(ak akVar, ae aeVar) {
        this(akVar.getViewModelStore(), aeVar);
    }
}
