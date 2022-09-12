package defpackage;
/* compiled from: PG */
/* renamed from: akah  reason: default package */
/* loaded from: classes2.dex */
public abstract class akah {
    public static akah j(boolean z, dcep<akaf> dcepVar, dbsg<String> dbsgVar, dbsg<String> dbsgVar2) {
        return new ajzf(z, dcepVar, dbsgVar, dbsgVar2, false);
    }

    public abstract boolean a();

    public abstract dcep<akaf> b();

    public abstract dbsg<String> c();

    public abstract dbsg<String> d();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean e();

    public final boolean f() {
        return b().isEmpty();
    }

    public final boolean g() {
        dcpd<akaf> it = b().iterator();
        while (it.hasNext()) {
            if (!it.next().p) {
                return false;
            }
        }
        return true;
    }

    public final boolean h() {
        dcpd<akaf> it = b().iterator();
        while (it.hasNext()) {
            if (it.next().q) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i() {
        /*
            r3 = this;
            dcep r0 = r3.b()
            dcpd r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            akaf r1 = (defpackage.akaf) r1
            akaf r2 = defpackage.akaf.LOCATION_PERMISSION_NOT_GRANTED
            if (r1 == r2) goto L20
            akaf r2 = defpackage.akaf.BACKGROUND_LOCATION_PERMISSION_NOT_GRANTED
            if (r1 == r2) goto L20
            akaf r2 = defpackage.akaf.ACTIVITY_DETECTION_PERMISSION_NOT_GRANTED
            if (r1 != r2) goto L8
        L20:
            r0 = 1
            return r0
        L22:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akah.i():boolean");
    }
}
