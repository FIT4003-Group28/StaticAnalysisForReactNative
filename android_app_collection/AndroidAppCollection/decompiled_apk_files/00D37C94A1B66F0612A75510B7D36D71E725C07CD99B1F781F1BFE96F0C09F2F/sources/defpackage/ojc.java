package defpackage;

import j$.util.Optional;
/* compiled from: PG */
/* renamed from: ojc  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ojc implements ayqd {
    private final /* synthetic */ int d;
    public static final /* synthetic */ ojc c = new ojc(2);
    public static final /* synthetic */ ojc b = new ojc(1);
    public static final /* synthetic */ ojc a = new ojc();

    private /* synthetic */ ojc() {
    }

    private /* synthetic */ ojc(int i) {
        this.d = i;
    }

    @Override // defpackage.ayqd
    public final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.d;
        if (i == 0) {
            ezx ezxVar = (ezx) obj;
            fte fteVar = (fte) obj2;
            Optional optional = (Optional) obj4;
            if (((sev) obj3).a != 0 && (!optional.isPresent() || ((izk) optional.get()).a < 0.9f)) {
                if (!ezxVar.i()) {
                    return (ftf) fteVar.c.orElse(ftf.ACTIVITY_DEFAULT);
                }
                return ftf.ACTIVITY_DEFAULT;
            }
            return ftf.DARK;
        }
        boolean z = true;
        if (i == 1) {
            imj imjVar = (imj) obj;
            return (!((Boolean) obj2).booleanValue() || ((Boolean) obj3).booleanValue() || ((Boolean) obj4).booleanValue()) ? imjVar : imp.d(imjVar);
        }
        Boolean bool = (Boolean) obj2;
        Boolean bool2 = (Boolean) obj3;
        Boolean bool3 = (Boolean) obj4;
        if ((((Boolean) obj).booleanValue() && bool.booleanValue()) || (bool2.booleanValue() && bool3.booleanValue())) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
