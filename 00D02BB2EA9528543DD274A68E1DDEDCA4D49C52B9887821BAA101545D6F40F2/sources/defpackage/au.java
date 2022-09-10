package defpackage;
/* compiled from: PG */
/* renamed from: au  reason: default package */
/* loaded from: classes.dex */
public final class au {
    private final aq a;
    private final aw b;

    public au(aw awVar, aq aqVar) {
        this.a = aqVar;
        this.b = awVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public au(defpackage.ax r3) {
        /*
            r2 = this;
            aw r0 = r3.NA()
            boolean r1 = r3 instanceof defpackage.h
            if (r1 == 0) goto Lf
            h r3 = (defpackage.h) r3
            aq r3 = r3.MX()
            goto L13
        Lf:
            as r3 = defpackage.as.a()
        L13:
            r2.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.au.<init>(ax):void");
    }

    public final <T extends an> T a(Class<T> cls) {
        Object obj;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        String str = "android.arch.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName;
        T t = (T) this.b.a(str);
        if (!cls.isInstance(t)) {
            aq aqVar = this.a;
            if (aqVar instanceof ar) {
                obj = ((ar) aqVar).a(str, cls);
            } else {
                obj = aqVar.b(cls);
            }
            t = (T) obj;
            an put = this.b.a.put(str, t);
            if (put != null) {
                put.a();
                return t;
            }
        } else {
            aq aqVar2 = this.a;
            if (aqVar2 instanceof at) {
                ((at) aqVar2).c(t);
                return t;
            }
        }
        return t;
    }
}
